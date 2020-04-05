/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.facade;

import de.hsos.kbse.entity.Benutzer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nordm
 */
@Stateless
public class BenutzerFacade extends AbstractFacade<Benutzer> {

    @PersistenceContext(unitName = "de.hsos.kbse_Bewerbungsportal_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BenutzerFacade() {
        super(Benutzer.class);
    }
    
}