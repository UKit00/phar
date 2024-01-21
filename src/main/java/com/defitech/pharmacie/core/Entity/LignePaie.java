package com.defitech.pharmacie.core.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "ligneP")
public class LignePaie {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idLign")
    private Long idLigne;

    @ManyToOne
    @JoinColumn(name = "idPaie", nullable = false)
    private Paiement paiement;

    @ManyToOne
    @JoinColumn(name = "idProduit", nullable = false)
    private Produit produit;

    @Column(name = "quantite", nullable = false)
    private Integer quantite;

    @Column(name = "prix_unitaire", nullable = false)
    private Double prixUnitaire;

    @Column(name = "total_ligne")
    private Double totalLigne;

    // Constructeurs, getters et setters

    public LignePaie() {
    }

    // Ajouter d'autres constructeurs si nécessaire

    // Getters et setters
    public Long getIdLigne() {
        return idLigne;
    }

    public void setIdLigne(Long idLigne) {
        this.idLigne = idLigne;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(Double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Double getTotalLigne() {
        return totalLigne;
    }

    public void setTotalLigne(Double totalLigne) {
        this.totalLigne = totalLigne;
    }
}
