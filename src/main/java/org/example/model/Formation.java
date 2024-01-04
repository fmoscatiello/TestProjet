package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFormation;
    private String nom;

    public Formation() {
    }

    public Formation(Long idFormation, String nom) {
        this.idFormation = idFormation;
        this.nom = nom;
    }

    public Long getIdFormation() {
        return idFormation;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
