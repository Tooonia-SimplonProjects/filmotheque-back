package com.simplon.filmothequeapplication.service;

import com.simplon.filmothequeapplication.storage.entity.FilmEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public interface FilmService {

    FilmEntity createFilm(FilmEntity filmEntity);
//    FilmDao createFilm(FilmDao filmDao);

    List<FilmEntity> getAllFilms() throws IOException;
//The new implementation by SimpleJpaRepository is: Optional<T> findById(ID id)
    Optional<FilmEntity> getFilmById(Long id) throws IOException;

    FilmEntity updateFilm(FilmEntity filmEntity);
//TODO: ide a Map<String, String> a message-t hivatott kiirni mint return value?
    Map<String, String> deleteFilm(Long id);
}
