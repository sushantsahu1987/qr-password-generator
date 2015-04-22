package com.tachyonic.qrpassword.ui.snapshot;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.tachyonic.qrpassword.R;
import com.tachyonic.qrpassword.ui.BaseFragment;
import com.tachyonic.qrpassword.utils.BitmapUtility;
import com.tachyonic.qrpassword.utils.QRUtility;

/**
 * Created by ssahu on 3/27/2015.
 */
public class SnapshotFragment extends BaseFragment implements SnapshotView {

    private View snapshotView;
    private ImageView ivSnapshot;
    private SnapshotPresenter presenter;
    private Bundle bundle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        snapshotView = inflater.inflate(R.layout.fragment_snapshot, container);
        return snapshotView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
        initUI();
        bindCallbacks();
    }

    private void initData() {
        bundle = getActivity().getIntent().getExtras();
    }

    private void initUI() {
        ivSnapshot = (ImageView) snapshotView.findViewById(R.id.ivSnapshot);
        presenter = new SnapshotPresenterImpl(this,getActivity(),bundle);
    }

    private void bindCallbacks() {

    }


    @Override
    public void setImage(String url) {
        Picasso.with(getActivity()).load(url).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).fit().into(ivSnapshot);
    }
}
