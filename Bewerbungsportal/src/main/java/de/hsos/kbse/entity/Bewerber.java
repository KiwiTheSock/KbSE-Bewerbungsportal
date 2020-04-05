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
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 *
 * @author pmarkman
 */
@Entity
//@Vetoed Erklärung nötig
@Table(name = "Bewerber")
//NamedQueries ergänzen!
@Transactional(Transactional.TxType.MANDATORY) // Überprüfen!
public class Bewerber extends AbstractEntity {

    //Bemerkung Nachschlagen: Persistierung von Datein in Java
    @Column(name = "anlagen_pfad")
    @NotNull
    @Valid
    String unterlagen_pfad;
    @Column(name = "portait_pfad")
    @NotNull
    @Valid
    String portait_pfad;

    //Überprüfen ob richtig 
    @OneToOne(mappedBy = "bewerber")
    Benutzer bewerber = new Benutzer();

    public Bewerber() {
    }

    public String getUnterlagen_pfad() {
        return unterlagen_pfad;
    }

    public void setUnterlagen_pfad(String unterlagen_pfad) {
        this.unterlagen_pfad = unterlagen_pfad;
    }

    public String getPortait_pfad() {
        return portait_pfad;
    }

    public void setPortait_pfad(String portait_pfad) {
        this.portait_pfad = portait_pfad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.unterlagen_pfad);
        hash = 17 * hash + Objects.hashCode(this.portait_pfad);
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
        final Bewerber other = (Bewerber) obj;
        if (!Objects.equals(this.unterlagen_pfad, other.unterlagen_pfad)) {
            return false;
        }
        if (!Objects.equals(this.portait_pfad, other.portait_pfad)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bewerber{" + "unterlagen_pfad=" + unterlagen_pfad + ", portait_pfad=" + portait_pfad + '}';
    }

}
