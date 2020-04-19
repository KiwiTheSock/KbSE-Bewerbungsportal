/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testpackage;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author nordm
 * @param <T>
 */
public abstract class Repository<T> implements IRepository<T>{

    protected  EntityManager em;

    public Repository(EntityManager em ) {
        this.em = em;
    }
    
    
    @Override
    public T Get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> GetAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
