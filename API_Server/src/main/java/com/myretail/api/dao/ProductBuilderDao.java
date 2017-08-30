/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myretail.api.dao;

import com.myretail.api.model.Price;
import com.myretail.api.model.Product;

/**
 *
 * @author harsh
 */
public class ProductBuilderDao implements IGenericDao {
    
    IGenericDao productNameDao = new ProductNameDao();
    IGenericDao priceDao = new PriceDao();

    @Override
    public Object get(Long id) {
        //Product product  = new Product();
        
        Product product = (Product) productNameDao.get(id);
        product.setCurrentPrice((Price)priceDao.get(id));
        return product;
    }

    @Override
    public Object put(Object product) {
        Product prod = (Product) product;
        //prod = (Product) productNameDao.put(prod);
        priceDao.put(prod.getCurrentPrice()); 
        return product;
    }

    @Override
    public Object post(Object product) {
        productNameDao.post(product);
        priceDao.post(product); 
        return product;
       

    }

    @Override
    public void delete(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
