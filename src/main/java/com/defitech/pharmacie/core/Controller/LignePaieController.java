package com.defitech.pharmacie.core.Controller;

import com.defitech.pharmacie.core.Service.LignePaieService;
import com.defitech.pharmacie.core.dto.LignePaieDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lignepaie")
public class LignePaieController {

    @Autowired
    LignePaieService lignePaieService;

    // Endpoint pour récupérer les détails des achats d'un client spécifique
    @GetMapping("/client/{clientId}")
    public ResponseEntity<List<LignePaieDTO>> getDetailsAchatsParClient(@PathVariable Long clientId) {
        List<LignePaieDTO> lignesPaie = lignePaieService.getDetailsAchatsParClient(clientId);
        if (lignesPaie.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(lignesPaie);
    }

    // Ajoutez d'autres méthodes pour la gestion des lignes de paiement au besoin
}
