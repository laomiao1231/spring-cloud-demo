package com.m;

import com.w.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
// 自定义规则 name 是指客户端instance-id
//@RibbonClient(name = "EUREKA-CLIENT-1", configuration = MySelfRule.class)
public class CloudCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudCustomerApplication.class, args);
    }
}
