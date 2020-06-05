package com.passion.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
