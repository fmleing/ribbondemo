package com.ribbon.demo.controller;

import com.ribbon.demo.Configuration.SayHelloConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RibbonClient(name = "say-hello", configuration = SayHelloConfiguration.class)
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;


    public String helloConsumer(){

    }
}
