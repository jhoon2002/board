package com.jhoon.springboard.web;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jhoon.springboard.entity.Config;
import com.jhoon.springboard.entity.Member;
import com.jhoon.springboard.entity.QMember;
import com.jhoon.springboard.model.PageNumbers;
import com.jhoon.springboard.repository.MemberRepository;
import com.mysema.query.types.Predicate;

@Controller
public class MemberController {
    
    @Autowired
    MemberRepository memberRepository;
    
    @Value("${pagesPerDistrict}")
    int pagesPerDistrict;
    
    @RequestMapping(value="/admin/member_list", method=RequestMethod.GET)
    public ModelAndView list(HttpServletRequest request,
                            //@ModelAttribute(value="member") Config member,
                            @RequestParam(value="id", defaultValue="") String id,
                            @RequestParam(value="name", defaultValue="") String name,
                            @RequestParam(value="page", defaultValue="1") int page, 
                            ModelAndView modelAndView) throws Exception {
        
        System.out.println("-------------");
        
        QMember member = QMember.member;
        
        Predicate predicate = null;
        if (id.length() > 0) {
            predicate = (Predicate) member.id.like("%" + id + "%");
        }
        if (name.length() > 0) {
            predicate = (Predicate) member.mbName.like("%" + name + "%");
        }
        
        Pageable pageable = new PageRequest(page-1, 30, new Sort(Direction.ASC, "mbDatetime"));
        Page<Member> foundPage = memberRepository.findAll(predicate, pageable);
        
        List<Member> members = foundPage.getContent();
        PageNumbers allPages = new PageNumbers(foundPage.getNumber()+1, foundPage.getSize(), pagesPerDistrict, foundPage.getTotalElements());
        
        modelAndView.addObject("contextPath", request.getContextPath());
        modelAndView.addObject("title", "회원관리");
        modelAndView.addObject("members", members);
        modelAndView.addObject("body", "member_list.jsp");
        modelAndView.addObject("pageList", allPages.getList());
        modelAndView.setViewName("admin");

        for (Member member2 : members) {
            System.out.println(member2);
        }
        
        return modelAndView;
    }
}
