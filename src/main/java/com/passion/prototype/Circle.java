package com.passion.prototype;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
