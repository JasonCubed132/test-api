package com.testurl.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class TestApplication {
	public static void main(String[] args) {
//		Connection c = null;
//
//		try {
//			Class.forName("org.postgresql.Driver");
//			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "test", "test");
//		}
//
//		catch (Exception e) {
//			e.printStackTrace();
//			System.err.println(e.getClass().getName() + ": " + e.getMessage());
//			System.exit(0);
//		}

		System.out.println("Success!");
		SpringApplication.run(TestApplication.class, args);
	}

//	@Bean
//	public WebMvcConfigurer configurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/*").allowedOrigins("*");
//			}
//		};
//	}
}
