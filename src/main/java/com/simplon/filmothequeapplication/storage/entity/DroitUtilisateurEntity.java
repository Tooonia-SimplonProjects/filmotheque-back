package com.simplon.filmothequeapplication.storage.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "droit_utilisateur")
@Getter
@Setter
@ToString
public class DroitUtilisateurEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "droit_utilisateur_id")
    private Long droitUtilisateurId;

    @Column(name = "type_utilisateur", nullable = false)
    private String typeUtilisateur;

}
