/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harsh.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author harsh
 */
@Component
public class MyEventListner implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent e) {
        System.out.println("event is called :"+ e.toString());
    }
    
    
}
