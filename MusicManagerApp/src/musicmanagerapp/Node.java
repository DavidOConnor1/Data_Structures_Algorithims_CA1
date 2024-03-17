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
     public SongSchema data;
    public Node next;
    public Node back;

    public Node(SongSchema data1, Node next1, Node back1)
    {
        data = data1;
        next = next1;
        back = back1;
    }


    public Node(SongSchema data1)
    {
        data = data1;
        next = null;
        back = null;
    }

}
