package com.example.demo.repositery;


import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Studentdata extends JpaRepository<Student, Integer> {




}
