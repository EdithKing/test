package com.example.hystrix10002.controller;


import com.example.hystrix10002.service.PaymentFeginService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "error")
    @GetMapping("/index/{name}")
    public String helloName(@PathVariable(value = "name") String name){
        int i = 1 / 0;
        return paymentFeginService.helloName(name);
    }


    public String error(String name){
        return "报错了呀，请重试吧" +name+ "孩子";
    }

}
