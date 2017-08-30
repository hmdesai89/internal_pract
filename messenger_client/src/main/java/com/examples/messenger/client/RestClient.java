/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.messenger.client;

import com.examples.messenger.client.model.Message;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author harsh
 */
public class RestClient {
    
    private static final RestClient myClient  = new RestClient();
    private static WebTarget webTarget;
    private static WebTarget messageWebTarget;
    Client client;

    private RestClient() {
        client =  ClientBuilder.newClient(); 
        webTarget = client.target("http://localhost:8080/messenger"); 
        messageWebTarget = webTarget.path("webapi/messages");
        

        
        
        
    }
    
    public static WebTarget getMessageTarget() {
        return messageWebTarget;
    }
    

}
