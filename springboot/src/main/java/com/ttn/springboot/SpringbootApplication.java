package com.ttn.springboot;

import com.ttn.springboot.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringbootApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		
		
	}
	
	@Bean
	public User getUser(){
		
		return  new User("username","password");
	
	}
}
