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

    @GetMapping("/publicpage")
    public String publicEndpoint() {
        return "public";
    }
    @GetMapping("/userpage")
    public String userEndpoint() {
        return "user";
    }
    @GetMapping("/adminpage")
    public String adminEndpoint() {
        return "admin";
    }

    @GetMapping("/authenticated")
    public String authenticatedEndpoint() {
        return "authenticated";
    }
}
