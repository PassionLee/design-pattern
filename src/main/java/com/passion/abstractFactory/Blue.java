package com.passion.abstractFactory;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
