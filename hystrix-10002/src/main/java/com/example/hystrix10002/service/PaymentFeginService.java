package com.example.hystrix10002.service;

import com.example.hystrix10002.service.impl.PaymentFeginServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "FEGIN-SERVICE",fallback = PaymentFeginServiceImpl.class)
public interface PaymentFeginService {

    @GetMapping("/")
    String hello();

    @GetMapping("/index/{name}")
    String helloName(@PathVariable(value = "name") String name);


}
