/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.entity.service;

import de.hsos.kbse.entity.Benutzer;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author nordm
 */
@Stateless //TODO: muss noch entfernt werden 
@Path("de.hsos.kbse.entity.benutzer")
public class BenutzerFacadeREST extends AbstractFacade<Benutzer> {

    @PersistenceContext(unitName = "de.hsos.kbse_Bewerbungsportal_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public BenutzerFacadeREST() {
        super(Benutzer.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Benutzer entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, Benutzer entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Benutzer find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Benutzer> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Benutzer> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    
        @POST
    @Path("benutzer")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response createBenutzer(
            @QueryParam("name") String name,
            @QueryParam("vorname") String vorname,
            @QueryParam("email") String email,
            @QueryParam("telefon") String telefon,
            @QueryParam("ort") String ort,
            @QueryParam("straße") String straße,
            @QueryParam("plz") Integer plz) {
        try {
            Benutzer benutzer = new Benutzer(name, vorname, email, telefon, ort, straße, plz);
            em.persist(benutzer);
            return Response
                    .status(Response.Status.FOUND)
                    .build();
        } catch (NullPointerException | IllegalArgumentException ex) {
            return Response.status(Response.Status.CONFLICT).build();
        }
    }
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

}
