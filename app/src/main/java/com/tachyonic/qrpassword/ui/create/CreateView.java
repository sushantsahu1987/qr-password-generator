package com.tachyonic.qrpassword.ui.create;

/**
 * Created by ssahu on 3/27/2015.
 */
public interface CreateView {

    public void navigateToSnapshotScreen(byte[] imageArray);

    public void setEmptyPasswordError();

    public void setEmptyUsernameError();

    public void setEmptyTitleError();

    public void setMinimumKeyLengthError();

    public void setUnknownError(String msg);

}
