/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myretail.api.service;

import com.myretail.api.dao.IGenericDao;
import com.myretail.api.dao.ProductBuilderDao;
import com.myretail.api.model.Product;
import java.util.List;

/**
 *
 * @author harsh
 */
public class ProductService {
    
    IGenericDao productBuilderDao = new ProductBuilderDao();
    
    

    public ProductService() {
    }
    

    
    public Product getProduct(Long productId) {
        Product product = (Product) productBuilderDao.get(productId);
        return product;
 
    }
    
    public Product addProduct( Product product) {
        return (Product) productBuilderDao.post(product);
 
    }
    
    
        
    public Product updateProduct( Long productId, Product product) {
        product.setId(productId);
        product.getCurrentPrice().setId(productId);
        return (Product) productBuilderDao.put(product);
 
    }

    
}
