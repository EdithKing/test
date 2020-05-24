package com.example.feginopen10001.controller;

import com.example.feginopen10001.service.PaymentFeginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderFeginController {

    @Resource
    private PaymentFeginService paymentFeginService;

    @GetMapping("/")
    public String hello(){
        return paymentFeginService.hello();
    }

    @GetMapping("/index/{name}")
    public String helloName(@PathVariable(value = "name") String name){
        return paymentFeginService.helloName(name);
    }

}
