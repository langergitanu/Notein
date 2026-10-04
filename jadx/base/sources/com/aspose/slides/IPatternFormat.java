package com.aspose.slides;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public interface IPatternFormat {
    IColorFormat getBackColor();

    IColorFormat getForeColor();

    byte getPatternStyle();

    IImage getTile(Integer num);

    IImage getTile(Integer num, Integer num2);

    @Deprecated
    Bitmap getTileImage(Integer num);

    @Deprecated
    Bitmap getTileImage(Integer num, Integer num2);

    void setPatternStyle(byte b);
}
