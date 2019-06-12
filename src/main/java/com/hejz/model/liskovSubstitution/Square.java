package com.hejz.model.liskovSubstitution;

/**
 * @Auther: hejz
 * @Description: 正方形
 * @Date: 2019/6/4 8:46
 */
public class Square implements Quadrangle{
    private long sideLength;

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }
}
