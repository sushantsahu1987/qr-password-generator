package com.tachyonic.qrpassword.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ssahu on 3/28/2015.
 */
public class FileUtility {

    public static final String TEMP_SNAPSHOT_FOLDER= "";
    public static final String TEMP_QRLOADER_FOLDER= "";
    private static List<String> imagesArray;

    public static void createTemporarySnapshotFolder() {
        //TODO IMPL
    }

    public static String saveImageToTemporarySnapshotFolder(byte[] imageArray) {
        //TODO IMPL
        String url = "";
        return  url;
    }

    public static void createTemporaryQRLoaderFolder() {
        //TODO IMPL
    }

    public static void loadImagesFromDbToTemporaryQRLoaderFolder() {
        //TODO IMPL
        if(imagesArray == null) {
            imagesArray = new ArrayList<>();
        }

        imagesArray.clear();


    }

    public static List<String> getImagesTemporaryQRLoaderFolder() {
        //TODO IMPL
        return imagesArray;
    }


}
