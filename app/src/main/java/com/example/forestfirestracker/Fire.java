package com.example.forestfirestracker;

public class Fire {
    private double mLat;
    private double mLng;
    private String mDate;

    public Fire(double lat,double lng,String date){
        this.mLat = lat;
        this.mLng = lng;
        this.mDate = date;
    }
    public Fire(){

    }
    public double getLat() {
        return mLat;
    }
    public double getLng() {
        return mLng;
    }
    public String getDate() {
        return mDate;
    }
}
