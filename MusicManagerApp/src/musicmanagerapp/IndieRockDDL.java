/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

import java.util.ArrayList;

/**
 *
 * @author dmoc2
 */
public class IndieRockDDL {
    public static Node convertArr2Dll(ArrayList<SongSchema> arr)
    {
        Node head = new Node(arr.get(0),null, null );
        Node prev = head;
        
        for (int i = 1; i < arr.size(); i++) {
            Node temp = new Node(arr.get(i), null, null);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    
    public static void print(Node head)
    {
        while(head != null)
        {
            System.out.println(head.data.songDetails()+"");
            head = head.next;
        }
    }
}
