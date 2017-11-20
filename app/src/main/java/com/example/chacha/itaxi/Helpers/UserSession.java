package com.example.chacha.itaxi.Helpers;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by chacha on 07/08/2017.
 */

public class UserSession {
        private  static  final String TAG = UserSession.class.getSimpleName();
        private  static  final String PREF_NAME = "login";
        private  static  final String KEY_IS_LOGGED_IN ="isLoggedIn";
            SharedPreferences prefs;
            SharedPreferences.Editor editor;
            Context context;
   public UserSession(Context context){
       this.context = context;
       prefs = context.getSharedPreferences(PREF_NAME,context.MODE_PRIVATE);
       editor=prefs.edit();
   }

    public void setLoggedIn(boolean isLoggedIn){
        editor.putBoolean(KEY_IS_LOGGED_IN,isLoggedIn);
        editor.apply();

    }
    public boolean isUserLoggedIn(){
        return prefs.getBoolean(KEY_IS_LOGGED_IN,false);
    }
}

