package com.imaya.dismas.manageaccount;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by root on 2/16/18.
 */

public class AuthenticatorService extends Service {

    private static AccountAuthenticator sAccountAuthenticator;

    @Override
    public IBinder onBind(Intent intent) {
        IBinder binder = null;
        if (intent.getAction().equals(android.accounts.AccountManager.ACTION_AUTHENTICATOR_INTENT)) {
            binder = getAuthenticator().getIBinder();
        }
        return binder;
    }

    private AccountAuthenticator getAuthenticator() {
        if (null == AuthenticatorService.sAccountAuthenticator) {
            AuthenticatorService.sAccountAuthenticator = new AccountAuthenticator(this);
        }
        return AuthenticatorService.sAccountAuthenticator;
    }

}