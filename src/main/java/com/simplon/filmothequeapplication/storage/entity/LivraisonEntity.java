package com.simplon.filmothequeapplication.storage.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "livraison")
@Getter
@Setter
@ToString
public class LivraisonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "livraison_id")
    private Long livraisonId;

    @Column(name = "prix", nullable = false)
    private Long prix;

    @Column(name = "type_livraison", nullable = false)
    private String typeLivraison;

}
