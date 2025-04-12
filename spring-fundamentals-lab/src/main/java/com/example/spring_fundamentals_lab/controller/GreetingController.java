package com.example.spring_fundamentals_lab.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class GreetingController {

    @GetMapping
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/{name}")
    public String greetName(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/add/{num1}/{num2}")
    public String add(@PathVariable int num1, @PathVariable int num2) {
        return "Sum: " + (num1 + num2);
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public String multiply(@PathVariable int num1, @PathVariable int num2) {
        return "Product: " + (num1 * num2);
    }
}    // Small change to trigger pull request


