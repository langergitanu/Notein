package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IPictureFrame extends IGeometryShape {
    IPictureFillFormat getPictureFormat();

    IPictureFrameLock getPictureFrameLock();

    float getRelativeScaleHeight();

    float getRelativeScaleWidth();

    void setRelativeScaleHeight(float f);

    void setRelativeScaleWidth(float f);
}
