package com.example.config12001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Config12001Application {

    public static void main(String[] args) {
        SpringApplication.run(Config12001Application.class, args);
    }

}
