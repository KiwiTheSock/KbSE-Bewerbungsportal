//package de.hsos.kbse.rest;
//
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
//import javax.ws.rs.core.MediaType;
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
//public interface RestBenutzerInterface {
//
//    @POST
//    @Path("benutzer")
//    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//    public Response createBenutzer(
//            @QueryParam("name") String name,
//            @QueryParam("vorname") String vorname,
//            @QueryParam("email") String email,
//            @QueryParam("telefon") String telefon,
//            @QueryParam("ort") String ort,
//            @QueryParam("straße") String straße,
//            @QueryParam("plz") Integer plz);
//
//}
