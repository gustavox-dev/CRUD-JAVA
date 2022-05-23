package com.example.Animes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Animes.client.AnimesClient;
import com.example.Animes.entities.Data;
import com.example.Animes.entities.DataResponse;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class AnimeController {

	@Autowired
	private AnimesClient client;

	// ------ LISTA DE ANIMES
	@GetMapping(value = "/trending/anime")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<DataResponse> listaAnimes() {

		DataResponse data = this.client.findAnimeList();

		return ResponseEntity.ok(data);
	}

	// ----- LISTA DE MANGAS
	@GetMapping(value = "/trending/manga")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<DataResponse> getMangaList() {

		DataResponse data = this.client.findMangaList();

		return ResponseEntity.ok(data);
	}

	// ----- LISTA DE CATEGORIAS
	@GetMapping(value = "/categories")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<DataResponse> getCategoriesList() {

		DataResponse data = this.client.findCategories();

		return ResponseEntity.ok(data);
	}

	// ----- LISTA DE EPISODIOS
	@GetMapping(value = "/episodes")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<DataResponse> getEpAnime() {

		DataResponse data = this.client.findEpAnime();

		return ResponseEntity.ok(data);
	}

	// ----- BUSCA O ANIME PELO ID
	@GetMapping(value = "/anime/{id}")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Data> getAnimeById(@PathVariable String id) {

		Data data = this.client.findAnimeById(id);

		return ResponseEntity.ok(data);
	}

	// ----- BUSCA O MANGA PELO ID
	@GetMapping(value = "/manga/{id}")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Data> getMangaById(@PathVariable String id) {

		Data data = this.client.findMangaById(id);

		return ResponseEntity.ok(data);
	}

	// ----- BUSCA A CATEGORIA PELO ID
	@GetMapping(value = "/categories/{id}")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Data> getCategorieById(@PathVariable String id) {

		Data data = this.client.findCategoryById(id);
		System.out.println(data);

		return ResponseEntity.ok(data);
	}

	// ----- BUSCA O EPISODIO PELO ID
	@GetMapping(value = "/episodes/{id}")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Data> getEpisodeById(@PathVariable String id) {

		Data data = this.client.findEpisodeById(id);

		return ResponseEntity.ok(data);
	}

	// ----- BUSCA ANIME POR TEXTO
	@GetMapping(value = "/anime={text}")
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<DataResponse> getAnimeText(@PathVariable String text) {

		DataResponse data = this.client.findTextAnime(text);
		System.out.println(data);

		return ResponseEntity.ok(data);
	}

}
