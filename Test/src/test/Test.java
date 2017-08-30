/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.ArrayList;



/**
 *
 * @author harsh
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("OK buddy.. Jay Shree Gaanesh");
        ArrayList<Animal> animals =  new ArrayList<Animal>();
        
        Animal fifi = new Dog();
        
        Animal kittiy = new cat();
        
        Animal tweety = new Bird();
        
        
        animals.add(fifi);
        animals.add(kittiy);
        animals.add(tweety);
        
        
        System.out.println(fifi.getSound());
        System.out.println(kittiy.getSound());
        System.out.println(tweety.getSound());


        System.out.println(fifi.tryToFly());
        System.out.println(kittiy.tryToFly());
        System.out.println(tweety.tryToFly());        
        
        Fly newFlyType = new CanFly();
        
        fifi.setFly(newFlyType);
        
        System.out.println(fifi.getSound());
        System.out.println(fifi.tryToFly());

        
        
        
    }
    
}
