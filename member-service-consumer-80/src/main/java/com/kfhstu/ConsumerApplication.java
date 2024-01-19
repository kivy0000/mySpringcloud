package com.kfhstu;

import com.kfhstu.config.RibbonRuleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 消费者模块
 */
//服务获取
@EnableEurekaClient
//注册服务发现
@EnableDiscoveryClient
//Ribbon负载均衡算法制定,针对哪些eureka的url
@RibbonClient(name = "MEMBER_SERVICE_PROVIDER_URL",configuration = RibbonRuleConfiguration.class)
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
