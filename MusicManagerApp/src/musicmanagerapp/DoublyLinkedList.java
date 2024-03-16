/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanagerapp;

import javax.swing.JOptionPane;

/**
 *
 * @author dmoc2
 */
public class DoublyLinkedList implements PlaylistLinearInterface {
    
 int size;
  Node head, tail;

  public boolean isEmpty()
  {
    return size ==0;
  }
  
  
  
  public int size()
  {
    return size;
  }

  public void addFirst(Object data)
  {
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        tail = newNode;
    } else {
        newNode.next = head;// will assign the next node as the head node
        head.previous = newNode; //assign previous head as new Node?
        head = newNode;
    }
    size++;

  }
@Override
  public void addLast(Object data)
 {
    Node newNode = new Node(data);
    if (tail == null) //checking if the tail is null
     {
        head = newNode;
        tail = newNode;
    } else {
        tail.next = newNode;
        newNode.previous = tail; //previous node will be assigned to the tail
        tail = newNode;
    }
    size++;

 }
@Override
 public void displayList()
 {
    if(head == null)
    {
        System.out.println("List is empty");
    } else {
        System.out.println("Forward travesal");
        Node currentNode = head;

        while (currentNode != null) {
            System.out.println(currentNode.data+"");
            currentNode = currentNode.next;
        }

    }
 }

 
@Override
public boolean remove(Object data)
{
    if (head == null) {
        return false;
    }
    if (head.data == data) {
        if (head == tail) {
            head = null;
            tail=null;
        }
    }
    else {
        head = head.next;
        head.previous = null;
        size --;
        return true;
    }
   

    Node currNode = head.next;

    while(currNode != null && currNode != tail)
    {
       if (currNode.data == data) {
            currNode.previous.next = currNode.next;
            currNode.next.previous = currNode.previous;
            size--;
            return true;
       }
       currNode = currNode.next;
    }
       if (tail.data == data) {
            tail = tail.previous;
            tail.next =null;
            return true;
       }
    
return false;
}
}
