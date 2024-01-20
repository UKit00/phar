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
    @Column(nullable = false, length = 50)
    String nom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
