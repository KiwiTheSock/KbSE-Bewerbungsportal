/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.bewerbungsportal.bewerbungsverwaltung.repository;

import Testpackage.Repository;
import de.hsos.kbse.bewerbungsportal.bewerbungsverwaltung.entity.Bewerbung;
import javax.persistence.EntityManager;


/**
 *
 * @author nordm
 */
public class BewerbungRepository extends Repository<Bewerbung> implements IBewerbungRepository{

    public BewerbungRepository(EntityManager em) {
        super(Bewerbung.class,em);
    }
}
