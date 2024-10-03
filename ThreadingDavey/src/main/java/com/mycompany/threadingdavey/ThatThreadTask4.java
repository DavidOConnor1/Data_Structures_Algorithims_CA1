/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadingdavey;

/**
 *
 * @author dmoc2
 */
public class ThatThreadTask4 {
    
    public static void main(String[] args)
    {
        
        for(int i=0; i<100; i++)
        {
            
            Thread newThread = new Thread(() -> {
                System.out.println("a");
            });
            newThread.start();
            Thread newThreadTwo = new Thread(() -> {
                System.out.println("b");
                
            });
            newThreadTwo.start();
            Thread newThreadThree = new Thread(() -> {
                int count=0;
                count++;
                System.out.println(count);
                
            });
            newThreadThree.start();
        }
       
        
    }
}
