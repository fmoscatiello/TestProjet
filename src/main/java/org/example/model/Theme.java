package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTheme;
    private String nom;
    private String description;
    private Long idSousTheme;

    public Theme(){

    }

    public Theme(Long idTheme, String nom, String description, Long idSousTheme) {
        this.idTheme = idTheme;
        this.nom = nom;
        this.description = description;
        this.idSousTheme = idSousTheme;
    }

    public Long getIdTheme() {
        return idTheme;
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

    public Long getIdSousTheme() {
        return idSousTheme;
    }

    public void setIdSousTheme(Long idSousTheme) {
        this.idSousTheme = idSousTheme;
    }
}
