/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;

import javax.swing.JOptionPane;


/**
 *
 * @author dmoc2
 */
public class SavedSongsStack implements SongStackInterface {
    
    ArrayList<SongSchema> playlist = new ArrayList<>(); //making an instance of the arraylist
    
    //used for my repeater 
    private Timer timer;
    

    //intializing the array in the constructor
    public SavedSongsStack(ArrayList<SongSchema> playlist) {
        this.playlist = playlist;
    }

    public SavedSongsStack() {
    }
    //to grab the playlist info for other methods 
    @Override
    public ArrayList<SongSchema> getPlaylist() {
        return playlist;
    }
      
    
    //checks if the array is empty 
    @Override
    public boolean isEmpty()
    {
        return playlist.isEmpty();
    }
    
    
   
    
    @Override
    public void pushPlaylist(SongSchema newSong)
    {//open push playlist 
        try
        {//will try the following code 
                //will grab all of the info nessacary to add an song
            String name = Music_Manager_GUI.songNameTF.getText();
            String artist = Music_Manager_GUI.artistNameTF.getText();
            String album = Music_Manager_GUI.albumNameTF.getText();
            String genre = Music_Manager_GUI.genreComboBox.getSelectedItem().toString();
            
            
            newSong = new SongSchema(name, artist, album, genre); //create a new instance of song Schema will the parameters 
      
        
     
            if(!playlist.contains(newSong)) //will stop the data over writing eachother
            {//open if 
                playlist.add(0,newSong); //will store a new song a the index of 0
         
                //displays the song has beeen added to the terminal 
                System.out.println("added song to playlist!");
                System.out.println(displayPlaylist());
      } 
            else 
            { //open else 
                System.out.println("This song already exists");
      } //end method 
     
      
        }//end try 
        catch(Exception ex){//checking for errors
            JOptionPane.showMessageDialog(null, ex); //displays error
            System.out.println(ex); //displays error
        }
      
    }
    
     
    
    @Override
    public Object remove()
    {//open remove 
         if(isEmpty())
        { //open if 
            JOptionPane.showMessageDialog(null, "There is nothing to remove"); //tells the user there is nothing to be removed 
            return null;
        }//close if  
         else 
         {//open else
            return playlist.remove(0); // removes the item stored at the index 0
        } //close else
    }//close remove 
    
    @Override
    public String displayPlaylist()
    { //open display 
        String str = new String(); // this wil concat the Strings 
        
        if (isEmpty()) {
            str = str.concat("There is no rap/pop songs to display");
            JOptionPane.showMessageDialog(null, str); //tells the user there is no songs to be displayed 
        } else {
            for (int i = 0; i < playlist.size(); i++) //will iterate through the array list to be displayed 
            {//open for loop
                int index = playlist.indexOf(playlist.get(i)); //will capture the index of songs to be then displayed and show the user how many songs they have  
                SongSchema load = playlist.get(i); //will grab all of the data that is within the amount of in the index of the array
               str = str.concat(index+" \t"+load.songDetails()); //will be used to print into the display
                str = str.concat("\n");
            } //end for 
        }//end else 
        return str; //returns the str to be displayed within the terminal
    } //close method 
    
    
    @Override
    public void search()
    { //open search
        try{ //open try
        String str = new String();
        String searchIndex = Music_Manager_GUI.searchTF.getText(); //will be used to keep the cody more tidy and to capture the characters entered into the                                                                        search field 
        boolean found = false;
        if (isEmpty()) {
            str = str.concat("There is no Liked songs to be searched right now \n Add your favorite songs on the home page!");
            JOptionPane.showMessageDialog(null, str); //will open a window to tell the user there is no songs to be searched
        } else {
           for(SongSchema song : playlist){ // song will take on the current element in the array, will stop having to loop through the indexs
               if(song.getSongName().equalsIgnoreCase(searchIndex))
               {//open if
                   
                   Music_Manager_GUI.displayLikedSongsArea.setText(""); //resets the display to blank not to cross over from previous data
                   Music_Manager_GUI.displayLikedSongsArea.setText("Title \t Artist \t Album \t Genre \n"); //resests the header of the form
                   Music_Manager_GUI.displayLikedSongsArea.append(song.songDetails()); //displays all of the details related to the song name that has been enter

                   found = true;
                   break; //ends the loop
               } //close if 
           } //open for loop
        }//close search function
        }//close try 
        catch(Exception ex){ //open catch
            System.out.println("There is an error"+ex); // will display an error if there is one 
        } //close catch
    }//close search 
    
    
    
    @Override
    public void transfer()
    {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "There is no songs to transfer");
            
        }
        
        else{
        
        int type = Integer.parseInt(JOptionPane.showInputDialog(null,"Press 1 to Add to Playlist 1,\nPress 2 to add to playlist 2"));
        
        // this will allow the user to determine where the songs will go in terms of the playlist 
        PlaylistGUI load = new PlaylistGUI();
        if(type == 1){
            Node head = PopRapDDL.convertArr2Dll(playlist); //this will convert the playlist over to the popRap playlist DDL
            remove(); //it will remove the song from the liked playlist 
            PopRapDDL.print(head); //will print the play list in the terminal to show that it has successfully transfered
            load.setVisible(true); //will show the playlist form
        } else if (type ==2)
        {
            Node head = IndieRockDDL.convertArr2Dll(playlist); //this will convert the playlist over to the indie/rock playlist
            remove(); //will remove the song from the playlist 
            IndieRockDDL.print(head); //will print the song to show if it has successfully transfered
             load.setVisible(true); //will load the playlist form
        }
    }
    }
    
    
    
    //this is functioning as a my repeat function
    @Override
    public void playFunction()
    {
     timer = new Timer(3000, new ActionListener() // there is a 3 second delay between playing each song 
              //also there is a 3second delay until the songs stat to display
      {
          private int index =0;
          
          @Override
          public void actionPerformed(ActionEvent e)
          {
              if(isEmpty())
              {
                  JOptionPane.showMessageDialog(null, "There is no music to play right now");
              } else {
                  Music_Manager_GUI.displayLikedSongsArea.setText("");
                  Music_Manager_GUI.displayLikedSongsArea.append("Current Song that is Playing: \n "+playlist.get(index).getSongName());
                  index = (index +1)% playlist.size(); // this will increment through the playlist start from the index of 0
              }
          }
    });
    timer.start(); //will load the function of the play list.
    }
    
    @Override
    public void stopFunction()
    {
        if(timer != null)
        {
            timer.stop(); // this will stop the repeat functions
        }
    }

}
