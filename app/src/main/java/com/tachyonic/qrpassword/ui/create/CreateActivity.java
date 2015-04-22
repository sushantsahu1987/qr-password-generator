package com.tachyonic.qrpassword.ui.create;

import android.os.Bundle;

import com.tachyonic.qrpassword.R;
import com.tachyonic.qrpassword.ui.BaseActivity;

/**
 * Created by ssahu on 3/27/2015.
 */
public class CreateActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        loadCreateQRCodeFragment();
    }

    private void loadCreateQRCodeFragment() {
        CreateFragment fragment = new CreateFragment();
        addFragment(R.id.fl_container,fragment,CreateFragment.class.getSimpleName(),false);
    }
}
