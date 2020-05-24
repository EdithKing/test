package com.example.hystrix10002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableCircuitBreaker
@SpringBootApplication
public class Hystrix10002Application {

    public static void main(String[] args) {
        SpringApplication.run(Hystrix10002Application.class, args);
    }

}
