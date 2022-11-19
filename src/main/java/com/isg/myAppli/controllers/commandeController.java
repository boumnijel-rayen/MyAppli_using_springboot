package com.isg.myAppli.controllers;

import com.isg.myAppli.models.commande;
import com.isg.myAppli.services.commandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commande")
public class commandeController {

    @Autowired
    private commandeService commandeService;

}
