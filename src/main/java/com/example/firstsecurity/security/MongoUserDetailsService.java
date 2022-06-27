package com.example.firstsecurity.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MongoUserDetailsService implements UserDetailsService {

    private final UserRepository repository;

    public List<TestUser> loadAllUsers(){
        return repository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var tmp = repository.findByUsername(username);
        System.out.println(tmp);
        var tmp2 = tmp
                .map(user -> new User(user.getUsername(), user.getPassword(), user.getAuthorities()))
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        System.out.println(tmp2);
        return tmp2;
    }

    public void addUser(TestUser user) {
        repository.save(user);
    }
}