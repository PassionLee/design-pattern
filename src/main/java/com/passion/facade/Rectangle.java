package com.passion.facade;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}