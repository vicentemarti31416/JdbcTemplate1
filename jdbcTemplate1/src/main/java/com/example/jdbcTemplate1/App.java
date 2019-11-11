package com.example.jdbcTemplate1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.jdbcTemplate.service.UserService;

public class App {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService.findById(1L).getUsername());
	}
}
