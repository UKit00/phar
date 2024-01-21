package com.defitech.pharmacie.core.Service;

import com.defitech.pharmacie.core.Entity.Client;
import com.defitech.pharmacie.core.Repository.ClientRepositoryInterface;
import com.defitech.pharmacie.core.Repository.PaiementRepositoryInterface;
import com.defitech.pharmacie.core.dto.ClientAchatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    PaiementRepositoryInterface PaiementRepository;
    @Autowired
    ClientRepositoryInterface clientRepository;

    public Long getClientIdParNom(String nom) {
        Optional<Client> client = clientRepository.findByNom(nom);
        return client.map(Client::getIdCli).orElse(null);
    }

    public List<ClientAchatDTO> getClientAchatsParDate(Date date) {
        return PaiementRepository.findClientDetailsByDateVente(date);
    }

    public List<ClientAchatDTO> getClientsInfoEtTotalAchats() {
        return PaiementRepository.findClientInfoEtTotalAchats();
    }

}
