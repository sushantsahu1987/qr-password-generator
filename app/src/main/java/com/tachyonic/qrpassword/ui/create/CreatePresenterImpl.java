package com.tachyonic.qrpassword.ui.create;

import android.app.Activity;
import android.view.Display;
import android.view.WindowManager;

import com.tachyonic.qrpassword.utils.models.QRDbData;

import java.util.Date;

/**
 * Created by ssahu on 3/27/2015.
 */
public class CreatePresenterImpl implements  CreatePresenter, onCreateFinishListener{

    private CreateInteractor createInteractor;
    private CreateView createView;
    private int smallerDimension;

    public CreatePresenterImpl(CreateView createView,Activity activity) {
        this.createView = createView;
        this.createInteractor = new CreateInteractorImpl();

        WindowManager manager = (WindowManager) activity.getSystemService(Activity.WINDOW_SERVICE);
        Display display = manager.getDefaultDisplay();
        int width = display.getWidth();
        int height = display.getHeight();
        smallerDimension = width < height ? width : height;
        smallerDimension = smallerDimension * 7 / 8;
    }

    @Override
    public void validateInput(CreateQRModel qrModel) {
        createInteractor.createQRCode(qrModel,smallerDimension,this);
    }

    @Override
    public void onEmptyPasswordError() {
        createView.setEmptyPasswordError();
    }

    @Override
    public void onEmptyUsernameError() {
        createView.setEmptyUsernameError();
    }

    @Override
    public void onEmptyTitleError() {
        createView.setEmptyTitleError();
    }

    @Override
    public void onMinimumKeyLengthError() {
        createView.setMinimumKeyLengthError();
    }

    @Override
    public void onSuccess(String title, byte[] imageArray) {
        QRDbData qrDbData = new QRDbData();
        qrDbData.setTitle(title);
        qrDbData.setImageBlob(imageArray);
        qrDbData.setTime(new Date().getTime());
        qrDbData.save();
        createView.navigateToSnapshotScreen(imageArray);
    }

    @Override
    public void onFail(String msg) {
        createView.setUnknownError(msg);
    }
}
