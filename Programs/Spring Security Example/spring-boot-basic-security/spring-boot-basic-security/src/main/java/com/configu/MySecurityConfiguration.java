package com.configu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration				// like xml or properties files 
@EnableWebSecurity
public class MySecurityConfiguration {

	@Bean
	public UserDetailsService provideUserDetails() {
		List<UserDetails> listOfUser = new ArrayList<UserDetails>();
		
		// default encoder 
//		listOfUser.add(User.withDefaultPasswordEncoder().username("raj").password("123").build());
//		listOfUser.add(User.withDefaultPasswordEncoder().username("ravi").password("456").build());
//		listOfUser.add(User.withDefaultPasswordEncoder().username("ram").password("789").build());
		
		// no encoder 
		
//		listOfUser.add(User.withUsername("raj").password("{noop}123").build());
//		listOfUser.add(User.withUsername("ravi").password("{noop}456").build());
		
		// custom encoder password 
		String user1 = "Raj";
		String passwordText  = "123";
		String passwordEncoder = passwordEncoder().encode(passwordText);
		System.out.println("Text password "+passwordText);
		System.out.println("encoder passwrod "+passwordEncoder);
		
		listOfUser.add(User.withUsername(user1).password(passwordEncoder).build());
		
		return new InMemoryUserDetailsManager(listOfUser);
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}



