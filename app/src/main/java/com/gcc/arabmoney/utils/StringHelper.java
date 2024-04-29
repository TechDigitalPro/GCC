package com.gcc.arabmoney.utils;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;

public class StringHelper {
    public static String convertNumberToString(double value){
        NumberFormat formatUK = NumberFormat.getInstance(Locale.US);
        formatUK.setGroupingUsed(false);
        //ft.setGroupingUsed(true);
        return formatUK.format(value);
    }
    public static double convertStringToDoubleNumber(String num){
        try{
            NumberFormat ft = NumberFormat.getInstance(Locale.US);
            ft.setGroupingUsed(false);
            return Objects.requireNonNull(ft.parse(num)).doubleValue();
        }catch (Exception e){
            return 0;
        }
    }
    public static boolean isFloat(String val){
        try{
            float checker = Float.parseFloat(val);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public static String getPrice(double price){
        return String.format(Locale.getDefault(),"€ %.2f", price);
    }
}
