/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1234;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author harsh
 */
public class Cache {
    
    Map <Integer, Node> map  =  new HashMap <Integer, Node>();
    LinkedList <Node> queue =  new LinkedList <Node>();
    int capacity;
    int current;

    
    public Cache(int capacity) {
        this.capacity = capacity;
        this.current = 0;
    }


    public String fetchValue(int key){
        if (map.containsKey(key)) {
            // We need to add to front of the queue;
            Node temp = map.get(key);
            queue.remove(temp);
            queue.add(temp);
            return temp.value;
        } else {
            //fetchFrom DB;
            
            
            //Check capacity;
            //Not full; simply add; inc current
            //Full; remove Last add new in front
            
        }
        return "";
    }
    
    public void notify(int key, String value) {
        
        return;
    }
    
    
    
}


class Node {
    String value;
}
