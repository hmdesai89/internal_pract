/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author harsh
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    static Node head;
    
    static class Node{ 
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
        }
    }
        
        void addData(int d, Node head) {
            Node temp = head;
            if (head == null) {
                this.head = new Node(d);
                return;
            }
            
            while(temp.next != null ) {
                temp = temp.next;
            }
            temp.next = new Node(d);
        }
        
        void printData(Node head) {
            Node temp = head;
            while(temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Implementation of linked list in JAVA");
       LinkedList list = new LinkedList();
       list.head = new Node(0);
       list.head.next = new Node(1);
       list.head.next.next =  new Node(2);
       list.addData(4, list.head);
       
       list.printData(list.head);    
       
    }
    
    
    
}
