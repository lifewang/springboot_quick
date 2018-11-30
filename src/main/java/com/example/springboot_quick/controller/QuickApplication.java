package com.example.springboot_quick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickApplication {

    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "Hello SpringBoot";
    }
}
