/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author harsh
 */
import com.flipkart.libraryservice.domain.Book;
import com.flipkart.libraryservice.dao.IBookDaoImpl;
import com.flipkart.libraryservice.service.ILibraryServiceImpl;
import com.flipkart.libraryservice.dao.IBookDao;
import com.flipkart.libraryservice.service.ILibraryService;

public class Test123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IBookDao bookDao = new IBookDaoImpl();
        ILibraryService api = new ILibraryServiceImpl();
        
        Book b1 = new Book(1234);
        b1.setAuthors("Harsh");
        b1.setName("Testing");
        
        Book b2 = new Book(1234);
        b2.setAuthors("Harsh");
        b2.setName("Testing");
        
        b1.displayInfo();
        
        
       // api.insertBook(b1);
        //api.insertBook(b2);
        
        
        api.searchBook("Author", "Harsh");
        api.updateBook(1234,"Author", "Desai");
        api.searchBook("Author", "Desai");
        
    }
    
}