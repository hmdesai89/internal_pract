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
public interface Fly {
    
    String fly();
}

class CanFly implements Fly {
    
    public String fly() {
        return "I can fly";
    }
    
}

class CantFly implements Fly {
    
    public String fly() {
        return "I can't fly! Sorry !";
    }
}