package com.fyk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class ConsumerFeign003Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeign003Application.class, args);
    }

}
