/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */
public class Song extends songComponent {
    
    String songName;
    String bandName;   
    int releaseYear;

    public Song(String newSongName,String newBandName, int newYearRelease) {

        songName = newSongName;
        bandName= newBandName;
        releaseYear = newYearRelease;

    }
    
    public String getSongName() {return songName;}
    public String getBandName() {return bandName;}
    public int getReleaseYear() {return releaseYear;}
    
    public void  displaySongInfo () {
        System.out.println(getSongName()+" created by "+getBandName()+"  released in "+getReleaseYear() );
    } 
    
}
