package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LieuFormation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLieuFormation;
    private String ville;
    private String telephone;
    private String mail;
    private String adresse;
    private Long idSalle;

    public LieuFormation() {
    }

    public LieuFormation(Long idLieuFormation, String ville, String telephone, String mail, String adresse, Long idSalle) {
        this.idLieuFormation = idLieuFormation;
        this.ville = ville;
        this.telephone = telephone;
        this.mail = mail;
        this.adresse = adresse;
        this.idSalle = idSalle;
    }

    public Long getIdLieuFormation() {
        return idLieuFormation;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Long getIdSalle() {
        return idSalle;
    }

    public void setIdSalle(Long idSalle) {
        this.idSalle = idSalle;
    }
}
