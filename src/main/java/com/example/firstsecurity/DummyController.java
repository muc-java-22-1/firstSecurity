package com.example.firstsecurity;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DummyController {
    @GetMapping("/{name}")
    public String dummy(@PathVariable String name){
        return "Hallo " + name;
    }

    @GetMapping("/public")
    public String publicEndpoint() {
        return "public";
    }
    @GetMapping("/user")
    public String userEndpoint() {
        return "user";
    }
    @GetMapping("/admin")
    public String adminEndpoint() {
        return "admin";
    }
}
