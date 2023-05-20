package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    //비즈니스 게층, 모든 비즈니스 로직 처리
    @Autowired//빈 주입
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();//멤버 목록 받기
    }
}