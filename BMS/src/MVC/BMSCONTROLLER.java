package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model

public class BMSCONTROLLER {
	
	private BMSView theView;
	private BMSModel theModel;
	
	public BMSCONTROLLER(BMSView theView, BMSModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		// Tell the View that when ever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class
		
		this.theView.AddTheaterListener(new TheaterListener());
	}
	
	class TheaterListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			//int firstNumber, secondNumber = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			
			try{
			
				//firstNumber = theView.getFirstNumber();
				//secondNumber = theView.getSecondNumber();
                                System.out.println("Testing");
                                
				String s  = theView.getTheaterName();
                                System.out.println(s);
				theModel.addTheater(theView.getTheaterName());
				
				theView.setTheaterList(theModel.showTheater());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
	}
	
}