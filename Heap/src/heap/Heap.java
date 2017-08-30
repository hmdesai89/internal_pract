/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

import java.util.*;
/**
 *
 * @author harsh
 */

class StringLengthComparator implements Comparator<String>
{
    @Override
    public int compare(String x, String y)
    {
        // Assume neither string is null. Real code should
        // probably be more robust
        // You could also just return x.length() - y.length(),
        // which would be more efficient.
        if (x.length() < y.length())
        {
            return -1;
        }
        if (x.length() > y.length())
        {
            return 1;
        }
        return 0;
    }
}

class myCompare implements Comparator<Integer>  {
     @Override
     public int compare(Integer a, Integer b) {
           return -1 * a.compareTo(b);
    }

}


public class Heap {
    
    PriorityQueue<Integer> lowers;
    PriorityQueue<Integer> highers;

    /** initialize your data structure here. */
    public Heap() {
        lowers = new PriorityQueue<Integer>(new Comparator<Integer> () {
                                             public int compare(Integer a, Integer b) {
                                                 return -1 * a.compareTo(b); }
                                            });
        highers = new PriorityQueue<Integer> ();
        
    }
    
    public void addNum(int num) {
        if (lowers.size() == 0|| num < lowers.peek()) {
            lowers.add(num);
        } else {
            highers.add(num);
        }
        rebalanceTree();
        
    }
    
    public void rebalanceTree(){
        PriorityQueue<Integer> biggerHeap = (lowers.size() > highers.size()) ? lowers : highers;
        PriorityQueue<Integer> lowerHeap = (lowers.size() > highers.size()) ? highers : lowers;
        if (biggerHeap.size() - lowerHeap.size() >= 2) {
            lowerHeap.add(biggerHeap.poll());
        }
    }
    
    public double findMedian() {
        PriorityQueue<Integer> biggerHeap = (lowers.size() > highers.size()) ? lowers : highers;
        if (lowers.size() == highers.size()) {
            return ((double)lowers.peek() + highers.peek())/2;
        } else {
            return biggerHeap.size();
        }
        
    }
}

class TreeNode
{
    int key;
    TreeNode left, right;
    public TreeNode(int key)
    {
        this.key = key;
        left = right = null;
    }
}

class GfG
{
    public void printTopView(TreeNode root)
    {
        //add code here.
        getLeftTopView(root);
        getRightTopView(root.right);
    }
    
    public void getLeftTopView(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.key);
        getLeftTopView(node);
        
    }
    
    public void getRightTopView(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.key);
        getRightTopView(node);
        
    }
}
/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
