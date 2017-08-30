/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harsh.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author harsh
 */
public class Triangle implements Shape  {
    
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context = null; 
    
    

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
    
  
    public void draw() {
        System.out.println("Drawing a triangle");
        System.out.println("Point A = "+ getPointA().getX() + ","+getPointA().getY());
        System.out.println("Point B = "+ getPointB().getX() + ","+getPointB().getY());
        System.out.println("Point C = "+ getPointC().getX() + ","+getPointC().getY());
    }

    /*
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initializing Bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying Beans - disposable bean");
    }
    */
    
    public void myInit() {
        System.out.println("initializing Bean - myinit");
        
    }
    
    public void destroyMe() {
        System.out.println("CleanUp");
        
    }
    
}
