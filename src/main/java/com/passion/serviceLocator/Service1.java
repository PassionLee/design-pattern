package com.passion.serviceLocator;

/**
 * @author lsl
 * @date 2020/6/5
 */
public class Service1 implements Service {
    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
