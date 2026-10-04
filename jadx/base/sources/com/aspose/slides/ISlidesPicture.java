package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ISlidesPicture extends ISlideComponent {
    IPPImage getImage();

    IImageTransformOperationCollection getImageTransform();

    String getLinkPathLong();

    void setImage(IPPImage iPPImage);

    void setLinkPathLong(String str);
}
