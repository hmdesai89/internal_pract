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

public interface Mediator {
    public void scheduleMeeting(ArrayList<User> users, int timeSlot, Day day);
    public Meeting getMeeting() ;
    
}
