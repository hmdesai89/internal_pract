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
public class MyLibrary {
    
    public static void main(String[] args) {
        ORM orm = new MyLayer();
        API api = new NewApi(orm);
        
        Book b1 = new Book(1);
        b1.setAuthors("Harsh");
        b1.setName("My Code");
        
        
        
    }
    
}
