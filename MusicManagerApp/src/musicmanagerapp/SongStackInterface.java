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
    
    public void pushPopRap(SongSchema newSong);
    public void pushIndieRock(SongSchema newSong);
    public Object removePop();
    public Object popRockIndie();
    
    
    public boolean isEmptyRap();
    public boolean isEmptyRock();
    //public int size();
    public String displayRap();
    public String displayRock();
   // public void search();
    
}
