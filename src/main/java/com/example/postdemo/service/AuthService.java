package com.example.postdemo.service;

import com.example.postdemo.domain.dto.request.LoginRequest;
import com.example.postdemo.domain.dto.request.RefreshTokenRequest;
import com.example.postdemo.domain.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
