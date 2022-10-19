package com.example.Animes.service;

import com.example.Animes.entities.Anime;
import com.example.Animes.entities.Animes;
import com.example.Animes.entities.DataOfAnime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class AnimeService {

    private final String uri = "https://kitsu.io/api/edge";

    private final RestTemplate restTemplate = new RestTemplate();

    public Anime animesEmTendencia() {
        return restTemplate.getForObject(uri + "/trending/anime", Anime.class);
    }

    public ResponseEntity<Animes> listaDeAnimes() {
        return restTemplate.getForEntity(uri + "/anime", Animes.class);
    }
    public Anime buscaAnimePorId(@PathVariable String id) {
        return restTemplate.getForObject(uri + "/anime/" + id, Anime.class);
    }

    public Anime listaDeCategoriasDosAnimes() {
        return restTemplate.getForObject(uri + "/categories", Anime.class);
    }

    // ----- BUSCA EP DE UM ANIME ESPECÍFICO
    public Anime listaDeEpisodios() {
        return restTemplate.getForObject(uri + "/episodes", Anime.class);
    }

    public DataOfAnime buscaCategoriaPorId(@PathVariable String id) {
        return restTemplate.getForObject(uri + "/categories/" + id, DataOfAnime.class);
    }

    public Anime listaDeMangas() {
        return restTemplate.getForObject(uri + "/manga", Anime.class);
    }

    public DataOfAnime buscaMangaPorId(@PathVariable String id) {
        return restTemplate.getForObject(uri + "/manga/" + id, DataOfAnime.class);
    }

    // ----- BUSCA ANIME POR TEXTO
    public Anime buscaAnimePorTitulo(@PathVariable String text) {
        return restTemplate.getForObject("/anime?filter[text]" + text, Anime.class);
    }

    // ----- BUSCA EPISODIO PELO ID
    public DataOfAnime buscaEpisodioPorId(@PathVariable String id) {
        return restTemplate.getForObject("/episodes/" + id, DataOfAnime.class);
    }

//    public DataResponse buscaAnime(String id) {
//        return new RestTemplate().getForEntity("" + id, DataResponse.class).getBody();
//    }

}
