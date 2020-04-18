/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testpackage;

import Testpackage.IBenutzerRepository;

/**
 *
 * @author nordm
 */
public interface IUnitWork {
    //hier ale Entitys einbinden
    IBenutzerRepository GetBenutzer();

    /**
     *
     * @return
     */
    int Complete();
}
