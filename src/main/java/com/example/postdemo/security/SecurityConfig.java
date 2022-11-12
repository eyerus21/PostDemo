//package com.example.postdemo.security;
//
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//@RequiredArgsConstructor
//public class SecurityConfig {
//
//    private final UserDetailsService userDetailsService;
//    private final JwtFilter jwtFilter;
//
//
//    @Bean
//    public UserDetailsService userDetailsService(){
//        return userDetailsService;
//    }
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/api/v1/user/authenticate").permitAll()
//                //.antMatchers("/api/v1/user")
//                .anyRequest()
//                .authenticated()
//                .and()
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//
//    }
//}
