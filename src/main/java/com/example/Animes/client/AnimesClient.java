package com.example.Animes.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.Animes.entities.Data;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Service
@Slf4j
public class AnimesClient {
	
	@Autowired
	private WebClient webClientAnimes;
		
	
	public Flux<Data> getAnimeList() {
		return webClientAnimes
				.method(HttpMethod.GET)
				.uri("/anime")
				.header("Content-type", "application/vnd.api+json")
				.retrieve()
				.bodyToFlux(Data.class);
	}
	
	
}
