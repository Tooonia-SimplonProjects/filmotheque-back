package com.simplon.filmothequeapplication.storage.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "detail_commande")
@Getter
@Setter
@ToString
public class DetailCommandeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detail_commande_id")
    private Long utilisateurId;

    @Column(name = "quantite", nullable = false)
    private Long quantite;

//    TODO: kell: accept 0 as a value, de nem lehet ures, vagy lehet?
    @Column(name = "remise")
    private String remise;

    @Column(name = "montant_detail_commande", nullable = false)
    private String montantDetailCommande;

    @ManyToOne
    @JoinColumn(name = "film_fk")
    private FilmEntity film;

    @ManyToOne
    @JoinColumn(name = "commande_fk")
    private CommandeEntity commande;
}
