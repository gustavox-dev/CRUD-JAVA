package com.example.Animes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimesApplication {


//	@Bean
//	public WebClient webClientAnimes(WebClient.Builder builder) {
//		return  builder
//				.defaultHeaders(headers -> {
//					headers.add("Content-type", "application/vnd.api+json");
//					headers.add("Aceppt", "application/vnd.api+json");
//				})
//				.baseUrl("https://kitsu.io/api/edge")
//				.build();
//	}


    public static void main(String[] args) {
        SpringApplication.run(AnimesApplication.class, args);
    }

}
