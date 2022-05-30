package com.simplon.filmothequeapplication.storage.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "utilisateur")
@Getter
@Setter
@ToString
public class UtilisateurEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "utilisateur_id")
    private String utilisateurId;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "mod_de_passe", nullable = false)
    private String motDePasse;

    @ManyToOne
    @JoinColumn(name = "droit_utilisateur_fk")
    private DroitUtilisateurEntity droitUtilisateur;

}
