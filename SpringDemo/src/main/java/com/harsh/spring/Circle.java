/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harsh.spring;

import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 *
 * @author harsh
 */
//Scans for circle bean and attaches that
//@Component

@Controller
public class Circle implements Shape,ApplicationEventPublisherAware  {
    
    @Autowired
    private MessageSource messageSource;
    
    private ApplicationEventPublisher publisher;

    
    public void setMeesageSource(MessageSource meesageSource) {
        this.messageSource = meesageSource;
    }
    

    public Point getCenter() {
        return center;
    }

    //Spring will not go ahead with execution without cneter
    //Checked by BeanPost processor.
    //@Required
    
    //This annotation is used to 
    //automatically assign qualifier from spring.xml to the 
    //with the value to the object
    //@Autowired
    //@Qualifier(value="circleRealated")
    
    @Resource(name="pointC")
    public void setCenter(Point center) {
        this.center = center;
    }
    
    private Point center;
    
    
 
    public void draw() {
        System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default cirlce", null));
        System.out.println(this.messageSource.getMessage("drawing.points", new Object[] {center.getX(), center.getY()}, "Default cirlce points", null));
        System.out.println(this.messageSource.getMessage("greeting", null, "Default cirlce", null));
        DrawEvent drawEvent = new DrawEvent(this);
        publisher.publishEvent(drawEvent);
    }
    
    @PostConstruct
    public void initializeCircle() {
        System.out.println("Starting cicrle object");
    }
    
    
    @PreDestroy
    public void destroyMethode(){
        System.out.println("Kill Circle");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    
}
