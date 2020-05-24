package com.example.configclient12002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConfigClient12002Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient12002Application.class, args);
    }

}
