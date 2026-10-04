package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IColorFormat extends IFillParamSource {
    void copyFrom(IColorFormat iColorFormat);

    byte getB();

    Integer getColor();

    IColorOperationCollection getColorTransform();

    int getColorType();

    float getFloatB();

    float getFloatG();

    float getFloatR();

    byte getG();

    float getHue();

    float getLuminance();

    int getPresetColor();

    byte getR();

    float getSaturation();

    int getSchemeColor();

    int getSystemColor();

    void setB(byte b);

    void setColor(Integer num);

    void setColorType(int i);

    void setFloatB(float f);

    void setFloatG(float f);

    void setFloatR(float f);

    void setG(byte b);

    void setHue(float f);

    void setLuminance(float f);

    void setPresetColor(int i);

    void setR(byte b);

    void setSaturation(float f);

    void setSchemeColor(int i);

    void setSystemColor(int i);

    String toString(int i);
}
