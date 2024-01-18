package com.kfhstu.service;


import com.kfhstu.entity.Member;

/**
 * service层
 */
public interface MemberService {
    Member queryMemberById(Long id);
    int save(Member member);
}
