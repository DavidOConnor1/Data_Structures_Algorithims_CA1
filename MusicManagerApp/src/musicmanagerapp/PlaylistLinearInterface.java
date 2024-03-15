/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author dmoc2
 */
public interface PlaylistLinearInterface {
    
    public boolean isEmpty();
    public int size();
    public Object first();
    public Object last();
    public void addFirst(Object value);
    public void addLast(Object value);
    public void addBetween(Object value, Node previous, Node successor);
    public Object remove(Node node);
    public Object removeFirst();
    public Object removeLast();
    
    public void list();
    
    
}
