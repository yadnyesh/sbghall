package io.yadnyesh.sbghall.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String returnHello() {
        return "Hello to you from GCP!";
    }

    @GetMapping("/home")
    public String returnHelloFromHome(@RequestParam(defaultValue = "Yadnyesh", required = false)String name, Model model) {
        model.addAttribute("user", name);
        return "Hello " + name;
    }
}
