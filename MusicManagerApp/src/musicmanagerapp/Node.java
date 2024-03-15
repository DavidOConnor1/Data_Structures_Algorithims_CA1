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
   Object data;
   Node previous, next;

    public Node(Object d) 
    {
        data = d;
        
        //they have not been intialized yet
        previous = null;
        next = null; 
    
    }
   
   
    
}
