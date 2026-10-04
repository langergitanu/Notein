package com.aspose.slides;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public interface IPPImage {
    byte[] getBinaryData();

    String getContentType();

    int getHeight();

    IImage getImage();

    ISvgImage getSvgImage();

    Bitmap getSystemImage();

    int getWidth();

    int getX();

    int getY();

    void replaceImage(IImage iImage);

    void replaceImage(IPPImage iPPImage);

    void replaceImage(byte[] bArr);

    void setSvgImage(ISvgImage iSvgImage);
}
