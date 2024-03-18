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
public class PopRapDDL implements PlaylistLinearInterface
{//open class
    
   static int size; //intializing the size
   static Node head, tail; //intializing the nodes 
    
   @Override
    public int size()
    {//open size
        int nodes =0; //intialize the count
        Node curr = head; //set the current as the head 
        while(curr != null) //while current is not null perform the following 
        {
            nodes++; //add to the node counter for each node it finds 
            curr = curr.next; //move onto the next node when it counts the first one 
        }
        return nodes; //returns all the nodes it has counted 
    } //close size 
    
    @Override
    public void displaySize()
    { //open display
        JOptionPane.showMessageDialog(null, "There is: "+size()+" Songs in Your playlist");
    } //close display
    
    
    
    @Override
    public boolean isEmpty()
    {//open 
         return size == 0;
    } //close 
    
    
    public static Node convertArr2Dll(ArrayList<SongSchema> arr)
    { //open
        head = new Node(arr.get(0),null, null ); //set the head as the first index of the array list
        Node prev = head; //set the previous as the head 
        
        for (int i = 1; i < arr.size(); i++) 
        {//open for 
            Node temp = new Node(arr.get(i), null, prev); //temp stores all of the data from the array
            prev.next = temp; //sets the next prev as temp 
            prev = temp; //sets prev as temp
        } //close for 
        size++; //increments the size of the DDL
        return head; //returns the head will all the data from the array list
    }//close 

    
    //prints all of the data from the array list that has been converted to DDL
    public static void print(Node head)
    {//open
        while(head != null) //while the head in not null do the following 
        { //open while 
            
            System.out.println(head.data.songDetails()+""); //will display the data from the array list to show that it has worked 
            head = head.next; //it will move onto the next node in the arraylist to display
        } //close while
    }//close 
    
  
    @Override
     public void displayForward()
 {//open 
    if(head == null)
    {
        System.out.println("List is empty"); //it can't display anything if there is nothing to display
    } else {
        System.out.println("Forward travesal"); //tells the order the data is being presented 
        PlaylistGUI.displayPlaylist2.setText("# \t Name \t Artist \t Album \t Genre \n"); //sets the top of the display
        
        Node currentNode = head; //setting the current node as head

        while (currentNode != null) 
        {//open while
          
            
    
            PlaylistGUI.displayPlaylist2.append(size()+"\t"+currentNode.data.songDetails()+"");//will display the size of the ddl while showing the song details. the size works as a index 
            currentNode = currentNode.next; //loops onto the next node 
        } //close 

    }//close else 
 }//close 
     
@Override
 public void displayBackward()
{//open
    if (head == null) {
        System.out.println("List is empty ");
        
    } else{
        System.out.println("backwards travesal");//tells the order the data is being presented 
        PlaylistGUI.displayPlaylist2.setText("");
        PlaylistGUI.displayPlaylist2.setText("# \t Name \t Artist \t Album \t Genre \n"); //sets the top of the display
        Node currNode = head;//initialize the current node 

        while (currNode.next != null) {
          
            currNode = currNode.next ; //loops to the next node
        
           
        }
        //travesing backwards from the last node to the head 
        while(currNode != null)
        { //open while
            PlaylistGUI.displayPlaylist2.append(size()+"\t"+currNode.data.songDetails());//will display the size of the ddl while showing the song details. the size works as a index 
            
            currNode = currNode.back; //will loop backwards through the nodes
        }//end while 

    }
}
@Override
public boolean remove(Object data)
{
    //will remove the data based on the placement, the data is mainly removed from the head but if there is multiple removes it will be able to remove them
    if (head == null) {//open if 
        JOptionPane.showMessageDialog(null, "There is no songs to remove");
        return false;
    } //close if 
    if (head.data == data) 
    { //grabbing the data from the schema class 
        if (head == tail) 
        {//open if 
            head = null; //setting as null
            tail=null; //setting as null
        } //close if 
    }//close if 
    else 
    {//open else 
        head = head.next; //head will move to the next head 
        head.back = null; //head will not go backwards
        size --; //the size decreases
        return true; //the remove has happened 
    }//close else 
   

    Node currNode = head.next; //creating anew node and setting it as head.next 

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
    public Node Search(String songName) //determining the String will tell the nodes on how to search based on the name
    {
        Node currNode = head; //setting curr as head to pull the data as the head 
        
        while(currNode != null)
        {
            if(currNode.data.getSongName().equalsIgnoreCase(songName))//if the song name in the search field equals to a song name in the song schema it will pull the data
            {
                return currNode; //will return the node with the song name 
        }
            currNode = currNode.next; //will move onto the next node 
      
   }
        System.out.println("song could not be found");
        return null; //cannot find the song
    }
    
    @Override
    public void displaySearch(String songName)
    { //will display the results of the search
        Node discovered = Search(songName); //creating the node based on the previous node method 
        PlaylistGUI.displayPlaylist2.setText("");//resest the display
        PlaylistGUI.displayPlaylist2.setText("Name \t Artist \t Album \t Genre \n"); //sets the top
        if (discovered != null) {
            System.out.println("Song Found: ");
            PlaylistGUI.displayPlaylist2.append(discovered.data.songDetails()); //diplays the song details 
        } else {
            JOptionPane.showMessageDialog(null, "The Song Could not be found "); //tells the user the song cannot be found!
        }//end else 
    }//end the method

}
