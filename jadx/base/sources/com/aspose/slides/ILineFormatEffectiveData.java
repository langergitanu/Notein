package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ILineFormatEffectiveData extends ILineParamSource {
    boolean equals(ILineFormatEffectiveData iLineFormatEffectiveData);

    byte getAlignment();

    byte getBeginArrowheadLength();

    byte getBeginArrowheadStyle();

    byte getBeginArrowheadWidth();

    byte getCapStyle();

    float[] getCustomDashPattern();

    byte getDashStyle();

    byte getEndArrowheadLength();

    byte getEndArrowheadStyle();

    byte getEndArrowheadWidth();

    ILineFillFormatEffectiveData getFillFormat();

    byte getJoinStyle();

    float getMiterLimit();

    ISketchFormatEffectiveData getSketchFormat();

    byte getStyle();

    double getWidth();
}
