package com.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloApplication.class, args);
		System.out.println("Welcome Spring_Boot");
	}

}