package com.passion.bridge;

/**
 * 桥接模式
 *
 * @author lsl
 * @date 2020/6/4
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
