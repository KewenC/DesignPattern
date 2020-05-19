package com.kewenc.designpattern._23_5_AppearanceMode;

import android.util.Log;

public class PhoneImpl implements Phone {

    @Override
    public void dail() {
        Log.i("TAGF", "打电话");
    }

    @Override
    public void hangup() {
        Log.i("TAGF", "挂断");
    }
}
