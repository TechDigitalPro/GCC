package com.gcc.arabmoney.model;

import com.google.gson.annotations.SerializedName;

public class Campain {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("ai")
    private String ai;
    @SerializedName("gi")
    private String gi;
    @SerializedName("country")
    private String country;
    @SerializedName("os")
    private String os;
    @SerializedName("landing_page")
    private LandingPage landingPage;
    @SerializedName("is_pause")
    private int pause;
    @SerializedName("auto_login")
    private int autoLogin;

    public Campain() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAi() {
        return ai;
    }

    public String getGi() {
        return gi;
    }

    public String getCountry() {
        return country;
    }

    public String getOs() {
        return os;
    }

    public LandingPage getLandingPage() {
        return landingPage;
    }

    public int getPause() {
        return pause;
    }

    public int getAutoLogin() {
        return autoLogin;
    }
}
