package com.isg.myAppli.repos;

import com.isg.myAppli.models.produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface produitRepo extends JpaRepository<produit, Long> {
}
