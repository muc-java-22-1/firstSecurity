package com.example.firstsecurity.security;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<TestUser, String> {

    Optional<TestUser> findByUsername(String s);
}
