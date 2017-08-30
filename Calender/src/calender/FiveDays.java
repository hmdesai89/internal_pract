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

public class FiveDays implements Calender {
    
    
    private ArrayList <Day> days;
    private ArrayList <Boolean> holiday;
    
    public FiveDays() {
        int workingHours = 6;
        days = new ArrayList <Day>();
        holiday = new ArrayList <Boolean>();
        int j = 1;
        for (int i = 0 ; i < 30; i ++) {
            j = j %7;
            if (j == 6|| j ==7) {
                holiday.add(true);
            } else {
                holiday.add(false);
            }
            days.add(new MyDay(workingHours));
            j++;
        }
    }

    @Override
    public Day getDay(int dayIndex) {
        return days.get(dayIndex);
    }

    @Override
    public boolean isWeekend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isHoliday(int dayIndex) {
        return holiday.get(dayIndex);
    }

    
   
    
}
