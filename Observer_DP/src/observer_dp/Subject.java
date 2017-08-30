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
public interface Subject {
    
    public void register(Observer newObserver);
    public void deregister(Observer deleteObserver);
    public void update();
    
}
