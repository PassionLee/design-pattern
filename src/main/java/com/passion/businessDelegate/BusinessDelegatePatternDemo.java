package com.passion.businessDelegate;

/**
 * 业务代表模式
 *
 * @author lsl
 * @date 2020/6/5
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
