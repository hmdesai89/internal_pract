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
public interface Calender {
    
    public Day getDay(int dayIndex);
    public boolean isWeekend();
    public boolean isHoliday(int dayIndex); 
}
