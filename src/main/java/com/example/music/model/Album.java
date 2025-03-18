package com.example.music.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Album {
    private Integer albumId;
    private String titolo;
    private LocalDate dataUscita;
    private String genere;
    private Artista artista;
    private LocalDateTime dataInserimento;
    private LocalDateTime dataAggiornamento;

    public Album(Integer albumId, String titolo, LocalDate dataUscita, String genere, Artista artista, LocalDateTime dataInserimento, LocalDateTime dataAggiornamento) {
        this.albumId = albumId;
        this.titolo = titolo;
        this.dataUscita = dataUscita;
        this.genere = genere;
        this.artista = artista;
        this.dataInserimento = dataInserimento;
        this.dataAggiornamento = dataAggiornamento;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataUscita() {
        return dataUscita;
    }

    public void setDataUscita(LocalDate dataUscita) {
        this.dataUscita = dataUscita;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public LocalDateTime getDataInserimento() {
        return dataInserimento;
    }

    public void setDataInserimento(LocalDateTime dataInserimento) {
        this.dataInserimento = dataInserimento;
    }

    public LocalDateTime getDataAggiornamento() {
        return dataAggiornamento;
    }

    public void setDataAggiornamento(LocalDateTime dataAggiornamento) {
        this.dataAggiornamento = dataAggiornamento;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumId=" + albumId +
                ", titolo='" + titolo + '\'' +
                ", dataUscita=" + dataUscita +
                ", genere='" + genere + '\'' +
                ", artista=" + artista +
                ", dataInserimento=" + dataInserimento +
                ", dataAggiornamento=" + dataAggiornamento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(albumId, album.albumId) && Objects.equals(titolo, album.titolo) && Objects.equals(dataUscita, album.dataUscita) && Objects.equals(genere, album.genere) && Objects.equals(artista, album.artista) && Objects.equals(dataInserimento, album.dataInserimento) && Objects.equals(dataAggiornamento, album.dataAggiornamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId, titolo, dataUscita, genere, artista, dataInserimento, dataAggiornamento);
    }
}
