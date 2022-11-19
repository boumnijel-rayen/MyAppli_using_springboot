package com.isg.myAppli.services;

import com.isg.myAppli.models.produit;
import com.isg.myAppli.repos.produitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class produitService {

    @Autowired
    private produitRepo produitRepo;

}
