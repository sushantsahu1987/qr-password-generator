package com.tachyonic.qrpassword.ui.create;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.zxing.WriterException;
import com.tachyonic.qrpassword.utils.EncryptUtility;
import com.tachyonic.qrpassword.utils.QRUtility;

import org.json.JSONException;
import org.json.JSONObject;

import java.security.NoSuchAlgorithmException;

/**
 * Created by ssahu on 3/28/2015.
 */
public class CreateInteractorImpl implements CreateInteractor {

    public void createQRCode(CreateQRModel qrModel, int smallerDimension, onCreateFinishListener listener) {

        if (TextUtils.isEmpty(qrModel.getTitle())) {
            listener.onEmptyTitleError();
        } else if (TextUtils.isEmpty(qrModel.getPassword())) {
            listener.onEmptyPasswordError();
        } else if (TextUtils.isEmpty(qrModel.getUsername())) {
            listener.onEmptyUsernameError();
        } else {
            Gson gson = new Gson();
            try {
                String json = gson.toJson(qrModel);
                String hashedString = EncryptUtility.createEncryptedString(json,qrModel.getAlgorithm());
                byte[] imageArray = QRUtility.createEncodedQRCode(hashedString, smallerDimension);
                listener.onSuccess(qrModel.getTitle(),imageArray);
            } catch (WriterException e) {
                listener.onFail(e.getMessage());
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                listener.onFail(e.getMessage());
            }
        }

    }

}
