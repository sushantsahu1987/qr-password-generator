package com.tachyonic.qrpassword.ui.snapshot;

import android.os.Bundle;

import com.tachyonic.qrpassword.R;
import com.tachyonic.qrpassword.ui.BaseActivity;

/**
 * Created by ssahu on 3/27/2015.
 */
public class SnapshotActivity extends BaseActivity {

    public static final String SNAPSHOT_IMAGE_ARRAY_KEY = "SNAPSHOT_IMAGE_ARRAY_KEY";
    public static final String SNAPSHOT_QR_TITLE_KEY = "SNAPSHOT_QR_TITLE_KEY";
    public static final String SNAPSHOT_SHOW_INFO_KEY = "SNAPSHOT_QR_TITLE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        launchSnapshotFragment();

    }

    private void launchSnapshotFragment() {
        SnapshotFragment fragment = new SnapshotFragment();
        addFragment(R.id.fl_container,fragment,SnapshotFragment.class.getSimpleName(),false);
    }
}
