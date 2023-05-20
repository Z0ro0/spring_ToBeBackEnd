package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
//퍼시스턴스 계층, 데이터베이스 관련 로직 처리
    //member라는 이름을 가진 테이블에 접근해서 클래스에 매핑하는 구현체
}

