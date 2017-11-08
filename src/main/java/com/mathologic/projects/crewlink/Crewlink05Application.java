package com.mathologic.projects.crewlink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@ComponentScan(basePackages = { "com.mathologic.projects.crewlink",
		"com.mathologic.projects.controllers",
		"com.mathologic.projects.utility","com.mathologic.projects.mongo.models","com.mathologic.projects.mongo.controllers"})
@EntityScan("com.mathologic.projects.models")

@EnableJpaRepositories("com.mathologic.projects.repositories")
@EnableMongoRepositories("com.mathologic.projects.mongo.repositories")
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class Crewlink05Application {

	public static void main(String[] args) {
		SpringApplication.run(Crewlink05Application.class, args);
	}
}
