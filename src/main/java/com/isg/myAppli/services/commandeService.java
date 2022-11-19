package com.isg.myAppli.services;

import com.isg.myAppli.models.commande;
import com.isg.myAppli.repos.commandeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class commandeService {

    @Autowired
    private commandeRepo commandeRepo;

}
