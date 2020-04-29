/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.bewerbungsportal.stellenverwaltung.repository;

import Testpackage.Repository;
import de.hsos.kbse.bewerbungsportal.stellenverwaltung.entity.Stelle;
import javax.persistence.EntityManager;

/**
 *
 * @author nordm
 */
public class StelleRepository extends Repository<Stelle> implements IStelleRepository{

    public StelleRepository(EntityManager em) {
        super(Stelle.class,em);
    }
}
