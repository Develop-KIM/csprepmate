package com.developkim.csprepmate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ReactController {

    @GetMapping("/api")
    public String hello() {
        return "현재 서버 시간: " + new Date();
    }
}
