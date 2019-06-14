package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import com.example.android.quakereport.QueryUtils;
import com.example.android.quakereport.Word;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Word>> {
    private final String LOG_TAG = EarthquakeLoader.class.getName();

    /** Query URL */
    private String mUrl;

    /**
     * Constructs a new {@link EarthquakeLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     */
    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Override
    public List<Word> loadInBackground() {
        if (mUrl==null) {
            return null;
        }

        List<Word> result = QueryUtils.fetchEarthquakeData(mUrl);
        return result;
    }
}