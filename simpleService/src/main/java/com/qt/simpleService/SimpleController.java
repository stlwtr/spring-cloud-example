package com.qt.simpleService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/")
    public String home() {
        return "hello world";
    }

    @GetMapping("hi")
    public String hi() {
        return "hi";
    }
}
