/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_dp;

import java.util.ArrayList;

/**
 *
 * @author harsh
 */
public class StockGatherer implements Subject {
    
    private int comA;
    private int comB;
    private int comC;    
    private ArrayList<Observer> stocks;
    
    
    public StockGatherer() {
        stocks = new ArrayList<Observer> ();
    }
    
    public void register(Observer newObserver) {
        stocks.add(newObserver);
    }
    
    public void deregister(Observer deleteObserver) {
        
        int index = this.stocks.indexOf(deleteObserver);
        System.out.println("Removing observer "+(index+1));
        this.stocks.remove(index);
    }

    public int getComA() {
        return comA;
    }

    public int getComB() {
        return comB;
    }

    public int getComC() {
        return comC;
    }

    public void setComA(int comA) {
        this.comA = comA;
        
        update();
    }

    public void setComB(int comB) {
        this.comB = comB;
        update();
    }

    public void setComC(int comC) {
        this.comC = comC;
        update();
        
    }
     
    public void update(){
        
        for(Observer stock: stocks) {
            
            stock.updateValues(comA,comB,comC);
        }
    }
    
}
