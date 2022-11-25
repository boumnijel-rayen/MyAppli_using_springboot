package com.isg.myAppli.services;

import com.isg.myAppli.models.facture;
import com.isg.myAppli.repos.factureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class factureService {

    @Autowired
    private factureRepo factureRepo;

}
