package vde.spring.vdes.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vde.spring.vdes.model.Produit;
import vde.spring.vdes.repository.ProduitRepository;

import java.util.List;
@Service
@AllArgsConstructor

public class produitServiceImple implements ProduitService{

    private ProduitRepository produitRepository;
    @Override
    public Produit creer(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> trouver(String nom) {
        return produitRepository.findByNom(nom);
    }

    @Override
    public List<Produit> lire() {
        return produitRepository.findAll();
    }

    @Override
    public Produit modiffier(Long id, Produit produit) {
        return produitRepository.findById(id)
                .map(p->{
                        p.setPrix(produit.getPrix());
                        p.setNom(produit.getNom());
                        p.setDescription(produit.getDescription());
                        return produitRepository.save(p);

                    }).orElseThrow(()-> new RuntimeException("Produit non trouvable "));
    }

    @Override
    public Produit supprimer(Long id) {
        return null;
    }
}
