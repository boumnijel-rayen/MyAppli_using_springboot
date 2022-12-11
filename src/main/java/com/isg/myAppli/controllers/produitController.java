package com.isg.myAppli.controllers;

import com.isg.myAppli.models.produit;
import com.isg.myAppli.services.produitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produits")
public class produitController {

    @Autowired
    private produitService produitService;

    @GetMapping("/all")
    public ResponseEntity<List<produit>> findAll() {
        return ResponseEntity.ok().body(produitService.findAll());
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<produit> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(produitService.findById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<produit> save(@RequestBody produit produit) {
        return ResponseEntity.ok().body(produitService.save(produit));
    }

}
