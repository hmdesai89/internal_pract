/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */

import java.util.ArrayList;
import java.util.Iterator;


public class songGroup extends songComponent {
    
    ArrayList songcomponent = new ArrayList();
    String groupName;
    String groupDescription;
    
    public songGroup(String newGroupName, String  newGroupDescription) {
        groupName = newGroupName;
        groupDescription = newGroupDescription;
    }
    
    public String getGroupName ()  {return groupName;}
    public String getGroupDescription ()  {return groupDescription;}
    
    public void add(songComponent newSongComponent) {
        
        songcomponent.add(newSongComponent);
        
    }

    public void remove(songComponent newSongComponent) {
        
        songcomponent.remove(newSongComponent);
        
    } 

    public songComponent getComponent (int componentIndex) {
        
        return (songComponent)songcomponent.get(componentIndex);
        
    } 
    
    public void displaySongInfo() {
        System.out.println(getGroupName()+"  "+getGroupDescription());
        
        Iterator songIterator = songcomponent.iterator();
        
        while(songIterator.hasNext()) {
            songComponent songInfo = ( songComponent)songIterator.next();
            songInfo.displaySongInfo();
        }
    }
    
}
