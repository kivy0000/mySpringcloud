package com.kfhstu.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 这个配置类用于配置ribbon负载均衡算法
 */
@Configuration
public class RibbonRuleConfiguration {

    @Bean
    public IRule myRibbonRule() {
        return new RandomRule();
    }
}
