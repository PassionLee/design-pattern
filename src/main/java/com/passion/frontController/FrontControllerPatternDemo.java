package com.passion.frontController;

/**
 * 前端控制器模式
 *
 * @author lsl
 * @date 2020/6/5
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
