package vde.spring.vdes.controlleur;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import vde.spring.vdes.model.Produit;
import vde.spring.vdes.service.ProduitService;

import java.util.List;

    @RestController
    @RequestMapping(path="/produit")
    @AllArgsConstructor
    public class ProduitControlleur {
        private ProduitService produitService;

        @PostMapping(path="/create")
        public Produit Create(@RequestBody Produit produit){
            return produitService.creer(produit);
        }

        @GetMapping(path="/lire")
        public List<Produit> lire(){
            return produitService.lire();
        }


        @PutMapping(path="/modifier/{id}")
        public Produit modifier(@PathVariable Long id , @RequestBody Produit produit){
            return produitService.modiffier(id, produit);
        }
        @DeleteMapping(path="/suprimer/{id}")
        public Produit suprimer(@PathVariable Long id ){
            return produitService.supprimer(id);
        }

        @GetMapping(path="trouver/{nom}")
        public List<Produit> trouver(@PathVariable String nom){
            return produitService.trouver(nom);
        }
    }


