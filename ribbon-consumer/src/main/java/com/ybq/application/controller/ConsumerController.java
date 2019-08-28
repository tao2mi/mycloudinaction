package com.ybq.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("hello")
    public String hello() {
        System.out.println(restTemplate);
        String res = restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
        return res;
    }
}
