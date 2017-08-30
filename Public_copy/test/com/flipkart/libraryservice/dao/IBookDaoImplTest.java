/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flipkart.libraryservice.dao;

import com.flipkart.libraryservice.domain.Book;
import java.util.HashMap;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author harsh
 */
public class IBookDaoImplTest {
    
    public IBookDaoImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        //IBookDaoImpl bookDao = new IBookDaoImpl();
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
     * Test of get method, of class IBookDaoImpl.
     */
    /*
    @Test
    public void testGet() {
        System.out.println("get");
        int ISBN = 0;
        IBookDaoImpl instance = new IBookDaoImpl();
        Book expResult = null;
        Book result = instance.get(ISBN);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class IBookDaoImpl.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int ISBN = 1234;
        String name = "Test the add";
        String author = "Harsh Desai";
        String code = "educational";
        IBookDaoImpl instance = new IBookDaoImpl();
        Book expResult = new Book(1234);
        expResult.setAuthors("Harsh Desai");
        expResult.setCode("educational");
        Book result = instance.add(ISBN, name, author, code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case Add Failed.");
    }
    
        @Test
    public void testMultipleAdd() {
        System.out.println("Multiple Add");
        int ISBN = 1234;
        String name = "Test the add";
        String author = "Harsh Desai";
        String code = "educational";
        IBookDaoImpl instance = new IBookDaoImpl();

        Book result = instance.add(ISBN, name, author, code);
        result = instance.add(ISBN, name, author, code);

        assertEquals(result.getCount(), 2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case Add Failed.");
    }

    /**
     * Test of addBookInAuthor method, of class IBookDaoImpl.
     */
    /*
    @Test
    public void testAddBookInAuthor() {
        System.out.println("addBookInAuthor");
        String author = "";
        int ISBN = 0;
        IBookDaoImpl instance = new IBookDaoImpl();
        instance.addBookInAuthor(author, ISBN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBookFromAuthor method, of class IBookDaoImpl.
     */
    /*
    @Test
    public void testRemoveBookFromAuthor() {
        System.out.println("removeBookFromAuthor");
        String author = "";
        int ISBN = 0;
        IBookDaoImpl instance = new IBookDaoImpl();
        instance.removeBookFromAuthor(author, ISBN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of put method, of class IBookDaoImpl.
     */
    /*
    @Test
    public void testPut() {
        System.out.println("put");
        int ISBN = 0;
        String tag = "";
        String tagValue = "";
        IBookDaoImpl instance = new IBookDaoImpl();
        instance.put(ISBN, tag, tagValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class IBookDaoImpl.
     */
    /*
    @Test
    public void testDelete() {
        System.out.println("delete");
        int ISBN = 0;
        IBookDaoImpl instance = new IBookDaoImpl();
        instance.delete(ISBN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copyBookAttr method, of class IBookDaoImpl.
     */
    /*
    @Test
    public void testCopyBookAttr() {
        System.out.println("copyBookAttr");
        Book book = null;
        String tag = "";
        String value = "";
        IBookDaoImpl instance = new IBookDaoImpl();
        instance.copyBookAttr(book, tag, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchByISBN method, of class IBookDaoImpl.
     */
    
    @Test
    public void testSearchByISBN() {
        System.out.println("searchByISBN");
        
        int ISBN = 1234;
        String name = "Test the add";
        String author = "Harsh Desai";
        String code = "educational";
        IBookDaoImpl instance = new IBookDaoImpl();

        Book expResult = instance.add(ISBN, name, author, code);
        
        int ISBN2 = 1236;
        String name2 = "Theory of everything";
        String author2 = "Stephen Hawking";
        String code2 = "HigherEducational";

        Book expResult2 = instance.add(ISBN2, name2, author2, code2);
        Book result = instance.searchByISBN(ISBN);
        assertEquals(expResult, result);
        
        result = instance.searchByISBN(ISBN2);
        assertEquals(expResult2, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSearchByISBNFail() {
        System.out.println("searchByISBNFail");
        
        int ISBN = 1234;
        String name = "Test the add";
        String author = "Harsh Desai";
        String code = "educational";
        IBookDaoImpl instance = new IBookDaoImpl();

        Book expResult = instance.add(ISBN, name, author, code);
        
        int ISBN2 = 1236;
        String name2 = "Theory of everything";
        String author2 = "Stephen Hawking";
        String code2 = "HigherEducational";

        Book expResult2 = instance.add(ISBN2, name2, author2, code2);
        Book result = instance.searchByISBN(12345);
        assertNull(result);
        
        result = instance.searchByISBN(ISBN2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchByAuthor method, of class IBookDaoImpl.
     */
    /*
    @Test
    public void testSearchByAuthor() {
        System.out.println("searchByAuthor");
        String author = "";
        IBookDaoImpl instance = new IBookDaoImpl();
        HashMap<Integer, Book> expResult = null;
        HashMap<Integer, Book> result = instance.searchByAuthor(author);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class IBookDaoImpl.
     */
    
    @Test
    public void testSearch() {
        System.out.println("search");
        
        int ISBN = 1234;
        String name = "Test the add";
        String author = "Harsh Desai";
        String code = "educational";
        IBookDaoImpl instance = new IBookDaoImpl();
        instance.add(ISBN, name, author, code);

        //Book expResult = instance.add(ISBN, name, author, code);
        
        int ISBN2 = 1236;
        String name2 = "Theory of everything";
        String author2 = "Stephen Hawking";
        String code2 = "HigherEducational";
        instance.add(ISBN2, name2, author2, code2);
        
        HashMap<Integer, Book> expResult = null;
        HashMap<Integer, Book> result = instance.search("ISBN", "1234");
        HashMap<Integer, Book> result1 = instance.search("auTHoR", "Harsh Desai");
        HashMap<Integer, Book> result2 = instance.search("code", "educational");
        HashMap<Integer, Book> result3 = instance.search("NAME", "Test the add");
        //HashMap<Integer, Book> result4 = instance.search("code", "educational");
        
        

        assertEquals(result.get(ISBN), result1.get(ISBN));
        assertEquals(result.get(ISBN), result2.get(ISBN));
        assertEquals(result.get(ISBN), result3.get(ISBN));
        //assertEquals(result, result1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
   
}
