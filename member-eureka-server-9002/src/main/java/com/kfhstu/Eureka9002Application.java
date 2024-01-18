package com.kfhstu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka server 9002启动类
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka9002Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka9002Application.class,args);
    }
}
