package com.imaya.dismas.manageaccount;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by root on 2/16/18.
 */

public class AuthPreferences {
    private static final String PREFS_NAME = "auth";
    private static final String KEY_ACCOUNT_NAME = "account_name";
    private static final String KEY_AUTH_TOKEN = "auth_token";

    private SharedPreferences preferences;

    public AuthPreferences(Context context) {
        preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public String getAccountName() {
        return preferences.getString(KEY_ACCOUNT_NAME, null);
    }

    public String getAuthToken() {
        return preferences.getString(KEY_AUTH_TOKEN, null);
    }

    public void setUsername(String accountName) {
        final SharedPreferences.Editor editor = preferences.edit();
        editor.putString(KEY_ACCOUNT_NAME, accountName);
        editor.commit();
    }

    public void setAuthToken(String authToken) {
        final SharedPreferences.Editor editor = preferences.edit();
        editor.putString(KEY_AUTH_TOKEN, authToken);
        editor.commit();
    }
}
