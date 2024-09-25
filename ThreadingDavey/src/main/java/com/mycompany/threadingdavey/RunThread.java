/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadingdavey;

/**
 *
 * @author dmoc2
 */
public class RunThread implements Runnable {
    
    private String word;
    private int count;

    public RunThread(String s, int c) 
    {
        word = s;
        count = c;
    }
    
    
    
    public void run()
    {
        synchronized(this){
        for(int i=0; i<4; i++)
        {
            System.out.println(word);
        }
        }
    }
    
    
}
