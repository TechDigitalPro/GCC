package com.gcc.arabmoney.utils;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    // All Shared Preferences Keys
    public static final String KEY_LANDING_PAGE = "landing_page";
    public static final String KEY_REGISTERED = "registered";
    public static final String KEY_USERNAME = "username";
    public static final String KEY_PHONE = "phone";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";

    public static final String KEY_URL = "broker_url";
    public static final String KEY_DISABLE_REGISTER = "disable_register";

    // Constructor
    public SessionManager(Context context){
        this._context = context;
        pref = _context.getSharedPreferences(context.getPackageName(), MODE_PRIVATE);
        editor = pref.edit();
        editor.apply();
    }

    public void setLandingPage(String landing_page){
        editor.putString(KEY_LANDING_PAGE, landing_page);
        editor.apply();
    }
    public String getLandingPage() {
        return pref.getString(KEY_LANDING_PAGE, "");
    }

    public void setRegistered(){
        editor.putInt(KEY_REGISTERED, 1);
        editor.apply();
    }
    public int getRegistered() {
        return pref.getInt(KEY_REGISTERED, 0);
    }

    public void setUserName(String username){
        editor.putString(KEY_USERNAME, username);
        editor.apply();
    }
    public String getUserName() {
        return pref.getString(KEY_USERNAME, null);
    }

    public void setPhone(String username){
        editor.putString(KEY_PHONE, username);
        editor.apply();
    }
    public String getPhone() {
        return pref.getString(KEY_PHONE, null);
    }

    public void setEmail(String username){
        editor.putString(KEY_EMAIL, username);
        editor.apply();
    }
    public String getEmail() {
        return pref.getString(KEY_EMAIL, null);
    }

    public void setPassword(String username){
        editor.putString(KEY_PASSWORD, username);
        editor.apply();
    }
    public String getPassword() {
        return pref.getString(KEY_PASSWORD, null);
    }

    public void setUrl(String url){
        editor.putString(KEY_URL, url);
        editor.apply();
    }
    public String getUrl() {
        return pref.getString(KEY_URL, null);
    }

    public void setDisableRegister(boolean value){
        editor.putBoolean(KEY_DISABLE_REGISTER, value);
        editor.apply();
    }
    public boolean getDisableRegister() {
        return pref.getBoolean(KEY_DISABLE_REGISTER, false);
    }
}
