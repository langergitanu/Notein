package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IFillFormat extends IFillParamSource {
    IFillFormatEffectiveData getEffective();

    byte getFillType();

    IGradientFormat getGradientFormat();

    IPatternFormat getPatternFormat();

    IPictureFillFormat getPictureFillFormat();

    byte getRotateWithShape();

    IColorFormat getSolidFillColor();

    void setFillType(byte b);

    void setRotateWithShape(byte b);
}
