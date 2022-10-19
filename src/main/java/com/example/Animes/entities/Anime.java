package com.example.Animes.entities;


import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Anime {

    @Autowired
    private List<Animes> data;
}
