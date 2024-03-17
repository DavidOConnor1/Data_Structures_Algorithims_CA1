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
    ArrayList<SongSchema> playlist = new ArrayList<>();

   
    public static SavedSongsStack instance;

    public SavedSongsStack(ArrayList<SongSchema> playlist) {
        this.playlist = playlist;
    }

    public SavedSongsStack() {
    }
    
   
  

    
    @Override
    public boolean isEmpty()
    {
        return playlist.isEmpty();
    }
    
   
    
    @Override
    public void pushPlaylist(SongSchema newSong)
    {
        try
        {//will try the following code 
      
            String name = Music_Manager_GUI.songNameTF.getText();
      String artist = Music_Manager_GUI.artistNameTF.getText();
      String album = Music_Manager_GUI.albumNameTF.getText();
      String genre = Music_Manager_GUI.genreComboBox.getSelectedItem().toString();
            
            
      newSong = new SongSchema(name, artist, album, genre);
      
        
     
      if(!playlist.contains(newSong)){
          playlist.add(newSong);
         
          System.out.println("added song to playlist!");
          System.out.println(displayPlaylist());
        // Node head = Test.convertArr2Dll(playlist);
         // System.out.println("the data has passed over as a double linked list!");
        //  Test.print(head);
      } else {
          System.out.println("This song already exists");
      
      }
     
      
        }//end try 
        catch(Exception ex){//checking for errors
            JOptionPane.showMessageDialog(null, ex); //displays error
            System.out.println(ex); //displays error
        }
      
    }
    
     
    
    @Override
    public Object remove(){
         if(isEmpty())
        {
            JOptionPane.showMessageDialog(null, "There is nothing to remove");
            return null;
        } else {
            return playlist.remove(0); // removes the item stored at the index 0
        }
    }
    
    
    
    
    
    @Override
    public String displayPlaylist()
    {
        String str = new String();
        
        if (isEmpty()) {
            str = str.concat("There is no rap/pop songs to display");
            JOptionPane.showMessageDialog(null, str);
        } else {
            for (int i = 0; i < playlist.size(); i++) {
                int index = playlist.indexOf(playlist.get(i));
                SongSchema load = playlist.get(i);
               str = str.concat(index+" \t"+load.songDetails());
                str = str.concat("\n");
            }
        }
        return str; //returns the str to be displayed within the terminal
    }
    
    
    
    
    
    
    
    /*
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
*/
}
