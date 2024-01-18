package kfhstu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * this is members application start class
 */

@SpringBootApplication
@EnableEurekaClient
public class MemberApplication10001 {
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication10001.class,args);
    }
}
