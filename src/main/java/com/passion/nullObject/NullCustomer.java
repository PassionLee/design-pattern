package com.passion.nullObject;

/**
 * @author lsl
 * @date 2020/6/4
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
