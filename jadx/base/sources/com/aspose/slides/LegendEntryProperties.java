package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class LegendEntryProperties implements ILegendEntryProperties, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private asn f2596du = new asn();

    /* JADX INFO: renamed from: h4 */
    private ChartTextFormat f2597h4;

    /* JADX INFO: renamed from: k4 */
    private InterfaceC14397rj f2598k4;

    /* JADX INFO: renamed from: kk */
    private ISlideComponent f2599kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f2600m9;

    /* JADX INFO: renamed from: to */
    private Chart f2601to;

    /* JADX INFO: renamed from: x1 */
    private IPresentationComponent f2602x1;

    public LegendEntryProperties(InterfaceC14397rj interfaceC14397rj) {
        this.f2598k4 = interfaceC14397rj;
    }

    @Override // com.aspose.slides.IChartComponent
    public final IChart getChart() {
        Chart chart = this.f2601to;
        if (chart == null) {
            Chart[] chartArr = {chart};
            kke.m63959k4(Chart.class, this.f2598k4, chartArr);
            this.f2601to = chartArr[0];
        }
        return this.f2601to;
    }

    @Override // com.aspose.slides.ILegendEntryProperties
    public final boolean getHide() {
        return this.f2600m9;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2598k4;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        if (m1860k4() != null) {
            return m1860k4().getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        if (m1862x1() != null) {
            return m1862x1().getSlide();
        }
        return null;
    }

    @Override // com.aspose.slides.IFormattedTextContainer
    public final IChartTextFormat getTextFormat() {
        if (this.f2597h4 == null) {
            this.f2597h4 = new ChartTextFormat(this);
        }
        return this.f2597h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final IPresentationComponent m1860k4() {
        IPresentationComponent iPresentationComponent = this.f2602x1;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, this.f2598k4, iPresentationComponentArr);
            this.f2602x1 = iPresentationComponentArr[0];
        }
        return this.f2602x1;
    }

    /* JADX INFO: renamed from: kk */
    public final asn m1861kk() {
        return this.f2596du;
    }

    @Override // com.aspose.slides.ILegendEntryProperties
    public final void setHide(boolean z) {
        this.f2600m9 = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final ISlideComponent m1862x1() {
        ISlideComponent iSlideComponent = this.f2599kk;
        if (iSlideComponent == null) {
            ISlideComponent[] iSlideComponentArr = {iSlideComponent};
            kke.m63959k4(ISlideComponent.class, this.f2598k4, iSlideComponentArr);
            this.f2599kk = iSlideComponentArr[0];
        }
        return this.f2599kk;
    }
}
