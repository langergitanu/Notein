package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IHtmlOptions extends ISaveOptions {
    boolean getDeletePicturesCroppedAreas();

    IHtmlFormatter getHtmlFormatter();

    IInkOptions getInkOptions();

    byte getJpegQuality();

    @Deprecated
    INotesCommentsLayoutingOptions getNotesCommentsLayouting();

    int getPicturesCompression();

    boolean getShowHiddenSlides();

    ISlideImageFormat getSlideImageFormat();

    ISlidesLayoutOptions getSlidesLayoutOptions();

    boolean getSvgResponsiveLayout();

    void setDeletePicturesCroppedAreas(boolean z);

    void setHtmlFormatter(IHtmlFormatter iHtmlFormatter);

    void setJpegQuality(byte b);

    void setPicturesCompression(int i);

    void setShowHiddenSlides(boolean z);

    void setSlideImageFormat(ISlideImageFormat iSlideImageFormat);

    void setSlidesLayoutOptions(ISlidesLayoutOptions iSlidesLayoutOptions);

    void setSvgResponsiveLayout(boolean z);
}
