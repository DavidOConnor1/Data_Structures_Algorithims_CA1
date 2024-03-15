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
        load.setVisible(true);
        /*
        PlaylistLinearInterface load2 = new DoublePlaylist(); 
        
        load2.add(0, "A");
         load2.add(1, "b");
          load2.add(2, "c");
           load2.add(3, "d");
            load2.add(4, "e");
             load2.add(5, "f");
             
             load2.displayPlaylist();
        */
    }
    
}
