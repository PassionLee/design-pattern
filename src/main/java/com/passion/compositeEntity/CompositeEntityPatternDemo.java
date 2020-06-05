package com.passion.compositeEntity;

/**
 * 组合实体模式
 *
 * @author lsl
 * @date 2020/6/5
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
