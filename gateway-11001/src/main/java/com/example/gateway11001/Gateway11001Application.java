package com.example.gateway11001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Gateway11001Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway11001Application.class, args);
    }

}
