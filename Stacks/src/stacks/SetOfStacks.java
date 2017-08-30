/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author harsh
 */
public class SetOfStacks extends Stack<Integer>{
    ArrayList <Stack> stk;
    int capacity;
    
    public SetOfStacks(int capacity) {
        stk = new ArrayList<Stack>();
        this.capacity = capacity;
        
    }
    
    public Stack getLastStack() {
        if (stk.size() == 0) 
            return null;
        else
            return stk.get(stk.size()-1);
    }
    
    public void push(int value) {
        Stack last = getLastStack();
        LinkedList l = new LinkedList();
        
        
            
            
        
        
    }
    
    
}

