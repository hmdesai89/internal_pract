/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PubLib.Api;

import java.util.ArrayList;

/**
 *
 * @author harsh
 */
public class MyLayer implements ORM {
       
    ArrayList <Book> books;
    
    public MyLayer () {
        books = new ArrayList <Book>();
        //System.out.println("Orm Layer initiating");
    }
    
    public Book get(int ISBN) {
        System.out.print("Should come here\n");
        for(Book b : books) {
            if(b.getISBN() == ISBN)
                return (b);
        }
        return null;
        
    }
    
        
    public void put(Book book) {
        for(Book b : books) {
            if(b.getISBN() == book.getISBN()) {
                copyBookAttr(book, b);
                return ;
            }
        }
        books.add(book);
    }
    
    public void delete(Book book) {
        for(Book b : books) {
            if(b.getISBN() == book.getISBN()) {
                books.remove(b);
                return ;
            }
        }  
    }
    
    public void copyBookAttr(Book newBook, Book oldBook) {
        oldBook.setAuthors(newBook.getAuthors()) ;
        oldBook.setCode(newBook.getCode()) ;
        
    }
    
    public Book search(String code , String value) {
        System.out.print("Searching\n");
        for(Book b : books) {
            if (code == "Author") {
            if(b.getAuthors() == value)
                return (b);
            } else if (code == "code") {
            if(b.getCode() == value)
                return (b);                
            }
            
        }
        return null;
        
    }
}
