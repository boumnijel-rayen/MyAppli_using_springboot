package com.isg.myAppli.controllers;

import com.isg.myAppli.models.categorie;
import com.isg.myAppli.services.categorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorie")
public class categorieController {

    @Autowired
    private categorieService categorieService;

}
