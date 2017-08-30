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
public class Model {

    /**
     * @param args the command line arguments
     */
    ArrayList <Theater> theaterList;
    ArrayList <Movie> movieList;
    
    
    public Model() {
        theaterList = new ArrayList <Theater>();
        movieList = new ArrayList <Movie>();
    }
    
    public void addTheater(Theater newTheater) { theaterList.add(newTheater); }
    public void removeTheater(Theater newTheater) { theaterList.remove(newTheater); }
    
    
    public void addMovie(Movie newMovie) { movieList.add(newMovie); }
    public void removeTheater(Movie newMovie) { movieList.remove(newMovie); }

    

    
}
