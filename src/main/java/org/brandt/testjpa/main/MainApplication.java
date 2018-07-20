package org.brandt.testjpa.main;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(EntityRepository repository) {
		return (args) -> {
			EntityEntry entry = new EntityEntry();
			entry.Name = "Rofl";
			entry.id = "nougat";
			repository.save(entry);
		};	
	}
	
	
}
