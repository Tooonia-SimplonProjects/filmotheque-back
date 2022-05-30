package com.simplon.filmothequeapplication.storage.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "commande")
@Getter
@Setter
@ToString
public class CommandeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commande_id")
    private Long commandeId;

    @Column(name = "numero_facture", nullable = false)
    private Long numeroFacture;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "montant_total", nullable = false)
    private Long montantTotal;

    @ManyToOne
    @JoinColumn(name = "livraison_fk")
    private LivraisonEntity livraison;

    @ManyToOne
    @JoinColumn(name = "client_fk")
    private ClientEntity commande;

}
