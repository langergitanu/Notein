package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IShapeStyle {
    IColorFormat getEffectColor();

    long getEffectStyleIndex();

    IColorFormat getFillColor();

    short getFillStyleIndex();

    byte getFontCollectionIndex();

    IColorFormat getFontColor();

    IColorFormat getLineColor();

    int getLineStyleIndex();

    void setEffectStyleIndex(long j);

    void setFillStyleIndex(short s);

    void setFontCollectionIndex(byte b);

    void setLineStyleIndex(int i);
}
