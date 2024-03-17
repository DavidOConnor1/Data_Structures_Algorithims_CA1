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
    ArrayList<SongSchema> playlist;

   
    public static SavedSongsStack instance;
    
    public static SavedSongsStack grabInstance()
    {
        if (instance == null) {
           instance = new SavedSongsStack(); 
        }
        return instance;
    }
  

    public SavedSongsStack() {
        rapPopPlaylist = new ArrayList<>();
        indieRockPlaylist = new ArrayList<>();
    }
    
    @Override
    public boolean isEmptyRap()
    {
        return rapPopPlaylist.isEmpty();
    }
    
       @Override
    public boolean isEmptyRock()
    {
        return indieRockPlaylist.isEmpty();
    }
    
    @Override
    public void pushPopRap(SongSchema newSong)
    {
        try
        {//will try the following code 
      
      newSong = new SongSchema();
      
         newSong.setSongName(Music_Manager_GUI.songNameTF.getText());
      newSong.setArtist(Music_Manager_GUI.artistNameTF.getText());
      newSong.setAlbum(Music_Manager_GUI.albumNameTF.getText());
      newSong.setGenre(Music_Manager_GUI.genreComboBox.getItemAt(0));
      if(!rapPopPlaylist.contains(newSong)){
          rapPopPlaylist.add(0,newSong);
          System.out.println("added song to playlist!");
          System.out.println(newSong.songDetails());
          Node head = Test.convertArr2Dll(rapPopPlaylist);
          System.out.println("the data has passed over as a double linked list!");
          Test.print(head);
      }
     
      
        }//end try 
        catch(Exception ex){//checking for errors
            JOptionPane.showMessageDialog(null, ex); //displays error
            System.out.println(ex); //displays error
        }
       
    }
    
      @Override
    public void pushIndieRock(SongSchema newSong)
    {
        try
        {//will try the following code 
      
      Node newNode = new Node(newSong);
      
     indieRockPlaylist.add(newNode);
      
        }//end try 
        catch(Exception ex){//checking for errors
            JOptionPane.showMessageDialog(null, ex); //displays error
            System.out.println(ex); //displays error
        }
       
    }
    
    @Override
    public Object popRockIndie()
    {
        if(isEmptyRock())
        {
            JOptionPane.showMessageDialog(null, "There is nothing to remove");
            return null;
        } else {
            return indieRockPlaylist.remove(0); // removes the item stored at the index 0
        }
    }
    
    @Override
    public Object removePop(){
         if(isEmptyRap())
        {
            JOptionPane.showMessageDialog(null, "There is nothing to remove");
            return null;
        } else {
            return rapPopPlaylist.remove(0); // removes the item stored at the index 0
        }
    }
    
    
    
    
    
    @Override
    public String displayRap()
    {
        String str = new String();
        
        if (isEmptyRap()) {
            str = str.concat("There is no rap/pop songs to display");
            JOptionPane.showMessageDialog(null, str);
        } else {
            for (int i = 0; i < rapPopPlaylist.size(); i++) {
                int index = rapPopPlaylist.indexOf(rapPopPlaylist.get(i));
                SongSchema load = rapPopPlaylist.get(i);
             //   str = str.concat(index+" \t"+load.getSong().songDetails());
                str = str.concat("\n");
            }
        }
        return str; //returns the str to be displayed within the terminal
    }
    
      @Override
    public String displayRock()
    {
        String str = new String();
        
        if (isEmptyRock()) {
            str = str.concat("There is no rap/pop songs to display");
            JOptionPane.showMessageDialog(null, str);
        } else {
            for (int i = 0; i < indieRockPlaylist.size(); i++) {
                int index = indieRockPlaylist.indexOf(indieRockPlaylist.get(i));
                Node load = indieRockPlaylist.get(i);
              //  str = str.concat(index+" \t"+load.getSong().songDetails());
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
