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
    
<<<<<<< HEAD
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



=======
    private Node head; // this will act as a temp storage
    private Node trailer; //will act as temp storage
    private int size;

    public DoublyLinkedList() {
        head = new Node(null,null,null);
        trailer = new Node(null, head, null);
        head.setNext(trailer);
    }
    
    @Override
    public int size()
    {
        return size;
    }
    
    @Override
    public boolean isEmpty()
    {
        return size == 0;
    } 
    
    @Override
    public Object first()
    {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "There is no songs to return");
            return null;
                  
        } else 
            return head.getNext().getSong();// will retrive the data at the top of the list
    }
    
    @Override
    public Object last()
    {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "There is no songs to return");
            return null;
        } else
            return trailer.getPrev().getSong();
    } //end of the last method
    
    @Override
    public void addBetween(Object value, Node previous, Node successor)
    {
        Node newNode = new Node(value, previous, successor);
        previous.setPrev(newNode); //assinging the nodes prev and succ to eachother
        successor.setNext(newNode);
        size++;
    }
    
    @Override
    public void addFirst(Object value)
    {
        addBetween(value, head, head.getNext()); //assigns the recent added string object first to the array list
    }
    
    @Override
    public void addLast(Object value)
    {
        addBetween(value, trailer.getPrev(), trailer); //assigns the latest added object to the last value in the list
    }
    
    @Override
    public Object remove(Node node)
    {
        Node previousNode = node.getPrev();
        Node successorNode = node.getNext();
        
        //assigns the two nodes to each other to remove nodes in the designated places that is required
        previousNode.setNext(successorNode);
        successorNode.setPrev(previousNode);
        size--;
        return node.getSong();
    }
    
    @Override
    public Object removeFirst()
    {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "There is no songs to remove");
            return null;
        } else
            return remove(head.getNext());
    } //end remove first
    
    @Override
    public Object removeLast()
    {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "There is nothing to remove");
            return null;
        } else 
            return remove(trailer.getPrev());
    } //end remove last 
    
    @Override
    public void list()
    {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else
            System.out.println("Travesing through the list");
            Node start = head.getNext();
            while(start != trailer)
            {
                System.out.println(start.getSong());
                
                start.getNext();
            }
            System.out.println("\n size of the list: "+size);
    } 
>>>>>>> parent of 233d1ba (After various testing of different dll tutorials one of my tests have finally worked!!)
    
}
