package com.jhoon.springboard.aop;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.jhoon.springboard.entity.Board;
import com.jhoon.springboard.entity.Member;
import com.jhoon.springboard.repository.BoardRepository;
import com.jhoon.springboard.repository.MemberRepository;

public class PreProcess {
    
//    @Autowired
//    MemberRepository memberRepository;

    @Autowired
    BoardRepository boardRepository;
    
    //ProceedingJoinPoint joinPoint
    public void boardPreProcess(Model model, String boid) throws Throwable {
        try {
            System.out.println("AOP(Pre) 수행");
            HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
            model.addAttribute("contextPath", request.getContextPath());
            
            //MemberSample member = memberService.findMember(memberId);
            //BoardInfo boardInfo = boardInfoService.findBoardInfo(boid);
            
            //Member member = memberRepository.findById(Member.class, memberId);
            Board board = boardRepository.findById(Board.class, boid);
            
            //model.addAttribute(member);
            model.addAttribute(board);
        } finally {
        }
    }
    public void contentsPreProcess(Model model, String id) throws Throwable {
        try {
            HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
            model.addAttribute("contextPath", request.getContextPath());
        } finally {
        }
    }
}
