/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author harsh
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        songComponent idustrialMusic = new songGroup("industrial",
                "is style of experimental music");
        
        songComponent heavyMetalMusic = new songGroup("heavyMetal",
                "Heavy electric guitar");

        songComponent dubStepMusic = new songGroup("Industrial",
                "new EDM !!");
        
        songComponent everySong = new songGroup("Song List"," Master Database");
        
        everySong.add(idustrialMusic);
        idustrialMusic.add(new Song("BajaRaja","nuclyea", 2010));
        idustrialMusic.add(new Song("Bajao","chaluDJ", 2012));
        
        idustrialMusic.add(dubStepMusic);
        
        dubStepMusic.add(new Song("BOOM !", "desiDub", 2015));
        
        everySong.add(heavyMetalMusic);

        heavyMetalMusic.add(new Song("God","Metalica", 1980));
        heavyMetalMusic.add(new Song("Death","Gunsnroses", 1990));
        
        DiscJockey dj = new DiscJockey(everySong);
        
        dj.getSongList();
                
        
        

        
    }
    
}
