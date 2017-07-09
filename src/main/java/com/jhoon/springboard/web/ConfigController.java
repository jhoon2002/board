package com.jhoon.springboard.web;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jhoon.springboard.entity.Config;
import com.jhoon.springboard.repository.ConfigRepository;

@Controller
public class ConfigController {
    
    @Autowired
    ConfigRepository configRepository;
    
    @Value("${pagesPerDistrict}")
    int pagesPerDistrict;
    
    @RequestMapping(value="/admin/config_form", method=RequestMethod.GET)
    public ModelAndView read(HttpServletRequest request,
                            @ModelAttribute(value="config") Config config, 
                            BindingResult result,
                            ModelAndView modelAndView) throws Exception {
        
        config = configRepository.findOne(1L);
        
        System.out.println(config);
        
        modelAndView.addObject("contextPath", request.getContextPath());
        modelAndView.addObject("title", "기본환경설정");
        modelAndView.addObject("head", "admin/head.jsp");
        modelAndView.addObject("tail", "admin/tail.jsp");
        modelAndView.addObject("config", config);
        modelAndView.addObject("body", "admin/config_form.jsp");
        modelAndView.setViewName("admin");

        return modelAndView;
    }
    
    @RequestMapping(value="/admin/config_form", method=RequestMethod.POST)
    public ModelAndView wite(HttpServletRequest request, 
            @ModelAttribute(value="config") @Valid Config config, 
            BindingResult result,
            ModelAndView modelAndView) throws Exception {
        
        if (result.hasFieldErrors()) {
            
            modelAndView.addObject("contextPath", request.getContextPath());
            modelAndView.addObject("title", "기본환경설정");
            modelAndView.addObject("head", "admin/head.jsp");
            modelAndView.addObject("tail", "admin/tail.jsp");
            modelAndView.addObject("config", config);
            modelAndView.addObject("body", "admin/config_form.jsp");
            modelAndView.setViewName("admin");
            
            return modelAndView;
        }
        
        config.setId(1L);
        config.setCfOptimizeDate(new Date());
        config.setCfTheme("basic");
        config.setCfVisit("오늘:1,어제:,최대:1,전체:1");
        configRepository.save(config);
        
        return null;
        //return "redirect:" + "/admin/config_form";
        
    }
}
