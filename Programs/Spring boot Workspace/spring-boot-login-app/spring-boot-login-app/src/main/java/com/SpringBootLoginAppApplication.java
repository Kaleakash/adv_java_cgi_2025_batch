package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// by default it scan current package as well as sub package of current package 
// to enable @Component, @Controller, @Service and @Repository annotation 
@SpringBootApplication(scanBasePackages = "com")
public class SpringBootLoginAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoginAppApplication.class, args);
		System.out.println("spring boot up!");
	}

}
