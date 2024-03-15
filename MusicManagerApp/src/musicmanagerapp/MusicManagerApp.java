/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicmanagerapp;

/**
 *
 * @author dmoc2
 */
public class MusicManagerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Music_Manager_GUI load = new Music_Manager_GUI();
        load.setVisible(false);
       
         PlaylistLinearInterface test = new DoublyLinkedList();
         
         test.addFirst("Hello world");
         test.addFirst("2");
          test.addFirst("7");
           test.addFirst("10");
            test.addFirst("8");
             test.addLast("99");
             
          test.displayList();
             
            
        
    }
    
}
