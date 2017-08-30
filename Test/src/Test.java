/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */
import java.util.*;

public class Test {
    

    public static void main(String[] args) {
        String name = new String("Harsh");
        PriorityQueue<Node> minHeap;
        minHeap = new PriorityQueue <Node>(new Comparator<Node>() {
            
            public int compare(Node x, Node y) {
                return (x.freq).compareTo(y.freq);
            }
        });

        //Node node1 = new Node(1,1);
        Node node2 = new Node(2, 3);
        minHeap.add(new Node(1, 1));
        minHeap.add(new Node(1, 2));
        //minHeap.add(node2);
        //minHeap.add(new Node(3, 4));
        
        /*

        System.out.println(minHeap.poll().number);
        System.out.println(minHeap.poll().number);
        System.out.println(minHeap.poll().number);
        System.out.println(minHeap.poll().number);
        */
        
        /*
        Node temp = minHeap.remove();
        temp.freq++;
        minHeap.add(temp);
        minHeap.remove(node2);
        node2.freq++;
        minHeap.add(node2);
*/
        

        
        //System.out.println(minHeap.poll().number);
        //System.out.println(minHeap.poll().number);
        //System.out.println(minHeap.poll().number);
        //System.out.println(minHeap.poll().number);
        
        Integer x =1;
        Integer y =2;
        System.out.println(x.compareTo(2));
    }

}

// In java function tour() takes two arguments array of petrol
// and array of distance

