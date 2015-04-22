package com.tachyonic.qrpassword.utils;

import android.util.Base64;

import java.security.NoSuchAlgorithmException;

import se.simbio.encryption.Encryption;

/**
 * Created by ssahu on 3/28/2015.
 */
public class EncryptUtility {

    public static String createEncryptedString(String json,String algorithm) throws NoSuchAlgorithmException {

        Encryption encryption = new Encryption.Builder()
                .setKeyLength(128)
                .setKey(getMasterKey())
                .setSalt(getSalt())
                .setIv(getByteIvArray())
                .setCharsetName("UTF8")
                .setIterationCount(65536)
                .setDigestAlgorithm("SHA1")
                .setBase64Mode(Base64.DEFAULT)
                .setAlgorithm(algorithm)
                .setSecureRandomAlgorithm("SHA1PRNG")
                .setSecretKeyType("PBKDF2WithHmacSHA1")
                .build();

        String hashedString = encryption.encryptOrNull(json.toString());
        return hashedString;
    }

    private static String getMasterKey() {
        //TODO NOT IMPLEMENTED
        return null;
    }

    private static String getSalt() {
        //TODO NOT IMPLEMENTED
        return "SALT"; // GET FROM USER OBJECT
    }

    private static byte[] getByteIvArray() {
        //TODO NOT IMPLEMENTED
        byte[] byteIvArray = new byte[1024];
        return byteIvArray; // GET FROM USER OBJECT
    }



}
