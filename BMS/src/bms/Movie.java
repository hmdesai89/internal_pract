/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bms;

/**
 *
 * @author harsh
 */
public interface Movie {
  
    
    public String getMovieName();
    
    public void addShow(Show newShow);
    public void removeShow(Show newShow);
    
}
