package com.passion.builder;

/**
 * @author lsl
 * @date 2020/6/4
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
