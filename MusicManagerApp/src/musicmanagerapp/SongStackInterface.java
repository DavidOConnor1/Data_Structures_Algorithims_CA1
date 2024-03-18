/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package musicmanagerapp;

import java.util.ArrayList;

/**
 *
 * @author dmoc2
 */
public interface SongStackInterface {
    
    public void pushPlaylist(SongSchema newSong);
   
    
    public Object remove();
    
    public boolean isEmpty();
    public void playFunction(); // this will serve as my repeat function 
     public ArrayList<SongSchema> getPlaylist();
    //public int size();
    public String displayPlaylist();
    public void search();
    public  void transfer(); // this will convert my array list as a DDL and move it over to the other playlists
}
