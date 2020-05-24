package com.example.feginopen10001.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "PAYMENT-SERVICE")
public interface PaymentFeginService {

    @GetMapping("/")
    String hello();

    @GetMapping("/index/{name}")
    String helloName(@PathVariable(value = "name") String name);

}
