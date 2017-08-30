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
public class GetStockPrice implements Runnable {
    
    private String stock;
    private int price;
    private StockGatherer sg;
    
    public GetStockPrice(StockGatherer stockGatherer, String stock, int price) {
        this.sg = stockGatherer;
        this.price = price;
        this.stock = stock;
        
    }
    
    public void run (){
        
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        
        Math.random();
    }
    
}
