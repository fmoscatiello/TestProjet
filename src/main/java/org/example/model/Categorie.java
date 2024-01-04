package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategorie;
    private String nom;
    private String description;
    private Long idFormation;
    private Long idTheme;

    public Categorie() {
    }

    public Categorie(Long idCategorie, String nom, String description, Long idFormation, Long idTheme) {
        this.idCategorie = idCategorie;
        this.nom = nom;
        this.description = description;
        this.idFormation = idFormation;
        this.idTheme = idTheme;
    }

    public Long getIdCategorie() {
        return idCategorie;
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

    public Long getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(Long idFormation) {
        this.idFormation = idFormation;
    }

    public Long getIdTheme() {
        return idTheme;
    }

    public void setIdTheme(Long idTheme) {
        this.idTheme = idTheme;
    }
}
