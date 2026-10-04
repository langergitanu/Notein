package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ICamera {
    int getCameraType();

    float getFieldOfViewAngle();

    float[] getRotation();

    float getZoom();

    void setCameraType(int i);

    void setFieldOfViewAngle(float f);

    void setRotation(float f, float f2, float f3);

    void setZoom(float f);
}
