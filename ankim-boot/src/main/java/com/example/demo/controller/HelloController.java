package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController //  REST API 컨트롤러 선언
@RequestMapping("/api") //  기본 URL 설정
public class HelloController {

    // 1️⃣ GET 요청: 단순한 인사말 반환
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }

    // 2️⃣ GET 요청: URL 파라미터 받기
    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    // 3️⃣ POST 요청: JSON 데이터 받기
    @PostMapping("/echo")
    public String echo(@RequestBody String message) {
        return "You said: " + message;
    }
}