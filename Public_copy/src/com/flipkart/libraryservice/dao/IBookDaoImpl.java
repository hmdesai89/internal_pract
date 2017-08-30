/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flipkart.libraryservice.dao;

import com.flipkart.libraryservice.domain.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

import com.flipkart.libraryservice.dao.IBookDao;

/**
 *
 * @author harsh
 */
public class IBookDaoImpl implements IBookDao {
       
    //ArrayList <Book> books;
    HashMap <Integer, Book> bookRack;
    HashMap <String, Set<Integer>> authorMap;
    
    public IBookDaoImpl () {
        //books = new ArrayList <Book>();
        bookRack = new HashMap <Integer, Book>();
        authorMap = new HashMap <String, Set<Integer>>();
        //System.out.println("Orm Layer initiating");
    }
    
    public Book get(int ISBN) {
        return bookRack.get(ISBN);
       
    }
    
    public Book add(int ISBN, String name, String author, String code) {
         if(bookRack.containsKey(ISBN)) {
             bookRack.get(ISBN).increamentCount();
         } else {
             Book newBook = new Book(ISBN);
             newBook.setName(name);
             newBook.setAuthors(author);
             
             //Set Author for fast lookup
             addBookInAuthor(author,ISBN);
             
             newBook.setCode(code);
             bookRack.put(ISBN,newBook);
         }
         return bookRack.get(ISBN); 
    }
    
    public void addBookInAuthor( String author, int ISBN) {
        if (! authorMap.containsKey(author)) {
            authorMap.put(author, new HashSet<Integer>());
        }
        authorMap.get(author).add(ISBN);
    }

    public void removeBookFromAuthor( String author, int ISBN) {
        if (! authorMap.containsKey(author)) { authorMap.get(author).remove(ISBN); }
    }
    
        
    public void put(int ISBN, String tag,String tagValue) {
        if(bookRack.containsKey(ISBN)) {
            copyBookAttr(bookRack.get(ISBN), tag,tagValue);
        }

    }
    
    public void delete(int ISBN) {
        if(bookRack.containsKey(ISBN)){
            bookRack.get(ISBN).decrementCount();
            Book b =bookRack.get(ISBN);
            
            if (b.getCount() == 0) {
                removeBookFromAuthor(b.getAuthors(),ISBN);
                bookRack.remove(ISBN);
                
                
                
            }
        }


    }
    
    public void copyBookAttr(Book book, String tag, String value ) {
        
        
        if (tag.equalsIgnoreCase("Author")) {
             removeBookFromAuthor(book.getAuthors(), book.getISBN());
             addBookInAuthor(value, book.getISBN());
             book.setAuthors(value);

        } else if (tag.equalsIgnoreCase("code")) {
            book.setCode(value);
        }
        
        
        
        
    }
    
    public Book searchByISBN(int ISBN) { return bookRack.get(ISBN); }
    
    public HashMap <Integer, Book> searchByAuthor(String author) {
        
        HashMap <Integer, Book> result = new HashMap <Integer, Book>();
        
        for (int ISBN: authorMap.get(author)) {
            result.put(ISBN, bookRack.get(ISBN));  
        }
        return result;
    }
    
    public HashMap<Integer,Book> search(String code , String value) {
        HashMap<Integer, Book> result = new HashMap<Integer, Book>();
        
        if (code.equalsIgnoreCase("ISBN")) {
            Book book = searchByISBN(Integer.parseInt(value));
            if (book != null) {
                result.put(book.getISBN(), book);
            }
            
            
        } else if (code.equalsIgnoreCase("author"))  {
           result = searchByAuthor(value);
        } else if (code.equalsIgnoreCase("name")){
            //generic case;
            for (Book b : bookRack.values()) {
                if (b.getName().equalsIgnoreCase(value)) {result.put(b.getISBN(), b);}
            }
            
        } else if (code.equalsIgnoreCase("code")){
            //generic case;
            for (Book b : bookRack.values()) {
                if (b.getCode().equalsIgnoreCase(value)) {result.put(b.getISBN(), b);}
            }
        }
        
        

        return result;
        
    }
}
