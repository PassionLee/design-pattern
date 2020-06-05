package com.passion.builder;

/**
 * @author lsl
 * @date 2020/6/4
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
