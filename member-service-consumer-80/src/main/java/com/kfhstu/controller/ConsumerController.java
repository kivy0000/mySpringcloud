package com.kfhstu.controller;

import com.kfhstu.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 这个消费者的模块接受前端请求，通过restTemplate发送http请求，调用服务模块完成业务需求
 */
@SuppressWarnings("all")
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    //未使用集群薇服务，原生restTemplate调用
    //未使用集群负载均衡，固定指向服务端20000端口
//    public static final String MEMBER_SERVICE_PROVIDER_URL = "http://192.168.111.137:20000";
   /*
    @RequestMapping("/member/get/{id}")
    public Member index(@PathVariable String id) {
        return
                restTemplate.getForObject
                        (MEMBER_SERVICE_PROVIDER_URL + "/member/get/" + id, Member.class);
    }
    */


    //使用服务集群调用
    //使用集群负载均衡，轮询指向不同服务端
    public static final String MEMBER_SERVICE_PROVIDER_URL = "http://MEMBER-SERVICE-PROVIDER";



    @RequestMapping("/member/get/{id}")
    public Member index(@PathVariable String id) {
        System.out.println("接收到请求，发送给集群处理");
        return
                restTemplate.getForObject
                        (MEMBER_SERVICE_PROVIDER_URL + "/member/get/" + id, Member.class);
    }

}
