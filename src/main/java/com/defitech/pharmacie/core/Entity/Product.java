package com.defitech.pharmacie.core.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "produit")
public class Product {

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

    @Column(name = "categ")
    private String categorie;


    public Product() {
    }

    public Product(Long idPr, String nom, String description, Double prix, Integer quantiteStock, String categorie) {
        this.idPr = idPr;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantiteStock = quantiteStock;
        this.categorie = categorie;
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

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

}
