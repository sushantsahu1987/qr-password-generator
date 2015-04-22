package com.tachyonic.qrpassword.ui;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by ssahu on 3/27/2015.
 */
public class BaseActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public void addFragment(int containerId, Fragment fragment, String tag, boolean addToBackStack) {
        //TODO NOT IMPLEMENTED
    }

    public void replaceFragment(int containerId, Fragment fragment, String tag, boolean addToBackStack) {
        //TODO NOT IMPLEMENTED
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        clearTempResources();
    }

    private void clearTempResources() {

    }
}
