/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.messenger.client;

import com.examples.messenger.client.model.Message;
import java.util.List;
import javax.ws.rs.client.Entity;
import static javax.ws.rs.client.Entity.entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author harsh
 */
public class MessageClientImpl implements IGenericClient{

    @Override
    public Object get(String id) {
        Invocation.Builder invocationBuilder 
            = RestClient.getMessageTarget()
                    .path(id)
                    .request(MediaType.APPLICATION_JSON);
        return invocationBuilder.get(Message.class);
    }

    @Override
    public  void put(Object message) {
        Invocation.Builder invocationBuilder 
            = RestClient.getMessageTarget()
                    .request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.put(Entity.entity(message, MediaType.APPLICATION_JSON));
        return;
        
    }

    @Override
    public void post(Object message) {
        Invocation.Builder invocationBuilder 
            = RestClient.getMessageTarget()
                    .request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.post(Entity.entity(message, MediaType.APPLICATION_JSON));
    }

    @Override
    public void delete(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAll() {
        Invocation.Builder invocationBuilder 
            = RestClient.getMessageTarget()
                    .request(MediaType.APPLICATION_JSON);
        
        return invocationBuilder.get(new GenericType<List<Message>>(){});
    }


    
}
