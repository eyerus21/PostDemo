package com.example.postdemo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    private final String secret ="top-secret";
    private final long expiration= 5*60*60*60;
    private final long refreshExpiration= 5*60*60*60*60;



}
