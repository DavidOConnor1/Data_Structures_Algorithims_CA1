/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dmoc2
 */
public class SavedSongsStack implements SongStackInterface {
    ArrayList<SongSchema> likePlaylist;
  

    public SavedSongsStack() {
        likePlaylist = new ArrayList<>();
    }
    
    @Override
    public boolean isEmpty()
    {
        return likePlaylist.isEmpty();
    }
    
    @Override
    public void push(SongSchema newSong)
    {
        try{
      newSong = new SongSchema();
      newSong.setSongName(Music_Manager_GUI.songNameTF.getText());
      newSong.setArtist(Music_Manager_GUI.artistNameTF.getText());
      newSong.setAlbum(Music_Manager_GUI.albumNameTF.getText());
      newSong.setGenre(Music_Manager_GUI.genreComboBox.getItemAt(0));
      
       if(!likePlaylist.contains(newSong)){
           likePlaylist.add(0, newSong);
           System.out.println("The song has successfully has been added");
           System.out.println("this is ur song that u added");
       } 
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }
       
    }
    
    @Override
    public Object pop()
    {
        if(isEmpty())
        {
            JOptionPane.showMessageDialog(null, "There is nothing to remove");
            return null;
        } else {
            return likePlaylist.remove(0); // removes the item stored at the index 0
        }
    }
    
    @Override
    public Object peek()
    {
        if(isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The liked songs playlist is empty");
            return null;
        } else {
            return likePlaylist.get(0).songDetails();
        }
    }
    
    
    
    @Override
    public int size()
    {
        return likePlaylist.size();
    }
    
    @Override
    public String displayLikedSongs()
    {
        String str = new String();
        
        if (isEmpty()) {
            str = str.concat("There is no liked songs to display");
            JOptionPane.showMessageDialog(null, str);
        } else {
            for (int i = 0; i < likePlaylist.size(); i++) {
                SongSchema load = likePlaylist.get(i);
                str = str.concat(load.songDetails());
                str = str.concat("\n");
            }
        }
        return str;
    }
    
    
}
