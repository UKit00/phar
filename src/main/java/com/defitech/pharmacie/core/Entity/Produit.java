package com.defitech.pharmacie.core.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "produit")
public class Produit {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idProduit")
    private Long idPr;

    @Column(name = "nomPro", nullable = false)
    private String nom;

    @Column(name = "description")
    private String description;

    @Column(name = "prixProd", nullable = false)
    private Double prix;

    @Column(name = "qtestock")
    private Integer quantiteStock;

    public Produit() {
    }

    public Produit(Long idPr, String nom, String description, Double prix, Integer quantiteStock) {
        this.idPr = idPr;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantiteStock = quantiteStock;
    }

    // Getters et setters
    public Long getIdPr() {
        return idPr;
    }

    public void setIdPr(Long idPr) {
        this.idPr = idPr;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Integer getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(Integer quantiteStock) {
        this.quantiteStock = quantiteStock;
    }


}
