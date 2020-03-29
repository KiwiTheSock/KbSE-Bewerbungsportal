/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.entity;

import de.hsos.kbse.interfaces.AbstractEntity;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author pmarkman
 */
@Entity
@Table(name="Personal")
public class Personal extends AbstractEntity {

    //Benutzer personal;
    
    //Zusätzliche Attribute
    String durchwahl;
    String bueronr;
    
}
