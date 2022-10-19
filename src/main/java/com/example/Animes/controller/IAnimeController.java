package com.example.Animes.controller;

import com.example.Animes.entities.Anime;
import com.example.Animes.entities.Animes;
import com.example.Animes.entities.DataOfAnime;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping(headers = "Content-type, application/vnd.api+json, Aceppt {application/vnd.api+json}", consumes = "application/vnd.api+json", produces = "application/vnd.api+json")
public interface IAnimeController {


    @RequestMapping(method = RequestMethod.GET, value = "/trending/anime")
    @GetMapping(value = "/trending/anime")
    Anime animesEmTendencia();

//    @RequestMapping(method = RequestMethod.GET, value = "/anime")
    @GetMapping(value = "/anime")
    ResponseEntity<Animes> listaDeAnimes();


    @RequestMapping(method = RequestMethod.GET, value = "/categories", consumes = "application/vnd.api+json")
    Anime listaDeCategoriasDosAnimes();

    @RequestMapping(method = RequestMethod.GET, value = "/episodes", headers = "application/vnd.api+json")
    Anime listaDeEpisodios();

    @RequestMapping(method = RequestMethod.GET, value = "/anime/{id}")
    Anime buscaAnimePorId(@PathVariable String id);


    @RequestMapping(method = RequestMethod.GET, value = "/categories/{id}")
    DataOfAnime buscaCategoriaPorId(@PathVariable String id);

    @RequestMapping(method = RequestMethod.GET, value = "/episodes/{id}")
    DataOfAnime buscaEpisodioPorId(@PathVariable String id);

    @RequestMapping(method = RequestMethod.GET, value = "/anime={text}")
    Anime buscaAnimePorTitulo(@PathVariable String text);

}
