package com.passion.chainOfResponsibility;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
