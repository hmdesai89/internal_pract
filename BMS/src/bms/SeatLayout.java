package bms;

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

public class SeatLayout implements Cloneable {
    
    public ArrayList <ArrayList<Seats>> seats;
    int clubClassSeatNumber;
    int economyClassSeatNumber;
    
    public SeatLayout(int newClubClassSeatNumber, int newEconomyClassSeatNumber){
        clubClassSeatNumber = newClubClassSeatNumber;
        economyClassSeatNumber = newEconomyClassSeatNumber;
        seats = new ArrayList <ArrayList<Seats>> ();
        seats.add(new ArrayList <Seats> ());
        seats.add(new ArrayList <Seats> ());
        
        for (int i = 0; i < clubClassSeatNumber; i++ ) {
            LargeSeats ls = new LargeSeats(100+i);
            seats.get(0).add(ls);
        }
        for (int j = 0; j < economyClassSeatNumber; j++ ) {
            SmallSeats ss = new SmallSeats(200+j);
            seats.get(1).add(ss);
        } 
    
    }


   public Object clone() {
      Object clone = null;
      
      try {
         clone = super.clone();
         
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      
      return clone;
   } 

    public void setPrice(String classType, int price) {
        //ArrayList <Seats>
        ArrayList <Seats> s ;
        if(classType == "Club"){
            s = seats.get(0);
        } else  {
            s = seats.get(1);
        }
        for (Seats a:s) {
            a.setPrice(price);
        }
    }   

    
    
}
