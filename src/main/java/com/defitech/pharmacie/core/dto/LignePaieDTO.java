package com.defitech.pharmacie.core.dto;

public class LignePaieDTO {
        private String nomProduit;
        private Integer quantite;
        private Double prixUnitaire;
        private Double totalLigne;

    public LignePaieDTO(String nomProduit, Integer quantite, Double prixUnitaire, Double totalLigne) {
        this.nomProduit = nomProduit;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.totalLigne = totalLigne;
    }

    public LignePaieDTO() {
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
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
