package com.spring.mongo.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;


@SpringBootApplication
@EnableMongoRepositories
public class SpringBootMongoDBApplication {

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDBApplication.class, args);
	}


	@Bean
	CommandLineRunner runner() {
		return args -> {

		};
	}

}
