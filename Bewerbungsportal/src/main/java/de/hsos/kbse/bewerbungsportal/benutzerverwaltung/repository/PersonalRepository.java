/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.bewerbungsportal.benutzerverwaltung.repository;

import Testpackage.Repository;
import de.hsos.kbse.bewerbungsportal.benutzerverwaltung.entity.Personal;
import javax.persistence.EntityManager;

/**
 *
 * @author nordm
 */
public class PersonalRepository extends Repository<Personal> implements IPersonalRepository{

    public PersonalRepository(EntityManager em) {
        super(Personal.class,em);
    }

}
