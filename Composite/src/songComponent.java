/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */

import java.lang.UnsupportedOperationException;

public abstract class songComponent {
    
    public void add(songComponent newsongComponent) {
        throw new UnsupportedOperationException();
    }
    
    public void remove(songComponent newsongComponent) {
        throw new UnsupportedOperationException();
    }
    
    public songComponent getComponent (int songComponentIndex) {
        throw new UnsupportedOperationException();
    }

    public String  getSongName (int songComponentIndex) {
        throw new UnsupportedOperationException();
    }

    public String getBandName (int songComponentIndex) {
        throw new UnsupportedOperationException();
    } 
    
    public int  getReleaseYear (int songComponentIndex) {
        throw new UnsupportedOperationException();
    } 
 
    public void  displaySongInfo () {
        throw new UnsupportedOperationException();
    } 
}
