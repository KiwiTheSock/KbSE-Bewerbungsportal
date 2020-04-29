/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.bewerbungsportal.stellenverwaltung.entity;

import de.hsos.kbse.bewerbungsportal.benutzerverwaltung.entity.Personal;
import de.hsos.kbse.bewerbungsportal.bewerbungsverwaltung.entity.Bewerbung;
import de.hsos.kbse.interfaces.AbstractEntity;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 *
 * @author pmarkman
 */
@Entity
//@Vetoed 
//@Table(name = "Stelle")
////@NamedQueries ergänzen
//@Transactional(Transactional.TxType.MANDATORY) // Überprüfen!
public class Stelle extends AbstractEntity {

    @Column(name = "bezeichnung")
    @NotNull
    @Valid
    String bezeichnung;

    @Column(name = "datum")
    @Temporal(TemporalType.DATE)
    @Valid
    Date datum;

    @Column(name = "beschreibung")
    @NotNull
    @Valid
    String beschreibung;

    @Column(name = "ort")
    @NotNull
    @Valid
    String ort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSONAL_ID")
    private Personal personal;

    @OneToMany(mappedBy = "stellen", fetch = FetchType.LAZY)
    private Set<Bewerbung> bewerbung;

    public Stelle() {
    }

    public Stelle(String bezeichnung, Date datum, String beschreibung, String ort) {
        this.bezeichnung = bezeichnung;
        this.datum = datum;
        this.beschreibung = beschreibung;
        this.ort = ort;
    }


    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.bezeichnung);
        hash = 59 * hash + Objects.hashCode(this.datum);
        hash = 59 * hash + Objects.hashCode(this.beschreibung);
        hash = 59 * hash + Objects.hashCode(this.ort);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Stelle other = (Stelle) obj;
        if (!Objects.equals(this.bezeichnung, other.bezeichnung)) {
            return false;
        }
        if (!Objects.equals(this.beschreibung, other.beschreibung)) {
            return false;
        }
        if (!Objects.equals(this.ort, other.ort)) {
            return false;
        }
        if (!Objects.equals(this.datum, other.datum)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stelle{" + "bezeichnung=" + bezeichnung + ", datum=" + datum + ", beschreibung=" + beschreibung + ", ort=" + ort + '}';
    }
}
