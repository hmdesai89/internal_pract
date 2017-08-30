/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bms;

import java.util.ArrayList;

/**
 *
 * @author harsh
 */
public class Show {
    
    Movie movie;
    Theater theater;
    SeatLayout showSL;
    
    public Show(Movie newMovie, Theater newTheater) {
        movie = newMovie;
        theater = newTheater;
        
        movie.addShow(this);
        theater.setShow(this);
        
        //copy seat layout from the theater
        
        showSL = (SeatLayout) theater.getSeatingLayout().clone();

    }
    
    public void setPrice(int club, int economy) {
        showSL.setPrice("club", club);
        showSL.setPrice("economy", economy);
    }
    
}
