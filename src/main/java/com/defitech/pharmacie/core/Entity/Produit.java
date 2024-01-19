package com.defitech.pharmacie.core.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idProduit")
    int id;
    String nom;
}
