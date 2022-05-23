package com.example.Animes.service;

import org.springframework.stereotype.Service;

import com.example.Animes.entities.Data;

import reactor.core.publisher.Flux;

@Service
public interface AnimeService {
	
	
	public Flux<Data> getAnimeList();
	
	
}
