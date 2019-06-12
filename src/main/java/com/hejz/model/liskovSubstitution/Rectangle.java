package com.hejz.model.liskovSubstitution;

/**
 * create by hejz
 */
public class Rectangle implements Quadrangle {

    private long length;
    private long width;


    public void setLength(Long length) {
        this.length = length;
    }

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }

    public void setWidth(Long width) {
        this.width = width;
    }
}
