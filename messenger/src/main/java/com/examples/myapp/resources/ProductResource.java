/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.myapp.resources;

import com.examples.myapp.model.Product;
import com.examples.myapp.service.ProductService;
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
@Path("/products")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProductResource {

    
    ProductService productService = new ProductService();
    
    @GET
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
    
    @POST
    public Product addProduct(Product product) {
        return productService.addProduct(product);
        
    }
    
    @PUT
    @Path("/{productId}")
    public Product updateProduct(@PathParam ("productId")long id,Product product) {
        product.setId(id);
        return productService.updateProduct(product);
        
    }
    
    @GET
    @Path("/{productId}")
    public Product getProduct(@PathParam ("productId")Long productId) {
        return productService.getProduct(productId);       
    }
    
        
    @DELETE
    @Path("/{productId}")
    public void deleteProduct(@PathParam ("productId")Long productId) {
        productService.removeProduct(productId);       
    }
    
    
    
    
}
