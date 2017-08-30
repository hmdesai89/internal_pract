/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1234;

import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author harsh
 */
public class Test1234 {
    
    ExecutorService excService= Executors.newScheduledThreadPool(10);
    Future <String>futureCallable = excService.submit(new Callable(){
        @Override
        public String call() throws Exception {
            return "Result";
        }
    });
    //retrun methode
    futureCallable.get();
    
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Node> node ;
        
    }
    
}

class Network_Node {
    int fqid;
    String cp_node;
    HashMap<Integer, Node> ports;
}

class Port implements Node {
    Node paasProject ; 
}


class PassProject implements Project  {
   boolean isPass;
   List <Node> cretedNode;
   
}




