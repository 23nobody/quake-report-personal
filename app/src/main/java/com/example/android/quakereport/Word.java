package com.example.android.quakereport;

public class Word {
    private double  mMagnitude;
    private String mPlace;
    private long mTimeInMilliSeconds;
    private String mUrl;

    public Word(double magnitude, String place, long TimeInMilliSeconds,String url)
    {
        mMagnitude=magnitude;
        mPlace=place;
        mTimeInMilliSeconds=TimeInMilliSeconds;
        mUrl=url;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public long getmTimeInMilliSeconds() {
        return mTimeInMilliSeconds;
    }

    public String getmPlace() {
        return mPlace;
    }
    public String getmUrl(){return mUrl;}

    @Override
    public String toString() {
        return "Word{" +
                "mMagnitude=" + mMagnitude +
                ", mPlace='" + mPlace + '\'' +
                ", mTimeInMilliSeconds=" + mTimeInMilliSeconds +
                ", mUrl='" + mUrl + '\'' +
                '}';
    }
}

