package com.yplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class YplusWapApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(YplusWapApiApplication.class, args);
    }

}
