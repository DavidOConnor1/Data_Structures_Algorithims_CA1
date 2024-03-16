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
             System.out.println(currentNode.getSong().songDetails());
            currentNode = currentNode.getNext();
            
        }

    }
 }


@Override
public boolean remove(SongSchema song)
{
    if (head == null) {
        return false;
    }
    if (head.song == song) {
        if (head == tail) {
            head = null;
            tail=null;
        }
    }
    else {
        head = head.next;
        head.previous = null;
        size --;
        return true;
    }
   

    Node currNode = head.next;

    while(currNode != null && currNode != tail)
    {
       if (currNode.song == song) {
            currNode.previous.next = currNode.next;
            currNode.next.previous = currNode.previous;
            size--;
            return true;
       }
       currNode = currNode.next;
    }
       if (tail.song == song) {
            tail = tail.previous;
            tail.next =null;
            return true;
       }
    
return false;
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

    
}
