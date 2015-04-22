package com.tachyonic.qrpassword.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;

import java.io.ByteArrayOutputStream;
import java.security.NoSuchAlgorithmException;

import se.simbio.encryption.Encryption;

/**
 * Created by ssahu on 3/27/2015.
 */
public class QRUtility {


    public static byte[] createEncodedQRCode(final String hashedString, final int smallerDimension) throws WriterException {

        QRCodeEncoder qrCodeEncoder = new QRCodeEncoder(hashedString,
                null,
                Contents.Type.TEXT,
                BarcodeFormat.QR_CODE.toString(),
                smallerDimension);
        Bitmap bitmap = qrCodeEncoder.encodeAsBitmap();
        return BitmapUtility.convertBitmapToByteArray(bitmap);
    }

}
