/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harsh.spring.aop.service;

import com.harsh.spring.aop.model.Circle;
import com.harsh.spring.aop.model.Triangle;

/**
 *
 * @author harsh
 */
public class ShapeService {

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
    
    private Circle circle;
    private Triangle triangle;
    
}
