package com.passion.prototype;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
