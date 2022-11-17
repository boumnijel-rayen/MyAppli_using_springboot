package com.isg.myAppli.controllers;

import com.isg.myAppli.models.utilisateur;
import com.isg.myAppli.repos.utilisateurRepo;
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

    @PostMapping("/save")
    public ResponseEntity<utilisateur> save(@RequestBody utilisateur utilisateur) {
        return ResponseEntity.ok(utilisateurService.save(utilisateur));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<utilisateur>> findAll() {
        return ResponseEntity.ok(utilisateurService.findAll());
    }
}
