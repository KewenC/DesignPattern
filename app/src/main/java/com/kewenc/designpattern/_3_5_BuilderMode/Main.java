package com.kewenc.designpattern._3_5_BuilderMode;

public class Main {
    public static void main(String[] args) {
        Builder builder = new MacbookBuilder();
        builder.buildBoard("英特尔主板");
        builder.buildDisplay("Retina显示器");
        builder.create();

        //链式调用
        Builder builder1 = new MacbookBuilder();
        builder1.buildBoard("英特尔主板")
                .buildDisplay("Retina显示器")
                .create();
    }
}
