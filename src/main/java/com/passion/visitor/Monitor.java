package com.passion.visitor;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
