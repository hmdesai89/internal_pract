/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harsh.oop.model;

/**
 *
 * @author harsh
 */
public class Card {
    
    private int pin;
    private int stripNumber;

    public Card(int pin, int stripNumber) {
        this.pin = pin;
        this.stripNumber = stripNumber;
    }

    public Card(int stripNumber) {
        this.stripNumber = stripNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getStripNumber() {
        return stripNumber;
    }

    public void setStripNumber(int stripNumber) {
        this.stripNumber = stripNumber;
    }
    
    
    
}
