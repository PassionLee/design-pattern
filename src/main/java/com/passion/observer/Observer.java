package com.passion.observer;

/**
 * @author lsl
 * @date 2020/6/4
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
