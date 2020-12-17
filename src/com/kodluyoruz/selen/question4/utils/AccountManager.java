package com.kodluyoruz.selen.question4.utils;

import com.kodluyoruz.selen.question4.exception.InvalidAuthenticationException;
import com.kodluyoruz.selen.question4.model.User;
import com.kodluyoruz.selen.question4.model.accounts.Account;
import com.kodluyoruz.selen.question4.model.accounts.EnterpriseAccount;
import com.kodluyoruz.selen.question4.model.accounts.IndividualAccount;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class AccountManager {
    private static TreeSet<Account> accounts = new TreeSet<>();
    static {
        User enterpriseUser = new User();
        enterpriseUser.setEmail("selen.demir");
        enterpriseUser.setPassword("1234");
        enterpriseUser.setAddress(new ArrayList<>());
        enterpriseUser.setAge(21);
        enterpriseUser.setName("Selen");
        enterpriseUser.setSurname("Demir");
        enterpriseUser.setJob("student");

        EnterpriseAccount enterpriseAccount = new EnterpriseAccount(enterpriseUser, new ArrayList<>());

        User individualUser =  new User();
        individualUser.setEmail("demir.bakır");
        individualUser.setPassword("121234");
        individualUser.setAddress(new ArrayList<>());
        individualUser.setAge(11);
        individualUser.setName("demir");
        individualUser.setSurname("bakır");
        individualUser.setJob("student");
        IndividualAccount individualAccount = new IndividualAccount(individualUser, new ArrayList<>());

        accounts.add(enterpriseAccount);
        accounts.add(individualAccount);
    }

    public static Account login(String email, String password){
        for (Iterator<Account> it = accounts.iterator(); it.hasNext(); ) {
            Account account = it.next();
            try{
                account.login(email,password);
                return account;
            }
           catch (InvalidAuthenticationException e){

           }


        }
        return null;

    }

}
