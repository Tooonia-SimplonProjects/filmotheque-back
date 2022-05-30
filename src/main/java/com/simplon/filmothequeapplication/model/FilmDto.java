package com.simplon.filmothequeapplication.model;

import com.simplon.filmothequeapplication.storage.entity.LangueEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FilmDto {
    private Long filmId;
    private String title;
    private Long prix;
    private Long stock;
    private LangueEntity langue;
}
