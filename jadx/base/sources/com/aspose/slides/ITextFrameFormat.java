package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ITextFrameFormat {
    byte getAnchoringType();

    byte getAutofitType();

    byte getCenterText();

    int getColumnCount();

    double getColumnSpacing();

    ITextFrameFormatEffectiveData getEffective();

    boolean getKeepTextFlat();

    double getMarginBottom();

    double getMarginLeft();

    double getMarginRight();

    double getMarginTop();

    float getRotationAngle();

    ITextStyle getTextStyle();

    byte getTextVerticalType();

    IThreeDFormat getThreeDFormat();

    byte getTransform();

    byte getWrapText();

    void setAnchoringType(byte b);

    void setAutofitType(byte b);

    void setCenterText(byte b);

    void setColumnCount(int i);

    void setColumnSpacing(double d);

    void setKeepTextFlat(boolean z);

    void setMarginBottom(double d);

    void setMarginLeft(double d);

    void setMarginRight(double d);

    void setMarginTop(double d);

    void setRotationAngle(float f);

    void setTextVerticalType(byte b);

    void setTransform(byte b);

    void setWrapText(byte b);
}
