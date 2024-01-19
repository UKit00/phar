package com.defitech.pharmacie.core.Service;

import com.defitech.pharmacie.core.Repository.ProduitRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class produitService {
    @Autowired
    ProduitRepositoryInterface produitRepository;
}
