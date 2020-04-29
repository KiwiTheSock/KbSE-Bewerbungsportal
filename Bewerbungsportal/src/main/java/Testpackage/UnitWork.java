/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testpackage;

import de.hsos.kbse.bewerbungsportal.stellenverwaltung.repository.StelleRepository;
import de.hsos.kbse.bewerbungsportal.bewerbungsverwaltung.repository.BewerbungRepository;
import de.hsos.kbse.bewerbungsportal.benutzerverwaltung.repository.PersonalRepository;
import de.hsos.kbse.bewerbungsportal.benutzerverwaltung.repository.BewerberRepository;
import de.hsos.kbse.bewerbungsportal.benutzerverwaltung.repository.BenutzerRepository;
import de.hsos.kbse.bewerbungsportal.benutzerverwaltung.repository.IBenutzerRepository;
import de.hsos.kbse.bewerbungsportal.benutzerverwaltung.repository.IBewerberRepository;
import de.hsos.kbse.bewerbungsportal.benutzerverwaltung.repository.IPersonalRepository;
import de.hsos.kbse.bewerbungsportal.bewerbungsverwaltung.repository.IBewerbungRepository;
import de.hsos.kbse.bewerbungsportal.stellenverwaltung.repository.IStelleRepository;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nordm
 */
@RequestScoped
public class UnitWork implements IUnitWork {

     @PersistenceContext(unitName = "de.hsos.kbse_Bewerbungsportal_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    private IBenutzerRepository Benutzer;
    private IBewerberRepository Bewerber;
    private IPersonalRepository Personal;
    private IBewerbungRepository Bewerbung;
    private IStelleRepository Stelle;

    public UnitWork() {
        Benutzer = new BenutzerRepository(em);
        Bewerber = new BewerberRepository(em);
        Personal = new PersonalRepository(em);
        Bewerbung = new BewerbungRepository(em);
        Stelle = new StelleRepository(em);
    }



    @Override
    public IBenutzerRepository getBenutzer() {
        return Benutzer;
    }

    public void setBenutzer(IBenutzerRepository Benutzer) {
        this.Benutzer = Benutzer;
    }

    @Override
    public IBewerberRepository getBewerber() {
        return Bewerber;
    }

    public void setBewerber(IBewerberRepository Bewerber) {
        this.Bewerber = Bewerber;
    }

    @Override
    public IPersonalRepository getPersonal() {
        return Personal;
    }

    public void setPersonal(IPersonalRepository Personal) {
        this.Personal = Personal;
    }

    @Override
    public IBewerbungRepository getBewerbung() {
        return Bewerbung;
    }

    public void setBewerbung(IBewerbungRepository Bewerbung) {
        this.Bewerbung = Bewerbung;
    }

    /**
     *
     * @return
     */
    @Override
    public IStelleRepository getStelle() {
        return Stelle;
    }

    public void setStelle(IStelleRepository Stelle) {
        this.Stelle = Stelle;
    }

    @Override
    public int Complete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
