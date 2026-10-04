package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ILineFillFormat extends IFillParamSource {
    byte getFillType();

    IGradientFormat getGradientFormat();

    IPatternFormat getPatternFormat();

    byte getRotateWithShape();

    IColorFormat getSolidFillColor();

    void setFillType(byte b);

    void setRotateWithShape(byte b);
}
