/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1234;

/**
 *
 * @author harsh
 */
public class TestConcurrent {
    
    
    //Sync complete methode 
    public synchronized void printString() {
        
        //Sync this block
        synchronized(this) {
            System.out.println("Hello world");
        }
    }
    
    //thread3.join() code will wait for thread to complete
    //thread4.join(4000) will wait for 4 ms
    
    //Thread yield ; static methode
    //State goes to running to runnable
    //Sleep - go to sleep for ms -can throw InterruptedEsception 
    
    
    public void testNotify() throws InterruptedException {
        
        Thread t1 = new Thread();
        t1.wait(); // will wait for another thread to notify the thread
        
        notify();
        
    }
    
}
