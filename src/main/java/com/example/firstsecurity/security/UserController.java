package com.example.firstsecurity.security;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final MongoUserDetailsService userDetailsService;

    @GetMapping
    public List<TestUser> allUsers(){
        return userDetailsService.loadAllUsers();
    }

    @PostMapping
    public void addUser(@RequestBody TestUser user){
        userDetailsService.addUser(user);
    }
}
