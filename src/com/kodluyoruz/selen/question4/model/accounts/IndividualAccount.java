package com.kodluyoruz.selen.question4.model.accounts;

import com.kodluyoruz.selen.question4.model.User;
import com.kodluyoruz.selen.question4.model.insurance.Insurance;

import java.util.List;

public class IndividualAccount extends Account{


    public IndividualAccount(User user, List<Insurance> insurances) {
        super(user, insurances);
    }

    @Override
    void addInsurance(Insurance insurance) {
        getInsurances().add(insurance);
    }


    @Override
    public int compareTo(Account o) {
        return this.hashCode() - o.hashCode();

    }
}
