/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */
public class DiscJockey {
    
    songComponent songList;
    
    public DiscJockey(songComponent newsongList) {
        songList = newsongList;
        
    }
    
    public void getSongList() {
        songList.displaySongInfo();
    }
    
}
