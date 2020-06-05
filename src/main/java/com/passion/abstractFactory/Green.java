package com.passion.abstractFactory;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
