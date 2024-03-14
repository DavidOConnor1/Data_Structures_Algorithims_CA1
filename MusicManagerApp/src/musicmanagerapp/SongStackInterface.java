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
    
    public void push(SongSchema newSong);
    public Object pop();
    public Object peek();
    
    public boolean isEmpty();
    public int size();
    public String displayLikedSongs();
    
}
