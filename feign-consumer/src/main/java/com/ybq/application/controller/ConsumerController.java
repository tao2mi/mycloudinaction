package com.ybq.application.controller;

import com.ybq.application.service.HelloService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RefreshScope
@RestController
public class ConsumerController {
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    HelloService helloService;

    @Value("${from}")
    private String from;

    @RequestMapping("hello")
    public String hello() {
        logger.info("trace client");

        return "feign" + helloService.hello();
    }

    @RequestMapping("from")
    public String from() {
        return "config: " + from;
    }
}
