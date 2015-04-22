package com.tachyonic.qrpassword.ui.main;

import android.app.Fragment;
import android.os.Bundle;

import com.tachyonic.qrpassword.R;
import com.tachyonic.qrpassword.ui.BaseActivity;

/**
 * Created by ssahu on 3/27/2015.
 */
public class MainActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        loadMainFragment();
    }

    private void loadMainFragment() {
        Fragment fragment = new MainFragment();
        addFragment(R.id.fl_container,fragment,MainFragment.class.getSimpleName(),false);
    }
}
