package com.example;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = {"com.example.controllers", "com.example.primeraApi", "com.example.repositories"})

@SpringBootApplication
@EntityScan(basePackages = "com.example.entities")
@EnableJpaRepositories(basePackages = "com.example.repositories")
@ComponentScan(basePackages = "com.example")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
