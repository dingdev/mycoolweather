package com.example.dk.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by DK on 2017/8/27.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}