package com.example.Animes.controller.Impl;

import com.example.Animes.controller.IAnimeController;
import com.example.Animes.entities.Anime;
import com.example.Animes.entities.Animes;
import com.example.Animes.entities.DataOfAnime;
import com.example.Animes.service.AnimeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AnimeController implements IAnimeController {

    private final AnimeService service;

    public Anime animesEmTendencia() {
        return service.animesEmTendencia();
    }

    public ResponseEntity<Animes> listaDeAnimes() {
        return service.listaDeAnimes();
    }

    public Anime listaDeCategoriasDosAnimes() {
        return service.listaDeCategoriasDosAnimes();
    }

    public Anime listaDeEpisodios() {
        return service.listaDeEpisodios();
    }

    public Anime buscaAnimePorId(String id) {
        return service.buscaAnimePorId(id);
    }

    public DataOfAnime buscaCategoriaPorId(String id) {
        return service.buscaCategoriaPorId(id);
    }

    public DataOfAnime buscaEpisodioPorId(String id) {
        return service.buscaEpisodioPorId(id);
    }

    public Anime buscaAnimePorTitulo(String text) {
        return service.buscaAnimePorTitulo(text);
    }
}
