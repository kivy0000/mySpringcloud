package com.kfhstu;
@SuppressWarnings("all")
/**
 * this is springcloud log
 * 1. 基本模块
 *      (1)使用配置文件，完成20000模块，作为service服务者
 *      (2)使用配置文件，完成80模块，作为consumer消费者，使用restTemplate发送http请求，调用20000模块
 *      (3)抽取公共模块，打包，进行依赖调用,引用包后，应注意类的路径，包括mapper文件的路径
 *
 * 2. Eureka 服务注册与发现：将服务注册到eureka上，由消费端访问，得到注册的服务，再进行调用
 *      (1)Eureka 包含两个组件∶Eureka Server 和 Eureka Client ,对应两个注解@EnableEurekaServer和@EnableEurekaClient
 *                          Eureka Server用于提供服务注册，可以使用集群，如果服务模块超时未响应，会被剔除（根据策略）
 *                          client则提供调用服务的接口，同时满足负载均衡，使用@EnableEurekaClient标识提供服务的模块
 *
 *      (2)Eureka也是cs形式的，使用9001端口作为eureka服务端口，
 *                          eureka的c与s端的通信可能也是通过socket完成的？
 *
 *      (3)Eureka的集群：通过创建其他注册中心（Eureka server），并互相注册，形成注册集群，使用本地host进行映射修改
 *                      修改服务和消费模块，注册到集群上
 *               服务集群：修改配置文件，注意：服务集群的spring.application.name应相同，这样才能进行负载均衡
 *
 *      (4)调用80消费者模块，负载均衡访问服务,注意url和restTemplate
 *
 */
public class BaseService {}
