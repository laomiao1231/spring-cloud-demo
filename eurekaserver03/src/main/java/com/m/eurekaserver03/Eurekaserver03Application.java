package com.m.eurekaserver03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eurekaserver03Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaserver03Application.class, args);
    }
}
