package com.example.demo;

import com.example.demo.model.Eleveur;
import com.example.demo.service.EleveurService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.demo.repository")

public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}
	@Bean
	public CommandLineRunner demoData(EleveurService eleveurService) {
		return args -> {
			Eleveur course = new Eleveur(1,"ismail ouali", "ismail@test.com", "root", "Darna", "22-22-22");
			eleveurService.saveEleveur(course);
		};
	}

}
