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
public class PopRapDDL implements PlaylistLinearInterface{
    
   static  int size;
   public static Node head, tail;
    
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
    
    public static Node convertArr2Dll(ArrayList<SongSchema> arr)
    {
        head = new Node(arr.get(0),null, null );
        Node prev = head;
        
        for (int i = 1; i < arr.size(); i++) {
            Node temp = new Node(arr.get(i), null, prev);
            prev.next = temp;
            prev = temp;
        }
        size++;
        return head;
    }
    
    @Override
    public void displaySize()
    {
        System.out.println(size());
    }
  
    
    public static void print(Node head)
    {
        while(head != null)
        {
            System.out.println("The size of the ddl is: "+size);
            System.out.println(head.data.songDetails()+"");
            head = head.next;
        }
    }
    
    
      @Override
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
  @Override
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
  @Override
public boolean remove(Object data)
{
    if (head == null) {
        JOptionPane.showMessageDialog(null, "You need to enter the song name into the search bar \nTo remove music from the playlist!");
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
    
  @Override
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
  @Override
    public void displaySearch(String songName)
    {
        Node discovered = Search(songName);
        PlaylistGUI.displayPopSongs.setText("");
        PlaylistGUI.displayPopSongs.setText("Name \t Artist \t Album \t Genre \n");
        if (discovered != null) {
            System.out.println("Song Found: ");
            PlaylistGUI.displayPopSongs.append(discovered.data.songDetails());
        } else {
            JOptionPane.showMessageDialog(null, "The Song Could not be found ");
        }
    }

}
