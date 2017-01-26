package com.linheimx.app.library.utils;

/**
 * 考虑到性能的原因，采用单例模式
 * --------------------
 * 尽量少的分配内存
 * <p>
 * <p>
 * Created by LJIAN on 2016/11/14.
 */

public class Single_XY {
    private double x;
    private double y;

    private static Single_XY value;

    private Single_XY() {

    }

    public synchronized static Single_XY getInstance() {
        if (value == null) {
            value = new Single_XY();
        }
        return value;
    }

    public double getX() {
        return x;
    }

    public Single_XY setX(double x) {
        this.x = x;
        return this;
    }

    public double getY() {
        return y;
    }

    public Single_XY setY(double y) {
        this.y = y;
        return this;
    }

    @Override
    public String toString() {
        return "U_XY  x: " + x + " y:" + y;
    }
}
