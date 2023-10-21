package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemonApiApplication {

	public static void main(String[] args) {

		System.out.println("application started");
		SpringApplication.run(DemonApiApplication.class, args);
		System.out.println("application running now");
	}

}
