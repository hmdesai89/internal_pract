/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flipkart.libraryservice.dao;

/**
 *
 * @author harsh
 */

import com.flipkart.libraryservice.domain.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


public interface  IBookDao {
    
    public Book add(int ISBN, String name, String author, String code);
    public Book get(int ISBN);    
    public void put(int ISBN, String tag,String tagValue);
    
    public void delete(int ISB);
    public HashMap<Integer, Book> search(String tag, String value);    
 
}
