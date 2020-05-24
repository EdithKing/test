package com.example.hystrix10002.service.impl;

import com.example.hystrix10002.service.PaymentFeginService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFeginServiceImpl implements PaymentFeginService {

    @Override
    public String hello() {
        return "hello的方法报错了，不好意思朋友";
    }

    @Override
    public String helloName(String name) {
        return "helloName的方法报错了，不好意思朋友 " + name +"你还是稍等一下吧";
    }
}
