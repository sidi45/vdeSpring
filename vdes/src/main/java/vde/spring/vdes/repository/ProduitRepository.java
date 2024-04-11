package vde.spring.vdes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vde.spring.vdes.model.Produit;

import java.util.List;
import java.util.Optional;

public interface ProduitRepository extends JpaRepository<Produit,Long>{
    List<Produit> findByNom(String nom);
    List<Produit> findByDescription(String description);
}
