package com.isg.myAppli.controllers;

import com.isg.myAppli.models.laboratoire;
import com.isg.myAppli.services.laboratoireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laboratoire")
public class laboratoireController {

    @Autowired
    private laboratoireService laboratoireService;

}
