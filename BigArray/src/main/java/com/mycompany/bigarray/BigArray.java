/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bigarray;

/**
 *
 * @author dmoc2
 */
import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;
public class BigArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int index =0;
        
        
            for(int i=0 ; i <=100; i++)
            {
                double randomNum = Math.floor(Math.random()*1000);
                System.out.println((int)randomNum);
                System.out.println("\n");
                numbers.add((int)randomNum);
            }
            boolean notOk = false;
            
            do{
                try
                {
                    System.out.println("Pick from the ArrayList 1-100");
                    index = input.nextInt();
                    
                    System.out.println(numbers.get(index).toString());
                } 
                catch(ArrayIndexOutOfBoundsException ex)
                {
                    
                    System.out.println("this index is out of bounds, try again!");
                    notOk = true;
                }
                
            } while(notOk);
                
            
            
        
       
    }
}
