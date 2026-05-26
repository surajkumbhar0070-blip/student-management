package com.example.demo.controller;

import com.example.demo.service.Deleteservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller

public class Delete {
    private final  Deleteservice deleteservice;
    public Delete( Deleteservice deleteservice){
        this.deleteservice=deleteservice;
    }

    @GetMapping("/delete/{id}")
    public String detetestudent(@PathVariable int id){
        deleteservice.deleteuser(id);

        return "redirect:/show";
    }
}
