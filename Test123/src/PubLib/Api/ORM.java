/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubLib.Api;

/**
 *
 * @author harsh
 */

import java.util.ArrayList;
public interface  ORM {
    
    public Book get(int ISBN);    
    public void put(Book book);
    
    public void delete(Book book);
    public Book search(String tag, String value);    
 
}
