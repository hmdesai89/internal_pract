/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author harsh
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //initiate the grid
        grid g = new grid(2,2);
        int result = g.findAllPath(0, 0);
        System.out.println(result);
        
    }
    
}
