/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.entity;

import de.hsos.kbse.interfaces.AbstractEntity;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 *
 * @author pmarkman
 */
@Entity
@Table(name = "Personal")
public class Personal extends AbstractEntity {

    //Zusätzliche Attribute
    @Column(name = "durchwahl")
    @NotNull
    @Valid
    String durchwahl;

    @Column(name = "bueronr")
    @NotNull
    @Valid
    String bueroNr;

    @OneToOne(mappedBy = "bewerber")
    Benutzer bewerber = new Benutzer();

    public Personal() {
    }

    public String getDurchwahl() {
        return durchwahl;
    }

    public void setDurchwahl(String durchwahl) {
        this.durchwahl = durchwahl;
    }

    public String getBueroNr() {
        return bueroNr;
    }

    public void setBueroNr(String bueroNr) {
        this.bueroNr = bueroNr;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.durchwahl);
        hash = 17 * hash + Objects.hashCode(this.bueroNr);
        hash = 17 * hash + Objects.hashCode(this.bewerber);
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
        final Personal other = (Personal) obj;
        if (!Objects.equals(this.durchwahl, other.durchwahl)) {
            return false;
        }
        if (!Objects.equals(this.bueroNr, other.bueroNr)) {
            return false;
        }
        if (!Objects.equals(this.bewerber, other.bewerber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Personal{" + "durchwahl=" + durchwahl + ", bueroNr=" + bueroNr + ", bewerber=" + bewerber + '}';
    }

}
