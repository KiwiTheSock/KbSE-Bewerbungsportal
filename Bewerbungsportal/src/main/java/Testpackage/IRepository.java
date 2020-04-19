/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testpackage;

import java.util.List;

/** 
 *
 * @author nordm
 * @param <T>
 */

//TODO: List in ander Collection wechseln
public interface IRepository<T> {
    T Get(int id);
    List<T> GetAll();
}
