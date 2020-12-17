package com.kodluyoruz.selen.question4.model.addresses;

public class BusinessAddress implements IAddress {
    private String businessAddress;

    public BusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    @Override
    public String getAddress() {
        return businessAddress;
    }

    @Override
    public void setAddress(String address) {
        this.businessAddress = address;

    }
}
