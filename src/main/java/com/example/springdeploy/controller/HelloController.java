package com.example.springdeploy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello-world")
public class HelloController {

    @GetMapping
    public String helloWorld(){
        return "Hello wolrd";
    }


    @GetMapping("/home")
    public String helloWorld2(){
        return "Home2";
    }


}
