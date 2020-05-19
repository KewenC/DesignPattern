package com.kewenc.designpattern._3_5_BuilderMode;

public class Macbook extends Computer {

    protected Macbook() {

    }

    @Override
    public void setOS() {
        mOS = "Mac OS X 10.10";
    }
}
