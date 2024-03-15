/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;


import java.util.ArrayList;
import java.util.Iterator;
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
        try
        {//will try the following code 
      newSong = new SongSchema();
      /*
      The following code below will add information from the text fields and combo box
      */
      newSong.setSongName(Music_Manager_GUI.songNameTF.getText());
      newSong.setArtist(Music_Manager_GUI.artistNameTF.getText());
      newSong.setAlbum(Music_Manager_GUI.albumNameTF.getText());
      newSong.setGenre(Music_Manager_GUI.genreComboBox.getSelectedItem().toString());
      
       if(!likePlaylist.contains(newSong)){ //if a new song is not the same details as the last song, it will add the song
           likePlaylist.add(0, newSong); //will add the song to the first index
           System.out.println("The song has successfully has been added");
           System.out.println("this is ur song that u added");
           Music_Manager_GUI.displayLikedSongsArea.setText("");
           Music_Manager_GUI.displayLikedSongsArea.setText("# \tTitle \t Artist \t Album \t Genre \n");
           Music_Manager_GUI.displayLikedSongsArea.append(displayLikedSongs());
       }//end if 
        }//end try 
        catch(Exception ex){//checking for errors
            JOptionPane.showMessageDialog(null, ex); //displays error
            System.out.println(ex); //displays error
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
                int index = likePlaylist.indexOf(likePlaylist.get(i));
                SongSchema load = likePlaylist.get(i);
                str = str.concat(index+" \t"+load.songDetails());
                str = str.concat("\n");
            }
        }
        return str; //returns the str to be displayed within the terminal
    }
    
    @Override
    public void search()
    {
        try{
        String str = new String();
        String searchIndex = Music_Manager_GUI.searchTF.getText();
        boolean found = false;
        if (isEmpty()) {
            str = str.concat("There is no Liked songs to be searched right now \n Add your favorite songs on the home page!");
            JOptionPane.showMessageDialog(null, str);
        } else {
           for(SongSchema song : likePlaylist){ // song will take on the current element in the array, will stop having to loop through the indexs
               if(song.getSongName().equals(searchIndex)){
                   
                   Music_Manager_GUI.displayLikedSongsArea.setText("");
                   Music_Manager_GUI.displayLikedSongsArea.setText("Title \t Artist \t Album \t Genre \n");
                   Music_Manager_GUI.displayLikedSongsArea.append(song.songDetails());

                   found = true;
                   break; //ends the loop
               } 
           }
        }//close search function
        } catch(Exception ex){
            System.out.println("There is an error"+ex);
        }
    }
}
