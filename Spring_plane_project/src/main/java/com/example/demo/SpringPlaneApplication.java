package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.example")
@EnableJpaRepositories(basePackageClasses = com.example.repository.Planerepo.class)
@EntityScan("com.example.*")
public class SpringPlaneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPlaneApplication.class, args);
	}

}
