package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller

public class Apiscontroll {
    @GetMapping("/open")
    public String open(){

        return "home";
    }
    @GetMapping ("/add")
        public String add(){

        return "add";
        }



       @GetMapping ("/previous")
    public String hame(){
        return "home";
       }

}
