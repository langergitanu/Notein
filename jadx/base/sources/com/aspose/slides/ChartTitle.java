package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class ChartTitle implements IChartTitle, InterfaceC14397rj {

    /* JADX INFO: renamed from: h4 */
    private InterfaceC14397rj f1526h4;

    /* JADX INFO: renamed from: kk */
    private TextFrame f1528kk;

    /* JADX INFO: renamed from: m9 */
    private Chart f1529m9;

    /* JADX INFO: renamed from: to */
    private ChartTextFormat f1530to;

    /* JADX INFO: renamed from: k4 */
    private boolean f1527k4 = true;

    /* JADX INFO: renamed from: du */
    private C0811bb f1525du = new C0811bb(getChart());

    /* JADX INFO: renamed from: x1 */
    private final Format f1531x1 = new Format(this);

    public ChartTitle(InterfaceC14397rj interfaceC14397rj) {
        this.f1526h4 = interfaceC14397rj;
    }

    @Override // com.aspose.slides.IOverridableText
    public final ITextFrame addTextFrameForOverriding(String str) {
        if (this.f1528kk == null) {
            this.f1528kk = new TextFrame(this);
        }
        ((ParagraphCollection) this.f1528kk.getParagraphs()).m2178k4(str);
        return this.f1528kk;
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getBottom() {
        return m754k4().getBottom();
    }

    @Override // com.aspose.slides.IChartComponent
    public final IChart getChart() {
        Chart chart = this.f1529m9;
        if (chart == null) {
            Chart[] chartArr = {chart};
            kke.m63959k4(Chart.class, this.f1526h4, chartArr);
            this.f1529m9 = chartArr[0];
        }
        return this.f1529m9;
    }

    @Override // com.aspose.slides.IChartTitle
    public final IFormat getFormat() {
        return this.f1531x1;
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getHeight() {
        return m754k4().getHeight();
    }

    @Override // com.aspose.slides.IChartTitle
    public final boolean getOverlay() {
        return this.f1527k4;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1526h4;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        if (getChart() != null) {
            return getChart().getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getRight() {
        return m754k4().getRight();
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        if (getChart() != null) {
            return getChart().getSlide();
        }
        return null;
    }

    @Override // com.aspose.slides.IFormattedTextContainer
    public final IChartTextFormat getTextFormat() {
        if (this.f1530to == null) {
            this.f1530to = new ChartTextFormat(this);
        }
        return this.f1530to;
    }

    @Override // com.aspose.slides.IOverridableText
    public final ITextFrame getTextFrameForOverriding() {
        return this.f1528kk;
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getWidth() {
        return m754k4().getWidth();
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getX() {
        return m754k4().getX();
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getY() {
        return m754k4().getY();
    }

    /* JADX INFO: renamed from: k4 */
    public final C0811bb m754k4() {
        return this.f1525du;
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setHeight(float f) {
        m754k4().setHeight(f);
    }

    @Override // com.aspose.slides.IChartTitle
    public final void setOverlay(boolean z) {
        this.f1527k4 = z;
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setWidth(float f) {
        m754k4().setWidth(f);
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setX(float f) {
        m754k4().setX(f);
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setY(float f) {
        m754k4().setY(f);
    }
}
