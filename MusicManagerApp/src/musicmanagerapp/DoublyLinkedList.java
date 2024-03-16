/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

import javax.swing.JOptionPane;

/**
 *
 * @author dmoc2
 */
public class DoublyLinkedList implements PlaylistLinearInterface {
    
  int size;
  Node head;

  @Override
  public boolean isEmpty()
  {
    return size ==0;
  }
  
  
  @Override
  public int size()
  {
    return size;
  }
@Override
  public void addFirst()
  {
      
      String name = Music_Manager_GUI.songNameTF.getText();
      String artist = Music_Manager_GUI.artistNameTF.getText();
      String album = Music_Manager_GUI.albumNameTF.getText();
      String genre = Music_Manager_GUI.genreComboBox.getSelectedItem().toString();
      SongSchema song = new SongSchema(name,artist,album,genre);
    Node newNode = new Node(song);
    

    if (head == null) {
        head = newNode;
        
    } else {
        newNode.setNext(head);
        head.setPrevious(newNode);
        head = newNode;
        
    }
    size++;

  }

  
@Override
 public void displayList()
 {
    if(head == null)
    {
        System.out.println("List is empty");
        
    } 
      Node currentNode = head;
      
      while(currentNode != null)
      {
          System.out.println(currentNode.getSong().songDetails());
          currentNode = currentNode.getNext();
      }
 
 }      
            
        

    
 


@Override
public void removeSong()
{
    Node currentNode = head;
    Node previousNode = null;
    
    while(currentNode.getNext() != null)
    {
        previousNode = currentNode;
        currentNode = currentNode.getNext();
    }
    
    if(previousNode == null){
        head = null;
    } else {
        previousNode.setNext(null);
    }
   
}


@Override
public void addGenrePlayList()
{
    Node newNode = head;
    
    if(newNode.getSong().getGenre().equals(Music_Manager_GUI.genreComboBox.getSelectedItem().toString()) ){
        SavedSongsStack.grabInstance().pushPopRap(newNode.getSong());
    } else {
        SavedSongsStack.grabInstance().pushIndieRock(newNode.getSong());
    }
    
    
    
}



    
}
