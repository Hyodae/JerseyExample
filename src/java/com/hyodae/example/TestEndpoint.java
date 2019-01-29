/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hyodae.example;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;

import javax.ws.rs.core.MediaType;

import javax.ws.rs.PathParam;
import javax.ws.rs.FormParam;




/**
 * REST Web Service
 *
 * @author hyodaekim
 */
@Path("example")
public class TestEndpoint {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public TestEndpoint() {
    }

    /**
     * Retrieves representation of an instance of com.hyodae.example.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        return "Successful Output From Service";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/params/{id}")
    public String getParamText(@PathParam("id") String id) {
        return "The value of the path parameter is " + id;

    }
    
    @POST
    @Path("/querytest")
    @Produces(MediaType.TEXT_PLAIN)
    public String getParamText(@FormParam("username") String user, @FormParam("password") String pw) {        
        return "The value of the Form parameters are Username = " + user + " and Password = " + pw;
    }

    
    
    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }    
    
    
}


