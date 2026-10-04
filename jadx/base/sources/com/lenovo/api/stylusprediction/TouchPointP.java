package com.lenovo.api.stylusprediction;

/* JADX INFO: loaded from: classes9.dex */
public class TouchPointP {
    private float orientation;
    private float pressure;
    private float tilt;
    private long time;

    /* JADX INFO: renamed from: x */
    private float f57058x;

    /* JADX INFO: renamed from: y */
    private float f57059y;

    public TouchPointP(float f, float f2) {
        this.f57058x = f;
        this.f57059y = f2;
        this.time = 0L;
        this.pressure = 0.0f;
        this.tilt = 0.0f;
        this.orientation = 0.0f;
    }

    public float getOrientation() {
        return this.orientation;
    }

    public float getPressure() {
        return this.pressure;
    }

    public float getTilt() {
        return this.tilt;
    }

    public long getTime() {
        return this.time;
    }

    public float getX() {
        return this.f57058x;
    }

    public float getY() {
        return this.f57059y;
    }

    public void setOrientation(float f) {
        this.orientation = f;
    }

    public void setPressure(float f) {
        this.pressure = f;
    }

    public void setTilt(float f) {
        this.tilt = f;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public void setX(float f) {
        this.f57058x = f;
    }

    public void setY(float f) {
        this.f57059y = f;
    }

    public TouchPointP(float f, float f2, long j) {
        this.f57058x = f;
        this.f57059y = f2;
        this.time = j;
        this.pressure = 0.0f;
        this.tilt = 0.0f;
        this.orientation = 0.0f;
    }

    public TouchPointP(float f, float f2, long j, float f3) {
        this.f57058x = f;
        this.f57059y = f2;
        this.time = j;
        this.pressure = f3;
        this.tilt = 0.0f;
        this.orientation = 0.0f;
    }

    public TouchPointP(float f, float f2, long j, float f3, float f4, float f5) {
        this.f57058x = f;
        this.f57059y = f2;
        this.time = j;
        this.pressure = f3;
        this.tilt = f4;
        this.orientation = f5;
    }
}
