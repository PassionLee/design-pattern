package com.passion.visitor;

/**
 * @author lsl
 * @date 2020/6/4
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
