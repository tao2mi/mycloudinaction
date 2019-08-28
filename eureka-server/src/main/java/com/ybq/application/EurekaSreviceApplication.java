package com.ybq.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSreviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaSreviceApplication.class, args);
    }
}
