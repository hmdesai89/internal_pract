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
import java.util.*;
public class Meeting {
    HashMap <Integer, String> users;
    int meetingNumber;
    
    public void addUser(Integer userId) {
        users.put(userId, "Undecided");
    }
    
    public void displayInfo() {
        System.out.println("Meeting Number is: "+ meetingNumber);
        for (Integer userId : users.keySet()) {
            System.out.println("User: "+User.getUserName(userId)+" Status : "+ users.get(userId));
        }
        
    }
    
}
