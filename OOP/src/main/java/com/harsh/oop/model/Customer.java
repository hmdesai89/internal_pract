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
public class Customer {
    
    private Card customerATMCard;

    public Customer(Card customerATMCard) {
        this.customerATMCard = customerATMCard;
    }

    public Card getCustomerATMCard() {
        return customerATMCard;
    }
    
    
    
}
