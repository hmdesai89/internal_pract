/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.myapp.resources;

import com.examples.myapp.model.Comment;
import com.examples.myapp.service.CommentService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author harsh
 */
@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentResource {

        
    CommentService commentService = new CommentService();
    
    
    @GET
    public List<Comment> getComments(@PathParam ("messageId") long messageId  ) {
        return commentService.getAllComments(messageId);
    }
    
    @POST
    public Comment addComment(@PathParam ("messageId") long messageId, Comment comment) {
        return commentService.addComment(messageId,comment);
        
    }
    
    @PUT
    @Path("/{commentId}")
    public Comment updateComment(@PathParam ("messageId")long messageId, @PathParam ("commentId")long commentId, Comment comment) {
        comment.setId(commentId);
        return commentService.updateComment(messageId,comment);
        
    }
    
    @GET
    @Path("/{commentId}")
    public Comment getComment(@PathParam ("messageId")long messageId,@PathParam ("commentId")long commentId) {
        return commentService.getComment(messageId,commentId);       
    }
    
        
    @DELETE
    @Path("/{commentId}")
    public void deleteComment(@PathParam ("messageId")long messageId, @PathParam ("commentId")long commentId ) {
        commentService.removeComment(messageId, commentId);       
    }
    

}
