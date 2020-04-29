/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.bewerbungsportal.benutzerverwaltung.repository;

import Testpackage.Repository;
import de.hsos.kbse.bewerbungsportal.benutzerverwaltung.entity.Bewerber;
import javax.persistence.EntityManager;

/**
 *
 * @author nordm
 */
public class BewerberRepository extends Repository<Bewerber> implements IBewerberRepository{

    public BewerberRepository(EntityManager em) {
        super(Bewerber.class,em);
    }



}
