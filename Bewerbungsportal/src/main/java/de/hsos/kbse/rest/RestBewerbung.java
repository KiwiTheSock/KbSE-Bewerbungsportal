///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package de.hsos.kbse.rest;
//
//import de.hsos.kbse.entity.Bewerbung;
//import java.sql.Date;
//
//import javax.ejb.Stateless;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.ws.rs.Path;
//import javax.ws.rs.core.Response;
//
//
///**
// *
// * @author nordm
// */
//@Stateless
//@Path("bewerbung")
//public class RestBewerbung implements RestBewerbungInterface {
//
//    @PersistenceContext(unitName = "de.hsos.kbse_Bewerbungsportal_war_1.0-SNAPSHOTPU")
//    private EntityManager em;
//
//    @Override
//
//
//
//
//
//
//
//
//    public Response createBewerbung(Date zeitstempel, String status) {
//        try {
//
//            Bewerbung bewerber = new Bewerbung(zeitstempel, status);
//            em.persist(bewerber);
//            return Response
//                    .status(Response.Status.FOUND)
//                    .build();
//        } catch (NullPointerException | IllegalArgumentException ex) {
//            return Response.status(Response.Status.CONFLICT).build();
//        }
//    }
//
//}
