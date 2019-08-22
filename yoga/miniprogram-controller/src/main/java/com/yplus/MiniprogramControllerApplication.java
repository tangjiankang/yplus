package com.yplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@ComponentScan({"com"})
@SpringBootApplication
public class MiniprogramControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniprogramControllerApplication.class, args);
    }

}
