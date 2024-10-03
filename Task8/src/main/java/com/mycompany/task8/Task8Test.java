/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task8;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author dmoc2
 */
public class Task8Test {

   // Shared queue used by both producer and consumer
    private static final Queue<Integer> queue = new LinkedList<>();
    // Maximum capacity of the queue
    private static final int CAPACITY = 10;

    // Producer task
    private static final Runnable producer = new Runnable() {
        public void run() {
            while (true) {
                synchronized (queue) {
                    // Wait if the queue is full
                    while (queue.size() == CAPACITY) {
                        try {
                            System.out.println("Queue is at max capacity");
                            queue.wait(); // Release the lock and wait
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // Add item to the queue
                    queue.add(10);
                    System.out.println("Added 10 to the queue");
                    queue.notifyAll(); // Notify all waiting consumers
                    try {
                        Thread.sleep(2000); // Simulate some delay in production
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };

    // Consumer task
    private static final Runnable consumer = new Runnable() {
        public void run() {
            while (true) {
                synchronized (queue) {
                    // Wait if the queue is empty
                    while (queue.isEmpty()) {
                        try {
                            System.out.println("Queue is empty, waiting");
                            queue.wait(); // Release the lock and wait
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // Remove item from the queue
                    System.out.println("Removed " + queue.remove() + " from the queue");
                    queue.notifyAll(); // Notify all waiting producers
                    try {
                        Thread.sleep(2000); // Simulate some delay in consumption
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    };
    
    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        
        
        Thread producerThread = new Thread(producer, "Producer");
        Thread ConsumerThread = new Thread(consumer, "Consumer");
        
        producerThread.start();
        ConsumerThread.start();
        System.out.println("Main Thread is Exiting");
       
    }
}
