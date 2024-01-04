package org.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class SessionFormation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSessionFormation;
    private Date dateDebut;
    private Date dateFin;
    private int nbreParticipant;
    private Long idFormation;
    private String idLieuFormation;

    public SessionFormation() {
    }

    public SessionFormation(Long idSessionFormation, Date dateDebut, Date dateFin, int nbreParticipant, Long idFormation, String idLieuFormation) {
        this.idSessionFormation = idSessionFormation;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nbreParticipant = nbreParticipant;
        this.idFormation = idFormation;
        this.idLieuFormation = idLieuFormation;
    }

    public Long getIdSessionFormation() {
        return idSessionFormation;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public int getNbreParticipant() {
        return nbreParticipant;
    }

    public Long getIdFormation() {
        return idFormation;
    }

    public String getIdLieuFormation() {
        return idLieuFormation;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setNbreParticipant(int nbreParticipant) {
        this.nbreParticipant = nbreParticipant;
    }

    public void setIdFormation(Long idFormation) {
        this.idFormation = idFormation;
    }

    public void setIdLieuFormation(String idLieuFormation) {
        this.idLieuFormation = idLieuFormation;
    }
}
