package com.tachyonic.qrpassword.ui.login;

/**
 * Created by ssahu on 3/27/2015.
 */
public interface LoginPresenter {

    public void validateInput(final String title, final String password, final String key, final String algorithm);

}
