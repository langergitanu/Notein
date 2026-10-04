package com.aspose.slides;

import com.aspose.slides.android.Size;

/* JADX INFO: loaded from: classes3.dex */
public interface ITiffOptions extends ISaveOptions {
    int getBwConversionMode();

    int getCompressionType();

    long getDpiX();

    long getDpiY();

    Size getImageSize();

    IInkOptions getInkOptions();

    @Deprecated
    INotesCommentsLayoutingOptions getNotesCommentsLayouting();

    int getPixelFormat();

    boolean getShowHiddenSlides();

    ISlidesLayoutOptions getSlidesLayoutOptions();

    void setBwConversionMode(int i);

    void setCompressionType(int i);

    void setDpiX(long j);

    void setDpiY(long j);

    void setImageSize(Size size);

    void setPixelFormat(int i);

    void setShowHiddenSlides(boolean z);

    void setSlidesLayoutOptions(ISlidesLayoutOptions iSlidesLayoutOptions);
}
