package com.passion.businessDelegate;

/**
 * @author lsl
 * @date 2020/6/5
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
