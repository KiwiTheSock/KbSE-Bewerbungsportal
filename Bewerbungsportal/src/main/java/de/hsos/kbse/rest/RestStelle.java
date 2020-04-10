///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package de.hsos.kbse.rest;
//
//import de.hsos.kbse.entity.Stelle;
//import java.sql.Date;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.ws.rs.core.Response;
//import org.joda.time.DateTime;
//
///**
// *
// * @author nordm
// */
//public class RestStelle implements RestStelleInterface {
//
//    @PersistenceContext(unitName = "de.hsos.kbse_Bewerbungsportal_war_1.0-SNAPSHOTPU")
//    private EntityManager em;
//
//    /**
//     *
//     * @param bezeichnung
//     * @param datum
//     * @param beschreibung
//     * @param ort
//     * @return
//     */
//    @Override
//    public Response createStelle(String bezeichnung, Date datum, String beschreibung, String ort) {
//        try {
//       
//            Stelle stelle = new Stelle(bezeichnung, datum, beschreibung, ort);
//            em.persist(stelle);
//            return Response
//                    .status(Response.Status.FOUND)
//                    .build();
//        } catch (NullPointerException | IllegalArgumentException ex) {
//            return Response.status(Response.Status.CONFLICT).build();
//        }
//    }
//
//}
