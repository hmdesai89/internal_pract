/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */
public class LRUTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LRU obj = new LRU(2);
        obj.put(1,3);
        int param_1 = obj.get(1);
        obj.put(2,4);
        obj.put(3,5);
        obj.put(4,7);
        param_1 = obj.get(1);
        System.out.println(param_1);
    }
    
}
