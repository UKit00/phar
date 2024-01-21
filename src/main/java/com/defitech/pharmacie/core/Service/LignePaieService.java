package com.defitech.pharmacie.core.Service;

import com.defitech.pharmacie.core.dto.LignePaieDTO;
import com.defitech.pharmacie.core.Repository.LignePaieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LignePaieService {
    @Autowired
    LignePaieRepositoryInterface lignePaieRepository;

    public List<LignePaieDTO> getDetailsAchatsParClient(Long clientId) {
        return lignePaieRepository.findDetailsAchatsParClientId(clientId);
    }
}
