/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testpackage;

import de.hsos.kbse.bewerbungsportal.benutzerverwaltung.repository.IBenutzerRepository;
import de.hsos.kbse.bewerbungsportal.benutzerverwaltung.repository.IBewerberRepository;
import de.hsos.kbse.bewerbungsportal.benutzerverwaltung.repository.IPersonalRepository;
import de.hsos.kbse.bewerbungsportal.bewerbungsverwaltung.repository.IBewerbungRepository;
import de.hsos.kbse.bewerbungsportal.stellenverwaltung.repository.IStelleRepository;

/**
 *
 * @author nordm
 */
public interface IUnitWork {
    //hier ale Entitys einbinden
    IBenutzerRepository getBenutzer();
    IPersonalRepository getPersonal();
    IBewerberRepository getBewerber();
    IBewerbungRepository getBewerbung();
    IStelleRepository getStelle();
    /**
     *
     * @return
     */
    int Complete();
}
