package com.isg.myAppli.repos;

import com.isg.myAppli.models.commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface commandeRepo extends JpaRepository<commande, Long> {
}
