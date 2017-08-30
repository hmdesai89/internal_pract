/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harsh.spring;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author harsh
 */
public class DrawEvent extends ApplicationEvent {
    
    public DrawEvent(Object source) {
        super(source);
    }
    
    @Override
    public String toString() {
        return "Draw event occured";
    }
    
}
