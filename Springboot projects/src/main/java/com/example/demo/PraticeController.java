package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class PraticeController {
    @GetMapping("/")
    String HelloWorld() {
        return "This is my first web project";
    }
}
