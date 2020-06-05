package com.passion.abstractFactory;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
