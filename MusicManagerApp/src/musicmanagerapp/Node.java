/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author dmoc2
 */
public class Node {
   SongSchema song;
   Node previous, next;

    public Node(SongSchema song) 
    {
        this.song = song;
        
        //they have not been intialized yet
        this.previous = null;
        this.next = null; 
    
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public SongSchema getSong() {
        return song;
    }

   
   
   
    
}
