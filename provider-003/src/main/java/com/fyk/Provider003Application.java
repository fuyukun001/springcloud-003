package com.fyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Provider003Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider003Application.class, args);
    }

}
