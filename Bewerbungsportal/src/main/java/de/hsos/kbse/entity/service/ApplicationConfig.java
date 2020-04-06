/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.entity.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author nordm
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(de.hsos.kbse.entity.service.BenutzerFacadeREST.class);
        resources.add(de.hsos.kbse.entity.service.BewerberFacadeREST.class);
        resources.add(de.hsos.kbse.entity.service.BewerbungFacadeREST.class);
        resources.add(de.hsos.kbse.entity.service.PersonalFacadeREST.class);
        resources.add(de.hsos.kbse.entity.service.StelleFacadeREST.class);
        resources.add(de.hsos.kbse.rest.RestBenutzer.class);
        resources.add(de.hsos.kbse.rest.RestBewerbung.class);
    }
    
}
