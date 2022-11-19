package com.isg.myAppli.controllers;

import com.isg.myAppli.models.produit;
import com.isg.myAppli.services.produitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produits")
public class produitController {

    @Autowired
    private produitService produitService;

}
