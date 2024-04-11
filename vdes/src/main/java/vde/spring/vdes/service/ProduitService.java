package vde.spring.vdes.service;

import vde.spring.vdes.model.Produit;

import java.util.List;

public interface ProduitService {

    Produit creer(Produit produit);
    List<Produit> trouver(String nom);
    List<Produit> lire();
    Produit modiffier ( Long id , Produit produit);
    Produit supprimer(Long id);
    List<Produit> definir(String description);
}
