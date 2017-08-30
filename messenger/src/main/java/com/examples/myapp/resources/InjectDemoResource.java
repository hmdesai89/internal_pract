/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.myapp.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectdemo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class InjectDemoResource {
    
    @GET
    @Path("/annotation")
    public String getParamUsingAnnotations(@MatrixParam ("param") String value,
                                            @HeaderParam ("header") String header,
                                            @CookieParam ("cookie") String cookie) {
        return "Test param: "+ value+ "Header is : "+ header;
        
    }
    
    @GET
    @Path("/context")
    public String getParamUsingContext(@Context UriInfo uriIndfo) {
        return "Test param";
        
    }
}
