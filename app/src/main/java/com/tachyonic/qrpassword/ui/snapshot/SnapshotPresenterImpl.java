package com.tachyonic.qrpassword.ui.snapshot;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;

import com.tachyonic.qrpassword.utils.BitmapUtility;

/**
 * Created by ssahu on 3/28/2015.
 */
public class SnapshotPresenterImpl implements SnapshotPresenter  {

    private SnapshotView view;
    private Activity activity;
    private Bundle bundle;

    public SnapshotPresenterImpl(SnapshotView view, Activity activity, Bundle bundle) {
        this.view = view;
        this.activity = activity;
        this.bundle = bundle;
    }

    @Override
    public void loadImage(){

        byte[] imageArray = bundle.getByteArray(SnapshotActivity.SNAPSHOT_IMAGE_ARRAY_KEY);
        Bitmap bitmap = BitmapUtility.convertByteArrayToBitmap(imageArray);
        //TODO IMPL
        if (bitmap != null) {
            view.setImage("");
        }

    }

}
