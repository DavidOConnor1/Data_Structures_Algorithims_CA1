/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadingdavey;



/**
 *
 * @author dmoc2
 */

public class NameThreadRun  {
    

    
    public static void main(String args [])
    {

        
        
        
        for (int i = 1; i <= 10; i ++) {
            
            Thread newThread = new Thread (() -> {
               
                Thread currentThread = Thread.currentThread();
                
                System.out.println("The name is " + currentThread.getName());
                System.out.println("This is the ID " + currentThread.getId());
                
            });
            
            newThread.setName("T"+i);
            
            newThread.start();
            
        }
    }
    
    
   
    
    
    
    
}
