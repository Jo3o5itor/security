package com.Bcript.safety.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	//serve para encriptar uma senha
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	//serve para fazer o login sem ter a necessidade do token
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
    	http.csrf(csrf -> csrf.disable());
    	http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
    	return http.build();
    }
	
}
