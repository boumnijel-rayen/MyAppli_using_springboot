package com.isg.myAppli.services;

import com.isg.myAppli.models.laboratoire;
import com.isg.myAppli.repos.laboratoireRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class laboratoireService {

    @Autowired
    private laboratoireRepo laboratoireRepo;

}
