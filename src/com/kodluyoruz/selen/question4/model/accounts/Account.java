package com.kodluyoruz.selen.question4.model;

import com.kodluyoruz.selen.question4.enums.AuthenticationStatus;
import com.kodluyoruz.selen.question4.exception.InvalidAuthenticationException;
import com.kodluyoruz.selen.question4.model.addresses.IAddress;
import com.kodluyoruz.selen.question4.model.insurance.Insurance;
import com.kodluyoruz.selen.question4.service.AddressManager;

import java.util.List;

public abstract class Account {

    private AuthenticationStatus authenticationStatus = AuthenticationStatus.FAIL;
    private User user;
    private List<Insurance> insurances;



    public Account(User user) {
        this.user = user;
    }

    final public void showUserInfo(){
        System.out.println(user.toString());
    }

    public void login(String email, String password) {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            authenticationStatus = AuthenticationStatus.SUCCESS;
            return;
        }
        authenticationStatus = AuthenticationStatus.FAIL;
        throw new InvalidAuthenticationException("Authentication Failed!");

    }

    public void addAddress(IAddress address){
        if(!isAuthenticated())
            return;

        AddressManager.add(user, address);
    }

    public void removeAddress(IAddress address){
        if(!isAuthenticated())
            return;

        AddressManager.remove(user, address);
    }

    public boolean isAuthenticated(){
        return AuthenticationStatus.SUCCESS.equals(authenticationStatus);
    }






}


   /*




        kullanıcının sigorta poliçesi ekleyebilmesi için soyut (abstract) bir fonksiyon tanımlanacaktır.
        Bu soyut sınıf "Individual" ve "Enterprise" isimli alt sınıflarda override edilerek doldurulacaktır.
        Çünkü, bireysel ve kurumsal müşterilerin ekledikleri paketlerin fiyatlarına uygulanan kar marjı farklı olacaktır.*/


