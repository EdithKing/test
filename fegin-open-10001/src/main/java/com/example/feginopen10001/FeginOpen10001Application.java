package com.example.feginopen10001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class FeginOpen10001Application {

    public static void main(String[] args) {
        SpringApplication.run(FeginOpen10001Application.class, args);
    }

}
