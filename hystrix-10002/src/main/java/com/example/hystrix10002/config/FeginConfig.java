package com.example.hystrix10002.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeginConfig {

    @Bean
    Logger.Level feiginLoggerLevel(){
        return Logger.Level.FULL;
    }
}
