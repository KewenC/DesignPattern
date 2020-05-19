package com.kewenc.designpattern._3_5_BuilderMode;

/**
 * 具体的Builder类， MacbookBuilder
 */
public class MacbookBuilder extends Builder {

    private Computer mComputer = new Macbook();
    @Override
    public MacbookBuilder buildBoard(String board) {
        mComputer.setBoard(board);
        return this;
    }

    @Override
    public MacbookBuilder buildDisplay(String display) {
        mComputer.setDisplay(display);
        return this;
    }

    @Override
    public MacbookBuilder buildOS() {
        mComputer.setOS();
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }

}
