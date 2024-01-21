package com.defitech.pharmacie.core.dto;

public class ClientAchatDTO {
    private String nom;
    private String adresse;
    private String email;
    private Double totalAchat;

    public ClientAchatDTO(String nom, String adresse, String email, Double totalAchat) {
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.totalAchat = totalAchat;
    }

    public ClientAchatDTO() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getTotalAchat() {
        return totalAchat;
    }

    public void setTotalAchat(Double totalAchat) {
        this.totalAchat = totalAchat;
    }
}
