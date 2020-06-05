package com.passion.mediator;

/**
 * 中介者模式
 *
 * @author lsl
 * @date 2020/6/4
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
