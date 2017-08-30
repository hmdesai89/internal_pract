/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myretail.api.resource;

import com.myretail.api.model.Product;
import com.myretail.api.service.ProductService;
import javax.ws.rs.Consumes;
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

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductResource {
    
    ProductService productService = new ProductService();
    
    @GET
    public String getProducts(@PathParam ("productId") Long productId ) {
        return "Hello world";
    }
    
    
 
    @GET
    @Path("/{productId}")
    public Product getProduct(@PathParam ("productId") Long productId ) {
        return productService.getProduct(productId);
    }

 
    @POST
    public Product addProduct( Product product ) {
        return productService.addProduct(product);
    } 
    
    
    @PUT
    @Path("/{productId}")
    public Product updateProduct(@PathParam ("productId") Long productId , Product product) {
        return productService.updateProduct(productId, product);
    }

    
    
}
