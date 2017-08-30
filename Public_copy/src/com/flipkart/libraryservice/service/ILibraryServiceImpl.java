package com.flipkart.libraryservice.service;


import com.flipkart.libraryservice.domain.Book;
import com.flipkart.libraryservice.dao.IBookDao;
import com.flipkart.libraryservice.dao.IBookDaoImpl;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;



/**
 *
 * @author harsh
 */
public class ILibraryServiceImpl implements ILibraryService {
    
    
    IBookDao bookDao ;
    HashMap <String, Boolean> tagMap;

    
    public ILibraryServiceImpl() {
        //This needs to be changed. And need to create Dao object here.
        bookDao = new IBookDaoImpl();
        tagMap = new HashMap <String, Boolean>();
        populateTagMap();
    }
    
    private void populateTagMap() {
        tagMap.put("auhtor", true);
        tagMap.put("name", true);
        tagMap.put("code", true);
        tagMap.put("isbn", true);
    }
    
    private boolean validateTagMap(String tag) {return tagMap.containsKey(tag);}
    
    //This should go in DAO layer
    public Book checkForBook(int ISBN) {
        Book b ;
        return bookDao.get(ISBN);
        //return b;
    }

    //User should give All parameter instead of object paas that to 
    //Dao layer and let dao to take care how to make object.
    @Override
    public Book insertBook(int ISBN, String name, String author , String Code){
        return bookDao.add(ISBN, name, author, Code);
    }
    

    @Override
    public List<Book> searchBook(String tag, String tagValue) {
        
        if (!validateTagMap(tag.toLowerCase())) {
            throw new UnsupportedOperationException("Tag not supported\n."); 
        }
            
        
        HashMap<Integer, Book> books =  bookDao.search(tag, tagValue);
            
        List<Book> list = new ArrayList<Book>(books.values());
        return list;
    }


    @Override
    public Book updateBook(int  ISBN,String tag,String tagValue) {
        if (!validateTagMap(tag.toLowerCase())) {
            throw new UnsupportedOperationException("Tag not supported\n."); 
        }
        bookDao.put(ISBN,tag, tagValue );
        return bookDao.get(ISBN);
        

    }

    @Override
    public void deleteBook(int ISBN) {
            bookDao.delete(ISBN);
    }

    @Override
    public List<Book> andSearchBook(List<String> tags, List<String> tagValues) {
        if (tags.size() != tagValues.size()) {
            throw new UnsupportedOperationException("Mismath in tag and value sizes.");
        } else if (tags.size() != 2  ) {
            throw new UnsupportedOperationException("Supports AND operation for only 2 values as of now");      
        }
        
        List<Book> list = new ArrayList<Book>();

        
        for (int i = 0; i < tags.size(); i ++) {
        
            if (!validateTagMap(tags.get(i).toLowerCase())) {
                throw new UnsupportedOperationException("Tag not supported\n."); 
            }
        }
        
            
        
        HashMap<Integer, Book> books1 =  bookDao.search(tags.get(0), tagValues.get(0));
        HashMap<Integer, Book> books2 =  bookDao.search(tags.get(1), tagValues.get(1));
        
        for (int key : books2.keySet()) {
            if (books1.containsKey(key)) { list.add(books1.get(key));}
        }
        
        return list;
        


    }

    @Override
    public List<Book> orSearchBook(List<String> tags, List<String> tagValues) {
        if (tags.size() != tagValues.size()) {
            throw new UnsupportedOperationException("Mismath in tag and value sizes.");
        }
        
                
        for (int i = 0; i < tags.size(); i ++) {
        
            if (!validateTagMap(tags.get(i).toLowerCase())) {
                throw new UnsupportedOperationException("Tag not supported\n."); 
            }
        }
        
        HashMap<Integer, Book> result = new HashMap<Integer, Book>();
        int index = 0;
        for (String tag : tags) {
            HashMap<Integer, Book> temp = bookDao.search(tag, tagValues.get(index));
            for (int key : temp.keySet()) {
                result.put(key, temp.get(key));
            }
           
            
            index++;
        }
        List<Book> list = new ArrayList<Book>(result.values());
        return list;
    }
    

    
}
