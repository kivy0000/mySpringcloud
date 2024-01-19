package com.kfhstu.controller;

import com.kfhstu.entity.Member;
import com.kfhstu.entity.Result;
import com.kfhstu.service.MemberOpenFeignService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * openfeign形式的controller
 */
@RestController
public class MemberOpenFeignController {

    @Resource
    private MemberOpenFeignService memberOpenFeignService;

    @RequestMapping("/member/openfeign/get/{id}")
        public Member index(@PathVariable Long id) {
            return memberOpenFeignService.getMemberById(id);
        }

}
