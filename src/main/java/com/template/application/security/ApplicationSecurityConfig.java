package com.template.application.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;

@Configuration
public class ApplicationSecurityConfig{

   

    @Bean
    public WebSecurityCustomizer config(){

        return (web) -> web.ignoring().antMatchers("/public/**");

        
    }


    @Bean
    public PasswordEncoder getPasswordENcoder(){
        return new BCryptPasswordEncoder();
    }






}
