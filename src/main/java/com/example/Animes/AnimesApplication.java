package com.example.Animes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class AnimesApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AnimesApplication.class, args);
	}

}
