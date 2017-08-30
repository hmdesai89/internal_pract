/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myretail.api.exception;

import com.myretail.api.model.ErrorMessage;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

    @Override
    public Response toResponse(Throwable e) {
        ErrorMessage er = new ErrorMessage(e.getMessage(), 500, "https://www.google.com");
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(er)
                .build();
    }
    
}
