package com.isg.myAppli.services;

import com.isg.myAppli.repos.categorieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class categorieService {

    @Autowired
    private categorieRepo categorieRepo;
}
