package com.passion.state;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}