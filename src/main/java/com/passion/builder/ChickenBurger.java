package com.passion.builder;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.4f;
    }
}
