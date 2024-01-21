package com.defitech.pharmacie.core.Repository;

import com.defitech.pharmacie.core.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepositoryInterface extends JpaRepository<Client, Long> {
    java.util.Optional<Client> findByNom(String nom);
}