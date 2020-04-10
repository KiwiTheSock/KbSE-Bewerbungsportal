//package de.hsos.kbse.rest;
//
//import de.hsos.kbse.entity.Benutzer;
//import de.hsos.kbse.facade.BenutzerFacade;
//import java.util.Collection;
//import javax.ejb.Stateless;
//import javax.inject.Inject;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.ws.rs.Path;
//import javax.ws.rs.core.Response;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
///**
// *
// * @author nordm
// */
//@Stateless
//@Path("benutzer")
//public class RestBenutzer implements RestBenutzerInterface {
//
//    @Inject
//    private BenutzerFacade repo;
//
//    @PersistenceContext(unitName = "de.hsos.kbse_Bewerbungsportal_war_1.0-SNAPSHOTPU")
//    private EntityManager em;
//
////    @Override
////    public Response createBenutzer(String name, String vorname) {
////      try {
////          Benutzer benutzer = new Benutzer(name,vorname);
////          em.persist(benutzer);
////            return Response
////                    .status(Response.Status.FOUND)
////                    .build();
////        } catch (NullPointerException |  IllegalArgumentException ex) {
////            return Response.status(Response.Status.CONFLICT).build();
////        }
////    }
//    @Override
//    public Response createBenutzer(String name, String vorname, String email, String telefon, String ort, String straße, Integer plz) {
//        try {
//            Benutzer benutzer = new Benutzer(name, vorname, email, telefon, ort, straße, plz);
//            em.persist(benutzer);
//            return Response
//                    .status(Response.Status.FOUND)
//                    .build();
//        } catch (NullPointerException | IllegalArgumentException ex) {
//            return Response.status(Response.Status.CONFLICT).build();
//        }
//    }
//
//}
