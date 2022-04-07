package com.training.jpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EntityScan("com.training.jpademo.entity")
@EnableJpaRepositories("com.training.jpademo.repository")
@SpringBootApplication
public class Subtask5Application {

	public static void main(String[] args) {
		SpringApplication.run(Subtask5Application.class, args);
	}

}
