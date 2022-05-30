package com.simplon.filmothequeapplication.storage.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "film")
@Getter
@Setter
@ToString
public class FilmEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private Long filmId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "prix", nullable = false)
    private Integer prix;

    @Column(name = "stock", nullable = false)
    private Integer stock;

//    Plusieurs Film peut avoir la meme langue
    @ManyToOne
    @JoinColumn(name = "langue_fk")
    private LangueEntity langue;
}
