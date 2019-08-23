package com.yplus.yoga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@ComponentScan({"com.*"})
@SpringBootApplication
public class MiniControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniControllerApplication.class, args);
    }

}
