package com.tachyonic.qrpassword.ui.create;

/**
 * Created by ssahu on 3/28/2015.
 */
public interface CreateInteractor {

    public void createQRCode(CreateQRModel qrModel,int smallerDimension, onCreateFinishListener listener);
}
