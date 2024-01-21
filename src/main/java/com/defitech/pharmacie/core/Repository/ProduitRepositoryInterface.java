package com.defitech.pharmacie.core.Repository;

import com.defitech.pharmacie.core.Entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProduitRepositoryInterface extends CrudRepository<Product, String> {

}
