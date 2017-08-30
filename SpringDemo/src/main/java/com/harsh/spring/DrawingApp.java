/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harsh.spring;

import java.util.Locale;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 *
 * @author harsh
 */
public class DrawingApp {
    
    public static void main(String [] args) {
        
        
        //BeanFactory factory = new  XmlBeanFactory(new FileSystemResource("spring.xml"));
        
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        Shape shape = (Shape)context.getBean("circle");
        shape.draw();
//Example of getting messageSource from context
//        System.out.println(context.getMessage("greeting", null, "Default greetings", null));
        
        
        
    }
            
    
}
