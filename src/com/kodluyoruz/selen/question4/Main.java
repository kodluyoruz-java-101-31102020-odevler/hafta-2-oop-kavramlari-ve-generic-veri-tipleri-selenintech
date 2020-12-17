package com.kodluyoruz.selen.question4;


import com.kodluyoruz.selen.question4.model.accounts.Account;
import com.kodluyoruz.selen.question4.utils.AccountManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("email address: ");
        String email = scanner.next();
        System.out.println("password: ");
        String password = scanner.next();
        Account account = AccountManager.login(email, password);
        if(account == null){
            System.out.println("User not found!");
            return;
        }
        System.out.println(account.getUser());





    }
}
