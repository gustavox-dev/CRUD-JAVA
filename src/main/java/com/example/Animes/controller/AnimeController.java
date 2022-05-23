package com.example.Animes.controller;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class AnimeController {

	WebClient client;

	public AnimeController(WebClient.Builder builder) {
		client = builder
				.defaultHeaders(headers -> {
					headers.add("Content-type", "application/vnd.api+json");
					headers.add("Aceppt", "application/vnd.api+json");
				})
				.baseUrl("https://kitsu.io/api/edge")
				.build();
	}

	@GetMapping(value = "/anime")
	@ResponseBody
	public Flux<Object> getAnimeList() {
		return client
				.method(HttpMethod.GET)
				.uri("/anime")
				.header("Content-type", "application/vnd.api+json")
				.retrieve()
				.bodyToFlux(Object.class);
	}
	
	@GetMapping(value = "/anime/{id}")
	public Mono<Object> getAnimeById(@PathVariable String id) {
		return client
				.method(HttpMethod.GET)
				.uri("/anime/" + id)
				.header("Content-type", "application/vnd.api+json")
				.retrieve()
				.bodyToMono(Object.class);
	}
}
