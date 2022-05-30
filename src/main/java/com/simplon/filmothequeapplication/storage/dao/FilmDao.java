package com.simplon.filmothequeapplication.storage.dao;

import com.simplon.filmothequeapplication.storage.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmDao extends JpaRepository<FilmEntity, Long> {

//    TODO: need or no need, as we have T getById(ID id). My "id" is of type Long what is set for JpaRepository<FilmEntity, Long> ???
//    FilmEntity findById(Long id);
}
