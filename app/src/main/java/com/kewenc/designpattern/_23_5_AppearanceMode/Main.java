package com.kewenc.designpattern._23_5_AppearanceMode;

/**
 * 外观模式
 */
public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        //拍照
        mobilePhone.takePicture();
        //视频聊天
        mobilePhone.videoChat();
    }
}
