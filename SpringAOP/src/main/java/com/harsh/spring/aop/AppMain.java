/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harsh.spring.aop;

import com.harsh.spring.aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author harsh
 */
public class AppMain {
    
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = (ShapeService) ctx.getBean("shapeService");
        shapeService.getCircle().setNameandReturn("Dummy");
    }
    
}
