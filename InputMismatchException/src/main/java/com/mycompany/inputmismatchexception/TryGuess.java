/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inputmismatchexception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dmoc2
 */
public class TryGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a=0, b=0;
        int sum;
        boolean notOk = false;
        
        
            do{
                 try
                {
                    System.out.println("The correct number is between 1 & 10");
                    System.out.println("Enter Two numbers to add");
                    a = input.nextInt();
                    b = input.nextInt();
            
                 System.out.println("Number"+a+"+"+b);
            
                 sum = a+b;
            
                 System.out.println("The sum of your numbers are: "+sum);
            
                if(sum == 10){
                 System.out.println("Congratulations you got the number!");
                 break;
             } else {
                    System.out.println("Try again");
                    notOk = true;
                }
                } catch(InputMismatchException ex){
             System.out.println("That is not a number, try again");
             
             System.out.println(ex);
             
        }
            } while(notOk); //continues the do until the correct number is guessed
            
        
            
            
        
         
        
    }
}
