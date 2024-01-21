package com.defitech.pharmacie.core.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "paiement")
public class Paiement {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPaie")
    private long idPaie;

    @ManyToOne
    @JoinColumn(name = "idCli", nullable = false)
    private Client client;

    @Column(name = "dateV")
    private Date dateVente;

    @Column(name = "totalV")
    private Double total;

    @OneToMany(mappedBy = "paiement", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<LignePaie> lignePaie = new HashSet<LignePaie>();

    public Paiement(long idPaie, Client client, Date dateVente, Double total, Set<LignePaie> lignePaie) {
        this.idPaie = idPaie;
        this.client = client;
        this.dateVente = dateVente;
        this.total = total;
        this.lignePaie = lignePaie;
    }

    public Paiement() {}

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateVente() {
        return dateVente;
    }

    public void setDateVente(Date dateVente) {
        this.dateVente = dateVente;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Set<LignePaie> getLignePaie() {
        return lignePaie;
    }

    public void setLignePaie(Set<LignePaie> lignePaie) {
        this.lignePaie = lignePaie;
    }

    public void setIdPaie(Long idPaie) {
        this.idPaie = idPaie;
    }

    public Long getIdPaie() {
        return idPaie;
    }
}
