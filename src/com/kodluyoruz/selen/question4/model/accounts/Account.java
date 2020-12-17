package com.kodluyoruz.selen.question4.model.accounts;

import com.kodluyoruz.selen.question4.enums.AuthenticationStatus;
import com.kodluyoruz.selen.question4.exception.InvalidAuthenticationException;
import com.kodluyoruz.selen.question4.model.User;
import com.kodluyoruz.selen.question4.model.addresses.IAddress;
import com.kodluyoruz.selen.question4.model.insurance.Insurance;
import com.kodluyoruz.selen.question4.utils.AddressManager;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public abstract class Account implements Comparable<Account> {

    private AuthenticationStatus authenticationStatus = AuthenticationStatus.FAIL;
    private User user;
    private List<Insurance> insurances;

    abstract void addInsurance(Insurance insurance);

    public Account(User user, List<Insurance> insurances) {
        this.user = user;
        this.insurances = insurances;
    }

    final public void showUserInfo(){
        System.out.println(user.toString());
    }

    public void login(String email, String password) {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            authenticationStatus = AuthenticationStatus.SUCCESS;
            user.setLastLoginDate(new Date());
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


    public List<Insurance> getInsurances() {
        return insurances;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return user.equals(account.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    public User getUser() {
        return user;
    }
}



