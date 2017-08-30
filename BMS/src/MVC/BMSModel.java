package MVC;


// The Model performs all the calculations needed
// and that is it. It doesn't know the View 
// exists
import bms.*;
import java.util.ArrayList;

public class BMSModel {

	// Holds the value of the sum of the numbers
	// entered in the view
	
	private ArrayList<Theater> theaters = new  ArrayList<Theater>();
	
	public String showTheater(){
            
            StringBuilder sb = new StringBuilder();
		
            for (Theater theater: theaters) {
                    sb.append(theater.getTheaterName()).append("\n");
            }
            
            return sb.toString();
		
	}
        
        
        public void addTheater(String theater){
            SeatLayout common = new SeatLayout(10, 90);
            Theater newTheater = new Theater(theater, common );
            theaters.add(newTheater);
	}
	

}