package com.simplon.filmothequeapplication.service.impl;

import com.simplon.filmothequeapplication.model.FilmDto;
import com.simplon.filmothequeapplication.service.FilmService;
import com.simplon.filmothequeapplication.storage.dao.FilmDao;
import com.simplon.filmothequeapplication.storage.entity.FilmEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class FilmServiceImpl implements FilmService {
//TODO: megnezni, h ide is kell-e az Exceptions-ok (vagy csak a Controller clas-ban?) es Log-og???
    @Autowired
    private FilmDao filmDao;

    @Override
//    public FilmDto createFilm(FilmDto filmDto) {
//        ModelMapper modelMapper = new ModelMapper();
//        OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class);
//        return filmDao.save(filmEntity);
//    }
    public FilmEntity createFilm(FilmEntity filmEntity) {

        return this.filmDao.save(filmEntity);
    }

    @Override
    public List<FilmEntity> getAllFilms() throws IOException {
        return this.filmDao.findAll();
    }

    @Override
    public Optional<FilmEntity> getFilmById(Long id) throws IOException {
        if (filmDao.findById(id).isPresent()) {
            return this.filmDao.findById(id);
        } else {
            throw new IllegalArgumentException("The id you are entering does not exist in the database");
        }
    }

    @Override
    public FilmEntity updateFilm(FilmEntity filmEntity) {

        return this.filmDao.save(filmEntity);
    }

    @Override
    public Map<String, String> deleteFilm(Long id) {

        // Total count of data before delete
        long beforeDelete = filmDao.count();

        filmDao.deleteById(id);

        // Total count of data after delete
        long afterDelete = filmDao.count();

        String messageValue = beforeDelete == afterDelete ? "Something went wrong!" : "Record deleted";

        Map<String, String> deleteMap = new HashMap<>();
        deleteMap.put("message", messageValue);

        return deleteMap;
    }
}
