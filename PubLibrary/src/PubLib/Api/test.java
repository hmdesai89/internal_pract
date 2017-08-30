package PubLib.Api;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */
//package test;


import PubLib.Api.API;
import PubLib.Api.ORM;
import PubLib.Api.MyLayer;
import PubLib.Api.NewApi;
import PubLib.Api.Book;
/**
 *
 * @author harsh
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Driver Function");
        ORM orm = new MyLayer();
        API api = new NewApi(orm);
        
        System.out.println("Adding New Book");
        
        Book b1 = new Book(123);
        b1.setAuthors("Harsh");
        b1.setName("My Code");
        b1.setCount(2);
        
        api.insertBook(b1);
        
        
        
    }
    
    
}