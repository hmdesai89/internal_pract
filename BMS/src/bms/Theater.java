/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bms;

/**
 *
 * @author harsh
 */

import java.util.ArrayList;

public class Theater {
    
    private String name;
    private ArrayList<Show> shows;
    SeatLayout sl ;
    
    public Theater(String newName, SeatLayout newSL ) {
        name = newName;
        sl = newSL;
        shows = new ArrayList<Show> ();
    }
    
    //public void setTheaterName();
    public String getTheaterName() {return name;}
    
    public SeatLayout getSeatingLayout() {return sl;};

/*    
    public void DisplaySeats() {
        
        
    }
*/
    
    public void setShow(Show show) {
        shows.add(show);
    }
    
    public void getShow(Show show){
        shows.remove(show);
    }
    
    
}
