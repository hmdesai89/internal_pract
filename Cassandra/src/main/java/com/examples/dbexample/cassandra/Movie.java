/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examples.dbexample.cassandra;

/**
 *
 * @author harsh
 */
public class Movie {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMmpa_rating() {
        return mmpa_rating;
    }

    public void setMmpa_rating(String mmpa_rating) {
        this.mmpa_rating = mmpa_rating;
    }

    public String getDustin_rating() {
        return dustin_rating;
    }

    public void setDustin_rating(String dustin_rating) {
        this.dustin_rating = dustin_rating;
    }


    
    private String title;
    private int year;
    private String description;
    private String mmpa_rating;
    private String dustin_rating;
    
    
    public Movie(String title, int year, String description, String mmpa_rating, String dustin_rating) {
        this.title = title;
        this.year = year;
        this.description = description;
        this.mmpa_rating = mmpa_rating;
        this.dustin_rating = dustin_rating;
    }
        
    
    
}
