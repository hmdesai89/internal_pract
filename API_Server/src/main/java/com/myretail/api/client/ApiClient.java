/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myretail.api.client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.ws.rs.client.ClientBuilder;
//import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ApiClient {
    
    	Properties prop = new Properties();
	InputStream input = null;


    
    private String url = "http://localhost:8080/messenger";
    private String msgUrl = "webapi/products";
    private static Client client;
    private WebResource webResource;
    private static WebResource webProductResource;
    private static ApiClient instance;
    

    private ApiClient() { 
        
        
     /*   
	try {

            input = new FileInputStream("/Users/harsh/NetBeansProjects/API_Server/src/main/resources/config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            url = prop.getProperty("url");
            msgUrl = prop.getProperty("msgUrl");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

     */   
        Client client = Client.create(); 
        webResource = client.resource(url);
        webProductResource = webResource.path(msgUrl);
 
    }

    public  Client getClient() {
        return client;
    }
    
    public  static WebResource getProductTarget() {
        if (instance == null) {
            instance = new ApiClient(); 
        }
        return webProductResource;
    }

}
