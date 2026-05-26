package com.example.demo.controller;
import  java.util.List;
import com.example.demo.entity.Student;
import com.example.demo.repositery.Studentdata;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Showdata {
 private final Studentdata studentdata ;
 public Showdata( Studentdata studentdata){

     this.studentdata = studentdata;
 }
    @GetMapping("/show")
    public String show(Model model){

       List <Student> all =studentdata.findAll();
       model.addAttribute("student",all);
        return "show";
    }
}
