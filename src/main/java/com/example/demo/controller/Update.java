package com.example.demo.controller;

import com.example.demo.dto.Studentdto;
import com.example.demo.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Update {
    @Autowired
    Studentservice studentservice;

    @PostMapping("/update")
    public String updateuser(@ModelAttribute Studentdto dto){
        studentservice.updateservice( dto);
        return "redirect:/show";
    }
}
