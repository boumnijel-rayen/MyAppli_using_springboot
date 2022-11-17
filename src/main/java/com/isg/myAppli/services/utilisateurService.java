package com.isg.myAppli.services;

import com.isg.myAppli.models.utilisateur;
import com.isg.myAppli.repos.utilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class utilisateurService {

    @Autowired
    private utilisateurRepo utilisateurRepo;

    public utilisateur save(utilisateur utilisateur) {
        return utilisateurRepo.save(utilisateur);
    }

    public List<utilisateur> findAll() {
        return utilisateurRepo.findAll();
    }

}
