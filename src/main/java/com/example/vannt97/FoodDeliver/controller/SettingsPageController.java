package com.example.vannt97.FoodDeliver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SettingsPageController {
    @RequestMapping("/settings.html")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("settings");
        return modelAndView;
    }
}
