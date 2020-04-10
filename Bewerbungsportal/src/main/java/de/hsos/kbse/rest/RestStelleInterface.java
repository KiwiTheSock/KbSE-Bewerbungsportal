///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package de.hsos.kbse.rest;
//
//import java.sql.Date;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
//
///**
// *
// * @author nordm
// */
//public interface RestStelleInterface {
//
//    @POST
//    @Path("stelle")
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//    public Response createStelle(
//            @QueryParam("bezeichnung") String bezeichnung,
//            @QueryParam("datum") Date datum,
//            @QueryParam("beschreibung") String beschreibung,
//            @QueryParam("ort") String ort);
//}
