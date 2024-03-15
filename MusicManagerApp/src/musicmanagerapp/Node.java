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
    
}
