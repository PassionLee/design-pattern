package com.passion.interceptingFilter;

/**
 * @author lsl
 * @date 2020/6/5
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
