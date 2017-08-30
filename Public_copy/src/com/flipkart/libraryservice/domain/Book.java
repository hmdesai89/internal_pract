package com.flipkart.libraryservice.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */

import java.util.ArrayList;
import java.util.Objects;

public class Book {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.ISBN;
        hash = 13 * hash + Objects.hashCode(this.Name);
        hash = 13 * hash + Objects.hashCode(this.authors);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        return true;
    }
    //Primary Key for class
    private int ISBN;
    private String Name;

    private String authors;
    private String PubHouse;
    private String code;
    private int count;
    
    public Book(int ISBN) {
        this.ISBN = ISBN;
        this.count  = 1;
        
        
    }
    
    
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getName() {
        return Name;
    }
    


    public void setPubHouse(String PubHouse) {
        this.PubHouse = PubHouse;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getCode() {
        return code;
    }

    public String getAuthors() {
        return authors;
    }

    public String getPubHouse() {
        return PubHouse;
    }

    public int getCount() {
        return this.count;
    }
    
    public void displayInfo() {
        System.out.println("Book name is:"+ Name+"\n"+
                "Author is : "+ authors);
    }
    
    public void increamentCount() { this.count++;}
    public void decrementCount() { this.count--;}

}


