/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */

import java.util.LinkedList;
import java.util.HashMap;

public class LRU {
    
    class Node {
        Node next;
        int val;
        int key;
    }
    
    private int size;
    private int capacity;
    
    
    LinkedList<Node> queue;
    HashMap<Integer, Node>  set;

    public LRU(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.queue = new LinkedList<Node>();
        this.set = new HashMap<Integer, Node> ();
       
    }
    
    public int get(int key) {
        Node currNode;
        if (set.containsKey(key)) {
            currNode = set.get(key);
            queue.remove(currNode);
            queue.add(currNode);
            return currNode.val;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        Node newNode = new Node();
        newNode.val = value;
        newNode.key = key;
        if (get(key) != -1) {          
            Node currNode = set.get(key);
            currNode.val = value;
            return;    
        }
        if (size != capacity) {
            size++;
        } else {
            Node tempValue;
            tempValue = queue.poll();
            set.remove(tempValue.key);
        }
        System.out.println("Size is -->"+size);
        queue.add(newNode);
        set.put(key,newNode);
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */