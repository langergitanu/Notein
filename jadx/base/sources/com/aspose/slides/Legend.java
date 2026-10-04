package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class Legend extends DomObject<Chart> implements ILegend {

    /* JADX INFO: renamed from: du */
    private final LegendEntryCollection f2589du;

    /* JADX INFO: renamed from: k4 */
    int f2590k4;

    /* JADX INFO: renamed from: kk */
    private boolean f2591kk;

    /* JADX INFO: renamed from: m9 */
    private final ffv f2592m9;

    /* JADX INFO: renamed from: to */
    private ChartTextFormat f2593to;

    /* JADX INFO: renamed from: x1 */
    Format f2594x1;

    public Legend(Chart chart) {
        super(chart);
        this.f2590k4 = 2;
        this.f2592m9 = new ffv(chart);
        this.f2594x1 = new Format(this);
        this.f2589du = new LegendEntryCollection(chart);
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getBottom() {
        return m1859k4().getBottom();
    }

    @Override // com.aspose.slides.IChartComponent
    public final IChart getChart() {
        return (IChart) this.f2127h4;
    }

    @Override // com.aspose.slides.ILegend
    public final ILegendEntryCollection getEntries() {
        return this.f2589du;
    }

    @Override // com.aspose.slides.ILegend
    public final IFormat getFormat() {
        return this.f2594x1;
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getHeight() {
        return m1859k4().getHeight();
    }

    @Override // com.aspose.slides.ILegend
    public final boolean getOverlay() {
        return this.f2591kk;
    }

    @Override // com.aspose.slides.ILegend
    public final int getPosition() {
        return this.f2590k4;
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
        return m1859k4().getRight();
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
        if (this.f2593to == null) {
            this.f2593to = new ChartTextFormat(this);
        }
        return this.f2593to;
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getWidth() {
        return m1859k4().getWidth();
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getX() {
        return m1859k4().getX();
    }

    @Override // com.aspose.slides.ILayoutable
    public final float getY() {
        return m1859k4().getY();
    }

    /* JADX INFO: renamed from: k4 */
    public final ffv m1859k4() {
        return this.f2592m9;
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setHeight(float f) {
        m1859k4().setHeight(f);
    }

    @Override // com.aspose.slides.ILegend
    public final void setOverlay(boolean z) {
        this.f2591kk = z;
    }

    @Override // com.aspose.slides.ILegend
    public final void setPosition(int i) {
        this.f2590k4 = i;
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setWidth(float f) {
        m1859k4().setWidth(f);
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setX(float f) {
        m1859k4().setX(f);
    }

    @Override // com.aspose.slides.ILayoutable
    public final void setY(float f) {
        m1859k4().setY(f);
    }
}
