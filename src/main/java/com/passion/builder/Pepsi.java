package com.passion.builder;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
