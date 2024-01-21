package com.defitech.pharmacie.core.Service;

import com.defitech.pharmacie.core.Repository.ProduitRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitService {
    @Autowired
    ProduitRepositoryInterface produitRepositoryInterface;
}
