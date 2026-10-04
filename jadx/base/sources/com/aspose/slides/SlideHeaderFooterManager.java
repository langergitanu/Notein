package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class SlideHeaderFooterManager extends BaseSlideHeaderFooterManager implements ISlideHeaderFooterManager {

    /* JADX INFO: renamed from: k4 */
    private final Slide f3398k4;

    public SlideHeaderFooterManager(Slide slide) {
        super(slide);
        this.f3398k4 = slide;
    }

    @Override // com.aspose.slides.BaseSlideHeaderFooterManager
    /* JADX INFO: renamed from: kk */
    public void mo417kk(byte b) {
        BaseHeaderFooterManager.m344k4(m412k4(), this.f3398k4.m2687bv(), b);
    }
}
