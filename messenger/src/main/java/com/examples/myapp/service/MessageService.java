/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.myapp.service;

import com.examples.myapp.database.DatabaseClass;
import com.examples.myapp.exception.DataNotFoundException;
import com.examples.myapp.model.Message;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 *
 * @author harsh
 */
public class MessageService {
    
    private Map<Long, Message> messages = DatabaseClass.getMessages();
    
    public List<Message> getAllMessages() {
        return new ArrayList(messages.values());

    }

    public MessageService() {
        messages.put(1l, new Message(1l,"Hello world", "Harsh Desai"));
        messages.put(2l, new Message(2l,"Welcome", "Jay Desai"));
    }


    public Message getMessage(Long id) {
        Message message =  messages.get(id);
        if (message ==null) {
            throw new DataNotFoundException("Message with id "+id+" not found");
        }
        return message;
    }
    
    public List <Message> getAllMessagesForYear(int year) {
        List <Message> messageForYear = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        for (Message message: messages.values()) {
            cal.setTime(message.getCreated());
            if (cal.get(Calendar.YEAR) == year) {
                messageForYear.add(message);
            }
        }
        return messageForYear;
    }
    
    public List <Message> getAllMessagesPaginated(int start, int size) {
        List <Message> list = new ArrayList(messages.values());
        if (start > list.size() ) { return new ArrayList<Message>(); }
        
        if (start+size > list.size() ) { return list.subList(start, list.size()); }
        
        return list.subList(start, start+size);

        
    }
    
    public Message addMessage(Message message) {
        message.setId(messages.size() + 1);
        messages.put(message.getId(), message);
        return message;
    }  
    
    
    public Message updateMessage(Message message) {
        if (message.getId() <= 0) {
            return null;
        }
        messages.put(message.getId(), message);
        return message;
    }
    
    public Message removeMessage(long messageId) {
        return messages.remove(messageId);
    }      
    
}
