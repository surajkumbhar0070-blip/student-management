package com.example.demo.controller;


import com.example.demo.dto.Studentdto;
import com.example.demo.entity.Student;
import com.example.demo.repositery.Studentdata;
import com.example.demo.service.Studentservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class restaois {
    private final Studentservice  Studentservice ;
    private final Studentdata use;

    public restaois(Studentservice Studentservice, Studentdata use){
        this.Studentservice =Studentservice ;

        this.use = use;
    }

    @PostMapping("/studentform")
    public String studentdatatt(@ModelAttribute Studentdto dto) {
        Studentservice.servedata(dto);

        return "sucess";
    }

}
