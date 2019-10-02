package io.yadnyesh.sbghall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String returnHello() {
        return "Hello to you from GCP!";
    }

    @GetMapping("/home")
    public String returnHelloFromHome() {
        return "Hello From Spring Boot";
    }
}
