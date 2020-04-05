/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.entity;

import de.hsos.kbse.interfaces.AbstractEntity;
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
    String bueronr;

    @OneToOne(mappedBy = "bewerber")
    Benutzer bewerber = new Benutzer();

    public Personal() {
    }

}
