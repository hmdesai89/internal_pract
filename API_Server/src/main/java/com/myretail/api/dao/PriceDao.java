/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myretail.api.dao;

import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.myretail.api.client.DbClient;
import com.myretail.api.exception.DataNotFoundException;
import com.myretail.api.model.Price;
import java.util.Optional;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author harsh
 */
@Provider
public class PriceDao implements IGenericDao {

    @Override
    public Object get(Long id) {
        
        
        Session session = DbClient.getSession();
        
        final ResultSet priceResult = session
                .execute(
            "SELECT * from price_keyspace.prices WHERE id = ? ", String.valueOf(id));
        final Row priceRow = priceResult.one();
        if (priceRow == null)  {throw new DataNotFoundException("Failed : Data not found Db");}
        
        final Price price =
            priceRow != null
            ? new Price(
                Long.parseLong(priceRow.getString("id")),
                priceRow.getFloat("value"),
                priceRow.getString("currencyCode"))
            : null;
        return price;
    }

    @Override
    public Object put(Object entity) {
        
        
        //Put following code in a new function updateDb; takes entity as arg
        Session session = DbClient.getSession();
        Price price = (Price) entity;

        
        session.execute(
            "INSERT INTO price_keyspace.prices (id,currencycode, value) VALUES (?,?,?)", 
                        String.valueOf(price.getId()),price.getCurrencyCode(), price.getValue() );
        //
        
        //Start a new thread with function of updateDb
        //Do not wait for thread to complete
        //Return success to user

        return price;
        
    }

    @Override
    public Object post(Object entity) {
                
        Session session = DbClient.getSession();
        Price price = (Price) entity;
        
        session.execute(
            "INSERT INTO price_keyspace.prices (id,currencycode, value) VALUES ", 
                        String.valueOf(price.getId()),price.getCurrencyCode(), price.getValue() );

        return price;
    }

    @Override
    public void delete(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
