package kfhstu.controller;

import com.kfhstu.entity.Member;
import kfhstu.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 测试类
 * return：json数据格式
 */
@RestController
@Slf4j
public class MemberController {
    @Autowired
    private MemberService memberService;

    @RequestMapping("/member/get/{id}")
    public Member index(@PathVariable String id) {
        return memberService.queryMemberById(Long.valueOf(id));
    }
}
