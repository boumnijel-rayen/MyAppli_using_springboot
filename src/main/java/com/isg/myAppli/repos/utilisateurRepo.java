package com.isg.myAppli.repos;

import com.isg.myAppli.models.utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface utilisateurRepo extends JpaRepository<utilisateur, Long> {
}
