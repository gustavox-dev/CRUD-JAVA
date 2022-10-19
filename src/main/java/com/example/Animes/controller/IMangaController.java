package com.example.Animes.controller;

import com.example.Animes.entities.Manga;
import com.example.Animes.entities.Mangas;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface IMangaController {
    @RequestMapping(method = RequestMethod.GET, value = "/trending/manga")
    Manga mangasEmTendencia();

    @RequestMapping(method = RequestMethod.GET, value = "/manga/{id}")
    Manga buscaMangaPorId(@PathVariable String id);
}
