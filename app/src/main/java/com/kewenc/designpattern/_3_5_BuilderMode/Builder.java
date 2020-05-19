package com.kewenc.designpattern._3_5_BuilderMode;

public abstract class Builder {

    public abstract MacbookBuilder buildBoard(String board);

    public abstract MacbookBuilder buildDisplay(String display);

    public abstract MacbookBuilder buildOS();

    public abstract Computer create();
}
