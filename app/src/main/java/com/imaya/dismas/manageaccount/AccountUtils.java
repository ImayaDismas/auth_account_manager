package com.imaya.dismas.manageaccount;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

/**
 * Created by root on 2/16/18.
 */

public class AccountUtils {

    public static final String ACCOUNT_TYPE = "com.samugg.example";
    public static final String AUTH_TOKEN_TYPE = "com.samugg.example.aaa";

    public static IServerAuthenticator mServerAuthenticator = new MyServerAuthenticator();

    public static Account getAccount(Context context, String accountName) {
        AccountManager accountManager = AccountManager.get(context);
        Account[] accounts = accountManager.getAccountsByType(ACCOUNT_TYPE);
        for (Account account : accounts) {
            if (account.name.equalsIgnoreCase(accountName)) {
                return account;
            }
        }
        return null;
    }

}
