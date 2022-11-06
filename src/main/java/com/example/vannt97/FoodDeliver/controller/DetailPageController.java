package com.example.vannt97.FoodDeliver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DetailPageController {
    @RequestMapping("/detail.html")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("detail");
        return modelAndView;
    }
}
