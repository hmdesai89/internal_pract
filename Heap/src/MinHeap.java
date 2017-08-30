/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */

import java.util.Arrays;
import java.util.*;

public class MinHeap {
    private int capacity;
    private int size= 0;
    int [] minHeap;
    
    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.minHeap = new int[capacity];
    }
    
    
    private int getLeftChildIndex(int index) {return index*2 +1;}
    private int getRightChildIndex(int index) {return index*2 +2;}
    private int getParentIndex(int index) {return (index-1) /2;}
    
        
    private boolean hasLeftChild(int index) {return getLeftChildIndex(index)< size;}
    private boolean hasRightChild(int index) {return getRightChildIndex(index)< size;}
    private boolean hasParent(int index) {return getParentIndex(index) >=0;}
    
    
    private int leftChild(int index) {return minHeap[getLeftChildIndex(index)];}
    private int rightChild(int index) {return minHeap[getRightChildIndex(index)];}
    private int parent(int index) {return minHeap[getParentIndex(index)];}
    
    
    private void swap(int index1, int  index2) {
        int temp = minHeap[index1];
        
        minHeap[index1] = minHeap[index1];
        minHeap[index2] = temp;
   
    }
    
    private void ensureExtraCap(){
        if (size == capacity) {
            minHeap = Arrays.copyOf(minHeap, capacity*2);
            capacity = capacity*2;     
        }
    }
    
    public int peek() {
        if (size > 0) {
        return minHeap[0];
        } else  {
            return -1;
        }
    }
    
    
    public int poll() {
        if (size > 0) {
         // we neet to swap the elements id copy it down;   
            int temp = minHeap[0];
            minHeap [0] = minHeap[size - 1];
            size --;
            heapifyDown();
            
            
            return temp;
        } else  {
            return -1;
        }
    }
        
    /**
     *
     */
    public void heapifyDown() {
        
        int index = 0;
        while(index < size) {
            if (hasLeftChild(index) && leftChild(index) < minHeap[index]) {
                swap(index, getLeftChildIndex(index) );
                index  = getLeftChildIndex(index);
            } else if (hasRightChild(index) && rightChild(index) < minHeap[index]) {
                swap(index, getRightChildIndex(index));
                getRightChildIndex(index);
            }
                
        }
            
    }
        
    public void heapifyUp() {
        
        int index = size;
        while(hasParent(index) && parent(index) > minHeap[index]) {
            swap(index, getParentIndex(index) ); 
            index = getParentIndex(index);
        }
        
            
    }
        
    public void add(int element) {
            ensureExtraCap();
            minHeap[size] = element;
            size++;
            heapifyUp();
    }
}
    
        
    
    
    
    

