/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.entity;

import de.hsos.kbse.interfaces.AbstractEntity;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pmarkman
 */
@Entity
@Table(name = "bewerbung")
//@NamedQueries ergänzen!

public class Bewerbung extends AbstractEntity {

    Date zeitstempel;
    String status;

    public Bewerbung(Date zeitstempel, String status) {
        this.zeitstempel = zeitstempel;
        this.status = status;
    }

    public Bewerbung() {
    }

    
    
    
    //______________Bewerber__________________
    //HasSet für Bewerber
   /** @OneToMany(
            mappedBy = "bewerbung",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Bewerber> bewerber = new HashSet<>();

    //bewerber_hinzufuegen
    //bewerber_entfernen
    
    //______________Personal__________________
    //HashSet für Personal
    @OneToMany(
            mappedBy = "bewerbung",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Personal> personal = new HashSet<>();

    //personal_hinzufuegen
    //personal_entfernen
    
    //_____________Stelle__________________
    //HashSet für Stellen
    @OneToMany(
            mappedBy = "bewerbung",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Stelle> stelle = new HashSet<>();
    
     /**
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
    
}
