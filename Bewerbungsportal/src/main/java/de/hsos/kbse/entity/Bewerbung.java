/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.entity;

import de.hsos.kbse.interfaces.AbstractEntity;
import java.util.Date;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 *
 * @author pmarkman
 */
@Entity
@Table(name = "bewerbung")
//@NamedQueries ergänzen!

public class Bewerbung extends AbstractEntity {

    @Column(name = "zeitstempel")
    @Valid
    @Temporal(javax.persistence.TemporalType.DATE)
    Date zeitstempel;

    @Column(name = "status")
    @NotNull
    @Valid
    String status;

    public Bewerbung(Date zeitstempel, String status) {
        this.zeitstempel = zeitstempel;
        this.status = status;
    }

    public Bewerbung() {
    }

    
    
    
    //______________Bewerber__________________
    @ManyToOne
    @JoinColumn(name="bewerber_id", nullable = false)
    private Bewerber bewerber;

    public Bewerber getBewerber() {
        return bewerber;
    }

    public void setBewerber(Bewerber bewerber) {
        this.bewerber = bewerber;
    }

    //______________Personal__________________
    
    @ManyToOne
    @JoinColumn(name = "personal_id", nullable = false)
    private Personal personal;
    
    public Personal getPersonal() {
    return personal;
    }
    
    public void setPersonal(Personal personal) {
    this.personal = personal;
    }
    
    //_____________Stelle__________________ 
    
    @OneToMany(mappedBy = "bewerbung")
    private Set<Stelle> stellen;

    public Set<Stelle> getStellen() {
        return stellen;
    }

    public void setStellen(Set<Stelle> stellen) {
        this.stellen = stellen;
    }
   
    public Bewerbung() {
    }

    public Date getZeitstempel() {
        return zeitstempel;
    }

    public void setZeitstempel(Date zeitstempel) {
        this.zeitstempel = zeitstempel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.zeitstempel);
        hash = 79 * hash + Objects.hashCode(this.status);
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
        final Bewerbung other = (Bewerbung) obj;
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return Objects.equals(this.zeitstempel, other.zeitstempel);
    }

    @Override
    public String toString() {
        return "Bewerbung{" + "zeitstempel=" + zeitstempel + ", status=" + status + '}';
    }
}
