/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

import java.util.Stack;

/**
 *
 * @author harsh
 */

public class StackWithMin extends Stack<Integer> {
    
    Stack <Integer> s2;
    
    public StackWithMin() {
        s2 = new Stack<Integer>();
    }
    
    public void push(int value) {
        if (value <= min()) {
            s2.push(value);
        }
        super.push(value);
    }
    
    public int min() {
        if (s2.isEmpty())
            return Integer.MAX_VALUE;
        return s2.peek();
    }
    
    public Integer pop() {
        int value = super.pop();
        if (value == min()) {
            s2.pop();
        }
        return value;
    }
}
