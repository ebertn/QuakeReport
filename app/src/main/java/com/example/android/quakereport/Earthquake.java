package com.example.android.quakereport;

/**
 * Created by nicke on 6/18/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mPlace;
    private long mTimeInMilliseconds;
    private String mURL;

    public Earthquake(double magnitude, String place, long timeInMilliseconds, String URL) {
        this.mMagnitude = magnitude;
        this.mTimeInMilliseconds = timeInMilliseconds;
        this.mPlace = place;
        this.mURL = URL;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getPlace() {
        return mPlace;
    }

    public String getURL() {
        return mURL;
    }
}

