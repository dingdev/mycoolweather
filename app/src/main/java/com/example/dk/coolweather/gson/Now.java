package com.example.dk.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.security.PublicKey;

/**
 * Created by DK on 2017/8/27.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    public class More{
        @SerializedName("txt")
        public String info;
    }
    @SerializedName("cond")
    public More more;
}
