package com.ybq.application.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {


    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() {
        String res = restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
        return res;
    }

    public String helloFallback() {
        return "fallbak";
    }

}
