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
    public void addFirst(Object data);
    public void addLast(Object data);
    public boolean remove(Object data);
    public void displayList();
    
    
}
