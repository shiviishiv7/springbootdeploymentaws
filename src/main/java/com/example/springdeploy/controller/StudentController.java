package com.example.springdeploy.controller;

import com.example.springdeploy.StudentRepo;
import com.example.springdeploy.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;


    @PostMapping
    public Student addStudent(@RequestBody Student st){
        Student save = studentRepo.save(st);
        return save;
    }

    @GetMapping
    public List<Student>getAllStudent(){
        List<Student> all = this.studentRepo.findAll();
        return all;
    }


}
