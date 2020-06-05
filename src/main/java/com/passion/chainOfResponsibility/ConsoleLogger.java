package com.passion.chainOfResponsibility;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
