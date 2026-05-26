package com.example.demo.service;

import com.example.demo.dto.Studentdto;
import com.example.demo.entity.Student;
import com.example.demo.repositery.Studentdata;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
 public class Studentservice {

   private final Studentdata studentdata;

    public Studentservice(Studentdata studentdata) {
        this.studentdata = studentdata;
    }

    public String servedata(Studentdto dto){

        Student s = new Student();
        s.setId( dto.getId());
        s.setName(dto.getName());
        s.setEmail(dto.getEmail());
        s.setAge(dto.getAge());
        s.setCourse(dto.getCourse());
        studentdata.save(s);
        return "save successfully";
    }
    public void updateservice(Studentdto studentdto){
        Student stu=new Student();
        stu.setId(studentdto.getId());
        stu.setCourse(studentdto.getCourse());
        stu.setEmail(studentdto.getEmail());
        stu.setAge(studentdto.getAge());
        stu.setName(studentdto.getName());
        studentdata.save(stu);


    }

}
