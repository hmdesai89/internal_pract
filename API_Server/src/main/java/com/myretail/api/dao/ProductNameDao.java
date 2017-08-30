/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myretail.api.dao;

import com.myretail.api.client.ApiClient;
import com.myretail.api.exception.DataNotFoundException;
import com.myretail.api.exception.InternalErrorException;
import com.myretail.api.model.Product;
import java.util.List;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


/**
 *
 * @author harsh
 */
public class ProductNameDao implements IGenericDao{
    
    

    @Override
    public Object get(Long id) {
        
        //ApiClient apiClient = new ApiClient();

        ClientResponse response = ApiClient.getProductTarget().path(String.valueOf(id))
                .accept("application/json")
                .get(ClientResponse.class);
        

        
        if (response.getStatus() != 200) {
            
            if (response.getStatus() == 404) {
		   throw new DataNotFoundException("Failed : HTTP error code : "
			+ response.getStatus());
            } else if (response.getStatus() == 500) {
		   throw new InternalErrorException("Internal Server Error : "
			+ response.getStatus());
            }
	}
        
        return response.getEntity(Product.class);

    }

    @Override
    public Object put(Object product) {
        
        Product prod = (Product)product;
        
        ClientResponse response = ApiClient.getProductTarget()
                .path(String.valueOf(prod.getId()))
                .accept("application/json")
                .put(ClientResponse.class,prod );
        
        int stat = response.getStatus();
        if (response.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ response.getStatus());
	}
        
        return product;
    }

    @Override
    public Object post(Object product) {
        
        
        Product prod = (Product)product;

        
        ClientResponse response = ApiClient.getProductTarget()
                .accept("application/json")
                .post(ClientResponse.class,prod );
        
        int stat = response.getStatus();
        if (response.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ response.getStatus());
	}
        
        return product;

    }

    @Override
    public void delete(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
