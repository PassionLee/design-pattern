package com.passion.visitor;

/**
 * @author lsl
 * @date 2020/6/4
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
