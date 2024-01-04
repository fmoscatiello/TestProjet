package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idSalle;
   private String nom;
   private int capacite;

    public Salle() {

    }

    public Salle(Long idSalle, String nom, int capacite) {
        this.idSalle = idSalle;
        this.nom = nom;
        this.capacite = capacite;
    }

    public Long getIdSalle() {
        return idSalle;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
