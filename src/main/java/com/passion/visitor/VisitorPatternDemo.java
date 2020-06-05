package com.passion.visitor;

/**
 * 访问者模式
 *
 * @author lsl
 * @date 2020/6/4
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
