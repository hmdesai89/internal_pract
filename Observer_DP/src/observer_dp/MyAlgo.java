/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_dp;

/**
 *
 * @author harsh
 */
public class MyAlgo implements Observer {
    
    private static int indexOfObs = 0;
    public int comA;
    public int comB;
    public int comC;
    public int index;
    
    private Subject stockGratherer;


    public MyAlgo(Subject stockGratherer) {
        System.out.println("Registring new Observer");
        this.index = ++indexOfObs;
        
        this.stockGratherer = stockGratherer;
        
        this.stockGratherer.register(this);
    }
    
    public void printValues(){
        System.out.print("Index is "+ this.index+"\n ComA : "+ this.comA
                +"\n comB : "+ this.comB +
                "\n comC : "+ this.comC);
    }
    
    public void updateValues(int comA,int comB,int comC) {
        
        this.comA = comA;
        this.comB = comB;
        this.comC = comC;
        
        printValues();
        
    }
    
    
}
