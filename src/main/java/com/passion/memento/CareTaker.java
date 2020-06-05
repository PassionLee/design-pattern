package com.passion.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
