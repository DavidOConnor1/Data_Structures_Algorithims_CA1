/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manyexceptionsstuff;

/**
 *
 * @author dmoc2
 */
public class ManyExceptions extends MainException {
    
        String msg = "Too many stuff!";

    public ManyExceptions() {
    }
    
    public ManyExceptions(String msg) {
        super(msg);
        this.msg = msg;
    }
    
    public String tooManyMessages()
    {
        return this.msg;
    }

        
}
