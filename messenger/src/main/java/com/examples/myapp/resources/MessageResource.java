/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.myapp.resources;

import com.examples.myapp.model.Message;
import com.examples.myapp.resources.beans.MessageFilterBeans;
import com.examples.myapp.service.MessageService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.apache.log4j.Logger;


/**
 *
 * @author harsh
 */
@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
    
    final static Logger logger = Logger.getLogger(MessageResource.class);

    
    MessageService messageService = new MessageService();
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages(@BeanParam MessageFilterBeans filterBean  ) {
        
        logger.info("Testing logger");

        if (filterBean.getYear()> 0) {
            return messageService.getAllMessagesForYear(filterBean.getYear());
        }
        if (filterBean.getStart() > 0 && filterBean.getSize() >=0 ) {
            return messageService.getAllMessagesPaginated(filterBean.getStart(),filterBean.getSize());
        }
        return messageService.getAllMessages();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addMessage(Message message, @Context UriInfo uriInfo) throws URISyntaxException {
        URI uri = uriInfo.getAbsolutePathBuilder().path(String.valueOf(message.getId())).build();
        return Response.created(uri)
                .entity(messageService.addMessage(message))
                .build();
        
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{messageId}")
    public Message updateMessage(@PathParam ("messageId")long id,Message message) {
        message.setId(id);
        return messageService.updateMessage(message);
        
    }
    
    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessage(@PathParam ("messageId")long messageId) {
        return messageService.getMessage(messageId);       
    }
    
        
    @DELETE
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteMessage(@PathParam ("messageId")long messageId) {
        messageService.removeMessage(messageId);       
    }
    
    @Path("/{messageId}/comments")
    public  CommentResource getCommentResource() {
        return new CommentResource();
    }
    
}
