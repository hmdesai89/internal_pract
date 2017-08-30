package MVC;

// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it. 

import java.awt.event.ActionListener;

import javax.swing.*;

public class BMSView extends JFrame{

	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField theaterName = new JTextField(20);
        private JButton AddTheater = new JButton("Add Theater");
        private JTextArea theaterListing = new JTextArea(50,20);
	
	BMSView(){
		
		// Sets up the view and adds the components
		
		JPanel bmsPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);
		
		//bmsPanel.add(firstNumber);
		//bmsPanel.add(additionLabel);
		//bmsPanel.add(secondNumber);
		//bmsPanel.add(calculateButton);
		//bmsPanel.add(calcSolution);
                
		bmsPanel.add(AddTheater);
                bmsPanel.add(theaterName);
		bmsPanel.add(theaterListing);
                
		
		this.add(bmsPanel);
		
		// End of setting up the components --------
		
	}
	
	public int getFirstNumber(){
		
		return Integer.parseInt(firstNumber.getText());
		
	}
	
	public int getSecondNumber(){
		
		return Integer.parseInt(secondNumber.getText());
		
	}
	/*
	public int getCalcSolution(){
		
		return Integer.parseInt(calcSolution.getText());
		
	}
	*/
	public void setTheaterList(String theaterList){
		
		theaterListing.setText(theaterList);
		
	}
        
        public String getTheaterName(){
		
		return theaterName.getText();
		
	}
        
        
	
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	void AddTheaterListener(ActionListener listenForShow){
		
		AddTheater.addActionListener(listenForShow);
		
	}
	
	// Open a popup that contains the error message passed
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
	
}