package com.example.dk.coolweather.gson;

/**
 * Created by DK on 2017/8/27.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
