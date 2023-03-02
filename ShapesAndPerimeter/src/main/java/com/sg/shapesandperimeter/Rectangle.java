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
public class Rectangle extends Shapes{

    
    int length=0;
    int height=0;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
        area=length*height;
        perimeter=(2*length)+(2*height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        area=length*height;
        perimeter=(2*length)+(2*height);
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
