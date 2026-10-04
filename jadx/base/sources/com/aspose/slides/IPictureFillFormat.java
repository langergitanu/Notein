package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IPictureFillFormat extends IFillParamSource {
    IPPImage deletePictureCroppedAreas();

    float getCropBottom();

    float getCropLeft();

    float getCropRight();

    float getCropTop();

    int getDpi();

    ISlidesPicture getPicture();

    int getPictureFillMode();

    float getStretchOffsetBottom();

    float getStretchOffsetLeft();

    float getStretchOffsetRight();

    float getStretchOffsetTop();

    void setCropBottom(float f);

    void setCropLeft(float f);

    void setCropRight(float f);

    void setCropTop(float f);

    void setDpi(int i);

    void setPictureFillMode(int i);

    void setStretchOffsetBottom(float f);

    void setStretchOffsetLeft(float f);

    void setStretchOffsetRight(float f);

    void setStretchOffsetTop(float f);
}
