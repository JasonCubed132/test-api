package com.testurl.Test;


import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@CrossOrigin(originPatterns = "*")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.printf("Serving %s%n", name);
        return String.format("Hello %s!", name);
    }

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/create_user")
    public Greeting create_user(@RequestParam(value = "firstname", defaultValue = "") String firstname) {
        return new Greeting(counter.incrementAndGet(), String.format(template, "hi"));
    }
    @PostMapping("/login")
    public Greeting login() {
        return new Greeting(counter.incrementAndGet(), String.format(template, "hi"));
    }
}
