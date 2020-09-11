package com.example.springbootupload.service.impl;

import com.example.springbootupload.service.IMemberService;
import com.example.springbootupload.vo.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements IMemberService {
    @Override
    public String get(long mid) {
        Member vo = new Member();
        vo.setMid(mid);
        vo.setName("King");
        vo.setSalary(5000.00);
        return null;
    }
}
