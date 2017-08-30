/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author harsh
 */
public class Dog extends Animal{
    
    public Dog () {
        super();
        setSound("Bark");
        
        flyingType = new CantFly();
    }
    
    public void fetch() {
        System.out.println("Go fetch");
    }
    
}
