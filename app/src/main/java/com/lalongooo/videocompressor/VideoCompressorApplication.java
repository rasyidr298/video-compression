package com.lalongooo.videocompressor;

import android.app.Application;

import com.lalongooo.videocompressor.file.FileUtils;

public class VideoCompressorApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FileUtils.createApplicationFolder();
    }

}