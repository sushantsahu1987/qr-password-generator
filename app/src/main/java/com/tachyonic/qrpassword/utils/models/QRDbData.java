package com.tachyonic.qrpassword.utils.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.Arrays;

/**
 * Created by ssahu on 3/28/2015.
 */
@Table(name = "QRDbDataTable")
public class QRDbData extends Model {

    @Column(name = "ImageBlob")
    private byte[] imageBlob;
    @Column(name = "DateOfCreation")
    private long time;
    @Column(name = "Title")
    private String title;

    public byte[] getImageBlob() {
        return imageBlob;
    }

    public void setImageBlob(byte[] imageBlob) {
        this.imageBlob = imageBlob;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "QRDbData{" +
                "time=" + time +
                ", title='" + title + '\'' +
                '}';
    }
}
