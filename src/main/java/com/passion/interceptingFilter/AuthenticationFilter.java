package com.passion.interceptingFilter;

/**
 * @author lsl
 * @date 2020/6/5
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
