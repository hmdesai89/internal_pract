package MVC;

public class BMSCalculator {
    
    public static void main(String[] args) {
        
        System.out.println("New program");
    	
    	BMSView theView = new BMSView();
        
    	BMSModel theModel = new BMSModel();
        
        BMSCONTROLLER theController = new BMSCONTROLLER(theView,theModel);
        
        theView.setVisible(true);
        
    }
}