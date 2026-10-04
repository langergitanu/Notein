package com.aspose.slides;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public interface IPatternFormatEffectiveData {
    Integer getBackColor();

    Integer getForeColor();

    byte getPatternStyle();

    IImage getTileIImage(Integer num, Integer num2);

    @Deprecated
    Bitmap getTileImage(Integer num, Integer num2);
}
