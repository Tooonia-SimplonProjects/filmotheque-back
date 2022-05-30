package com.simplon.filmothequeapplication.storage.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "langue")
@Getter
@Setter
@ToString
public class LangueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "langue_id")
    private Long langueId;

    @Column(name = "langue_nom", nullable = false)
    private String langueNom;

}
