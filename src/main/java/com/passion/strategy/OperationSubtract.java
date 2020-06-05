package com.passion.strategy;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
