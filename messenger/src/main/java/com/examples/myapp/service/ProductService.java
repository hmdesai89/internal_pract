/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.myapp.service;

import com.examples.myapp.database.DatabaseClass;
import com.examples.myapp.model.Product;
import com.examples.myapp.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author harsh
 */
public class ProductService {
    
    
    private Map<Long, Product> products = DatabaseClass.getProducts();
    
    public List<Product> getAllProducts() {
        return new ArrayList(products.values());

    }

    public ProductService() {
        products.put(12345l, new Product(12345l, "Test the thunder"));
        products.put(6789l, new Product(6789l, "Pepsi"));
    }


    public Product getProduct(Long productid) {
        return products.get(productid);
    }

    public Product addProduct(Product product) {
        product.setId(product.getId());
        products.put(product.getId(), product);
        return product;
    }  
    
    
    public Product updateProduct(Product product) {
        if (product.getId() <= 0) {
            return null;
        }
        products.put(product.getId(), product);
        return product;
    }
    
    public Product removeProduct(Long productId) {
        return products.remove(productId);
    }      
    
}

