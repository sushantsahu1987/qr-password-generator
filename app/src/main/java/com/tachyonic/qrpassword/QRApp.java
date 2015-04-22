package com.tachyonic.qrpassword;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

/**
 * Created by ssahu on 3/27/2015.
 */
public class QRApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
