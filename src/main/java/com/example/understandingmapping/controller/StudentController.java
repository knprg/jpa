package com.example.understandingmapping.controller;

import com.example.understandingmapping.models.Student;
import com.example.understandingmapping.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @RequestMapping("/getStudent")
    public void getStudent(){
        Student student=new Student();
        student.id= 5L;
        student.name="abc";
        student.psp="76";
        studentRepository.save(student);
    }
}
