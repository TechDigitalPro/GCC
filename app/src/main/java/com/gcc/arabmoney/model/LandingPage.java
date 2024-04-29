package com.gcc.arabmoney.model;

import com.google.gson.annotations.SerializedName;

public class LandingPage {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("short_name")
    private String shortName;
    @SerializedName("key_name")
    private String key;
    @SerializedName("os")
    private String os;
    @SerializedName("show_option")
    private int show;

    public LandingPage() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public String getKey() {
        return key;
    }

    public String getOs() {
        return os;
    }

    public int getShow() {
        return show;
    }
}
