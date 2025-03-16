package com.skyking.skyking_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

/*
 * @EnableJpaRepositories(basePackages = "com.skyking.skyking_app.repository")
 * 
 * @EntityScan(basePackages = "com.skyking.skyking_app.entity")
 */
public class SkykingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkykingAppApplication.class, args);
	}

}
