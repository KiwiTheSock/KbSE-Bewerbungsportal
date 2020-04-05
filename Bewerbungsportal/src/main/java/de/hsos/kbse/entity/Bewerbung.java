/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.entity;

import de.hsos.kbse.interfaces.AbstractEntity;
import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
    @Temporal(TemporalType.DATE)
    @Valid
    Date zeitstempel;

    @Column(name = "status")
    @NotNull
    @Valid
    String status;

    //______________Bewerber__________________
    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "bewerbung_id")
    @NotNull()
    @Valid
    private List<Bewerber> bewerber;
    //bewerber_hinzufuegen
    //bewerber_entfernen

    /**
     * //______________Personal__________________ //HashSet für Personal
     *
     * @OneToMany( mappedBy = "bewerbung", cascade = CascadeType.ALL,
     * orphanRemoval = true ) private Set<Personal> personal = new HashSet<>();
     *
     * //personal_hinzufuegen //personal_entfernen
     *
     * //_____________Stelle__________________ //HashSet für Stellen
     * @OneToMany( mappedBy = "bewerbung", cascade = CascadeType.ALL,
     * orphanRemoval = true ) private Set<Stelle> stelle = new HashSet<>();
     *
     * /**
     * OneToMany Example
     *
     * @OneToMany( mappedBy = "department", cascade = CascadeType.ALL,
     * orphanRemoval = true ) private Set<Exam> exams = new HashSet<>();
     *
     * public void addExam(Exam exam) { exams.add(exam); exam.setDepart(this); }
     *
     * public void removeExam(Exam exam) { exams.remove(exam);
     * exam.setDatum(null); }
     *
     */
    
    
    public Bewerbung() {
    }

}
