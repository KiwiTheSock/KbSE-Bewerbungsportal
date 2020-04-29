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

//TODO: List in ander Collection wechseln
public interface IRepository<T> {
    public void create(T entity) ;
    public void edit(T entity);

    public void remove(T entity);

    public T find(Object id) ;
    public List<T> findAll() ;
    public List<T> findRange(int[] range) ;

    public int count() ;
    
}
