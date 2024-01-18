package com.kfhstu.service.impl;

import com.kfhstu.dao.MemberDao;
import com.kfhstu.entity.Member;
import com.kfhstu.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * service层实现类
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {

    @Resource
    private MemberDao memberDao;

    @Override
    public Member queryMemberById(Long id) {
        return memberDao.queryMemberById(id);
    }

    @Override
    public int save(Member member) {
        return memberDao.saveMember(member);
    }
}
