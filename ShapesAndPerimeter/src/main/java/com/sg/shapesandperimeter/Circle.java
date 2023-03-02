/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.shapesandperimeter;

/**
 *
 * @author merin
 */
public class Circle extends Shapes {

    int radius = 0;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        area= (int)(Math.PI*radius*radius);
        perimeter=(int)(2*Math.PI*radius);
        
    }

    @Override
    public int getArea() {
        return area;
    }

    @Override
    public int getPerimeter() {
        return perimeter;
    }

}
