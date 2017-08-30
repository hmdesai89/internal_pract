/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flipkart.libraryservice.service;

import com.flipkart.libraryservice.domain.Book;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 *
 * @author harsh
 */
public class ILibraryServiceTest {
    
    public ILibraryServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertBook method, of class ILibraryService.
     */
    @Test
    public void testInsertBook() {
        System.out.println("insertBook");
        int ISBN = 1234;
        String name = "Test the add";
        String author = "Harsh Desai";
        String code = "educational";
        Book expResult = new Book(1234);
        expResult.setAuthors("Harsh Desai");
        expResult.setCode("educational");

        ILibraryService instance = new ILibraryServiceImpl();
        Book result = instance.insertBook(ISBN, name, author, code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchBook method, of class ILibraryService.
     */
    
    @Test
    public void testSearchBook() {
        System.out.println("searchBook");
        int ISBN = 1234;
        String name = "Test the add";
        String author = "Harsh Desai";
        String code = "educational";
        Book expResult = new Book(1234);
        expResult.setAuthors("Harsh Desai");
        expResult.setCode("educational");

        ILibraryService instance = new ILibraryServiceImpl();
        instance.insertBook(ISBN, name, author, code);
        List<Book> result = instance.searchBook("ISBN", "1234");
        assertEquals(expResult, result.get(0));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateBook method, of class ILibraryService.
     */
    /*
    @Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        int ISBN = 0;
        String tag = "";
        String tagValue = "";
        ILibraryService instance = new ILibraryServiceImpl();
        Book expResult = null;
        Book result = instance.updateBook(ISBN, tag, tagValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteBook method, of class ILibraryService.
     */
    /*
    @Test
    public void testDeleteBook() {
        System.out.println("deleteBook");
        int ISBN = 0;
        ILibraryService instance = new ILibraryServiceImpl();
        instance.deleteBook(ISBN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ILibraryServiceImpl implements ILibraryService {

        public Book insertBook(int ISBN, String name, String author, String Cod) {
            return null;
        }

        public List<Book> searchBook(String tag, String tagValue) {
            return null;
        }

        public Book updateBook(int ISBN, String tag, String tagValue) {
            return null;
        }

        public void deleteBook(int ISBN) {
        }
    }
    */
    @Test
    public void testAndSearchBook() {
        System.out.println("AndSearchBook");
        int ISBN = 1234;
        String name = "Test the add";
        String author = "Harsh Desai";
        String code = "educational";
        Book expResult = new Book(1234);
        expResult.setAuthors("Harsh Desai");
        expResult.setCode("educational");
        
        int ISBN2 = 1236;
        String name2 = "Show";
        String author2 = "XYZ";
        String code2 = "fiction";
        Book expResult2 = new Book(1236);
        expResult2.setAuthors("Harsh Desai");
        expResult2.setCode("educational");

        ILibraryService instance = new ILibraryServiceImpl();
        instance.insertBook(ISBN, name, author, code);
        instance.insertBook(ISBN2, name2, author2, code2);
        List <String> tags = new ArrayList <String>();
        List <String> tagValues = new ArrayList <String>();
        
        tags.add("NAme");
        tags.add("ISBN");
        
        tagValues.add("Show");
        tagValues.add("1234");
        
        
        List<Book> expListResult = new ArrayList<Book>();
        
        List<Book> result = instance.andSearchBook(tags,tagValues);
        
        assertEquals(expListResult,result);
        
        expListResult.add(expResult);
        expListResult.add(expResult2);
        
        
       }
    
    
    
    @Test   
    public void testOrSearchBook() {
        System.out.println("AndSearchBook");
        int ISBN = 1234;
        String name = "Test the add";
        String author = "Harsh Desai";
        String code = "educational";
        Book expResult = new Book(1234);
        expResult.setAuthors("Harsh Desai");
        expResult.setCode("educational");
        
        int ISBN2 = 1236;
        String name2 = "Show";
        String author2 = "XYZ";
        String code2 = "fiction";
        Book expResult2 = new Book(1236);
        expResult2.setAuthors("Harsh Desai");
        expResult2.setCode("educational");

        ILibraryService instance = new ILibraryServiceImpl();
        instance.insertBook(ISBN, name, author, code);
        instance.insertBook(ISBN2, name2, author2, code2);
        List <String> tags = new ArrayList <String>();
        List <String> tagValues = new ArrayList <String>();
        
        tags.add("NAme");
        tags.add("ISBN");
        
        tagValues.add("Show");
        tagValues.add("1234");
        
        
        List<Book> expListResult = new ArrayList<Book>();
                
        expListResult.add(expResult);
        expListResult.add(expResult2);
        
        List<Book> result = instance.andSearchBook(tags,tagValues);
        
        assertEquals(expResult,result.get(0));
        assertEquals(expResult2,result.get(1));

        
        
       }
}
