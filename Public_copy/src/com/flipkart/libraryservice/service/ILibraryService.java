/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flipkart.libraryservice.service;

import com.flipkart.libraryservice.domain.Book;

import java.util.List;


/**
 *
 * @author harsh
 */
public interface ILibraryService {
    
    public Book insertBook(int ISBN, String name, String author , String Cod);
    public List<Book> searchBook(String tag, String tagValue);
    public List<Book> andSearchBook(List<String> tag, List<String> tagValue);
    public List<Book> orSearchBook(List<String> tag, List<String> tagValue);
    public Book updateBook(int  ISBN,String tag,String tagValue);
    public void deleteBook(int ISBN);
}


