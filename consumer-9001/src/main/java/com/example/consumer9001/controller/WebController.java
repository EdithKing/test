package com.example.consumer9001.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class WebController {

    private final String  SERVICE_NAME = "PAYMENT-SERVICE";

    @Resource
    private DiscoveryClient discoveryClient;
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String hello(){
        List<ServiceInstance> serviceInstances= discoveryClient.getInstances(SERVICE_NAME);
        serviceInstances.forEach(v -> System.out.println(v.getHost() + " : " + v.getPort() + " ?? " + v.getInstanceId() + " @ " + v.getServiceId()));
        return restTemplate.getForObject("http://" + SERVICE_NAME + "/",String.class);
    }

    @GetMapping("/consumer/index/{name}")
    public String helloName(@PathVariable(value = "name") String name){
        List<ServiceInstance> serviceInstances= discoveryClient.getInstances(SERVICE_NAME);
        serviceInstances.forEach(v -> System.out.println(v.getHost() + " : " + v.getPort() + " ?? " + v.getInstanceId() + " @ " + v.getServiceId()));
        return restTemplate.getForObject("http://" + SERVICE_NAME + "/index/",String.class,name);
    }

}
