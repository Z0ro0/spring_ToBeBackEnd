package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    //localhost:1234/test 접속 시 Hello World 보임 
    @GetMapping("/test")
    public String test(){
        return "Hello world";
    }
}
