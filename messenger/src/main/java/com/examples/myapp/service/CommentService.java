/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.myapp.service;

import com.examples.myapp.database.DatabaseClass;
import com.examples.myapp.model.Comment;
import com.examples.myapp.model.Message;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 *
 * @author harsh
 */
public class CommentService {

    
    private Map<Long, Message> messages = DatabaseClass.getMessages();


    public CommentService() {
    }

        
    public List<Comment> getAllComments(Long messageId) {
        return new ArrayList(messages.get(messageId).getComments().values());

    }

    public Comment getComment(Long messageId,Long commentId) {
        return messages.get(messageId).getComments().get(commentId);
    }
    

    
    public Comment addComment(Long messageId,Comment comment) {
        Map<Long, Comment> comments =  messages.get(messageId).getComments();
        comment.setId(comments.size() +1);
        comments.put(comment.getId(), comment);
        return comment;
    }  
    
    
    public Comment updateComment(Long messageId, Comment comment) {
        if (comment.getId() <= 0) {
            return null;
        }
        Map<Long, Comment> comments =  messages.get(messageId).getComments();
        comments.put(comment.getId(), comment);
        return comment;
    }
    
    public Comment removeComment(Long messageId,long commentId) {
        Map<Long, Comment> comments =  messages.get(messageId).getComments();
        return comments.remove(commentId);
    }      
    
    
}
