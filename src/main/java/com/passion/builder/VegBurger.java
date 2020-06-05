package com.passion.builder;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
