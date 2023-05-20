package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//라우처 역할, 클라이언트 요청에 맞는 메서드 실행 가능
public class TestController {
    //localhost:1234/test 접속 시 Hello World 보임
    @GetMapping("/test")// /test GET 요청이 오면 test() 메서드 실행
    public String test(){
        return "Hello world";
    }
}
