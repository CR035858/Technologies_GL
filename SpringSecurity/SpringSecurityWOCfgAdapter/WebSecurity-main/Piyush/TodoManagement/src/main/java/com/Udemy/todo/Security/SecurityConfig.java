package com.Udemy.todo.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration

public class SecurityConfig {

	@Bean
	public static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// TO create Basic Authentication i.e. Pop-up will be open from browser at the
	// time of login

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf().disable().authorizeHttpRequests((authorize) -> {
			authorize.anyRequest().authenticated();
		}).httpBasic(Customizer.withDefaults());

		return http.build();
	}

	// in-Memory Authentication

	@Bean
	public UserDetailsService userDetailsService() {

		UserDetails piyush = User.builder().username("user1").password(passwordEncoder().encode("piyush"))
				.roles("ADMIN").build();
		UserDetails mohit = User.builder().username("user2").password(passwordEncoder().encode("mohit")).roles("USER")
				.build();

		/*
		 * UserDetails piyush = User.builder().username("admin").password(passwordEncoder().encode("piyush"))
				.roles("ADMIN").build();
		UserDetails mohit = User.builder().username("admin").password(passwordEncoder().encode("mohit")).roles("USER")
				.build();
		 */
		return new InMemoryUserDetailsManager(piyush, mohit);

	}

}
