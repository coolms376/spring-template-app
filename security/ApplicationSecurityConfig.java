package com.example.template.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ApplicationSecurityConfig{

    @Autowired
    private ApplicationAuthenticationProvider applicationAuthenticationProvider;

    @Bean
    public SecurityFilterChain config(HttpSecurity http){

        http.authenticationManager();
        

        return http.build();
    }


    @Bean
    public PasswordEncoder getPasswordENcoder(){
        return new BCryptPasswordEncoder();
    }






}
