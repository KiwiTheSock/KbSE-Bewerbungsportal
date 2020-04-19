/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testpackage;

import javax.persistence.EntityManager;

/**
 *
 * @author nordm
 */
public class UnitWork implements IUnitWork {

    private EntityManager em;

    public UnitWork(EntityManager em) {
        this.em = em;
        Benutzer = new BenutzerRepository(em);

    }
    private IBenutzerRepository Benutzer;
    
    @Override
    public IBenutzerRepository GetBenutzer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Complete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
