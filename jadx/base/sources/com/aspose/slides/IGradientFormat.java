package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IGradientFormat extends IFillParamSource {
    int getGradientDirection();

    byte getGradientShape();

    IGradientStopCollection getGradientStops();

    float getLinearGradientAngle();

    byte getLinearGradientScaled();

    int getTileFlip();

    void setGradientDirection(int i);

    void setGradientShape(byte b);

    void setLinearGradientAngle(float f);

    void setLinearGradientScaled(byte b);

    void setTileFlip(int i);
}
