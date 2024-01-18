package com.kfhstu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka的服务启动类
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka9001Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka9001Application.class,args);
    }
}
