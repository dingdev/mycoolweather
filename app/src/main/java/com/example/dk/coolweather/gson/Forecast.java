package com.example.dk.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by DK on 2017/8/27.
 */

public class Forecast {
    public String date;
    @SerializedName("cond")
    public More more;
    public Temprature temprature;
    public class Temprature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
