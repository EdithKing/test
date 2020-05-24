package com.example.configclient12002.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;

    @GetMapping("/username")
    public String configUsername(){
        return username;
    }

    @GetMapping("/password")
    public String configPassword(){
        return password;
    }


}
