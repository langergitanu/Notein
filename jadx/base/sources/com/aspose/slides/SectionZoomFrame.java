package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: loaded from: classes3.dex */
public class SectionZoomFrame extends ZoomObject implements ISectionZoomFrame {

    /* JADX INFO: renamed from: k4 */
    private ISection f3287k4;

    /* JADX INFO: renamed from: x1 */
    private C14047bz f3288x1;

    public SectionZoomFrame(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f3288x1 = new C14047bz();
    }

    @Override // com.aspose.slides.ISectionZoomFrame
    public final ISection getTargetSection() {
        return this.f3287k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14047bz m2525k4() {
        return this.f3288x1.Clone();
    }

    @Override // com.aspose.slides.ISectionZoomFrame
    public final void setTargetSection(ISection iSection) {
        if (iSection.getStartedFromSlide() != null) {
            this.f3287k4 = iSection;
            m2527k4(((Section) iSection).m2517k4().Clone());
            setTargetSlide(this.f3287k4.getStartedFromSlide());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2526k4(ISection iSection) {
        this.f3287k4 = iSection;
        m2527k4(((Section) iSection).m2517k4().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2527k4(C14047bz c14047bz) {
        this.f3288x1 = c14047bz.Clone();
    }
}
