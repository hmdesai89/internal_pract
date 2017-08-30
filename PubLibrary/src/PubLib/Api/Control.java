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
public class Control {
    
   public Control() {
       
       
       
   }
   
   
   public static void main(String[] args) {
       ORM orm = new MyLayer();
       API api = new NewApi(orm);
       
       Book test = new Book(1);
       test.setAuthors("Harsh");
       test.setName("My Code");
       
      
       
       
       Book b2 = new Book(1234);
       b2.setAuthors("Rolland");
       b2.setName("Test Book");
       
      // api.insertBook(test);

       
       
       
       
       
   }
    
}
