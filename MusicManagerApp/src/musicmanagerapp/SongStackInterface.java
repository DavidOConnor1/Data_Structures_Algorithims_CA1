/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author dmoc2
 */
public interface SongStackInterface {
    
    public void pushLikedSongs(SongSchema newSong);
    public void pushIndieRock(SongSchema newSong);
    
    
    
    public boolean isEmpty();
    
    //public int size();
    public String displayRap();
   // public void search();
    
}
