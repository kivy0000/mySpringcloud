package com.kfhstu.service;

import com.kfhstu.entity.Member;
import com.kfhstu.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 通过openFeign设置的service层
 * 这是一个接口
 */
@Service
@FeignClient(value = "MEMBER-SERVICE-PROVIDER")
public interface MemberOpenFeignService {
    @GetMapping(value = "/member/get/{id}")
    Member getMemberById(@PathVariable("id") Long id);
}
