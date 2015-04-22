package com.tachyonic.qrpassword.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tachyonic.qrpassword.R;
import com.tachyonic.qrpassword.ui.BaseFragment;
import com.tachyonic.qrpassword.ui.create.CreatePresenterImpl;

/**
 * Created by ssahu on 3/27/2015.
 */
public class MainFragment extends BaseFragment implements MainView {

    private View mainView;
    private MainPresenter mainPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        mainView = inflater.inflate(R.layout.fragment_create,container);
        mainPresenter = new MainPresenterImpl(this,getActivity());
        return mainView;
    }

    @Override
    public void onResume() {
        super.onResume();
        mainPresenter.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mainPresenter.onPause();
    }

    @Override
    public void showProgressbar() {

    }

    @Override
    public void hideProgressbar() {

    }

    @Override
    public void updateDisplay() {

    }


}
