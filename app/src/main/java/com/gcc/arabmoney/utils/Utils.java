package com.gcc.arabmoney.utils;

import android.content.Context;
import android.telephony.TelephonyManager;

import com.gcc.arabmoney.model.Campain;

import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonenumber;

public class Utils {
    public static int account_num = 21;
    public static Campain campain = null;
    public static CountryOption COUNTRY;

    public static String getRegionCode(Context context) {
        try{
            TelephonyManager tm = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
            return tm.getNetworkCountryIso();
        }catch (Exception e){
            return "AA";
        }
    }

    public static int getPhoneCountryCode(Context context, String phone){
        try {
            // phone must begin with '+'
            PhoneNumberUtil phoneUtil = PhoneNumberUtil.createInstance(context);
            Phonenumber.PhoneNumber numberProto = phoneUtil.parse(phone, "");
            return numberProto.getCountryCode();

        } catch (Exception e) {
            return 0;
        }
    }
    public static long getPhoneNationalNumber(Context context, String phone){
        try {
            // phone must begin with '+'
            PhoneNumberUtil phoneUtil = PhoneNumberUtil.createInstance(context);
            Phonenumber.PhoneNumber numberProto = phoneUtil.parse(phone, "");
            return numberProto.getNationalNumber();

        } catch (Exception e) {
            return 0;
        }
    }
}
