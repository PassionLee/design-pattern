package com.passion.facade;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
