/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.myapp.exception;

import javax.persistence.PersistenceException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider 
public class PersistenceMapper implements ExceptionMapper<PersistenceException> { 

    @Override 
    public Response toResponse(PersistenceException arg0) { 
        if(arg0.getCause() instanceof DataNotFoundException) {
           return Response.status(Response.Status.BAD_REQUEST).build(); 
        } 
        return null;
    } 

} 