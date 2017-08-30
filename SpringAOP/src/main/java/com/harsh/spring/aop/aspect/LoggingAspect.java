/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harsh.spring.aop.aspect;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author harsh
 */
@Aspect
public class LoggingAspect {
    
    
    @Before("allGetters() && allCircleMethods()")
    public void loggingAdvice(JoinPoint joinPoint){
        //Circle circle = (Circle)(joinPoint.getTarget());
        
        
    }
    
    @AfterReturning(pointcut = "args(name)", returning="returnString")
    public void stringArgumentMethods(String name, String returnString) {
        System.out.println("Methode takes strnig args :"+name);
    }
    
    
    //@AfterReturning - Cares for execution will not be thrown if advice is hampered
    //@AfterThrowing(throwing = "ex") - Catches exception
    
    @Pointcut("execution(* get*())")
    public void allGetters() {}
    
    
    @Pointcut("within(com.harsh.spring.aop.model.Circle)")
    public void allCircleMethods(){}
    
    @Around("@annotation(com.harsh.spring.aop.aspect.Loggable)")
    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        
        Object returnValue = null;
        
        try {
            System.out.println("Before Advice");
            returnValue = proceedingJoinPoint.proceed();
            System.out.println("After Returning");
        } catch (Throwable ex) {
            System.out.println("After throwing");
        }
        
        System.out.println("After Finally");
        
        return returnValue;

        
    }
    
}
