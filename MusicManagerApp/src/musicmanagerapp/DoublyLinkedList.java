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
  Node head, tail;

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
        Node predecessor = getPredecessor();
        if (predecessor != null) {
            predecessor.setNext(newNode);
            
            //don't forget to display it
        } else {
            JOptionPane.showMessageDialog(null, "unable to add song");
        }
        
    }
    size++;

  }
@Override
  public void addLast()
 {
      String name = Music_Manager_GUI.songNameTF.getText();
      String artist = Music_Manager_GUI.artistNameTF.getText();
      String album = Music_Manager_GUI.albumNameTF.getText();
      String genre = Music_Manager_GUI.genreComboBox.getSelectedItem().toString();
      SongSchema song = new SongSchema(name,artist,album,genre);
    Node newNode = new Node(song);
    if (tail == null) //checking if the tail is null
     {
        tail = newNode;
    } else {
        Node successor = getSuccessor();
        if (successor != null) {
            successor.setPrevious(newNode);
            
        } else {
            JOptionPane.showMessageDialog(null, "unsble to add");
        }
    }
    size++;

 }//end addlast
  
@Override
 public void displayList()
 {
    if(head == null)
    {
        System.out.println("List is empty");
    } else {
        
        System.out.println("All of the items");
        Node currentNode = head;
        
        while (currentNode != null) {
         //  PlaylistGUI.displayPopSongs.append(currentNode.data.toString()+"\n");
             System.out.println(size+" "+currentNode.getSong().songDetails());
             
             currentNode = currentNode.getNext();
            
        }

    }
 }


@Override
public void removeSong()
{
    Node currentNode = head;
    Node previousNode = tail;
    
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

private Node getPredecessor()
{
    if(head == null){
        return null;
    } 
        Node currentNode = head;
        while(currentNode.getNext() != null)
        {
            currentNode = currentNode.getNext();
        }
        return currentNode;
}

private Node getSuccessor()
{
    if(tail == null)
    {
        return null;
    } else {
        Node currentNode = tail;
        
        while(currentNode.getPrevious() != null){
             currentNode = currentNode.getPrevious();
        }
        return currentNode;
           
    }
}

@Override
public void addGenrePlayList()
{
    
}



    
}
