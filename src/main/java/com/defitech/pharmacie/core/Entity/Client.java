package com.defitech.pharmacie.core.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idCli")
    private long idCli;
    @Column(name="nomCli")
    private String nom;
    @Column(name="email")
    private String email;
    @Column(name="adresseCli")
    private String adresse;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Paiement> paiement = new HashSet<Paiement>();

    public Client(long idCli, String nom, String adresse, java.util.Set<Paiement> paiement) {
        this.idCli = idCli;
        this.nom = nom;
        this.adresse = adresse;
        this.paiement = paiement;
    }

    public Client() {

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

    public java.util.Set<Paiement> getPaiement() {
        return paiement;
    }

    public void setPaiement(java.util.Set<Paiement> paiement) {
        this.paiement = paiement;
    }

    public void setIdCli(Long idCli) {
        this.idCli = idCli;
    }

    public Long getIdCli() {
        return idCli;
    }
}
