package com.gcc.arabmoney.activity;

import android.content.Context;
import android.widget.ImageView;

import com.gcc.arabmoney.R;
import com.gcc.arabmoney.utils.CountryOption;
import com.gcc.arabmoney.utils.Utils;

public class Images {
    public static void loadWhiteLogo(ImageView view) {
        if(Utils.COUNTRY == CountryOption.Oman1 || Utils.COUNTRY == CountryOption.Oman2 || Utils.COUNTRY == CountryOption.Oman3) {
            view.setImageResource(R.drawable.oman_white_logo);
        } else if(Utils.COUNTRY == CountryOption.Iraq1 || Utils.COUNTRY == CountryOption.Iraq2 || Utils.COUNTRY == CountryOption.Iraq3) {
            view.setImageResource(R.drawable.iraq_white_logo);
        } else if(Utils.COUNTRY == CountryOption.Libya1 || Utils.COUNTRY == CountryOption.Libya2 || Utils.COUNTRY == CountryOption.Libya3) {
            view.setImageResource(R.drawable.libya_white_logo);
        } else if(Utils.COUNTRY == CountryOption.Saudi1 || Utils.COUNTRY == CountryOption.Saudi2) {
            view.setImageResource(R.drawable.saudi_white_logo);
        } else if(Utils.COUNTRY == CountryOption.Qatar1 || Utils.COUNTRY == CountryOption.Qatar2) {
            view.setImageResource(R.drawable.qatar_white_logo);
        } else if(Utils.COUNTRY == CountryOption.Uae1 || Utils.COUNTRY == CountryOption.Uae2) {
            view.setImageResource(R.drawable.uae_white_logo);
        } else if(Utils.COUNTRY == CountryOption.Kuwait1 || Utils.COUNTRY == CountryOption.Kuwait2) {
            view.setImageResource(R.drawable.kuwait_white_logo);
        } else if(Utils.COUNTRY == CountryOption.Bahrain1 || Utils.COUNTRY == CountryOption.Bahrain2) {
            view.setImageResource(R.drawable.bahrain_white_logo);
        } else {
            view.setImageResource(R.drawable.oman_white_logo);
        }
    }
    public static void loadHeaderBackgroundImage(ImageView view) {
        if(Utils.COUNTRY == CountryOption.Oman4) {
            view.setImageResource(R.drawable.oman_header_background_1);
        } else if(Utils.COUNTRY == CountryOption.Oman41) {
            view.setImageResource(R.drawable.oman_header_background_2);
        } else if(Utils.COUNTRY == CountryOption.Bahrain3) {
            view.setImageResource(R.drawable.bh_header_background_1);
        } else if(Utils.COUNTRY == CountryOption.Bahrain31) {
            view.setImageResource(R.drawable.bh_header_background_2);
        } else if(Utils.COUNTRY == CountryOption.Libya4) {
            view.setImageResource(R.drawable.libya_header_background_1);
        } else if(Utils.COUNTRY == CountryOption.Libya41) {
            view.setImageResource(R.drawable.libya_header_background_2);
        } else if(Utils.COUNTRY == CountryOption.Iraq4) {
            view.setImageResource(R.drawable.iraq_header_background_1);
        } else if(Utils.COUNTRY == CountryOption.Iraq41) {
            view.setImageResource(R.drawable.iraq_header_background_2);
        } else if(Utils.COUNTRY == CountryOption.Saudi3) {
            view.setImageResource(R.drawable.saudi_header_background_1);
        } else if(Utils.COUNTRY == CountryOption.Saudi31) {
            view.setImageResource(R.drawable.saudi_header_background_2);
        } else if(Utils.COUNTRY == CountryOption.Kuwait3) {
            view.setImageResource(R.drawable.kw_header_background_1);
        } else if(Utils.COUNTRY == CountryOption.Kuwait31) {
            view.setImageResource(R.drawable.kw_header_background_2);
        } else if(Utils.COUNTRY == CountryOption.Uae3) {
            view.setImageResource(R.drawable.uae_header_background_1);
        } else if(Utils.COUNTRY == CountryOption.Uae31) {
            view.setImageResource(R.drawable.uae_header_background_2);
        } else if(Utils.COUNTRY == CountryOption.Qatar3) {
            view.setImageResource(R.drawable.qatar_header_background_1);
        } else if(Utils.COUNTRY == CountryOption.Qatar31) {
            view.setImageResource(R.drawable.qatar_header_background_2);
        }
    }
    public static void loadBlackLogo(ImageView view) {
        if(Utils.COUNTRY == CountryOption.Oman1 || Utils.COUNTRY == CountryOption.Oman2
                || Utils.COUNTRY == CountryOption.Oman3 || Utils.COUNTRY == CountryOption.Oman4 || Utils.COUNTRY == CountryOption.Oman41) {
            view.setImageResource(R.drawable.oman_black_logo);
        } else if(Utils.COUNTRY == CountryOption.Iraq1 || Utils.COUNTRY == CountryOption.Iraq2
                || Utils.COUNTRY == CountryOption.Iraq3 || Utils.COUNTRY == CountryOption.Iraq4 || Utils.COUNTRY == CountryOption.Iraq41) {
            view.setImageResource(R.drawable.iraq_black_logo);
        } else if(Utils.COUNTRY == CountryOption.Libya1 || Utils.COUNTRY == CountryOption.Libya2
                || Utils.COUNTRY == CountryOption.Libya3 || Utils.COUNTRY == CountryOption.Libya4 || Utils.COUNTRY == CountryOption.Libya41) {
            view.setImageResource(R.drawable.libya_black_logo);
        } else if(Utils.COUNTRY == CountryOption.Saudi1 || Utils.COUNTRY == CountryOption.Saudi2 || Utils.COUNTRY == CountryOption.Saudi3
                || Utils.COUNTRY == CountryOption.Saudi31) {
            view.setImageResource(R.drawable.saudi_black_logo);
        } else if(Utils.COUNTRY == CountryOption.Qatar1 || Utils.COUNTRY == CountryOption.Qatar2 || Utils.COUNTRY == CountryOption.Qatar3
                || Utils.COUNTRY == CountryOption.Qatar31) {
            view.setImageResource(R.drawable.qatar_black_logo);
        } else if(Utils.COUNTRY == CountryOption.Uae1 || Utils.COUNTRY == CountryOption.Uae2 || Utils.COUNTRY == CountryOption.Uae3
                || Utils.COUNTRY == CountryOption.Uae31) {
            view.setImageResource(R.drawable.uae_black_logo);
        } else if(Utils.COUNTRY == CountryOption.Kuwait1 || Utils.COUNTRY == CountryOption.Kuwait2 || Utils.COUNTRY == CountryOption.Kuwait3
                || Utils.COUNTRY == CountryOption.Kuwait31) {
            view.setImageResource(R.drawable.kuwait_black_logo);
        } else if(Utils.COUNTRY == CountryOption.Bahrain1 || Utils.COUNTRY == CountryOption.Bahrain2 || Utils.COUNTRY == CountryOption.Bahrain3
                || Utils.COUNTRY == CountryOption.Bahrain31) {
            view.setImageResource(R.drawable.bahrain_black_logo);
        } else {
            view.setImageResource(R.drawable.oman_black_logo);
        }
    }
    public static void loadAllFlagLogo(ImageView view) {
        if(Utils.COUNTRY == CountryOption.Oman1 || Utils.COUNTRY == CountryOption.Oman2
                || Utils.COUNTRY == CountryOption.Oman3 || Utils.COUNTRY == CountryOption.Oman4 || Utils.COUNTRY == CountryOption.Oman41) {
            view.setImageResource(R.drawable.oman_all_flag_logo);
        } else if(Utils.COUNTRY == CountryOption.Iraq1 || Utils.COUNTRY == CountryOption.Iraq2
                || Utils.COUNTRY == CountryOption.Iraq3 || Utils.COUNTRY == CountryOption.Iraq4 || Utils.COUNTRY == CountryOption.Iraq41) {
            view.setImageResource(R.drawable.iraq_all_flag_logo);
        } else if(Utils.COUNTRY == CountryOption.Libya1 || Utils.COUNTRY == CountryOption.Libya2
                || Utils.COUNTRY == CountryOption.Libya3 || Utils.COUNTRY == CountryOption.Libya4 || Utils.COUNTRY == CountryOption.Libya41) {
            view.setImageResource(R.drawable.libya_all_flag_logo);
        } else if(Utils.COUNTRY == CountryOption.Saudi1 || Utils.COUNTRY == CountryOption.Saudi2 || Utils.COUNTRY == CountryOption.Saudi3
                || Utils.COUNTRY == CountryOption.Saudi31) {
            view.setImageResource(R.drawable.saudi_all_flag_logo);
        } else if(Utils.COUNTRY == CountryOption.Qatar1 || Utils.COUNTRY == CountryOption.Qatar2 || Utils.COUNTRY == CountryOption.Qatar3
                || Utils.COUNTRY == CountryOption.Qatar31) {
            view.setImageResource(R.drawable.qatar_all_flag_logo);
        } else if(Utils.COUNTRY == CountryOption.Uae1 || Utils.COUNTRY == CountryOption.Uae2 || Utils.COUNTRY == CountryOption.Uae3
                || Utils.COUNTRY == CountryOption.Uae31) {
            view.setImageResource(R.drawable.uae_all_flag_logo);
        } else if(Utils.COUNTRY == CountryOption.Kuwait1 || Utils.COUNTRY == CountryOption.Kuwait2 || Utils.COUNTRY == CountryOption.Kuwait3
                || Utils.COUNTRY == CountryOption.Kuwait31) {
            view.setImageResource(R.drawable.kuwait_all_flag_logo);
        } else if(Utils.COUNTRY == CountryOption.Bahrain1 || Utils.COUNTRY == CountryOption.Bahrain2
                || Utils.COUNTRY == CountryOption.Bahrain3 || Utils.COUNTRY == CountryOption.Bahrain31) {
            view.setImageResource(R.drawable.bahrain_all_flag_logo);
        } else {
            view.setImageResource(R.drawable.oman_all_flag_logo);
        }
    }
    public static void loadGrayFlag(ImageView view) {
        if(Utils.COUNTRY == CountryOption.Oman1 || Utils.COUNTRY == CountryOption.Oman2
                || Utils.COUNTRY == CountryOption.Oman3 || Utils.COUNTRY == CountryOption.Oman4 || Utils.COUNTRY == CountryOption.Oman41) {
            view.setImageResource(R.drawable.oman_gray_flag_logo);
        } else if(Utils.COUNTRY == CountryOption.Iraq1 || Utils.COUNTRY == CountryOption.Iraq2
                || Utils.COUNTRY == CountryOption.Iraq3 || Utils.COUNTRY == CountryOption.Iraq4 || Utils.COUNTRY == CountryOption.Iraq41) {
            view.setImageResource(R.drawable.iraq_gray_flag_logo);
        } else if(Utils.COUNTRY == CountryOption.Libya1 || Utils.COUNTRY == CountryOption.Libya2
                || Utils.COUNTRY == CountryOption.Libya3 || Utils.COUNTRY == CountryOption.Libya4 || Utils.COUNTRY == CountryOption.Libya41) {
            view.setImageResource(R.drawable.libya_gray_flag_logo);
        } else if(Utils.COUNTRY == CountryOption.Saudi1 || Utils.COUNTRY == CountryOption.Saudi2 || Utils.COUNTRY == CountryOption.Saudi3
                || Utils.COUNTRY == CountryOption.Saudi31) {
            view.setImageResource(R.drawable.saudi_gray_flag_logo);
        } else if(Utils.COUNTRY == CountryOption.Qatar1 || Utils.COUNTRY == CountryOption.Qatar2 || Utils.COUNTRY == CountryOption.Qatar3
                || Utils.COUNTRY == CountryOption.Qatar31) {
            view.setImageResource(R.drawable.qatar_gray_flag_logo);
        } else if(Utils.COUNTRY == CountryOption.Uae1 || Utils.COUNTRY == CountryOption.Uae2 || Utils.COUNTRY == CountryOption.Uae3
                || Utils.COUNTRY == CountryOption.Uae31) {
            view.setImageResource(R.drawable.uae_gray_flag_logo);
        } else if(Utils.COUNTRY == CountryOption.Kuwait1 || Utils.COUNTRY == CountryOption.Kuwait2 || Utils.COUNTRY == CountryOption.Kuwait3
                || Utils.COUNTRY == CountryOption.Kuwait31) {
            view.setImageResource(R.drawable.kuwait_gray_flag_logo);
        } else if(Utils.COUNTRY == CountryOption.Bahrain1 || Utils.COUNTRY == CountryOption.Bahrain2
                || Utils.COUNTRY == CountryOption.Bahrain3 || Utils.COUNTRY == CountryOption.Bahrain31) {
            view.setImageResource(R.drawable.bahrain_gray_flag_logo);
        } else {
            view.setImageResource(R.drawable.oman_gray_flag_logo);
        }
    }
}
