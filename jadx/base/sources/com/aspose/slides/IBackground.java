package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IBackground extends IFillParamSource, ISlideComponent {
    IEffectFormat getEffectFormat();

    IBackgroundEffectiveData getEffective();

    IFillFormat getFillFormat();

    IColorFormat getStyleColor();

    int getStyleIndex();

    byte getType();

    void setStyleIndex(int i);

    void setType(byte b);
}
