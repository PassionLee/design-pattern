package com.passion.memento;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
