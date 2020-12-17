package com.kodluyoruz.selen.question4.model.addresses;

public class HomeAddress implements IAddress {
    private String homeAddress;

    public HomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }



    @Override
    public String getAddress() {
        return homeAddress;
    }

    @Override
    public void setAddress(String address) {
        this.homeAddress = address;
    }
}
