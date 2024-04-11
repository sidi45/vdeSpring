package vde.spring.vdes.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Produit")
@NoArgsConstructor

public class Produit {

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)




    private Long id;
    private String nom;
    private String description;
    private Integer prix ;

}
