package com.tachyonic.qrpassword.ui.create;

/**
 * Created by ssahu on 3/27/2015.
 */
public interface onCreateFinishListener {

    public void onEmptyPasswordError();

    public void onEmptyUsernameError();

    public void onEmptyTitleError();

    public void onMinimumKeyLengthError();

    public void onSuccess(String title,byte[] imageArray);

    public void onFail(String msg);


}
