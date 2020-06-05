package com.passion.interceptingFilter;

/**
 * @author lsl
 * @date 2020/6/5
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
