package com.kodluyoruz.selen.question4.utils;

import com.kodluyoruz.selen.question4.model.User;
import com.kodluyoruz.selen.question4.model.addresses.IAddress;

import java.util.ArrayList;

public class AddressManager {

    public static void add(User user, IAddress address){
        if(user.getAddress() == null){
            user.setAddress(new ArrayList<>());
        }
        user.getAddress().add(address);
    }

    public static IAddress remove(User user, IAddress address){
        user.getAddress().remove(address);
        return address;
    }
}
