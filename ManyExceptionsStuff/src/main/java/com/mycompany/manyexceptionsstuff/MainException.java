/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manyexceptionsstuff;

/**
 *
 * @author dmoc2
 */
public class MainException extends Exception {
    
    protected String msg;

    public MainException() {
    }

    public MainException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
    
    
    
}
