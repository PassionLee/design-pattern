package com.passion.prototype;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
