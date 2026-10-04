package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ILayoutSlide extends IBaseSlide, IOverrideThemeable {
    ISlide[] getDependingSlides();

    ILayoutSlideHeaderFooterManager getHeaderFooterManager();

    byte getLayoutType();

    IMasterSlide getMasterSlide();

    boolean hasDependingSlides();

    void remove();

    void setMasterSlide(IMasterSlide iMasterSlide);
}
