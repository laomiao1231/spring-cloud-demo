package com.m.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName SpringStreamApplication
 * @Description:
 * @Author: mxw
 * @Create: 2021-01-19 21:11
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringStreamApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringStreamApplication.class, args);
    }
}
