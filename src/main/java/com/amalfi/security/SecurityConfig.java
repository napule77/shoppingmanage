package com.amalfi.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests()
//            .antMatchers("/login", "/token","/v2/api-docs",
//                    "/configuration/ui",
//                    "/swagger-resources/**",
//                    "/configuration/security",
//                    "/swagger-ui.html",
//                    "/user-controller",
//                    "/webjars/**").permitAll() // Exclude login and token endpoints from authentication
            .anyRequest().permitAll();
    }
}