package com.tachyonic.qrpassword.ui.main;

/**
 * Created by ssahu on 3/28/2015.
 */
public interface onMainFinishListener {

    public void onSuccess(byte[] imageArray);

    public void onFail(String msg);


}
