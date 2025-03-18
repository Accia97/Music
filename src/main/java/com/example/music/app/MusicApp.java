package com.example.music.app;

import java.util.Set;

import com.example.music.dao.ArtistaDao;
import com.example.music.dao.ArtistaDaoImpl;
import com.example.music.model.Artista;

public class MusicApp {

    public static void main(String[] args) {
        /*
         * Artista artista = new Artista(); artista.setNome("Beatles");
         * artista.setNazione("Regno Unito"); artista.setAnnoInizio(1962);
         * artista.setDataInserimento(LocalDateTime.now());
         */

        try {
            ArtistaDao artistaDao = new ArtistaDaoImpl();
            // artistaDao.save(artista);

            Set<Artista> artisti = artistaDao.findAll();
            for (Artista artista : artisti) {
                System.out.println(artista);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}