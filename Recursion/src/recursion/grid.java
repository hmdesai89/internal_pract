/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.ArrayList;

/**
 *
 * @author harsh
 */
public class grid {
    public int len;
    public int wid;
    public int[][] g ;
    
    class Point {
        int x;
        int y;
    }
    ArrayList <Point> points = new ArrayList<Point>();
    
    public grid(int len, int wid) {
        this.len = len;
        this.wid = wid;
        g = new int[len][wid];
    }
    
    public int findAllPath(int i , int j){
        
        
        if (i >=len) {
            return 0;
        }
        if (j >=  wid) {
            return 0;
        }
        return 1+findAllPath(i,j+1)+findAllPath(i+1,j) ;       
    }
    
    
}
