package com.example.Animes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Animes.client.AnimesClient;
import com.example.Animes.entities.Data;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
public class AnimeController {

	@Autowired
	private AnimesClient client;
	
	@GetMapping(value = "/anime")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Flux<Data>> listaAnimes() {
		
		Flux<Data> data = this.client.getAnimeList();
		
		return ResponseEntity.ok(data);
	}
	
	
	//public Flux<Data> getAnimesList(){
		//return client.getAnimeList();
	//}
	
//	
//	@GetMapping(value = "/anime/{id}")
//	public Mono<Data> getAnimeById(@PathVariable String id) {
//		return client
//				.method(HttpMethod.GET)
//				.uri("/anime/" + id)
//				.header("Content-type", "application/vnd.api+json")
//				.retrieve()
//				.bodyToMono(Data.class);
//	}
}
