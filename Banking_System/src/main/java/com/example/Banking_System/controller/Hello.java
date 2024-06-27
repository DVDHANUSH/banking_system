package com.example.Banking_System.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hello {
    @GetMapping("sayHello")
    public String sayHello(){
        return "Hello";
    }
}