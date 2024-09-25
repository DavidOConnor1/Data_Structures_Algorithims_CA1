/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadingdavey;

/**
 *
 * @author dmoc2
 */
public class RunThreadTest {
    
    public static void main(String[] args) {
       // Thread newThread = new Thread();
        RunThread runningThread = new RunThread("lol",2);
        RunThread runningBehind = new RunThread("Derp", 1);
        
        Thread newThread = new Thread(runningThread);
        
        
        Thread newThreadTwo = new Thread(runningBehind);
        
        newThread.setPriority(1);
        newThreadTwo.setPriority(2);
        
        newThread.start();
        newThreadTwo.start();
    }
    
}
