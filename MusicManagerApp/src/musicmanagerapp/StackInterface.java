/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author dmoc2
 */
public interface StackInterface {
    
    public int size();
    public boolean isEmpty();
    public void enqueue(Object newSong);
    public Object dequeue();
    public Object frontElement();
    public String displaySongs();
    public Object removeAll();
    
}
