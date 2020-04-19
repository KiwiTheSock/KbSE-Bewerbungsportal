/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testpackage;

import de.hsos.kbse.entity.Benutzer;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author nordm
 */
public class BenutzerRepository extends Repository<Benutzer> implements IBenutzerRepository{

    public BenutzerRepository(EntityManager em) {
        super(em);
    }

    
    
    @Override
    public List<Benutzer> GetDiesDas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
