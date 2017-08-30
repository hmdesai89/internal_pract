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
public class User {
    
    private String userName;
    private int userId;
    private Calender calender;
    private MeetingScheduler meetingScheduler;
    
    
    public User (MeetingScheduler newMeetingScheduler) {
        calender = new FiveDays();
        meetingScheduler = newMeetingScheduler;
    }
    
    public void setUserName(String newUserName) { userName = newUserName;}
    public void setUserId(int newUserId) { userId = newUserId;}
    
    public String getUserName() { return userName;}
    public int getUserId() { return userId;}
    
    public Calender getCalender() {return calender;}
    
    public void sendAcknowledgeMent() {} // This guy will acknowledge meeting scehduler;
    
    
}
