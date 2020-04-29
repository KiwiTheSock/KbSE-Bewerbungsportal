/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.bewerbungsportal.benutzerverwaltung.repository;

import Testpackage.IRepository;
import de.hsos.kbse.bewerbungsportal.benutzerverwaltung.entity.Benutzer;
import java.util.List;


/**
 *
 * @author nordm
 */
public interface IBenutzerRepository extends IRepository<Benutzer> {
    List<Benutzer> GetDiesDas();
}
