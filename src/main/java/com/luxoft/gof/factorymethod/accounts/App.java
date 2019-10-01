package com.luxoft.gof.factorymethod.accounts;

/**
 * Created by teacher109 on 8/23/2017.
 */
public class App {
    public static void main(String[] args) {
        AccountFactory factory = new CheckingAccountFactory();
        AccountFactory savingfactory1 = SavingAccount::new;
        Account account = factory.create();
        savingfactory1.create();

    }
}

