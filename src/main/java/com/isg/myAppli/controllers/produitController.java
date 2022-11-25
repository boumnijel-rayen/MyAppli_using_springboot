package com.isg.myAppli.controllers;

import com.isg.myAppli.services.produitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produits")
public class produitController {

    @Autowired
    private produitService produitService;

}
