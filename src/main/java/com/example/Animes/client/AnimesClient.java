package com.example.Animes.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.Animes.entities.Data;
import com.example.Animes.entities.DataResponse;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AnimesClient {
	
	@Autowired
	private WebClient webClientAnimes;
		
	
	public DataResponse findAnimeList() {
		return webClientAnimes
				.method(HttpMethod.GET)
				.uri("/trending/anime")
				.header("Content-type", "application/vnd.api+json")
				.retrieve()
				.bodyToFlux(DataResponse.class)
				.blockLast();
				
	}
	
	
	public Data findAnimeById(@PathVariable String id) {
		return webClientAnimes
				.method(HttpMethod.GET)
				.uri("/anime/" + id)
				.header("Content-type", "application/vnd.api+json")
				.retrieve()
				.bodyToMono(Data.class)
				.block();
	}
	
	public DataResponse findCategories() {
		return webClientAnimes
				.method(HttpMethod.GET)
				.uri("/categories")
				.header("Content-type", "application/vnd.api+json")
				.retrieve()
				.bodyToFlux(DataResponse.class)
				.blockLast();
	}
	
	// ----- BUSCA EP DE UM ANIME ESPECÍFICO
		public DataResponse findEpAnime() {
			return webClientAnimes
					.method(HttpMethod.GET)
					.uri("/episodes")
					.header("Content-type", "application/vnd.api+json")
					.retrieve()
					.bodyToFlux(DataResponse.class)
					.blockLast();
		}
	
	public Data findCategoryById(@PathVariable String id) {
		return webClientAnimes
				.method(HttpMethod.GET)
				.uri("/categories/" + id)
				.header("Content-type", "application/vnd.api+json")
				.retrieve()
				.bodyToMono(Data.class)
				.block();
	}
	
	public DataResponse findMangaList() {
		return webClientAnimes
				.method(HttpMethod.GET)
				.uri("/trending/manga")
				.header("Content-type", "application/vnd.api+json")
				.retrieve()
				.bodyToFlux(DataResponse.class)
				.blockLast();
	}
	
	public Data findMangaById(@PathVariable String id) {
		return webClientAnimes
				.method(HttpMethod.GET)
				.uri("/manga/" + id)
				.header("Content-type", "application/vnd.api+json")
				.retrieve()
				.bodyToMono(Data.class)
				.block();
	}
	
	// ----- BUSCA ANIME POR TEXTO
	public DataResponse findTextAnime(@PathVariable String text) {
		return webClientAnimes
				.method(HttpMethod.GET)
				.uri("/anime?filter[text]" + text)
				.header("Content-type", "application/vnd.api+json")
				.retrieve()
				.bodyToFlux(DataResponse.class)
				.blockLast();
	}
	
	// ----- BUSCA EPISODIO PELO ID
	public Data findEpisodeById(@PathVariable String id) {
		return webClientAnimes
				.method(HttpMethod.GET)
				.uri("/episodes/" + id)
				.header("Content-type", "application/vnd.api+json")
				.retrieve()
				.bodyToMono(Data.class)
				.block();
	}
	
}
