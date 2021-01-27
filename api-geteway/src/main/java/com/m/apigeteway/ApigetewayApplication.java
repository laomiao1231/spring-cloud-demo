package com.m.apigeteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ApigetewayApplication
 * @Description:
 * @Author: mxw
 * @Create: 2021-01-14 22:12
 */
@SpringBootApplication
@EnableEurekaClient
public class ApigetewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApigetewayApplication.class, args);
    }
}
