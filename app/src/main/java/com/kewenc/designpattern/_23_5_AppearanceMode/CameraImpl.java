package com.kewenc.designpattern._23_5_AppearanceMode;

import android.util.Log;

public class CameraImpl implements Camera {
    @Override
    public void open() {
        Log.i("TAGF", "打开照相机");
    }

    @Override
    public void takePicture() {
        Log.i("TAGF", "拍照");
    }

    @Override
    public void close() {
        Log.i("TAGF", "关闭相机");
    }
}
