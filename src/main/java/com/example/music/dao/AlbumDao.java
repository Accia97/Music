package com.example.music.dao;

import java.util.Set;

import com.example.music.model.Album;

public interface AlbumDao {

    Album save(Album album);

    Album findById(Integer albumId);

    Album update(Integer albumId, Album album);

    Album deleteById(Integer albumId);

    Set<Album> findAll();

}