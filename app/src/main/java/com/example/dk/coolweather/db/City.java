package com.example.dk.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by DK on 2017/8/23.
 */

public class City extends DataSupport {
    private int id;
    private int cityCode;
    private String cityName;
    private int provinceId;
    public int getId(){
        return id;
    }
    public int getCityCode(){
        return cityCode;
    }
    public String getCityName(){
        return cityName;
    }
    public int getProvinceId(){
        return provinceId;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
