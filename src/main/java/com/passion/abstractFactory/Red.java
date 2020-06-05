package com.passion.abstractFactory;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
