package com.jhoon.springboard.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jhoon.springboard.dto.Search;
import com.jhoon.springboard.dto.SingleSearch;
import com.jhoon.springboard.entity.Board;
import com.jhoon.springboard.entity.Write;
import com.jhoon.springboard.model.PageNumbers;
import com.jhoon.springboard.repository.BoardRepository;
import com.jhoon.springboard.repository.MemberRepository;
import com.jhoon.springboard.repository.WriteRepository;
import com.jhoon.springboard.service.WriteService;

@Controller
public class WriteController {

    @Autowired
    WriteRepository writeRepository;

    @Autowired
    MemberRepository memberRepository;
    
    @Autowired
    BoardRepository boardRepository;
    
    @Autowired
    WriteService writeService;
    
    @Value("${pagesPerDistrict}")
    int pagesPerDistrict;
    
    WriteController() { }

    @RequestMapping(value="/read", method=RequestMethod.GET)
    public ModelAndView read(HttpServletRequest request, 
                             @RequestParam(value="boid", required=true) Board board,
                             @RequestParam(value="wrid", required=false) Write write, 
                             @ModelAttribute(value="listParam") ListParam listParam) throws Exception {
        
        if (board == null) throw new Exception("없는 'boid' 입니다.");
        if (listParam.getWrid() > 0 && write == null) throw new Exception("없는 'wrid' 입니다."); //숫자가 아닌 경우 매핑 단계에서 걸러짐(?)
        
        Pageable pageable = new PageRequest(listParam.getPage()-1, board.getBoPageRows(), new Sort(Direction.ASC, "wrNum", "wrReply"));
        Search<Write> search = new SingleSearch<Write>(listParam.getWord(), listParam.getField());
        
        //Page<Write> foundPage = writeRepository.findAllWithoutWrContent(where(search.depictSpec()), pageableParam);
        Page<Write> foundPage = writeRepository.findAllWithoutWrContent(search.getPredicate(), pageable);
        
        List<Write> writes = foundPage.getContent();
        PageNumbers pageNumbers = new PageNumbers(foundPage.getNumber()+1, foundPage.getSize(), pagesPerDistrict, foundPage.getTotalElements());

        String viewName;
        if (listParam.getWrid() > 0) {
            viewName = "/view.jsp";
        } else {
            viewName = "/list.jsp";
        }
        ModelAndView modelAndView = commonModelAndView(request, board, write, viewName);
        modelAndView.addObject("writes", writes);
        modelAndView.addObject("pageList", pageNumbers.getList());
        
        for (Write thisWrite : writes) {
            System.out.println(thisWrite.getWrSubject());
        }
        /*
        System.out.println("page.getNumber() 현재 페이지번호: " + foundPage.getNumber());
        System.out.println("page.getSize() 페이지당 글갯수: " + foundPage.getSize());
        System.out.println("page.getTotalPages() 총페이지수: " + foundPage.getTotalPages());
        System.out.println("page.getNumberOfElements() 현재페이지의 글갯수: " + foundPage.getNumberOfElements());
        System.out.println("page.getTotalElements() 총 글겟수: " + foundPage.getTotalElements());
        
        for (OnePage onePage : (List<OnePage>)allPages.getList()) {
            System.out.println(onePage);
        }
        */
        return modelAndView;
    }
    
    /* 글쓰기 */
    @RequestMapping(value="/post", method=RequestMethod.GET)
    public ModelAndView post(
            HttpServletRequest request, 
            @RequestParam(value="boid", required=true) Board board, 
            @ModelAttribute(value="write") Write write, 
            @ModelAttribute(value="listParam") ListParam listParam) {
        
        write.setBoard(board);
        ModelAndView modelAndView = commonModelAndView(request, board, write, "/form.jsp");
        modelAndView.addObject("page", listParam.getPage());
        
        return modelAndView;
    }
    @RequestMapping(value="/post", method=RequestMethod.POST)
    public String post(
            HttpServletRequest request, 
            @ModelAttribute(value="write") Write write, 
            @ModelAttribute(value="listParam") ListParam listParam) {
        
        writeService.saveWrite(write);
        return "redirect:" + "/read?boid=" + listParam.getBoid() + "&page=" + listParam.getPage();
    }
    /* 글수정 */
    @RequestMapping(value="/edit", method=RequestMethod.GET)
    public ModelAndView edit(
            HttpServletRequest request, 
            @RequestParam(value="boid", required=true) Board board, 
            @RequestParam(value="wrid", required=true) Long wrid,
            @ModelAttribute(value="write") Write write, 
            @ModelAttribute(value="listParam") ListParam listParam) {
        
        write = writeRepository.findOne(wrid);
        ModelAndView modelAndView = commonModelAndView(request, board, write, "/form.jsp");
        modelAndView.addObject("page", listParam.getPage());
        
        return modelAndView;
    }
    @RequestMapping(value="/edit", method=RequestMethod.POST)
    public String edit(
            HttpServletRequest request, 
            @RequestParam(value="wrid", required=false) Long wrid,
            @ModelAttribute(value="write") Write write, 
            @ModelAttribute(value="listParam") ListParam listParam) {
        
        writeService.updateWrite(write);
        return "redirect:" + "/read?boid=" + listParam.getBoid() + "&page=" + listParam.getPage();
    }
    /* 답글쓰기 */
    @RequestMapping(value="/reply", method=RequestMethod.GET)
    public ModelAndView reply(
            HttpServletRequest request, 
            @RequestParam(value="boid", required=true) Board board, 
            @RequestParam(value="wrid", required=true) Long wrid,
            @ModelAttribute(value="write") Write write, 
            @ModelAttribute(value="listParam") ListParam listParam) {
        
        Write parentWrite = writeRepository.findOne(wrid);
        write.setBoard(board);
        write.setWrContent("\r\n\r\n\r\n\r\n\r\n\r\n------이하 원글------\r\n\r\n" + parentWrite.getWrContent());
        write.setWrSubject("[답글]" + parentWrite.getWrSubject());
        write.setId(parentWrite.getId());
        write.setWrNum(parentWrite.getWrNum());
        write.setWrReply(parentWrite.getWrReply());
        ModelAndView modelAndView = commonModelAndView(request, board, write, "/form.jsp");
        modelAndView.addObject("page", listParam.getPage());
        //modelAndView.addObject("parentWrite", parentWrite);
        
        return modelAndView;
    }
    @RequestMapping(value="/reply", method=RequestMethod.POST)
    public String reply(
            HttpServletRequest request, 
            @RequestParam(value="wrid", required=false) Long wrid,
            @ModelAttribute(value="write") Write write, 
            @ModelAttribute(value="listParam") ListParam listParam) throws Exception {
        
        writeService.replyWrite(write);
        return "redirect:" + "/read?boid=" + listParam.getBoid() + "&page=" + listParam.getPage();
    }
    @RequestMapping("/contents")
    public ModelAndView contents(HttpServletRequest request, String id) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("contextPath", request.getContextPath());
        modelAndView.setViewName("conotents/" + id);
        
        return modelAndView;

    }
    private ModelAndView commonModelAndView(HttpServletRequest request, Board board, Write write, String fileaName) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("contextPath", request.getContextPath());
        modelAndView.addObject("title", board.getBoSubject());
        modelAndView.addObject("head", board.getBoIncludeHead());
        modelAndView.addObject("tail", board.getBoIncludeTail());
        modelAndView.addObject("board", board);
        modelAndView.addObject("write", write);
        modelAndView.addObject("skinUrl", "/WEB-INF/view/skin/board/" + board.getBoSkin());
        modelAndView.addObject("body", board.getBoSkin() + fileaName);
        modelAndView.setViewName("board");
        return modelAndView;
    }
}
