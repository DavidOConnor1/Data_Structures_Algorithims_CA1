/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task8;

/**
 *
 * @author dmoc2
 */

import java.util.LinkedList;
import java.util.Queue;

public class Task8   {
    private static final Queue<Integer> queue = new LinkedList<>();
  
    private static final int capacity = 10;
    
    private static final Runnable producer = new Runnable()
    {
        public void run()
        {
            while(true){
                synchronized(this){
                while(queue.size() == capacity){
                    try{
                        System.out.println("Queue us at max");
                        queue.wait();
                    } catch(InterruptedException e){
                        System.out.println("It was interrupted "+e.getMessage());
                    }
                }
                queue.add(10);
                System.out.println("added 10 to the queue");
                queue.notifyAll(); //notifying all waiting consumers
                
                try{
                    Thread.sleep(2000);
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
                
            }
            }
        }
    };
    
    private static final Runnable consumer = new Runnable()
    {
        public void run()
        {
            while(true)
            {
             synchronized(queue)
             {
                while(queue.isEmpty()){
                    try{
                        System.out.println("queue is empty");
                        queue.wait();
                    } catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }   
            }
        }
    };
    
    }
    

