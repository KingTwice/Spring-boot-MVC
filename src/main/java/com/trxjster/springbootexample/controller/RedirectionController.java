package com.trxjster.springbootexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectionController {

    @GetMapping("/redirectToLinkedin")
    public String redirectOut(){
        System.out.println("in redirect controller");
        return "redirect:https://www.linkedin.com/in/alejandro-t-05324521b/";
    }
}
