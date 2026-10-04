package com.aspose.slides;

import com.aspose.slides.android.SizeF;

/* JADX INFO: loaded from: classes3.dex */
public interface IHtmlGenerator {
    void addAttributeValue(String str);

    void addAttributeValue(char[] cArr);

    void addAttributeValue(char[] cArr, int i, int i2);

    void addHtml(String str);

    void addHtml(char[] cArr);

    void addHtml(char[] cArr, int i, int i2);

    void addText(String str);

    void addText(char[] cArr);

    void addText(char[] cArr, int i, int i2);

    int getNextSlideIndex();

    int getPreviousSlideIndex();

    SizeF getSlideImageSize();

    int getSlideImageSizeUnit();

    String getSlideImageSizeUnitCode();

    int getSlideIndex();
}
