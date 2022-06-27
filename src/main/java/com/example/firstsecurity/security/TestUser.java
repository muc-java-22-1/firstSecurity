package com.example.firstsecurity.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;

@Data
@Document(collection="users")
@NoArgsConstructor
@AllArgsConstructor
public class TestUser {
    @Id
    private String id;
    private String username;
    private String password;

}
