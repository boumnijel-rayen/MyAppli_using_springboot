package com.isg.myAppli.services;

import com.isg.myAppli.models.fournisseur;
import com.isg.myAppli.models.produit;
import com.isg.myAppli.models.utilisateur;
import com.isg.myAppli.repos.produitRepo;
import com.isg.myAppli.repos.utilisateurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class utilisateurService {

    @Autowired
    private utilisateurRepo utilisateurRepo;
    @Autowired
    private produitRepo produitRepo;

    public List<utilisateur> findAll() {
        return utilisateurRepo.findAll();
    }

    public utilisateur findById(Long id) {
        return utilisateurRepo.findById(id).get();
    }

    public utilisateur save(utilisateur utilisateur) {
        return utilisateurRepo.save(utilisateur);
    }

    public void delete(Long id) {
        utilisateur utilisateur = utilisateurRepo.findById(id).get();
        utilisateur.getFournisseurs().forEach(fournisseur -> {
            fournisseur.setUtilisateur(null);
        });
        utilisateurRepo.delete(utilisateur);
    }

    public utilisateur update(utilisateur utilisateur, Long id) {
        utilisateur utilisateurToUpdate = utilisateurRepo.findById(id).get();
        utilisateurToUpdate.setNom(utilisateur.getNom());
        utilisateurToUpdate.setPrenom(utilisateur.getPrenom());
        utilisateurToUpdate.setEmail(utilisateur.getEmail());
        utilisateurToUpdate.setAdresse(utilisateur.getAdresse());
        utilisateurToUpdate.setCode_postal(utilisateur.getCode_postal());
        utilisateurToUpdate.setDate_naissance(utilisateur.getDate_naissance());
        return utilisateurRepo.save(utilisateurToUpdate);
    }

    public void assignProduitToUtilisateur(Long id_u, Long id_pr) {
        utilisateur utilisateur = utilisateurRepo.findById(id_u).get();
        produit produit = produitRepo.findById(id_pr).get();
        utilisateur.getProduits().add(produit);
        utilisateurRepo.save(utilisateur);
    }

}
