/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import musicmanagerapp.PlaylistGUI;

/**
 *
 * @author dmoc2
 */
public class PopRapDDL {
    
    int size;
   static Node head, tail;
    
    
    
    
    public static Node convertArr2Dll(ArrayList<SongSchema> arr)
    {
        head = new Node(arr.get(0),null, null );
        Node prev = head;
        
        for (int i = 1; i < arr.size(); i++) {
            Node temp = new Node(arr.get(i), null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    
    /*
        The method below is to detect all the new data that         is being transfered from the arraylist from the other classses and then placing that new data to the back of the DDL. This makes sure that the head is not over written or to cause any confusion for the program.
    
    */
    
    
    public void addNewDataLast(SongSchema song)
    {
      
        if(head == null){ //checking if the head is null
           
            head = new Node(song, null, null); //intializing the head node
            return;
        }
        
       
            System.out.println("loading add to last!");
       Node current = head;
        while(current != null)
        {
            current = current.next;
        }
        Node newNode = new Node(song, null, current);
        current.next = newNode;
       
    }
            
    
    
    
    
    public static void print(Node head)
    {
        while(head != null)
        {
            System.out.println(head.data.songDetails()+"");
            head = head.next;
        }
    }
    
    public boolean isEmpty()
    {
        return size ==0;
    }
    
     public void displayForward()
 {
    if(head == null)
    {
        System.out.println("List is empty");
    } else {
        System.out.println("Forward travesal");
                PlaylistGUI.displayPopSongs.setText("Name \t Artist \t Album \t Genre \n");
        
        Node currentNode = head;

        while (currentNode != null) {
            
    
            PlaylistGUI.displayPopSongs.append(currentNode.data.songDetails()+"");
            currentNode = currentNode.next;
        }

    }
 }

 public void displayBackward()
{
    if (head == null) {
        System.out.println("List is empty ");
        
    } else{
        System.out.println("backwards travesal");
            PlaylistGUI.displayPopSongs.setText("");
        PlaylistGUI.displayPopSongs.setText("Name \t Artist \t Album \t Genre \n");
        Node currNode = head;

        while (currNode.next != null) {
          
            currNode = currNode.next ;
        
           
        }
        //travesing backwards from the last node to the head 
        while(currNode != null)
        {
            PlaylistGUI.displayPopSongs.append(currNode.data.songDetails());
            System.out.println(currNode.data.songDetails());
            currNode = currNode.back;
        }

    }
}

public boolean remove(Object data)
{
    if (head == null) {
        JOptionPane.showMessageDialog(null, "There is no songs to remove");
        return false;
    }
    if (head.data == data) {
        if (head == tail) {
            head = null;
            tail=null;
        }
    }
    else {
        head = head.next;
        head.back = null;
        size --;
        return true;
    }
   

    Node currNode = head.next;

    while(currNode != null && currNode != tail)
    {
       if (currNode.data == data) {
            currNode.back.next = currNode.next;
            currNode.next.back = currNode.back;
            size--;
            return true;
       }
       currNode = currNode.next;
    }
       if (tail.data == data) {
            tail = tail.back;
            tail.next =null;
            return true;
       }
    
return false;
}
    

    public Node Search(String songName)
    {
        Node currNode = head;
        
        while(currNode != null)
        {
            if(currNode.data.getSongName().equals(songName))
            {
                return currNode;
        }
            currNode = currNode.next;
      
   }
        System.out.println("song could not be found");
        return null;
    }

    public void displaySearch(String songName)
    {
        Node discovered = Search(songName);
        
        if (discovered != null) {
            System.out.println("Song Found: ");
            JOptionPane.showMessageDialog(null, discovered.data.songDetails());
        } else {
            System.out.println("Song has not be found");
        }
    }

}
