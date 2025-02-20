package com.springjpapractice.restapipractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springjpapractice.restapipractice")
public class RestapipracticeApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestapipracticeApplication.class, args);
	}

}
