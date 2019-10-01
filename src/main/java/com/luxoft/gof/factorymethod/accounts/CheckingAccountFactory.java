package com.luxoft.gof.factorymethod.accounts;

/**
 * Created by teacher109 on 8/23/2017.
 */
public class CheckingAccountFactory implements AccountFactory {
    @Override
    public Account create() {
        return new CheckingAccount();
    }
}
