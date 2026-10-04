package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IZoomObject extends IGraphicalObject {
    int getImageType();

    boolean getReturnToParent();

    boolean getShowBackground();

    float getTransitionDuration();

    IPPImage getZoomImage();

    void setImageType(int i);

    void setReturnToParent(boolean z);

    void setShowBackground(boolean z);

    void setTransitionDuration(float f);

    void setZoomImage(IPPImage iPPImage);
}
