package com.fyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka003Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka003Application.class, args);
    }

}
