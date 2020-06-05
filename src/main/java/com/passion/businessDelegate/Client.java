package com.passion.businessDelegate;

/**
 * @author lsl
 * @date 2020/6/5
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }
}
