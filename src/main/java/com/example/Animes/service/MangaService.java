package com.example.Animes.service;

import com.example.Animes.entities.Manga;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class MangaService {

    private final String uri = "https://kitsu.io/api/edge";

    private final RestTemplate restTemplate = new RestTemplate();

    public Manga mangasEmTendencia() {
        return restTemplate.getForObject(uri + "/trending/manga" , Manga.class);
    }

    public Manga buscaMangaPorId(@PathVariable String id) {
        return restTemplate.getForObject(uri + id, Manga.class);
    }
}
