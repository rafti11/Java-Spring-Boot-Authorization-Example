package com.example.login.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class TestController {
    

    @GetMapping("test")
    public ResponseEntity<String> test() {

        return ResponseEntity.ok("All works fine!!!");

    }
}
