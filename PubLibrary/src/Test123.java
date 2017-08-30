/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author harsh
 */
import PubLib.Api.*;

public class Test123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ORM orm = new MyLayer();
        API api = new NewApi(orm);
        
        Book b1 = new Book(1234);
        b1.setAuthors("Harsh Desai");
        
        api.insertBook(b1);
    }
    
}
