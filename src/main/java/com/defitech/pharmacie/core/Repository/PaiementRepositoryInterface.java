package com.defitech.pharmacie.core.Repository;

import com.defitech.pharmacie.core.dto.ClientAchatDTO;
import com.defitech.pharmacie.core.Entity.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface PaiementRepositoryInterface extends JpaRepository<Paiement, Long> {

    @Query("SELECT new com.defitech.pharmacie.core.dto.ClientAchatDTO(c.nom, c.adresse, c.email, p.total) " +
            "FROM Paiement p JOIN p.client c WHERE p.dateVente = :dateVente")
    List<ClientAchatDTO> findClientDetailsByDateVente(Date dateVente);

    @Query("SELECT new com.defitech.pharmacie.core.dto.ClientAchatDTO(c.nom, c.adresse, c.email, SUM(p.total)) " +
            "FROM Paiement p JOIN p.client c " +
            "GROUP BY c.nom, c.adresse, c.email")
    List<ClientAchatDTO> findClientInfoEtTotalAchats();
}
