/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calender;

/**
 *
 * @author harsh
 */

import java.util.ArrayList;
public class MyDay implements Day{
    
    ArrayList<Boolean> timeSlots;

    
    public MyDay(int workingHours) {
        
        timeSlots = new ArrayList<Boolean>();
        for (int i  = 0 ; i < workingHours; i++ ) {
            timeSlots.add(false);
        }
        
    }
    
    
    @Override
    public void setTimeSlot(int timeSlot) {
        timeSlots.set(timeSlot,true);
    }

    @Override
    public boolean getTimeSlot(int timeSlot) {
        return timeSlots.get(timeSlot);
    }
    
    
}
