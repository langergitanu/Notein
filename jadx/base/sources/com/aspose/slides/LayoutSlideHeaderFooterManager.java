package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutSlideHeaderFooterManager extends BaseSlideHeaderFooterManager implements ILayoutSlideHeaderFooterManager {

    /* JADX INFO: renamed from: k4 */
    private final LayoutSlide f2586k4;

    public LayoutSlideHeaderFooterManager(LayoutSlide layoutSlide) {
        super(layoutSlide);
        this.f2586k4 = layoutSlide;
    }

    @Override // com.aspose.slides.BaseSlideHeaderFooterManager
    /* JADX INFO: renamed from: kk */
    public void mo417kk(byte b) {
        BaseHeaderFooterManager.m344k4(m412k4(), (MasterSlide) this.f2586k4.getMasterSlide(), b);
    }

    @Override // com.aspose.slides.ILayoutSlideHeaderFooterManager
    public final void setDateTimeAndChildDateTimesText(String str) {
        m1854x1((byte) 4, str, true);
    }

    @Override // com.aspose.slides.ILayoutSlideHeaderFooterManager
    public final void setDateTimeAndChildDateTimesVisibility(boolean z) {
        m1855x1((byte) 4, z);
    }

    @Override // com.aspose.slides.ILayoutSlideHeaderFooterManager
    public final void setFooterAndChildFootersText(String str) {
        m1854x1((byte) 6, str, false);
    }

    @Override // com.aspose.slides.ILayoutSlideHeaderFooterManager
    public final void setFooterAndChildFootersVisibility(boolean z) {
        m1855x1((byte) 6, z);
    }

    @Override // com.aspose.slides.ILayoutSlideHeaderFooterManager
    public final void setSlideNumberAndChildSlideNumbersVisibility(boolean z) {
        m1855x1((byte) 5, z);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1854x1(byte b, String str, boolean z) {
        m413k4(b, str, z);
        for (ISlide iSlide : this.f2586k4.getDependingSlides()) {
            ((SlideHeaderFooterManager) iSlide.getHeaderFooterManager()).m413k4(b, str, z);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1855x1(byte b, boolean z) {
        m414k4(b, z);
        for (ISlide iSlide : this.f2586k4.getDependingSlides()) {
            ((SlideHeaderFooterManager) iSlide.getHeaderFooterManager()).m414k4(b, z);
        }
    }
}
