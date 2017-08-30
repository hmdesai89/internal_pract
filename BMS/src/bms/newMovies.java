/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bms;


import java.util.*;
/**
 *
 * @author harsh
 */
public class newMovies implements Movie {
    
    
    private ArrayList <Show> shows;
    private String movieName;
    private int runTime;
    
    
    public newMovies(String newMovieName, String runTime){
        movieName = newMovieName;
        runTime = runTime;
        shows = new ArrayList <Show>();
        
    }

    @Override
    public String getMovieName() {
        return movieName;
    }

    public void addShow(Show newShow) {
        shows.add(newShow);
    }

    public void removeShow(Show removeShow) {
        shows.remove(removeShow);
    }
    
    
}
