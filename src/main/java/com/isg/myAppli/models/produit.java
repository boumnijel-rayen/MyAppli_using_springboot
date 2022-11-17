package com.isg.myAppli.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
public class produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_p;
    private String lib_p;
    private String description;
    private String image;
    private double prix_p;
    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    private Date date_ajout;
    private float prix_liv;
    @OneToMany(mappedBy = "produit")
    @JsonIgnore
    private Collection<commande> commandes;
    @OneToMany(mappedBy = "produit")
    @JsonIgnore
    private Collection<facture> factures;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cat")
    private categorie categorie;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_lab")
    private laboratoire laboratoire;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_mag")
    private magasin magasin;
}
