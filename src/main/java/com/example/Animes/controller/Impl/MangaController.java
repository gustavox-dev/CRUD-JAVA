package com.example.Animes.controller.Impl;

import com.example.Animes.controller.IMangaController;
import com.example.Animes.entities.Manga;
import com.example.Animes.service.MangaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MangaController implements IMangaController {

    private final MangaService service;

    public Manga mangasEmTendencia() {
        return service.mangasEmTendencia();
    }

    public Manga buscaMangaPorId(String id) {
        return service.buscaMangaPorId(id);
    }
}
