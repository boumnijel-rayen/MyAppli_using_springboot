package com.isg.myAppli.controllers;

import com.isg.myAppli.models.facture;
import com.isg.myAppli.services.factureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facture")
public class factureController {

    @Autowired
    private factureService factureService;

}
