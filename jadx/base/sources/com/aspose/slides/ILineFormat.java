package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ILineFormat extends ILineParamSource {
    boolean equals(ILineFormat iLineFormat);

    byte getAlignment();

    byte getBeginArrowheadLength();

    byte getBeginArrowheadStyle();

    byte getBeginArrowheadWidth();

    byte getCapStyle();

    float[] getCustomDashPattern();

    byte getDashStyle();

    ILineFormatEffectiveData getEffective();

    byte getEndArrowheadLength();

    byte getEndArrowheadStyle();

    byte getEndArrowheadWidth();

    ILineFillFormat getFillFormat();

    byte getJoinStyle();

    float getMiterLimit();

    ISketchFormat getSketchFormat();

    byte getStyle();

    double getWidth();

    boolean isFormatNotDefined();

    void setAlignment(byte b);

    void setBeginArrowheadLength(byte b);

    void setBeginArrowheadStyle(byte b);

    void setBeginArrowheadWidth(byte b);

    void setCapStyle(byte b);

    void setCustomDashPattern(float[] fArr);

    void setDashStyle(byte b);

    void setEndArrowheadLength(byte b);

    void setEndArrowheadStyle(byte b);

    void setEndArrowheadWidth(byte b);

    void setJoinStyle(byte b);

    void setMiterLimit(float f);

    void setStyle(byte b);

    void setWidth(double d);
}
