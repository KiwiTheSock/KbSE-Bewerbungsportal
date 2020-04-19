/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.entity;

import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 *
 * @author pmarkman
 */
@Entity
@Table(name = "Personal")
@Transactional(Transactional.TxType.MANDATORY)
public class Personal extends Benutzer {

    //Zusätzliche Attribute
    @Column(name = "durchwahl")
    @NotNull
    @Valid
    String durchwahl;

    @Column(name = "bueronr")
    @NotNull
    @Valid
    String bueroNr;
    
    @OneToMany(mappedBy = "personal")
    private Set<Bewerbung> bewerbungen;
    
    public Set<Bewerbung> getBewerbung() {
    return bewerbungen;
    }
    
    public void setBewerbung(Set<Bewerbung> bewerbung) {
    this.bewerbungen = bewerbung;
    }
    
    @OneToMany(mappedBy = "personal")
    private Set<Stelle> stelle;
    
    public Set<Stelle> getStelle() {
    return stelle;
    }
    
    public void setStelle(Set<Stelle> stelle) {
    this.stelle = stelle;
    }
    
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
        return true;
    }

    @Override
    public String toString() {
        return "Personal{" + "durchwahl=" + durchwahl + ", bueroNr=" + bueroNr +'}';
    }

}
