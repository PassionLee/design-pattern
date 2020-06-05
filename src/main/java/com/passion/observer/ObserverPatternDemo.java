package com.passion.observer;

/**
 * 观察者模式
 *
 * @author lsl
 * @date 2020/6/4
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
