package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SousTheme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSousTheme;
    private String nom;
    private String description;


}
