package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class hellocontroller {

    @GetMapping(value="hello")
    public String HelloWord(){
        return "Hello Program Testing";
    }
}
