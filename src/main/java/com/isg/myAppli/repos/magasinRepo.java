package com.isg.myAppli.repos;

import com.isg.myAppli.models.magasin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface magasinRepo extends JpaRepository<magasin, Long> {
}