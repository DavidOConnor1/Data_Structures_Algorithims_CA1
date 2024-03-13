/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author dmoc2
 */

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class SavedSongsQueue implements StackInterface {

    private ArrayList<String> queueList;
    
    public SavedSongsQueue() 
    {
     queueList = new ArrayList<>(); //initalizes the array list in the constructor   
    }
    
    @Override
    public int size(){
        return queueList.size(); //returns the size of the array
    } //end size
    
    @Override
    public boolean isEmpty()
    {
        return queueList.isEmpty(); // returns to the user to inform them if the list is empty
    }
    
    @Override
    public void enqueue(Object newSong)
    {
        String savedSongs;
        savedSongs = newSong.toString(); //casting newSong into a string variable
        queueList.add((String) savedSongs); //adding to the playlist
    }
    
    @Override
    public Object dequeue()
            { //open object method
                if(isEmpty())
                {
                    
                    System.out.println("The Saved Songs Playlist Has no songs to remove");
                    return null; //returns nothing
                } else{
                    return queueList.remove(0); //removes at the index of 0
                } //end else
            } //close object method
    
    @Override
    public Object frontElement()
    { //open object
        if (isEmpty()) 
        { //open if
            JOptionPane.showMessageDialog(null,"There is nothing in the saved songs playlist to display");   
            return null;
        } else{ //open else
            return queueList.get(0);
        } //end else
    } //close object
    
    @Override
    public String displaySongs()
    {
        String str = "";
        if(isEmpty())
        {
            JOptionPane.showMessageDialog(null, "There is nothing in the saved songs playlist to be shown");
            return null;
        } else {
            Iterator it;
            it = queueList.iterator();
            
            while(it.hasNext())
            {
                str = str.concat((String) it.next());
                str = str.concat("");
            }
            
        }
        return str;
    }   
    
    @Override
    public Object removeAll()
    {
        if (isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "There is nothing in the saved songs play to be removed");
            return null;
            
        } else {
            JOptionPane.showMessageDialog(null, "All of the songs in the liked playlist has been removed");
            return queueList.removeAll(queueList);
        }
    }
    
    
    
}
