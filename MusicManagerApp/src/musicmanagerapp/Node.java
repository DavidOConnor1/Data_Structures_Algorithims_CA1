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
<<<<<<< HEAD
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

   
   
   
=======
    private Object song;
    private Node next,prev;

    public Node(Object song, Node next, Node prev) {
        this.song = song;
        this.next = next;
        this.prev = prev;
    }

    public Object getSong() {
        return song;
    }

    public void setSong(Object song) {
        this.song = song;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    
    
    @Override
    public String toString()
    {
        return "Node{"+"Song = "+song+'}';
    }
>>>>>>> parent of 233d1ba (After various testing of different dll tutorials one of my tests have finally worked!!)
    
}
