package com.isg.myAppli.controllers;

import com.isg.myAppli.models.utilisateur;
import com.isg.myAppli.services.utilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateur")
public class utilisateurController {

    @Autowired
    private utilisateurService utilisateurService;

    @GetMapping("/all")
    public ResponseEntity<List<utilisateur>> findAll() {
        return ResponseEntity.ok().body(utilisateurService.findAll());
    }
}
