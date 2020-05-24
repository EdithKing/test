package com.example.payment8001.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    @GetMapping("/index/{name}")
    public String helloName(@PathVariable String name){
        return "hi," + name;
    }
}
