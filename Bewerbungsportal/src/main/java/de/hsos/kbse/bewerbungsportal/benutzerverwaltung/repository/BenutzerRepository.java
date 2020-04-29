package de.hsos.kbse.bewerbungsportal.benutzerverwaltung.repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Testpackage.Repository;
import de.hsos.kbse.bewerbungsportal.benutzerverwaltung.entity.Benutzer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nordm
 */
public class BenutzerRepository extends Repository<Benutzer> implements IBenutzerRepository {
    
//    EntityManager em;
    
    public BenutzerRepository(EntityManager em) {
        super(Benutzer.class,em);
    }

    @Override
    public List<Benutzer> GetDiesDas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
