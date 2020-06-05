package com.passion.abstractFactory;

/**
 * @author lsl
 * @date 2020/6/4
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
