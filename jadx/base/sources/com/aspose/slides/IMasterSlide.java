package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IMasterSlide extends IBaseSlide, IMasterThemeable {
    IMasterSlide applyExternalThemeToDependingSlides(String str);

    ITextStyle getBodyStyle();

    ISlide[] getDependingSlides();

    IMasterSlideHeaderFooterManager getHeaderFooterManager();

    IMasterLayoutSlideCollection getLayoutSlides();

    ITextStyle getOtherStyle();

    boolean getPreserve();

    ITextStyle getTitleStyle();

    boolean hasDependingSlides();

    void setPreserve(boolean z);
}
