package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repositery.Studentdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Deleteservice {
    @Autowired
    Studentdata studentdata;
    public void deleteuser(int id){


        studentdata.deleteById(id);

    }
}
