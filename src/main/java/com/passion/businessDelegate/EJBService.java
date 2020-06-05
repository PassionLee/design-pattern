package com.passion.businessDelegate;

/**
 * @author lsl
 * @date 2020/6/5
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
