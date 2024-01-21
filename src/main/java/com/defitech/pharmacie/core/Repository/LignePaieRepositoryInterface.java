package com.defitech.pharmacie.core.Repository;

import com.defitech.pharmacie.core.dto.LignePaieDTO;
import com.defitech.pharmacie.core.Entity.LignePaie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LignePaieRepositoryInterface extends JpaRepository<LignePaie, Long> {

    @Query("SELECT new com.defitech.pharmacie.core.dto.LignePaieDTO(p.nom, lp.quantite, lp.prixUnitaire, lp.totalLigne) " +
            "FROM LignePaie lp JOIN lp.paiement paie JOIN lp.produit p WHERE paie.client.idCli = :clientId")
    List<LignePaieDTO> findDetailsAchatsParClientId(Long clientId);
}
