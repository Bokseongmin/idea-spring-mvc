package com.example.controller;

import com.example.service.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Locale;

@Controller
public class HomeController {

    @Resource
    private HomeService homeService;

    @RequestMapping(value = "/",method = {RequestMethod.GET,RequestMethod.POST})
    public String index(Locale locale, Model model) throws Exception{
        model.addAttribute("post","test");
        return "index";
    }
}