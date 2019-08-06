package com.becomingmachinic.apt.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import com.fasterxml.jackson.databind.ObjectMapper;

@EnableAsync
@SpringBootApplication
public class AptServerApplication {
	public static void main(final String... args) {
		SpringApplication.run(AptServerApplication.class, args);
	}
	
	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
}
