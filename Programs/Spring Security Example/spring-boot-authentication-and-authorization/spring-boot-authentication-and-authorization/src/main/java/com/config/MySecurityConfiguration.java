package com.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MySecurityConfiguration {

	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		System.out.println("i cam here");
		return 
				httpSecurity.authorizeHttpRequests(http->{
					// rules 
					http.requestMatchers("/public/**").permitAll();  // no auth required
					http.requestMatchers("/useroradmin/**").hasAnyRole("USER");   // USER ROLE as well as ADMIN can access 
					http.requestMatchers("/admin/**").hasAnyRole("ADMIN");   // ADMIN ROLE can access 
				}).
				formLogin(form->form.permitAll())
				.build();
	}
	
	@Bean
	public UserDetailsService provideUserDetails() {
		List<UserDetails> listOfUser = new ArrayList<UserDetails>();
		
		
		// custom encoder password 
		// type of user is normal user 
		String userName = "Raj";
		String userPassword = passwordEncoder().encode("raj@123");
		listOfUser.add(User.withUsername(userName).password(userPassword).roles("USER").build());
		
		// type of user is admin user 
		String adminName = "Admin";
		String adminPassword = passwordEncoder().encode("admin@123");
		listOfUser.add(User.withUsername(adminName).password(adminPassword).roles("USER","ADMIN").build());
		
		
		return new InMemoryUserDetailsManager(listOfUser);
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
