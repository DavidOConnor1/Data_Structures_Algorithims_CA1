/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task7;

/**
 *
 * @author dmoc2
 */
public class Task7 {

    public static void main(String[] args) {
    Counter counter = new Counter();
    Thread t1 = new Thread(counter, "Thread One");
    Thread t2 = new Thread(counter, "Thread Two");
    Thread t3 = new Thread(counter, "Thread Three");
    t1.start();
    t2.start();
    t3.start();
  }
}



    

