package com.gcc.arabmoney.activity;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;

import com.gcc.arabmoney.R;
import com.gcc.arabmoney.activity.landingpage_1.Answer;
import com.gcc.arabmoney.activity.landingpage_1.Question;
import com.gcc.arabmoney.utils.CountryOption;
import com.gcc.arabmoney.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Strings {
    public static void setSliderText1(Context context, TextView view) {
        view.setText(context.getString(R.string.slider_text));
        if(Utils.COUNTRY == CountryOption.Oman1) {
            view.setText(context.getString(R.string.slider_text));
        } else if(Utils.COUNTRY == CountryOption.Oman2) {
            view.setText(context.getString(R.string.oman2_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Oman3) {
            view.setText(context.getString(R.string.oman3_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Iraq1) {
            view.setText(context.getString(R.string.iraq1_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Iraq2) {
            view.setText(context.getString(R.string.iraq2_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Iraq3) {
            view.setText(context.getString(R.string.iraq3_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Libya1) {
            view.setText(context.getString(R.string.libya1_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Libya2) {
            view.setText(context.getString(R.string.libya2_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Libya3) {
            view.setText(context.getString(R.string.libya3_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Saudi1) {
            view.setText(context.getString(R.string.saudi1_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Saudi2) {
            view.setText(context.getString(R.string.saudi2_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Qatar1) {
            view.setText(context.getString(R.string.qatar1_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Qatar2) {
            view.setText(context.getString(R.string.qatar2_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Uae1) {
            view.setText(context.getString(R.string.uae1_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Uae2) {
            view.setText(context.getString(R.string.uae2_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Kuwait1) {
            view.setText(context.getString(R.string.kw1_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Kuwait2) {
            view.setText(context.getString(R.string.kw2_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Bahrain1) {
            view.setText(context.getString(R.string.bh1_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Bahrain2) {
            view.setText(context.getString(R.string.bh2_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Oman4) {
            view.setText(context.getString(R.string.oman4_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Oman41) {
            view.setText(context.getString(R.string.oman41_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Libya4) {
            view.setText(context.getString(R.string.libya4_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Libya41) {
            view.setText(context.getString(R.string.libya41_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Bahrain3) {
            view.setText(context.getString(R.string.bh3_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Bahrain31) {
            view.setText(context.getString(R.string.bh31_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Iraq4) {
            view.setText(context.getString(R.string.iraq4_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Iraq41) {
            view.setText(context.getString(R.string.iraq41_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Saudi3) {
            view.setText(context.getString(R.string.saudi3_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Saudi31) {
            view.setText(context.getString(R.string.saudi31_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Kuwait3) {
            view.setText(context.getString(R.string.kw3_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Kuwait31) {
            view.setText(context.getString(R.string.kw31_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Uae3) {
            view.setText(context.getString(R.string.uae3_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Uae31) {
            view.setText(context.getString(R.string.uae31_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Qatar3) {
            view.setText(context.getString(R.string.qatar3_slider_text));
        } else if(Utils.COUNTRY == CountryOption.Qatar31) {
            view.setText(context.getString(R.string.qatar31_slider_text));
        }
    }
    public static void setSliderText2(Context context, TextView view) {
        view.setText(context.getString(R.string.slider_switch_text_2));
        if(Utils.COUNTRY == CountryOption.Oman1) {
            view.setText(context.getString(R.string.slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Oman2) {
            view.setText(context.getString(R.string.oman2_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Oman3) {
            view.setText(context.getString(R.string.oman3_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Iraq1) {
            view.setText(context.getString(R.string.iraq1_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Iraq2) {
            view.setText(context.getString(R.string.iraq2_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Iraq3) {
            view.setText(context.getString(R.string.iraq3_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Libya1) {
            view.setText(context.getString(R.string.libya1_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Libya2) {
            view.setText(context.getString(R.string.libya2_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Libya3) {
            view.setText(context.getString(R.string.libya3_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Saudi1) {
            view.setText(context.getString(R.string.saudi1_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Saudi2) {
            view.setText(context.getString(R.string.saudi2_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Qatar1) {
            view.setText(context.getString(R.string.qatar1_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Qatar2) {
            view.setText(context.getString(R.string.qatar2_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Uae1) {
            view.setText(context.getString(R.string.uae1_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Uae2) {
            view.setText(context.getString(R.string.uae2_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Kuwait1) {
            view.setText(context.getString(R.string.kw1_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Kuwait2) {
            view.setText(context.getString(R.string.kw2_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Bahrain1) {
            view.setText(context.getString(R.string.bh1_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Bahrain2) {
            view.setText(context.getString(R.string.bh2_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Oman4) {
            view.setText(context.getString(R.string.oman4_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Oman41) {
            view.setText(context.getString(R.string.oman41_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Libya4) {
            view.setText(context.getString(R.string.libya4_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Libya41) {
            view.setText(context.getString(R.string.libya41_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Bahrain3) {
            view.setText(context.getString(R.string.bh3_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Bahrain31) {
            view.setText(context.getString(R.string.bh31_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Iraq4) {
            view.setText(context.getString(R.string.iraq4_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Iraq41) {
            view.setText(context.getString(R.string.iraq41_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Saudi3) {
            view.setText(context.getString(R.string.saudi3_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Saudi31) {
            view.setText(context.getString(R.string.saudi31_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Kuwait3) {
            view.setText(context.getString(R.string.kw3_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Kuwait31) {
            view.setText(context.getString(R.string.kw31_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Uae3) {
            view.setText(context.getString(R.string.uae3_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Uae31) {
            view.setText(context.getString(R.string.uae31_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Qatar3) {
            view.setText(context.getString(R.string.qatar3_slider_switch_text_2));
        } else if(Utils.COUNTRY == CountryOption.Qatar31) {
            view.setText(context.getString(R.string.qatar31_slider_switch_text_2));
        }
    }
    public static void setMainText1(Context context, TextView view) {
        view.setText(context.getString(R.string.main_text_1));
        if(Utils.COUNTRY == CountryOption.Oman1) {
            view.setText(context.getString(R.string.main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Oman2) {
            view.setText(context.getString(R.string.oman2_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Oman3) {
            view.setText(context.getString(R.string.oman3_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Iraq1) {
            view.setText(context.getString(R.string.iraq1_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Iraq2) {
            view.setText(context.getString(R.string.iraq2_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Iraq3) {
            view.setText(context.getString(R.string.iraq3_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Libya1) {
            view.setText(context.getString(R.string.libya1_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Libya2) {
            view.setText(context.getString(R.string.libya2_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Libya3) {
            view.setText(context.getString(R.string.libya3_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Saudi1) {
            view.setText(context.getString(R.string.saudi1_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Saudi2) {
            view.setText(context.getString(R.string.saudi2_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Qatar1) {
            view.setText(context.getString(R.string.qatar1_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Qatar2) {
            view.setText(context.getString(R.string.qatar2_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Uae1) {
            view.setText(context.getString(R.string.uae1_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Uae2) {
            view.setText(context.getString(R.string.uae2_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Kuwait1) {
            view.setText(context.getString(R.string.kw1_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Kuwait2) {
            view.setText(context.getString(R.string.kw2_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Bahrain1) {
            view.setText(context.getString(R.string.bh1_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Bahrain2) {
            view.setText(context.getString(R.string.bh2_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Oman4) {
            view.setText(context.getString(R.string.oman4_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Oman41) {
            view.setText(context.getString(R.string.oman41_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Libya4) {
            view.setText(context.getString(R.string.libya4_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Libya41) {
            view.setText(context.getString(R.string.libya41_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Bahrain3) {
            view.setText(context.getString(R.string.bh3_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Bahrain31) {
            view.setText(context.getString(R.string.bh31_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Iraq4) {
            view.setText(context.getString(R.string.iraq4_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Iraq41) {
            view.setText(context.getString(R.string.iraq41_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Saudi3) {
            view.setText(context.getString(R.string.saudi3_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Saudi31) {
            view.setText(context.getString(R.string.saudi31_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Kuwait3) {
            view.setText(context.getString(R.string.kw3_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Kuwait31) {
            view.setText(context.getString(R.string.kw31_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Uae3) {
            view.setText(context.getString(R.string.uae3_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Uae31) {
            view.setText(context.getString(R.string.uae31_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Qatar3) {
            view.setText(context.getString(R.string.qatar3_main_text_1));
        } else if(Utils.COUNTRY == CountryOption.Qatar31) {
            view.setText(context.getString(R.string.qatar31_main_text_1));
        }
    }
    public static void setMainText2(Context context, TextView view) {
        view.setText(context.getString(R.string.main_text_2));
        if(Utils.COUNTRY == CountryOption.Oman1) {
            view.setText(context.getString(R.string.main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Oman2) {
            view.setText(context.getString(R.string.oman2_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Oman3) {
            view.setText(context.getString(R.string.oman3_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Iraq1) {
            view.setText(context.getString(R.string.iraq1_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Iraq2) {
            view.setText(context.getString(R.string.iraq2_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Iraq3) {
            view.setText(context.getString(R.string.iraq3_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Libya1) {
            view.setText(context.getString(R.string.libya1_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Libya2) {
            view.setText(context.getString(R.string.libya2_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Libya3) {
            view.setText(context.getString(R.string.libya3_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Saudi1) {
            view.setText(context.getString(R.string.saudi1_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Saudi2) {
            view.setText(context.getString(R.string.saudi2_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Qatar1) {
            view.setText(context.getString(R.string.qatar1_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Qatar2) {
            view.setText(context.getString(R.string.qatar2_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Uae1) {
            view.setText(context.getString(R.string.uae1_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Uae2) {
            view.setText(context.getString(R.string.uae2_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Kuwait1) {
            view.setText(context.getString(R.string.kw1_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Kuwait2) {
            view.setText(context.getString(R.string.kw2_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Bahrain1) {
            view.setText(context.getString(R.string.bh1_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Bahrain2) {
            view.setText(context.getString(R.string.bh2_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Oman4) {
            view.setText(context.getString(R.string.oman4_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Oman41) {
            view.setText(context.getString(R.string.oman41_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Libya4) {
            view.setText(context.getString(R.string.libya4_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Libya41) {
            view.setText(context.getString(R.string.libya41_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Bahrain3) {
            view.setText(context.getString(R.string.bh3_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Bahrain31) {
            view.setText(context.getString(R.string.bh31_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Iraq4) {
            view.setText(context.getString(R.string.iraq4_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Iraq41) {
            view.setText(context.getString(R.string.iraq41_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Saudi3) {
            view.setText(context.getString(R.string.saudi3_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Saudi31) {
            view.setText(context.getString(R.string.saudi31_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Kuwait3) {
            view.setText(context.getString(R.string.kw3_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Kuwait31) {
            view.setText(context.getString(R.string.kw31_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Uae3) {
            view.setText(context.getString(R.string.uae3_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Uae31) {
            view.setText(context.getString(R.string.uae31_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Qatar3) {
            view.setText(context.getString(R.string.qatar3_main_text_2));
        } else if(Utils.COUNTRY == CountryOption.Qatar31) {
            view.setText(context.getString(R.string.qatar31_main_text_2));
        }
    }
    public static void setAccountText(Context context, TextView view) {
        view.setText(context.getString(R.string.account_text));
    }
    public static void setQuestionBtnText(Context context, TextView view) {
        view.setText(context.getString(R.string.question_btn_text));
        if(Utils.COUNTRY == CountryOption.Oman1) {
            view.setText(context.getString(R.string.question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Oman2) {
            view.setText(context.getString(R.string.oman2_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Oman3) {
            view.setText(context.getString(R.string.oman3_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Iraq1) {
            view.setText(context.getString(R.string.iraq1_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Iraq2) {
            view.setText(context.getString(R.string.iraq2_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Iraq3) {
            view.setText(context.getString(R.string.iraq3_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Libya1) {
            view.setText(context.getString(R.string.libya1_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Libya2) {
            view.setText(context.getString(R.string.libya2_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Libya3) {
            view.setText(context.getString(R.string.libya3_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Saudi1) {
            view.setText(context.getString(R.string.saudi1_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Saudi2) {
            view.setText(context.getString(R.string.saudi2_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Qatar1) {
            view.setText(context.getString(R.string.qatar1_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Qatar2) {
            view.setText(context.getString(R.string.qatar2_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Uae1) {
            view.setText(context.getString(R.string.uae1_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Uae2) {
            view.setText(context.getString(R.string.uae2_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Kuwait1) {
            view.setText(context.getString(R.string.kw1_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Kuwait2) {
            view.setText(context.getString(R.string.kw2_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Bahrain1) {
            view.setText(context.getString(R.string.bh1_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Bahrain2) {
            view.setText(context.getString(R.string.bh2_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Oman4) {
            view.setText(context.getString(R.string.oman4_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Oman41) {
            view.setText(context.getString(R.string.oman41_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Libya4) {
            view.setText(context.getString(R.string.libya4_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Libya41) {
            view.setText(context.getString(R.string.libya41_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Bahrain3) {
            view.setText(context.getString(R.string.bh3_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Bahrain31) {
            view.setText(context.getString(R.string.bh31_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Iraq4) {
            view.setText(context.getString(R.string.iraq4_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Iraq41) {
            view.setText(context.getString(R.string.iraq41_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Saudi3) {
            view.setText(context.getString(R.string.saudi3_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Saudi31) {
            view.setText(context.getString(R.string.saudi31_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Kuwait3) {
            view.setText(context.getString(R.string.kw3_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Kuwait31) {
            view.setText(context.getString(R.string.kw31_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Uae3) {
            view.setText(context.getString(R.string.uae3_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Uae31) {
            view.setText(context.getString(R.string.uae31_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Qatar3) {
            view.setText(context.getString(R.string.qatar3_question_btn_text));
        } else if(Utils.COUNTRY == CountryOption.Qatar31) {
            view.setText(context.getString(R.string.qatar31_question_btn_text));
        }
    }
    public static void setLoadMoreText(Context context, TextView view) {
        view.setText(context.getString(R.string.load_more));
    }
    public static void setRegisterTitleText(Context context, TextView view) {
        view.setText(context.getString(R.string.register_title));
    }
    public static void setRegisterHolder1(Context context, TextView view) {
        view.setHint(context.getString(R.string.register_holder_1));
    }
    public static void setRegisterHolder2(Context context, EditText view) {
        view.setHint(context.getString(R.string.register_holder_2));
    }
    public static void setMessageHint(Context context, EditText view) {
        view.setHint(context.getString(R.string.message));
    }
    public static void setSendText(Context context, TextView view) {
        view.setText(context.getString(R.string.send));
    }
    public static void setRegisterBtnText(Context context, TextView view) {
        view.setText(context.getString(R.string.register_btn_text));
    }
    private static Answer BA(String answer) {
        return new Answer(answer);
    }
    private static Answer BA(String answer, boolean bold) {
        return new Answer(answer, bold);
    }
    private static String getString(Context context, int id) {
        return context.getString(id);
    }
    public static List<Question> getQuestionList(Context context) {
        List<Question> question_list = new ArrayList<>();
        if(Utils.COUNTRY == CountryOption.Oman1) {
            question_list.add(new Question(context.getString(R.string.question_1), BA(getString(context, R.string.answer_11)),
                    BA(getString(context, R.string.answer_12))));
            question_list.add(new Question(context.getString(R.string.question_2), BA(getString(context, R.string.answer_21)),
                    BA(getString(context, R.string.answer_22))));
            question_list.add(new Question(context.getString(R.string.question_3), BA(getString(context, R.string.answer_31)),
                    BA(getString(context, R.string.answer_32))));
            question_list.add(new Question(context.getString(R.string.question_4), BA(getString(context, R.string.answer_41)),
                    BA(getString(context, R.string.answer_42))));

        } else if(Utils.COUNTRY == CountryOption.Oman2) {
            question_list.add(new Question(context.getString(R.string.oman2_question_1), BA(getString(context, R.string.oman2_answer_11)),
                    BA(getString(context, R.string.oman2_answer_12))));
            question_list.add(new Question(context.getString(R.string.oman2_question_2), BA(getString(context, R.string.oman2_answer_21)),
                    BA(getString(context, R.string.oman2_answer_22))));
            question_list.add(new Question(context.getString(R.string.oman2_question_3), BA(getString(context, R.string.oman2_answer_31)),
                    BA(getString(context, R.string.oman2_answer_32))));
            question_list.add(new Question(context.getString(R.string.oman2_question_4), BA(getString(context, R.string.oman2_answer_41)),
                    BA(getString(context, R.string.oman2_answer_42))));
            question_list.add(new Question(context.getString(R.string.oman2_question_5), BA(getString(context, R.string.oman2_answer_51)),
                    BA(getString(context, R.string.oman2_answer_52))));
            question_list.add(new Question(context.getString(R.string.oman2_question_6), BA(getString(context, R.string.oman2_answer_61)),
                    BA(getString(context, R.string.oman2_answer_62))));
        }  else if(Utils.COUNTRY == CountryOption.Oman3) {
            question_list.add(new Question(context.getString(R.string.oman3_question_1), BA(getString(context, R.string.oman3_answer_11), true),
                    BA(getString(context, R.string.oman3_answer_12), true), BA(getString(context, R.string.oman3_answer_13)),
                            BA(getString(context, R.string.oman3_answer_14))));
            question_list.add(new Question(context.getString(R.string.oman3_question_2), BA(getString(context, R.string.oman3_answer_21)),
                    BA(getString(context, R.string.oman3_answer_22)), BA(getString(context, R.string.oman3_answer_23)),
                            BA(getString(context, R.string.oman3_answer_24)), BA(getString(context, R.string.oman3_answer_25))));
            question_list.add(new Question(context.getString(R.string.oman3_question_3), BA(getString(context, R.string.oman3_answer_31)),
                    BA(getString(context, R.string.oman3_answer_32)), BA(getString(context, R.string.oman3_answer_33)),
                            BA(getString(context, R.string.oman3_answer_34))));
            question_list.add(new Question(context.getString(R.string.oman3_question_4), BA(getString(context, R.string.oman3_answer_41)),
                    BA(getString(context, R.string.oman3_answer_42))));
            question_list.add(new Question(context.getString(R.string.oman3_question_5), BA(getString(context, R.string.oman3_answer_51)),
                    BA(getString(context, R.string.oman3_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.oman3_question_6), BA(getString(context, R.string.oman3_answer_61)),
                    BA(getString(context, R.string.oman3_answer_62))));
            question_list.add(new Question(context.getString(R.string.oman3_question_7), BA(getString(context, R.string.oman3_answer_71)),
                    BA(getString(context, R.string.oman3_answer_72), true)));

        } else if(Utils.COUNTRY == CountryOption.Oman4) {
            question_list.add(new Question(context.getString(R.string.oman4_question_1), BA(getString(context, R.string.oman4_answer_11), true),
                    BA(getString(context, R.string.oman4_answer_12), true), BA(getString(context, R.string.oman4_answer_13)),
                            BA(getString(context, R.string.oman4_answer_14))));
            question_list.add(new Question(context.getString(R.string.oman4_question_2), BA(getString(context, R.string.oman4_answer_21)),
                    BA(getString(context, R.string.oman4_answer_22)), BA(getString(context, R.string.oman4_answer_23)),
                            BA(getString(context, R.string.oman4_answer_24)), BA(getString(context, R.string.oman4_answer_25))));
            question_list.add(new Question(context.getString(R.string.oman4_question_3), BA(getString(context, R.string.oman4_answer_31)),
                    BA(getString(context, R.string.oman4_answer_32)), BA(getString(context, R.string.oman4_answer_33)),
                            BA(getString(context, R.string.oman4_answer_34))));
            question_list.add(new Question(context.getString(R.string.oman4_question_4), BA(getString(context, R.string.oman4_answer_41)),
                    BA(getString(context, R.string.oman4_answer_42))));
            question_list.add(new Question(context.getString(R.string.oman4_question_5), BA(getString(context, R.string.oman4_answer_51)),
                    BA(getString(context, R.string.oman4_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.oman4_question_6), BA(getString(context, R.string.oman4_answer_61)),
                    BA(getString(context, R.string.oman4_answer_62))));
            question_list.add(new Question(context.getString(R.string.oman4_question_7), BA(getString(context, R.string.oman4_answer_71)),
                    BA(getString(context, R.string.oman4_answer_72), true)));
        } else if(Utils.COUNTRY == CountryOption.Oman41) {
            question_list.add(new Question(context.getString(R.string.oman41_question_1), BA(getString(context, R.string.oman41_answer_11), true),
                    BA(getString(context, R.string.oman41_answer_12), true), BA(getString(context, R.string.oman41_answer_13)),
                    BA(getString(context, R.string.oman41_answer_14))));
            question_list.add(new Question(context.getString(R.string.oman41_question_2), BA(getString(context, R.string.oman41_answer_21)),
                    BA(getString(context, R.string.oman41_answer_22)), BA(getString(context, R.string.oman41_answer_23)),
                    BA(getString(context, R.string.oman41_answer_24)), BA(getString(context, R.string.oman41_answer_25))));
            question_list.add(new Question(context.getString(R.string.oman41_question_3), BA(getString(context, R.string.oman41_answer_31)),
                    BA(getString(context, R.string.oman41_answer_32)), BA(getString(context, R.string.oman41_answer_33)),
                    BA(getString(context, R.string.oman41_answer_34))));
            question_list.add(new Question(context.getString(R.string.oman41_question_4), BA(getString(context, R.string.oman41_answer_41)),
                    BA(getString(context, R.string.oman41_answer_42))));
            question_list.add(new Question(context.getString(R.string.oman41_question_5), BA(getString(context, R.string.oman41_answer_51)),
                    BA(getString(context, R.string.oman41_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.oman41_question_6), BA(getString(context, R.string.oman41_answer_61)),
                    BA(getString(context, R.string.oman41_answer_62))));
            question_list.add(new Question(context.getString(R.string.oman41_question_7), BA(getString(context, R.string.oman41_answer_71)),
                    BA(getString(context, R.string.oman41_answer_72), true)));

        } else if(Utils.COUNTRY == CountryOption.Iraq1) {
            question_list.add(new Question(context.getString(R.string.iraq1_question_1), BA(getString(context, R.string.iraq1_answer_11)),
                    BA(getString(context, R.string.iraq1_answer_12))));
            question_list.add(new Question(context.getString(R.string.iraq1_question_2),
                    BA(getString(context, R.string.iraq1_answer_21)), BA(getString(context, R.string.iraq1_answer_22))));
            question_list.add(new Question(context.getString(R.string.iraq1_question_3), BA(getString(context, R.string.iraq1_answer_31)),
                    BA(getString(context, R.string.iraq1_answer_32))));
            question_list.add(new Question(context.getString(R.string.iraq1_question_4), BA(getString(context, R.string.iraq1_answer_41)),
                    BA(getString(context, R.string.iraq1_answer_42))));

        } else if(Utils.COUNTRY == CountryOption.Iraq2) {
            question_list.add(new Question(context.getString(R.string.iraq2_question_1), BA(getString(context, R.string.iraq2_answer_11)),
                    BA(getString(context, R.string.iraq2_answer_12))));
            question_list.add(new Question(context.getString(R.string.iraq2_question_2), BA(getString(context, R.string.iraq2_answer_21)),
                    BA(getString(context, R.string.iraq2_answer_22))));
            question_list.add(new Question(context.getString(R.string.iraq2_question_3), BA(getString(context, R.string.iraq2_answer_31)),
                    BA(getString(context, R.string.iraq2_answer_32))));
            question_list.add(new Question(context.getString(R.string.iraq2_question_4), BA(getString(context, R.string.iraq2_answer_41)),
                    BA(context.getString(R.string.iraq2_answer_42))));
            question_list.add(new Question(context.getString(R.string.iraq2_question_5), BA(getString(context, R.string.iraq2_answer_51)),
                    BA(getString(context, R.string.iraq2_answer_52))));
            question_list.add(new Question(context.getString(R.string.iraq2_question_6), BA(getString(context, R.string.iraq2_answer_61)),
                    BA(getString(context, R.string.iraq2_answer_62))));

        } else if(Utils.COUNTRY == CountryOption.Iraq3) {
            question_list.add(new Question(context.getString(R.string.iraq3_question_1), BA(getString(context, R.string.iraq3_answer_11)),
                    BA(context.getString(R.string.iraq3_answer_12), true)));
            question_list.add(new Question(context.getString(R.string.iraq3_question_2),
                    BA(context.getString(R.string.iraq3_answer_21)), BA(context.getString(R.string.iraq3_answer_22))));
            question_list.add(new Question(context.getString(R.string.iraq3_question_3), BA(context.getString(R.string.iraq3_answer_31)),
                    BA(context.getString(R.string.iraq3_answer_32))));
            question_list.add(new Question(context.getString(R.string.iraq3_question_4), BA(context.getString(R.string.iraq3_answer_41)),
                    BA(context.getString(R.string.iraq3_answer_42), true)));
            question_list.add(new Question(context.getString(R.string.iraq3_question_5), BA(context.getString(R.string.iraq3_answer_51)),
                    BA(context.getString(R.string.iraq3_answer_52))));
            question_list.add(new Question(context.getString(R.string.iraq3_question_6), BA(context.getString(R.string.iraq3_answer_61)),
                    BA(context.getString(R.string.iraq3_answer_62))));
            question_list.add(new Question(context.getString(R.string.iraq3_question_7), BA(context.getString(R.string.iraq3_answer_71)),
                    BA(context.getString(R.string.iraq3_answer_72))));
            question_list.add(new Question(context.getString(R.string.iraq3_question_8), BA(context.getString(R.string.iraq3_answer_81)),
                    BA(context.getString(R.string.iraq3_answer_82))));

        }  else if(Utils.COUNTRY == CountryOption.Iraq4) {
            question_list.add(new Question(context.getString(R.string.iraq4_question_1), BA(context.getString(R.string.iraq4_answer_11), true),
                    BA(context.getString(R.string.iraq4_answer_12), true), BA(context.getString(R.string.iraq4_answer_13)),
                            BA(context.getString(R.string.iraq4_answer_14))));
            question_list.add(new Question(context.getString(R.string.iraq4_question_2), BA(context.getString(R.string.iraq4_answer_21)),
                    BA(context.getString(R.string.iraq4_answer_22)), BA(context.getString(R.string.iraq4_answer_23)),
                            BA(context.getString(R.string.iraq4_answer_24)), BA(context.getString(R.string.iraq4_answer_25))));
            question_list.add(new Question(context.getString(R.string.iraq4_question_3), BA(context.getString(R.string.iraq4_answer_31)),
                    BA(context.getString(R.string.iraq4_answer_32)), BA(context.getString(R.string.iraq4_answer_33)),
                            BA(context.getString(R.string.iraq4_answer_34))));
            question_list.add(new Question(context.getString(R.string.iraq4_question_4), BA(context.getString(R.string.iraq4_answer_41)),
                    BA(context.getString(R.string.iraq4_answer_42)), BA(context.getString(R.string.iraq4_answer_43)),
                            BA(context.getString(R.string.iraq4_answer_44))));
            question_list.add(new Question(context.getString(R.string.iraq4_question_5), BA(context.getString(R.string.iraq4_answer_51)),
                    BA(context.getString(R.string.iraq4_answer_52)), BA(context.getString(R.string.iraq4_answer_53)),
                            BA(context.getString(R.string.iraq4_answer_54))));
            question_list.add(new Question(context.getString(R.string.iraq4_question_6), BA(context.getString(R.string.iraq4_answer_61)),
                    BA(context.getString(R.string.iraq4_answer_62))));
            question_list.add(new Question(context.getString(R.string.iraq4_question_7), BA(context.getString(R.string.iraq4_answer_71)),
                    BA(context.getString(R.string.iraq4_answer_72)), BA(context.getString(R.string.iraq4_answer_73)),
                            BA(context.getString(R.string.iraq4_answer_74))));
            question_list.add(new Question(context.getString(R.string.iraq4_question_8), BA(context.getString(R.string.iraq4_answer_81)),
                    BA(context.getString(R.string.iraq4_answer_82), true)));
            question_list.add(new Question(context.getString(R.string.iraq4_question_9), BA(context.getString(R.string.iraq4_answer_91)),
                    BA(context.getString(R.string.iraq4_answer_92)), BA(context.getString(R.string.iraq4_answer_93)),
                            BA(context.getString(R.string.iraq4_answer_94))));
            question_list.add(new Question(context.getString(R.string.iraq4_question_10), BA(context.getString(R.string.iraq4_answer_101)),
                    BA(context.getString(R.string.iraq4_answer_102))));
            question_list.add(new Question(context.getString(R.string.iraq4_question_11), BA(context.getString(R.string.iraq4_answer_111)),
                    BA(context.getString(R.string.iraq4_answer_112))));
            question_list.add(new Question(context.getString(R.string.iraq4_question_12), BA(context.getString(R.string.iraq4_answer_121)),
                    BA(context.getString(R.string.iraq4_answer_122), true)));

        } else if(Utils.COUNTRY == CountryOption.Iraq41) {
            question_list.add(new Question(context.getString(R.string.iraq41_question_1), BA(context.getString(R.string.iraq41_answer_11), true),
                    BA(context.getString(R.string.iraq41_answer_12), true), BA(context.getString(R.string.iraq41_answer_13)),
                            BA(context.getString(R.string.iraq41_answer_14))));
            question_list.add(new Question(context.getString(R.string.iraq41_question_2), BA(context.getString(R.string.iraq41_answer_21)),
                    BA(context.getString(R.string.iraq41_answer_22)), BA(context.getString(R.string.iraq41_answer_23)),
                    BA(context.getString(R.string.iraq41_answer_24)),
                    BA(context.getString(R.string.iraq41_answer_25))));
            question_list.add(new Question(context.getString(R.string.iraq41_question_3), BA(context.getString(R.string.iraq41_answer_31)),
                    BA(context.getString(R.string.iraq41_answer_32)), BA(context.getString(R.string.iraq41_answer_33)),
                            BA(context.getString(R.string.iraq41_answer_34))));
            question_list.add(new Question(context.getString(R.string.iraq41_question_4), BA(context.getString(R.string.iraq41_answer_41)),
                    BA(context.getString(R.string.iraq41_answer_42)), BA(context.getString(R.string.iraq41_answer_43)),
                            BA(context.getString(R.string.iraq41_answer_44))));
            question_list.add(new Question(context.getString(R.string.iraq41_question_5), BA(context.getString(R.string.iraq41_answer_51)),
                    BA(context.getString(R.string.iraq41_answer_52)), BA(context.getString(R.string.iraq41_answer_53)),
                            BA(context.getString(R.string.iraq41_answer_54))));
            question_list.add(new Question(context.getString(R.string.iraq41_question_6), BA(context.getString(R.string.iraq41_answer_61)),
                    BA(context.getString(R.string.iraq41_answer_62))));
            question_list.add(new Question(context.getString(R.string.iraq41_question_7), BA(context.getString(R.string.iraq41_answer_71)),
                    BA(context.getString(R.string.iraq41_answer_72)), BA(context.getString(R.string.iraq41_answer_73)),
                            BA(context.getString(R.string.iraq41_answer_74))));
            question_list.add(new Question(context.getString(R.string.iraq41_question_8), BA(context.getString(R.string.iraq41_answer_81)),
                    BA(context.getString(R.string.iraq41_answer_82), true)));
            question_list.add(new Question(context.getString(R.string.iraq41_question_9), BA(context.getString(R.string.iraq41_answer_91)),
                    BA(context.getString(R.string.iraq41_answer_92)), BA(context.getString(R.string.iraq41_answer_93)),
                            BA(context.getString(R.string.iraq41_answer_94))));
            question_list.add(new Question(context.getString(R.string.iraq41_question_10), BA(context.getString(R.string.iraq41_answer_101)),
                    BA(context.getString(R.string.iraq41_answer_102))));
            question_list.add(new Question(context.getString(R.string.iraq41_question_11), BA(context.getString(R.string.iraq41_answer_111)),
                    BA(context.getString(R.string.iraq41_answer_112))));
            question_list.add(new Question(context.getString(R.string.iraq41_question_12), BA(context.getString(R.string.iraq41_answer_121)),
                    BA(context.getString(R.string.iraq41_answer_122), true)));

        } else if(Utils.COUNTRY == CountryOption.Libya1) {
            question_list.add(new Question(context.getString(R.string.libya1_question_1), BA(context.getString(R.string.libya1_answer_11)),
                    BA(context.getString(R.string.libya1_answer_12))));
            question_list.add(new Question(context.getString(R.string.libya1_question_2), BA(context.getString(R.string.libya1_answer_21)),
                    BA(context.getString(R.string.libya1_answer_22))));
            question_list.add(new Question(context.getString(R.string.libya1_question_3),
                    BA(context.getString(R.string.libya1_answer_31)),
                    BA(context.getString(R.string.libya1_answer_32))));
            question_list.add(new Question(context.getString(R.string.libya1_question_4), BA(context.getString(R.string.libya1_answer_41)),
                    BA(context.getString(R.string.libya1_answer_42))));

        } else if(Utils.COUNTRY == CountryOption.Libya2) {
            question_list.add(new Question(context.getString(R.string.libya2_question_1), BA(context.getString(R.string.libya2_answer_11)),
                    BA(context.getString(R.string.libya2_answer_12))));
            question_list.add(new Question(context.getString(R.string.libya2_question_2),
                    BA(context.getString(R.string.libya2_answer_21)), BA(context.getString(R.string.libya2_answer_22))));
            question_list.add(new Question(context.getString(R.string.libya2_question_3), BA(context.getString(R.string.libya2_answer_31)),
                    BA(context.getString(R.string.libya2_answer_32))));
            question_list.add(new Question(context.getString(R.string.libya2_question_4), BA(context.getString(R.string.libya2_answer_41)),
                    BA(context.getString(R.string.libya2_answer_42))));
            question_list.add(new Question(context.getString(R.string.libya2_question_5), BA(context.getString(R.string.libya2_answer_51)),
                    BA(context.getString(R.string.libya2_answer_52))));
            question_list.add(new Question(context.getString(R.string.libya2_question_6), BA(context.getString(R.string.libya2_answer_61)),
                    BA(context.getString(R.string.libya2_answer_62))));

        } else if(Utils.COUNTRY == CountryOption.Libya3) {
            question_list.add(new Question(context.getString(R.string.libya3_question_1), BA(context.getString(R.string.libya3_answer_11)),
                    BA(context.getString(R.string.libya3_answer_12), true)));
            question_list.add(new Question(context.getString(R.string.libya3_question_2), BA(context.getString(R.string.libya3_answer_21)),
                    BA(context.getString(R.string.libya3_answer_22))));
            question_list.add(new Question(context.getString(R.string.libya3_question_3), BA(context.getString(R.string.libya3_answer_31)),
                    BA(context.getString(R.string.libya3_answer_32))));
            question_list.add(new Question(context.getString(R.string.libya3_question_4), BA(context.getString(R.string.libya3_answer_41)),
                    BA(context.getString(R.string.libya3_answer_42), true)));
            question_list.add(new Question(context.getString(R.string.libya3_question_5), BA(context.getString(R.string.libya3_answer_51)),
                    BA(context.getString(R.string.libya3_answer_52))));
            question_list.add(new Question(context.getString(R.string.libya3_question_6), BA(context.getString(R.string.libya3_answer_61)),
                    BA(context.getString(R.string.libya3_answer_62))));
            question_list.add(new Question(context.getString(R.string.libya3_question_7), BA(context.getString(R.string.libya3_answer_71)),
                    BA(context.getString(R.string.libya3_answer_72))));
            question_list.add(new Question(context.getString(R.string.libya3_question_8), BA(context.getString(R.string.libya3_answer_81)),
                    BA(context.getString(R.string.libya3_answer_82))));

        } else if(Utils.COUNTRY == CountryOption.Libya4) {
            question_list.add(new Question(context.getString(R.string.libya4_question_1), BA(context.getString(R.string.libya4_answer_11), true),
                    BA(context.getString(R.string.libya4_answer_12), true), BA(context.getString(R.string.libya4_answer_13)),
                    BA(context.getString(R.string.libya4_answer_14))));
            question_list.add(new Question(context.getString(R.string.libya4_question_2), BA(context.getString(R.string.libya4_answer_21)),
                    BA(context.getString(R.string.libya4_answer_22)), BA(context.getString(R.string.libya4_answer_23)),
                    BA(context.getString(R.string.libya4_answer_24)),
                    BA(context.getString(R.string.libya4_answer_25))));
            question_list.add(new Question(context.getString(R.string.libya4_question_3), BA(context.getString(R.string.libya4_answer_31)),
                    BA(context.getString(R.string.libya4_answer_32)), BA(context.getString(R.string.libya4_answer_33)),
                    BA(context.getString(R.string.libya4_answer_34))));
            question_list.add(new Question(context.getString(R.string.libya4_question_4), BA(context.getString(R.string.libya4_answer_41)),
                    BA(context.getString(R.string.libya4_answer_42)), BA(context.getString(R.string.libya4_answer_43)),
                    BA(context.getString(R.string.libya4_answer_44))));
            question_list.add(new Question(context.getString(R.string.libya4_question_5), BA(context.getString(R.string.libya4_answer_51)),
                    BA(context.getString(R.string.libya4_answer_52)), BA(context.getString(R.string.libya4_answer_53)),
                    BA(context.getString(R.string.libya4_answer_54))));
            question_list.add(new Question(context.getString(R.string.libya4_question_6), BA(context.getString(R.string.libya4_answer_61)),
                    BA(context.getString(R.string.libya4_answer_62))));
            question_list.add(new Question(context.getString(R.string.libya4_question_7), BA(context.getString(R.string.libya4_answer_71)),
                    BA(context.getString(R.string.libya4_answer_72)), BA(context.getString(R.string.libya4_answer_73)),
                    BA(context.getString(R.string.libya4_answer_74))));
            question_list.add(new Question(context.getString(R.string.libya4_question_8), BA(context.getString(R.string.libya4_answer_81)),
                    BA(context.getString(R.string.libya4_answer_82), true)));
            question_list.add(new Question(context.getString(R.string.libya4_question_9), BA(context.getString(R.string.libya4_answer_91)),
                    BA(context.getString(R.string.libya4_answer_92)), BA(context.getString(R.string.libya4_answer_93)),
                            BA(context.getString(R.string.libya4_answer_94))));
            question_list.add(new Question(context.getString(R.string.libya4_question_10), BA(context.getString(R.string.libya4_answer_101)),
                    BA(context.getString(R.string.libya4_answer_102))));
            question_list.add(new Question(context.getString(R.string.libya4_question_11), BA(context.getString(R.string.libya4_answer_111)),
                    BA(context.getString(R.string.libya4_answer_112))));

        } else if(Utils.COUNTRY == CountryOption.Libya41) {
            question_list.add(new Question(context.getString(R.string.libya41_question_1), BA(context.getString(R.string.libya41_answer_11), true),
                    BA(context.getString(R.string.libya41_answer_12), true), BA(context.getString(R.string.libya41_answer_13)),
                            BA(context.getString(R.string.libya41_answer_14))));
            question_list.add(new Question(context.getString(R.string.libya41_question_2), BA(context.getString(R.string.libya41_answer_21)),
                    BA(context.getString(R.string.libya41_answer_22)), BA(context.getString(R.string.libya41_answer_23)),
                    BA(context.getString(R.string.libya41_answer_24)),
                    BA(context.getString(R.string.libya41_answer_25))));
            question_list.add(new Question(context.getString(R.string.libya41_question_3), BA(context.getString(R.string.libya41_answer_31)),
                    BA(context.getString(R.string.libya41_answer_32)), BA(context.getString(R.string.libya41_answer_33)),
                    BA(context.getString(R.string.libya41_answer_34))));
            question_list.add(new Question(context.getString(R.string.libya41_question_4), BA(context.getString(R.string.libya41_answer_41)),
                    BA(context.getString(R.string.libya41_answer_42)), BA(context.getString(R.string.libya41_answer_43)),
                    BA(context.getString(R.string.libya41_answer_44))));
            question_list.add(new Question(context.getString(R.string.libya41_question_5), BA(context.getString(R.string.libya41_answer_51)),
                    BA(context.getString(R.string.libya41_answer_52)), BA(context.getString(R.string.libya41_answer_53)),
                    BA( context.getString(R.string.libya41_answer_54))));
            question_list.add(new Question(context.getString(R.string.libya41_question_6), BA(context.getString(R.string.libya41_answer_61)),
                    BA(context.getString(R.string.libya41_answer_62))));
            question_list.add(new Question(context.getString(R.string.libya41_question_7), BA(context.getString(R.string.libya41_answer_71)),
                    BA(context.getString(R.string.libya41_answer_72)), BA(context.getString(R.string.libya41_answer_73)),
                    BA(context.getString(R.string.libya41_answer_74))));
            question_list.add(new Question(context.getString(R.string.libya41_question_8), BA(context.getString(R.string.libya41_answer_81)),
                    BA(context.getString(R.string.libya41_answer_82), true)));
            question_list.add(new Question(context.getString(R.string.libya41_question_9), BA(context.getString(R.string.libya41_answer_91)),
                    BA(context.getString(R.string.libya41_answer_92)), BA(context.getString(R.string.libya41_answer_93)),
                    BA(context.getString(R.string.libya41_answer_94))));
            question_list.add(new Question(context.getString(R.string.libya41_question_10), BA(context.getString(R.string.libya41_answer_101)),
                    BA(context.getString(R.string.libya41_answer_102))));
            question_list.add(new Question(context.getString(R.string.libya41_question_11), BA(context.getString(R.string.libya41_answer_111)),
                    BA(context.getString(R.string.libya41_answer_112))));

        } else if(Utils.COUNTRY == CountryOption.Saudi1) {
            question_list.add(new Question(context.getString(R.string.saudi1_question_1), BA(context.getString(R.string.saudi1_answer_11)),
                    BA(context.getString(R.string.saudi1_answer_12))));
            question_list.add(new Question(context.getString(R.string.saudi1_question_2), BA(context.getString(R.string.saudi1_answer_21)),
                    BA(context.getString(R.string.saudi1_answer_22))));
            question_list.add(new Question(context.getString(R.string.saudi1_question_3), BA(context.getString(R.string.saudi1_answer_31)),
                    BA(context.getString(R.string.saudi1_answer_32))));
            question_list.add(new Question(context.getString(R.string.saudi1_question_4), BA(context.getString(R.string.saudi1_answer_41)),
                    BA(context.getString(R.string.saudi1_answer_42))));

        } else if(Utils.COUNTRY == CountryOption.Saudi2) {
            question_list.add(new Question(context.getString(R.string.saudi2_question_1), BA(context.getString(R.string.saudi2_answer_11), true),
                    BA(context.getString(R.string.saudi2_answer_12), true), BA(context.getString(R.string.saudi2_answer_13)),
                            BA(context.getString(R.string.saudi2_answer_14))));
            question_list.add(new Question(context.getString(R.string.saudi2_question_2), BA(context.getString(R.string.saudi2_answer_21)),
                    BA(context.getString(R.string.saudi2_answer_22)), BA(context.getString(R.string.saudi2_answer_23)),
                            BA(context.getString(R.string.saudi2_answer_24)), BA(context.getString(R.string.saudi2_answer_25))));
            question_list.add(new Question(context.getString(R.string.saudi2_question_3), BA(context.getString(R.string.saudi2_answer_31)),
                    BA(context.getString(R.string.saudi2_answer_32)), BA(context.getString(R.string.saudi2_answer_33)),
                            BA(context.getString(R.string.saudi2_answer_34))));
            question_list.add(new Question(context.getString(R.string.saudi2_question_4), BA(context.getString(R.string.saudi2_answer_41)),
                    BA(context.getString(R.string.saudi2_answer_42))));
            question_list.add(new Question(context.getString(R.string.saudi2_question_5), BA(context.getString(R.string.saudi2_answer_51)),
                    BA(context.getString(R.string.saudi2_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.saudi2_question_6), BA(context.getString(R.string.saudi2_answer_61)),
                    BA(context.getString(R.string.saudi2_answer_62))));
            question_list.add(new Question(context.getString(R.string.saudi2_question_7), BA(context.getString(R.string.saudi2_answer_71)),
                    BA(context.getString(R.string.saudi2_answer_72), true)));

        }  else if(Utils.COUNTRY == CountryOption.Saudi3) {
            question_list.add(new Question(context.getString(R.string.saudi3_question_1), BA(context.getString(R.string.saudi3_answer_11), true),
                    BA(context.getString(R.string.saudi3_answer_12), true), BA(context.getString(R.string.saudi3_answer_13)),
                            BA(context.getString(R.string.saudi3_answer_14))));
            question_list.add(new Question(context.getString(R.string.saudi3_question_2), BA(context.getString(R.string.saudi3_answer_21)),
                    BA(context.getString(R.string.saudi3_answer_22)), BA(context.getString(R.string.saudi3_answer_23)),
                            BA(context.getString(R.string.saudi3_answer_24)),
                                    BA(context.getString(R.string.saudi3_answer_25))));
            question_list.add(new Question(context.getString(R.string.saudi3_question_3), BA(context.getString(R.string.saudi3_answer_31)),
                    BA(context.getString(R.string.saudi3_answer_32)), BA(context.getString(R.string.saudi3_answer_33)),
                            BA(context.getString(R.string.saudi3_answer_34))));
            question_list.add(new Question(context.getString(R.string.saudi3_question_4), BA(context.getString(R.string.saudi3_answer_41)),
                    BA(context.getString(R.string.saudi3_answer_42))));
            question_list.add(new Question(context.getString(R.string.saudi3_question_5), BA( context.getString(R.string.saudi3_answer_51)),
                    BA(context.getString(R.string.saudi3_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.saudi3_question_6), BA(context.getString(R.string.saudi3_answer_61)),
                    BA(context.getString(R.string.saudi3_answer_62))));
            question_list.add(new Question(context.getString(R.string.saudi3_question_7), BA(context.getString(R.string.saudi3_answer_71)),
                    BA(context.getString(R.string.saudi3_answer_72), true)));

        } else if(Utils.COUNTRY == CountryOption.Saudi31) {
            question_list.add(new Question(context.getString(R.string.saudi31_question_1), BA(context.getString(R.string.saudi31_answer_11), true),
                    BA(context.getString(R.string.saudi31_answer_12), true), BA(context.getString(R.string.saudi31_answer_13)),
                            BA(context.getString(R.string.saudi31_answer_14))));
            question_list.add(new Question(context.getString(R.string.saudi31_question_2), BA(context.getString(R.string.saudi31_answer_21)),
                    BA(context.getString(R.string.saudi31_answer_22)), BA(context.getString(R.string.saudi31_answer_23)),
                            BA(context.getString(R.string.saudi31_answer_24)), BA(context.getString(R.string.saudi31_answer_25))));
            question_list.add(new Question(context.getString(R.string.saudi31_question_3), BA(context.getString(R.string.saudi31_answer_31)),
                    BA(context.getString(R.string.saudi31_answer_32)), BA(context.getString(R.string.saudi31_answer_33)),
                            BA(context.getString(R.string.saudi31_answer_34))));
            question_list.add(new Question(context.getString(R.string.saudi31_question_4), BA(context.getString(R.string.saudi31_answer_41)),
                    BA(context.getString(R.string.saudi31_answer_42))));
            question_list.add(new Question(context.getString(R.string.saudi31_question_5), BA(context.getString(R.string.saudi31_answer_51)),
                    BA(context.getString(R.string.saudi31_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.saudi31_question_6), BA(context.getString(R.string.saudi31_answer_61)),
                    BA(context.getString(R.string.saudi31_answer_62))));
            question_list.add(new Question(context.getString(R.string.saudi31_question_7), BA(context.getString(R.string.saudi31_answer_71)),
                    BA(context.getString(R.string.saudi31_answer_72), true)));

        } else if(Utils.COUNTRY == CountryOption.Qatar1) {
            question_list.add(new Question(context.getString(R.string.qatar1_question_1), BA(context.getString(R.string.qatar1_answer_11)),
                    BA(context.getString(R.string.qatar1_answer_12))));
            question_list.add(new Question(context.getString(R.string.qatar1_question_2), BA(context.getString(R.string.qatar1_answer_21)),
                    BA(context.getString(R.string.qatar1_answer_22))));
            question_list.add(new Question(context.getString(R.string.qatar1_question_3), BA(context.getString(R.string.qatar1_answer_31)),
                    BA(context.getString(R.string.qatar1_answer_32))));
            question_list.add(new Question(context.getString(R.string.qatar1_question_4), BA(context.getString(R.string.qatar1_answer_41)),
                    BA(context.getString(R.string.qatar1_answer_42))));

        } else if(Utils.COUNTRY == CountryOption.Qatar2) {
            question_list.add(new Question(context.getString(R.string.qatar2_question_1), BA(context.getString(R.string.qatar2_answer_11), true),
                    BA(context.getString(R.string.qatar2_answer_12)), BA(context.getString(R.string.qatar2_answer_13)),
                            BA(context.getString(R.string.qatar2_answer_14))));
            question_list.add(new Question(context.getString(R.string.qatar2_question_2), BA(context.getString(R.string.qatar2_answer_21)),
                    BA(context.getString(R.string.qatar2_answer_22)), BA(context.getString(R.string.qatar2_answer_23)),
                            BA(context.getString(R.string.qatar2_answer_24)), BA(context.getString(R.string.qatar2_answer_25))));
            question_list.add(new Question(context.getString(R.string.qatar2_question_3), BA(context.getString(R.string.qatar2_answer_31)),
                    BA(context.getString(R.string.qatar2_answer_32)), BA(context.getString(R.string.qatar2_answer_33)),
                            BA(context.getString(R.string.qatar2_answer_34))));
            question_list.add(new Question(context.getString(R.string.qatar2_question_4), BA(context.getString(R.string.qatar2_answer_41)),
                    BA(context.getString(R.string.qatar2_answer_42))));
            question_list.add(new Question(context.getString(R.string.qatar2_question_5), BA(context.getString(R.string.qatar2_answer_51)),
                    BA(context.getString(R.string.qatar2_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.qatar2_question_6), BA(context.getString(R.string.qatar2_answer_61)),
                    BA(context.getString(R.string.qatar2_answer_62))));
            question_list.add(new Question(context.getString(R.string.qatar2_question_7), BA(context.getString(R.string.qatar2_answer_71)),
                    BA(context.getString(R.string.qatar2_answer_72), true)));

        } else if(Utils.COUNTRY == CountryOption.Qatar3) {
            question_list.add(new Question(context.getString(R.string.qatar3_question_1), BA(context.getString(R.string.qatar3_answer_11), true),
                    BA(context.getString(R.string.qatar3_answer_12)), BA(context.getString(R.string.qatar3_answer_13)),
                            BA(context.getString(R.string.qatar3_answer_14))));
            question_list.add(new Question(context.getString(R.string.qatar3_question_2), BA(context.getString(R.string.qatar3_answer_21)),
                    BA(context.getString(R.string.qatar3_answer_22)), BA(context.getString(R.string.qatar3_answer_23)),
                    BA(context.getString(R.string.qatar3_answer_24)),
                    BA(context.getString(R.string.qatar3_answer_25))));
            question_list.add(new Question(context.getString(R.string.qatar3_question_3), BA(context.getString(R.string.qatar3_answer_31)),
                    BA(context.getString(R.string.qatar3_answer_32)), BA(context.getString(R.string.qatar3_answer_33)),
                            BA(context.getString(R.string.qatar3_answer_34))));
            question_list.add(new Question(context.getString(R.string.qatar3_question_4), BA(context.getString(R.string.qatar3_answer_41)),
                    BA(context.getString(R.string.qatar3_answer_42))));
            question_list.add(new Question(context.getString(R.string.qatar3_question_5), BA(context.getString(R.string.qatar3_answer_51)),
                    BA(context.getString(R.string.qatar3_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.qatar3_question_6), BA(context.getString(R.string.qatar3_answer_61)),
                    BA(context.getString(R.string.qatar3_answer_62))));
            question_list.add(new Question(context.getString(R.string.qatar3_question_7), BA(context.getString(R.string.qatar3_answer_71)),
                    BA(context.getString(R.string.qatar3_answer_72), true)));

        } else if(Utils.COUNTRY == CountryOption.Qatar31) {
            question_list.add(new Question(context.getString(R.string.qatar31_question_1), BA(context.getString(R.string.qatar31_answer_11), true),
                    BA(context.getString(R.string.qatar31_answer_12)), BA(context.getString(R.string.qatar31_answer_13)),
                            BA(context.getString(R.string.qatar31_answer_14))));
            question_list.add(new Question(context.getString(R.string.qatar31_question_2), BA(context.getString(R.string.qatar31_answer_21)),
                    BA(context.getString(R.string.qatar31_answer_22)), BA(context.getString(R.string.qatar31_answer_23)),
                    BA(context.getString(R.string.qatar31_answer_24)),
                    BA(context.getString(R.string.qatar31_answer_25))));
            question_list.add(new Question(context.getString(R.string.qatar31_question_3), BA(context.getString(R.string.qatar31_answer_31)),
                    BA(context.getString(R.string.qatar31_answer_32)), BA(context.getString(R.string.qatar31_answer_33)),
                            BA(context.getString(R.string.qatar31_answer_34))));
            question_list.add(new Question(context.getString(R.string.qatar31_question_4), BA(context.getString(R.string.qatar31_answer_41)),
                    BA(context.getString(R.string.qatar31_answer_42))));
            question_list.add(new Question(context.getString(R.string.qatar31_question_5), BA(context.getString(R.string.qatar31_answer_51)),
                    BA(context.getString(R.string.qatar31_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.qatar31_question_6), BA(context.getString(R.string.qatar31_answer_61)),
                    BA(context.getString(R.string.qatar31_answer_62))));
            question_list.add(new Question(context.getString(R.string.qatar31_question_7), BA(context.getString(R.string.qatar31_answer_71)),
                    BA(context.getString(R.string.qatar31_answer_72), true)));

        } else if(Utils.COUNTRY == CountryOption.Uae1) {
            question_list.add(new Question(context.getString(R.string.uae1_question_1), BA(context.getString(R.string.uae1_answer_11)),
                    BA(context.getString(R.string.uae1_answer_12))));
            question_list.add(new Question(context.getString(R.string.uae1_question_2), BA(context.getString(R.string.uae1_answer_21)),
                    BA(context.getString(R.string.uae1_answer_22))));
            question_list.add(new Question(context.getString(R.string.uae1_question_3), BA(context.getString(R.string.uae1_answer_31)),
                    BA(context.getString(R.string.uae1_answer_32))));
            question_list.add(new Question(context.getString(R.string.uae1_question_4), BA(context.getString(R.string.uae1_answer_41)),
                    BA(context.getString(R.string.uae1_answer_42))));

        } else if(Utils.COUNTRY == CountryOption.Uae2) {
            question_list.add(new Question(context.getString(R.string.uae2_question_1), BA(context.getString(R.string.uae2_answer_11), true),
                    BA(context.getString(R.string.uae2_answer_12)), BA(context.getString(R.string.uae2_answer_13)),
                            BA(context.getString(R.string.uae2_answer_14))));
            question_list.add(new Question(context.getString(R.string.uae2_question_2), BA(context.getString(R.string.uae2_answer_21)),
                    BA(context.getString(R.string.uae2_answer_22)), BA(context.getString(R.string.uae2_answer_23)),
                            BA(context.getString(R.string.uae2_answer_24)), BA(context.getString(R.string.uae2_answer_25))));
            question_list.add(new Question(context.getString(R.string.uae2_question_3), BA(context.getString(R.string.uae2_answer_31)),
                    BA(context.getString(R.string.uae2_answer_32)), BA(context.getString(R.string.uae2_answer_33)),
                            BA(context.getString(R.string.uae2_answer_34))));
            question_list.add(new Question(context.getString(R.string.uae2_question_4), BA(context.getString(R.string.uae2_answer_41)),
                    BA(context.getString(R.string.uae2_answer_42))));
            question_list.add(new Question(context.getString(R.string.uae2_question_5),
                    BA(context.getString(R.string.uae2_answer_51)), BA(context.getString(R.string.uae2_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.uae2_question_6), BA(context.getString(R.string.uae2_answer_61)),
                    BA(context.getString(R.string.uae2_answer_62))));
            question_list.add(new Question(context.getString(R.string.uae2_question_7), BA(context.getString(R.string.uae2_answer_71)),
                    BA(context.getString(R.string.uae2_answer_72), true)));

        } else if(Utils.COUNTRY == CountryOption.Uae3) {
            question_list.add(new Question(context.getString(R.string.uae3_question_1), BA(context.getString(R.string.uae3_answer_11), true),
                    BA(context.getString(R.string.uae3_answer_12)), BA(context.getString(R.string.uae3_answer_13)),
                            BA(context.getString(R.string.uae3_answer_14))));
            question_list.add(new Question(context.getString(R.string.uae3_question_2), BA(context.getString(R.string.uae3_answer_21)),
                    BA(context.getString(R.string.uae3_answer_22)), BA(context.getString(R.string.uae3_answer_23)),
                    BA(context.getString(R.string.uae3_answer_24)),
                    BA(context.getString(R.string.uae3_answer_25))));
            question_list.add(new Question(context.getString(R.string.uae3_question_3), BA(context.getString(R.string.uae3_answer_31)),
                    BA(context.getString(R.string.uae3_answer_32)), BA(context.getString(R.string.uae3_answer_33)),
                    BA(context.getString(R.string.uae3_answer_34))));
            question_list.add(new Question(context.getString(R.string.uae3_question_4), BA(context.getString(R.string.uae3_answer_41)),
                    BA(context.getString(R.string.uae3_answer_42))));
            question_list.add(new Question(context.getString(R.string.uae3_question_5), BA(context.getString(R.string.uae3_answer_51)),
                    BA(context.getString(R.string.uae3_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.uae3_question_6), BA(context.getString(R.string.uae3_answer_61)),
                    BA(context.getString(R.string.uae3_answer_62))));
            question_list.add(new Question(context.getString(R.string.uae3_question_7), BA(context.getString(R.string.uae3_answer_71)),
                    BA(context.getString(R.string.uae3_answer_72), true)));

        } else if(Utils.COUNTRY == CountryOption.Uae31) {
            question_list.add(new Question(context.getString(R.string.uae31_question_1), BA(context.getString(R.string.uae31_answer_11), true),
                    BA(context.getString(R.string.uae31_answer_12)), BA(context.getString(R.string.uae31_answer_13)),
                            BA(context.getString(R.string.uae31_answer_14))));
            question_list.add(new Question(context.getString(R.string.uae31_question_2), BA(context.getString(R.string.uae31_answer_21)),
                    BA(context.getString(R.string.uae31_answer_22)), BA(context.getString(R.string.uae31_answer_23)),
                    BA(context.getString(R.string.uae31_answer_24)),
                    BA(context.getString(R.string.uae31_answer_25))));
            question_list.add(new Question(context.getString(R.string.uae31_question_3), BA(context.getString(R.string.uae31_answer_31)),
                    BA(context.getString(R.string.uae31_answer_32)), BA(context.getString(R.string.uae31_answer_33)),
                    BA(context.getString(R.string.uae31_answer_34))));
            question_list.add(new Question(context.getString(R.string.uae31_question_4), BA(context.getString(R.string.uae31_answer_41)),
                    BA(context.getString(R.string.uae31_answer_42))));
            question_list.add(new Question(context.getString(R.string.uae31_question_5), BA(context.getString(R.string.uae31_answer_51)),
                    BA(context.getString(R.string.uae31_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.uae31_question_6), BA(context.getString(R.string.uae31_answer_61)),
                    BA(context.getString(R.string.uae31_answer_62))));
            question_list.add(new Question(context.getString(R.string.uae31_question_7), BA(context.getString(R.string.uae31_answer_71)),
                    BA(context.getString(R.string.uae31_answer_72), true)));

        } else if(Utils.COUNTRY == CountryOption.Kuwait1) {
            question_list.add(new Question(context.getString(R.string.kw1_question_1), BA(context.getString(R.string.kw1_answer_11)),
                    BA(context.getString(R.string.kw1_answer_12))));
            question_list.add(new Question(context.getString(R.string.kw1_question_2), BA(context.getString(R.string.kw1_answer_21)),
                    BA(context.getString(R.string.kw1_answer_22))));
            question_list.add(new Question(context.getString(R.string.kw1_question_3), BA(context.getString(R.string.kw1_answer_31)),
                    BA(context.getString(R.string.kw1_answer_32))));
            question_list.add(new Question(context.getString(R.string.kw1_question_4), BA(context.getString(R.string.kw1_answer_41)),
                    BA(context.getString(R.string.kw1_answer_42))));

        } else if(Utils.COUNTRY == CountryOption.Kuwait2) {
            question_list.add(new Question(context.getString(R.string.kw2_question_1), BA(context.getString(R.string.kw2_answer_11), true),
                    BA(context.getString(R.string.kw2_answer_12)), BA(context.getString(R.string.kw2_answer_13)),
                            BA(context.getString(R.string.kw2_answer_14))));
            question_list.add(new Question(context.getString(R.string.kw2_question_2), BA(context.getString(R.string.kw2_answer_21)),
                    BA(context.getString(R.string.kw2_answer_22)), BA(context.getString(R.string.kw2_answer_23)),
                            BA(context.getString(R.string.kw2_answer_24)), BA(context.getString(R.string.kw2_answer_25))));
            question_list.add(new Question(context.getString(R.string.kw2_question_3), BA(context.getString(R.string.kw2_answer_31)),
                    BA(context.getString(R.string.kw2_answer_32)), BA(context.getString(R.string.kw2_answer_33)),
                            BA(context.getString(R.string.kw2_answer_34))));
            question_list.add(new Question(context.getString(R.string.kw2_question_4), BA(context.getString(R.string.kw2_answer_41)),
                    BA(context.getString(R.string.kw2_answer_42))));
            question_list.add(new Question(context.getString(R.string.kw2_question_5), BA(context.getString(R.string.kw2_answer_51)),
                    BA(context.getString(R.string.kw2_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.kw2_question_6), BA(context.getString(R.string.kw2_answer_61)),
                    BA(context.getString(R.string.kw2_answer_62))));
            question_list.add(new Question(context.getString(R.string.kw2_question_7), BA(context.getString(R.string.kw2_answer_71)),
                    BA(context.getString(R.string.kw2_answer_72), true)));

        } else if(Utils.COUNTRY == CountryOption.Kuwait3) {
            question_list.add(new Question(context.getString(R.string.kw3_question_1), BA(context.getString(R.string.kw3_answer_11), true),
                    BA(context.getString(R.string.kw3_answer_12)), BA(context.getString(R.string.kw3_answer_13)),
                            BA(context.getString(R.string.kw3_answer_14))));
            question_list.add(new Question(context.getString(R.string.kw3_question_2), BA(context.getString(R.string.kw3_answer_21)),
                    BA(context.getString(R.string.kw3_answer_22)), BA(context.getString(R.string.kw3_answer_23)),
                            BA(context.getString(R.string.kw3_answer_24)), BA(context.getString(R.string.kw3_answer_25))));
            question_list.add(new Question(context.getString(R.string.kw3_question_3), BA(context.getString(R.string.kw3_answer_31)),
                    BA(context.getString(R.string.kw3_answer_32)), BA(context.getString(R.string.kw3_answer_33)),
                            BA(context.getString(R.string.kw3_answer_34))));
            question_list.add(new Question(context.getString(R.string.kw3_question_4), BA(context.getString(R.string.kw3_answer_41)),
                    BA(context.getString(R.string.kw3_answer_42))));
            question_list.add(new Question(context.getString(R.string.kw3_question_5),BA(context.getString(R.string.kw3_answer_51)),
                    BA(context.getString(R.string.kw3_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.kw3_question_6), BA(context.getString(R.string.kw3_answer_61)),
                    BA(context.getString(R.string.kw3_answer_62))));
            question_list.add(new Question(context.getString(R.string.kw3_question_7), BA(context.getString(R.string.kw3_answer_71)),
                    BA(context.getString(R.string.kw3_answer_72), true)));

        } else if(Utils.COUNTRY == CountryOption.Kuwait31) {
            question_list.add(new Question(context.getString(R.string.kw31_question_1), BA(context.getString(R.string.kw31_answer_11), true),
                    BA(context.getString(R.string.kw31_answer_12)), BA(context.getString(R.string.kw31_answer_13)),
                    BA(context.getString(R.string.kw31_answer_14))));
            question_list.add(new Question(context.getString(R.string.kw31_question_2), BA(context.getString(R.string.kw31_answer_21)),
                    BA(context.getString(R.string.kw31_answer_22)), BA(context.getString(R.string.kw31_answer_23)),
                    BA(context.getString(R.string.kw31_answer_24)),
                    BA(context.getString(R.string.kw31_answer_25))));
            question_list.add(new Question(context.getString(R.string.kw31_question_3), BA(context.getString(R.string.kw31_answer_31)),
                    BA(context.getString(R.string.kw31_answer_32)), BA(context.getString(R.string.kw31_answer_33)),
                    BA(context.getString(R.string.kw31_answer_34))));
            question_list.add(new Question(context.getString(R.string.kw31_question_4), BA(context.getString(R.string.kw31_answer_41)),
                    BA(context.getString(R.string.kw31_answer_42))));
            question_list.add(new Question(context.getString(R.string.kw31_question_5), BA(context.getString(R.string.kw31_answer_51)),
                    BA(context.getString(R.string.kw31_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.kw31_question_6), BA(context.getString(R.string.kw31_answer_61)),
                    BA(context.getString(R.string.kw31_answer_62))));
            question_list.add(new Question(context.getString(R.string.kw31_question_7), BA(context.getString(R.string.kw31_answer_71)),
                    BA(context.getString(R.string.kw31_answer_72), true)));

        } else if(Utils.COUNTRY == CountryOption.Bahrain1) {
            question_list.add(new Question(context.getString(R.string.bh1_question_1), BA(context.getString(R.string.bh1_answer_11)),
                    BA(context.getString(R.string.bh1_answer_12))));
            question_list.add(new Question(context.getString(R.string.bh1_question_2), BA(context.getString(R.string.bh1_answer_21)),
                    BA(context.getString(R.string.bh1_answer_22))));
            question_list.add(new Question(context.getString(R.string.bh1_question_3), BA(context.getString(R.string.bh1_answer_31)),
                    BA(context.getString(R.string.bh1_answer_32))));
            question_list.add(new Question(context.getString(R.string.bh1_question_4), BA(context.getString(R.string.bh1_answer_41)),
                    BA(context.getString(R.string.bh1_answer_42))));

        } else if(Utils.COUNTRY == CountryOption.Bahrain2) {
            question_list.add(new Question(context.getString(R.string.bh2_question_1), BA(context.getString(R.string.bh2_answer_11)),
                    BA(context.getString(R.string.bh2_answer_12))));
            question_list.add(new Question(context.getString(R.string.bh2_question_2), BA(context.getString(R.string.bh2_answer_21)),
                    BA(context.getString(R.string.bh2_answer_22))));
            question_list.add(new Question(context.getString(R.string.bh2_question_3), BA(context.getString(R.string.bh2_answer_31)),
                    BA(context.getString(R.string.bh2_answer_32))));
            question_list.add(new Question(context.getString(R.string.bh2_question_4), BA(context.getString(R.string.bh2_answer_41)),
                    BA(context.getString(R.string.bh2_answer_42))));
            question_list.add(new Question(context.getString(R.string.bh2_question_5), BA(context.getString(R.string.bh2_answer_51)),
                    BA(context.getString(R.string.bh2_answer_52))));
            question_list.add(new Question(context.getString(R.string.bh2_question_6), BA(context.getString(R.string.bh2_answer_61)),
                    BA(context.getString(R.string.bh2_answer_62))));

        } else if(Utils.COUNTRY == CountryOption.Bahrain3) {
            question_list.add(new Question(context.getString(R.string.bh3_question_1), BA(context.getString(R.string.bh3_answer_11), true),
                    BA(context.getString(R.string.bh3_answer_12)), BA(context.getString(R.string.bh3_answer_13)),
                            BA(context.getString(R.string.bh3_answer_14))));
            question_list.add(new Question(context.getString(R.string.bh3_question_2), BA(context.getString(R.string.bh3_answer_21)),
                    BA(context.getString(R.string.bh3_answer_22)), BA(context.getString(R.string.bh3_answer_23)),
                            BA(context.getString(R.string.bh3_answer_24)), BA(context.getString(R.string.bh3_answer_25))));
            question_list.add(new Question(context.getString(R.string.bh3_question_3), BA(context.getString(R.string.bh3_answer_31)),
                    BA(context.getString(R.string.bh3_answer_32)), BA(context.getString(R.string.bh3_answer_33)),
                            BA(context.getString(R.string.bh3_answer_34))));
            question_list.add(new Question(context.getString(R.string.bh3_question_4), BA(context.getString(R.string.bh3_answer_41)),
                    BA(context.getString(R.string.bh3_answer_42))));
            question_list.add(new Question(context.getString(R.string.bh3_question_5), BA(context.getString(R.string.bh3_answer_51)),
                    BA(context.getString(R.string.bh3_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.bh3_question_6), BA(context.getString(R.string.bh3_answer_61)),
                    BA(context.getString(R.string.bh3_answer_62))));
            question_list.add(new Question(context.getString(R.string.bh3_question_7), BA(context.getString(R.string.bh3_answer_71)),
                    BA(context.getString(R.string.bh3_answer_72), true)));

        } else if(Utils.COUNTRY == CountryOption.Bahrain31) {
            question_list.add(new Question(context.getString(R.string.bh31_question_1), BA(context.getString(R.string.bh31_answer_11), true),
                    BA(context.getString(R.string.bh31_answer_12), true), BA(context.getString(R.string.bh31_answer_13)),
                    BA(context.getString(R.string.bh31_answer_14))));
            question_list.add(new Question(context.getString(R.string.bh31_question_2), BA(context.getString(R.string.bh31_answer_21)),
                    BA(context.getString(R.string.bh31_answer_22)), BA(context.getString(R.string.bh31_answer_23)),
                    BA(context.getString(R.string.bh31_answer_24)), BA(context.getString(R.string.bh31_answer_25))));
            question_list.add(new Question(context.getString(R.string.bh31_question_3), BA(context.getString(R.string.bh31_answer_31)),
                    BA(context.getString(R.string.bh31_answer_32)), BA(context.getString(R.string.bh31_answer_33)),
                            BA(context.getString(R.string.bh31_answer_34))));
            question_list.add(new Question(context.getString(R.string.bh31_question_4), BA(context.getString(R.string.bh31_answer_41)),
                    BA(context.getString(R.string.bh31_answer_42))));
            question_list.add(new Question(context.getString(R.string.bh31_question_5), BA(context.getString(R.string.bh31_answer_51)),
                    BA(context.getString(R.string.bh31_answer_52), true)));
            question_list.add(new Question(context.getString(R.string.bh31_question_6), BA(context.getString(R.string.bh31_answer_61)),
                    BA(context.getString(R.string.bh31_answer_62))));
            question_list.add(new Question(context.getString(R.string.bh31_question_7), BA(context.getString(R.string.bh31_answer_71)),
                    BA(context.getString(R.string.bh31_answer_72), true)));
        } else {
            question_list.add(new Question(context.getString(R.string.question_1), BA(context.getString(R.string.answer_11)),
                    BA(context.getString(R.string.answer_12))));
            question_list.add(new Question(context.getString(R.string.question_2), BA(context.getString(R.string.answer_21)),
                    BA(context.getString(R.string.answer_22))));
            question_list.add(new Question(context.getString(R.string.question_3), BA(context.getString(R.string.answer_31)),
                    BA(context.getString(R.string.answer_32))));
            question_list.add(new Question(context.getString(R.string.question_4), BA(context.getString(R.string.answer_41)),
                    BA(context.getString(R.string.answer_42))));
        }
        return question_list;
    }
    public static void setAboutUsContentText(Context context, TextView view) {
        view.setText(context.getString(R.string.about_us_content));
        if(Utils.COUNTRY == CountryOption.Oman1) {
            view.setText(context.getString(R.string.about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Oman2) {
            view.setText(context.getString(R.string.oman2_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Oman3) {
            view.setText(context.getString(R.string.oman3_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Iraq1) {
            view.setText(context.getString(R.string.iraq1_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Iraq2) {
            view.setText(context.getString(R.string.iraq2_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Iraq3) {
            view.setText(context.getString(R.string.iraq3_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Libya1) {
            view.setText(context.getString(R.string.libya1_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Libya2) {
            view.setText(context.getString(R.string.libya2_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Libya3) {
            view.setText(context.getString(R.string.libya3_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Saudi1) {
            view.setText(context.getString(R.string.saudi1_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Saudi2) {
            view.setText(context.getString(R.string.saudi2_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Qatar1) {
            view.setText(context.getString(R.string.qatar1_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Qatar2) {
            view.setText(context.getString(R.string.qatar2_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Uae1) {
            view.setText(context.getString(R.string.uae1_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Uae2) {
            view.setText(context.getString(R.string.uae2_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Kuwait1) {
            view.setText(context.getString(R.string.kw1_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Kuwait2) {
            view.setText(context.getString(R.string.kw2_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Bahrain1) {
            view.setText(context.getString(R.string.bh1_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Bahrain2) {
            view.setText(context.getString(R.string.bh2_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Oman4) {
            view.setText(context.getString(R.string.oman4_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Oman41) {
            view.setText(context.getString(R.string.oman41_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Libya4) {
            view.setText(context.getString(R.string.libya4_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Libya41) {
            view.setText(context.getString(R.string.libya41_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Bahrain3) {
            view.setText(context.getString(R.string.bh3_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Bahrain31) {
            view.setText(context.getString(R.string.bh31_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Iraq4) {
            view.setText(context.getString(R.string.iraq4_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Iraq41) {
            view.setText(context.getString(R.string.iraq41_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Saudi3) {
            view.setText(context.getString(R.string.saudi3_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Saudi31) {
            view.setText(context.getString(R.string.saudi31_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Kuwait3) {
            view.setText(context.getString(R.string.kw3_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Kuwait31) {
            view.setText(context.getString(R.string.kw31_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Uae3) {
            view.setText(context.getString(R.string.uae3_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Uae31) {
            view.setText(context.getString(R.string.uae31_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Qatar3) {
            view.setText(context.getString(R.string.qatar3_about_us_content));
        } else if(Utils.COUNTRY == CountryOption.Qatar31) {
            view.setText(context.getString(R.string.qatar31_about_us_content));
        }
    }
    public static void setContactText(Context context, TextView view) {
        view.setText(context.getString(R.string.contact));
    }
    public static void setThankTitle(Context context, TextView view) {
        view.setText(context.getString(R.string.thanks_title));
    }
    public static void setThankText1(Context context, TextView view) {
        view.setText(context.getString(R.string.thanks_text_1));
        if(Utils.COUNTRY == CountryOption.Oman1) {
            view.setText(context.getString(R.string.thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Oman2) {
            view.setText(context.getString(R.string.oman2_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Oman3) {
            view.setText(context.getString(R.string.oman3_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Iraq1) {
            view.setText(context.getString(R.string.iraq1_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Iraq2) {
            view.setText(context.getString(R.string.iraq2_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Iraq3) {
            view.setText(context.getString(R.string.iraq3_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Libya1) {
            view.setText(context.getString(R.string.libya1_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Libya2) {
            view.setText(context.getString(R.string.libya2_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Libya3) {
            view.setText(context.getString(R.string.libya3_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Saudi1) {
            view.setText(context.getString(R.string.saudi1_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Saudi2) {
            view.setText(context.getString(R.string.saudi2_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Qatar1) {
            view.setText(context.getString(R.string.qatar1_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Qatar2) {
            view.setText(context.getString(R.string.qatar2_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Uae1) {
            view.setText(context.getString(R.string.uae1_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Uae2) {
            view.setText(context.getString(R.string.uae2_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Kuwait1) {
            view.setText(context.getString(R.string.kw1_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Kuwait2) {
            view.setText(context.getString(R.string.kw2_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Bahrain1) {
            view.setText(context.getString(R.string.bh1_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Bahrain2) {
            view.setText(context.getString(R.string.bh2_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Oman4) {
            view.setText(context.getString(R.string.oman4_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Oman41) {
            view.setText(context.getString(R.string.oman41_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Libya4) {
            view.setText(context.getString(R.string.libya4_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Libya41) {
            view.setText(context.getString(R.string.libya41_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Bahrain3) {
            view.setText(context.getString(R.string.bh3_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Bahrain31) {
            view.setText(context.getString(R.string.bh31_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Iraq4) {
            view.setText(context.getString(R.string.iraq4_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Iraq41) {
            view.setText(context.getString(R.string.iraq41_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Saudi3) {
            view.setText(context.getString(R.string.saudi3_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Saudi31) {
            view.setText(context.getString(R.string.saudi31_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Kuwait3) {
            view.setText(context.getString(R.string.kw3_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Kuwait31) {
            view.setText(context.getString(R.string.kw31_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Uae3) {
            view.setText(context.getString(R.string.uae3_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Uae31) {
            view.setText(context.getString(R.string.uae31_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Qatar3) {
            view.setText(context.getString(R.string.qatar3_thanks_text_1));
        } else if(Utils.COUNTRY == CountryOption.Qatar31) {
            view.setText(context.getString(R.string.qatar31_thanks_text_1));
        }
    }
    public static void setThankText2(Context context, TextView view) {
        view.setText(context.getString(R.string.thanks_text_2));
        if(Utils.COUNTRY == CountryOption.Oman1) {
            view.setText(context.getString(R.string.thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Oman2) {
            view.setText(context.getString(R.string.oman2_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Oman3) {
            view.setText(context.getString(R.string.oman3_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Iraq1) {
            view.setText(context.getString(R.string.iraq1_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Iraq2) {
            view.setText(context.getString(R.string.iraq2_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Iraq3) {
            view.setText(context.getString(R.string.iraq3_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Libya1) {
            view.setText(context.getString(R.string.libya1_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Libya2) {
            view.setText(context.getString(R.string.libya2_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Libya3) {
            view.setText(context.getString(R.string.libya3_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Saudi1) {
            view.setText(context.getString(R.string.saudi1_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Saudi2) {
            view.setText(context.getString(R.string.saudi2_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Qatar1) {
            view.setText(context.getString(R.string.qatar1_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Qatar2) {
            view.setText(context.getString(R.string.qatar2_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Uae1) {
            view.setText(context.getString(R.string.uae1_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Uae2) {
            view.setText(context.getString(R.string.uae2_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Kuwait1) {
            view.setText(context.getString(R.string.kw1_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Kuwait2) {
            view.setText(context.getString(R.string.kw2_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Bahrain1) {
            view.setText(context.getString(R.string.bh1_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Bahrain2) {
            view.setText(context.getString(R.string.bh2_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Oman4) {
            view.setText(context.getString(R.string.oman4_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Oman41) {
            view.setText(context.getString(R.string.oman41_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Libya4) {
            view.setText(context.getString(R.string.libya4_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Libya41) {
            view.setText(context.getString(R.string.libya41_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Bahrain3) {
            view.setText(context.getString(R.string.bh3_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Bahrain31) {
            view.setText(context.getString(R.string.bh31_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Iraq4) {
            view.setText(context.getString(R.string.iraq4_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Iraq41) {
            view.setText(context.getString(R.string.iraq41_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Saudi3) {
            view.setText(context.getString(R.string.saudi3_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Saudi31) {
            view.setText(context.getString(R.string.saudi31_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Kuwait3) {
            view.setText(context.getString(R.string.kw3_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Kuwait31) {
            view.setText(context.getString(R.string.kw31_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Uae3) {
            view.setText(context.getString(R.string.uae3_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Uae31) {
            view.setText(context.getString(R.string.uae31_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Qatar3) {
            view.setText(context.getString(R.string.qatar3_thanks_text_2));
        } else if(Utils.COUNTRY == CountryOption.Qatar31) {
            view.setText(context.getString(R.string.qatar31_thanks_text_2));
        }
    }
    public static void setThankText3(Context context, TextView view) {
        view.setText(context.getString(R.string.thanks_text_3));
        if(Utils.COUNTRY == CountryOption.Oman1) {
            view.setText(context.getString(R.string.thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Oman2) {
            view.setText(context.getString(R.string.oman2_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Oman3) {
            view.setText(context.getString(R.string.oman3_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Iraq1) {
            view.setText(context.getString(R.string.iraq1_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Iraq2) {
            view.setText(context.getString(R.string.iraq2_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Iraq3) {
            view.setText(context.getString(R.string.iraq3_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Libya1) {
            view.setText(context.getString(R.string.libya1_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Libya2) {
            view.setText(context.getString(R.string.libya2_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Libya3) {
            view.setText(context.getString(R.string.libya3_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Saudi1) {
            view.setText(context.getString(R.string.saudi1_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Saudi2) {
            view.setText(context.getString(R.string.saudi2_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Qatar1) {
            view.setText(context.getString(R.string.qatar1_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Qatar2) {
            view.setText(context.getString(R.string.qatar2_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Uae1) {
            view.setText(context.getString(R.string.uae1_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Uae2) {
            view.setText(context.getString(R.string.uae2_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Kuwait1) {
            view.setText(context.getString(R.string.kw1_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Kuwait2) {
            view.setText(context.getString(R.string.kw2_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Bahrain1) {
            view.setText(context.getString(R.string.bh1_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Bahrain2) {
            view.setText(context.getString(R.string.bh2_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Oman4) {
            view.setText(context.getString(R.string.oman4_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Oman41) {
            view.setText(context.getString(R.string.oman41_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Libya4) {
            view.setText(context.getString(R.string.libya4_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Libya41) {
            view.setText(context.getString(R.string.libya41_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Bahrain3) {
            view.setText(context.getString(R.string.bh3_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Bahrain31) {
            view.setText(context.getString(R.string.bh31_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Iraq4) {
            view.setText(context.getString(R.string.iraq4_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Iraq41) {
            view.setText(context.getString(R.string.iraq41_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Saudi3) {
            view.setText(context.getString(R.string.saudi3_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Saudi31) {
            view.setText(context.getString(R.string.saudi31_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Kuwait3) {
            view.setText(context.getString(R.string.kw3_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Kuwait31) {
            view.setText(context.getString(R.string.kw31_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Uae3) {
            view.setText(context.getString(R.string.uae3_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Uae31) {
            view.setText(context.getString(R.string.uae31_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Qatar3) {
            view.setText(context.getString(R.string.qatar3_thanks_text_3));
        } else if(Utils.COUNTRY == CountryOption.Qatar31) {
            view.setText(context.getString(R.string.qatar31_thanks_text_3));
        }
    }
    public static void setHomeText(Context context, TextView view) {
        view.setText(context.getString(R.string.home));
    }
    public static void setAboutTitleText(Context context, TextView view) {
        view.setText(context.getString(R.string.about_title));
    }
    public static void setPrivacyPolicyText(Context context, TextView view) {
        view.setText(context.getString(R.string.privacy_policy));
    }
    public static void setTermsConditionMenu(Context context, TextView view) {
        view.setText(context.getString(R.string.terms_conditions));
    }
    public static void setRateText(Context context, TextView view) {
        view.setText(context.getString(R.string.rate_us));
    }

    public static String getPrivacyPolicyText(Context context) {
        return context.getString(R.string.privacy_policy);
    }
    public static String getTermsConditionText(Context context) {
        return context.getString(R.string.terms_conditions);
    }
    public static String getQuestionBtnText1(Context context) {
        if(Utils.COUNTRY == CountryOption.Oman1) {
            return context.getString(R.string.question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Oman2) {
            return context.getString(R.string.oman2_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Oman3) {
            return context.getString(R.string.oman3_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Iraq1) {
            return context.getString(R.string.iraq1_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Iraq2) {
            return context.getString(R.string.iraq2_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Iraq3) {
            return context.getString(R.string.iraq3_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Libya1) {
            return context.getString(R.string.libya1_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Libya2) {
            return context.getString(R.string.libya2_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Libya3) {
            return context.getString(R.string.libya3_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Saudi1) {
            return context.getString(R.string.saudi1_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Saudi2) {
            return context.getString(R.string.saudi2_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Qatar1) {
            return context.getString(R.string.qatar1_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Qatar2) {
            return context.getString(R.string.qatar2_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Uae1) {
            return context.getString(R.string.uae1_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Uae2) {
            return context.getString(R.string.uae2_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Kuwait1) {
            return context.getString(R.string.kw1_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Kuwait2) {
            return context.getString(R.string.kw2_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Bahrain1) {
            return context.getString(R.string.bh1_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Bahrain2) {
            return context.getString(R.string.bh2_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Oman4) {
            return context.getString(R.string.oman4_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Oman41) {
            return context.getString(R.string.oman41_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Libya4) {
            return context.getString(R.string.libya4_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Libya41) {
            return context.getString(R.string.libya41_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Bahrain3) {
            return context.getString(R.string.bh3_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Bahrain31) {
            return context.getString(R.string.bh31_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Iraq4) {
            return context.getString(R.string.iraq4_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Iraq41) {
            return context.getString(R.string.iraq41_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Saudi3) {
            return context.getString(R.string.saudi3_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Saudi31) {
            return context.getString(R.string.saudi31_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Kuwait3) {
            return context.getString(R.string.kw3_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Kuwait31) {
            return context.getString(R.string.kw31_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Uae3) {
            return context.getString(R.string.uae3_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Uae31) {
            return context.getString(R.string.uae31_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Qatar3) {
            return context.getString(R.string.qatar3_question_btn_text_1);
        } else if(Utils.COUNTRY == CountryOption.Qatar31) {
            return context.getString(R.string.qatar31_question_btn_text_1);
        } else {
            return context.getString(R.string.question_btn_text_1);
        }
    }
    public static String getQuestionBtnText2(Context context) {
        if(Utils.COUNTRY == CountryOption.Oman1) {
            return context.getString(R.string.question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Oman2) {
            return context.getString(R.string.oman2_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Oman3) {
            return context.getString(R.string.oman3_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Iraq1) {
            return context.getString(R.string.iraq1_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Iraq2) {
            return context.getString(R.string.iraq2_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Iraq3) {
            return context.getString(R.string.iraq3_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Libya1) {
            return context.getString(R.string.libya1_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Libya2) {
            return context.getString(R.string.libya2_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Libya3) {
            return context.getString(R.string.libya3_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Saudi1) {
            return context.getString(R.string.saudi1_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Saudi2) {
            return context.getString(R.string.saudi2_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Qatar1) {
            return context.getString(R.string.qatar1_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Qatar2) {
            return context.getString(R.string.qatar2_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Uae1) {
            return context.getString(R.string.uae1_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Uae2) {
            return context.getString(R.string.uae2_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Kuwait1) {
            return context.getString(R.string.kw1_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Kuwait2) {
            return context.getString(R.string.kw2_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Bahrain1) {
            return context.getString(R.string.bh1_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Bahrain2) {
            return context.getString(R.string.bh2_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Oman4) {
            return context.getString(R.string.oman4_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Oman41) {
            return context.getString(R.string.oman41_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Libya4) {
            return context.getString(R.string.libya4_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Libya41) {
            return context.getString(R.string.libya41_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Bahrain3) {
            return context.getString(R.string.bh3_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Bahrain31) {
            return context.getString(R.string.bh31_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Iraq4) {
            return context.getString(R.string.iraq4_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Iraq41) {
            return context.getString(R.string.iraq41_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Saudi3) {
            return context.getString(R.string.saudi3_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Saudi31) {
            return context.getString(R.string.saudi31_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Kuwait3) {
            return context.getString(R.string.kw3_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Kuwait31) {
            return context.getString(R.string.kw31_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Uae3) {
            return context.getString(R.string.uae3_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Uae31) {
            return context.getString(R.string.uae31_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Qatar3) {
            return context.getString(R.string.qatar3_question_btn_text_2);
        } else if(Utils.COUNTRY == CountryOption.Qatar31) {
            return context.getString(R.string.qatar31_question_btn_text_2);
        } else {
            return context.getString(R.string.question_btn_text_2);
        }
    }

    public static String getComment1(Context context) {
        return context.getString(R.string.comment_1);
    }
    public static String getComment2(Context context) {
        return context.getString(R.string.comment_2);
    }
    public static String getComment3(Context context) {
        return context.getString(R.string.comment_3);
    }
    public static String getComment4(Context context) {
        return context.getString(R.string.comment_4);
    }
    public static String getComment5(Context context) {
        return context.getString(R.string.comment_5);
    }
    public static String getComment6(Context context) {
        return context.getString(R.string.comment_6);
    }
    public static String getComment7(Context context) {
        return context.getString(R.string.comment_7);
    }
}
