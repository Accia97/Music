package com.example.music.dao;
import com.example.music.model.Artista;

import java.util.Set;

public interface ArtistaDao {
    Artista save (Artista artista);
    Artista findById(Integer artistaId);
    Artista update(Integer artistaId, Artista artista);
    Artista deleteById(Integer artistaId);
    Set<Artista> findAll();
}
