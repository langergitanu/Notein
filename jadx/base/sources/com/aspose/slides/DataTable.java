package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class DataTable extends DomObject<Chart> implements IDataTable {

    /* JADX INFO: renamed from: du */
    Format f2108du;

    /* JADX INFO: renamed from: dy */
    private final C0898de f2109dy;

    /* JADX INFO: renamed from: k4 */
    boolean f2110k4;

    /* JADX INFO: renamed from: kk */
    boolean f2111kk;

    /* JADX INFO: renamed from: m9 */
    private ChartTextFormat f2112m9;

    /* JADX INFO: renamed from: to */
    boolean f2113to;

    /* JADX INFO: renamed from: x1 */
    boolean f2114x1;

    public DataTable(Chart chart) {
        super(chart);
        this.f2109dy = new C0898de();
        this.f2108du = new Format(this);
    }

    @Override // com.aspose.slides.IChartComponent
    public final IChart getChart() {
        return (IChart) this.f2127h4;
    }

    @Override // com.aspose.slides.IDataTable
    public final IFormat getFormat() {
        return this.f2108du;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        if (getChart() != null) {
            return getChart().getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.IDataTable
    public final boolean getShowLegendKey() {
        return this.f2113to;
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
        if (this.f2112m9 == null) {
            this.f2112m9 = new ChartTextFormat(this);
        }
        return this.f2112m9;
    }

    @Override // com.aspose.slides.IDataTable
    public final boolean hasBorderHorizontal() {
        return this.f2110k4;
    }

    @Override // com.aspose.slides.IDataTable
    public final boolean hasBorderOutline() {
        return this.f2111kk;
    }

    @Override // com.aspose.slides.IDataTable
    public final boolean hasBorderVertical() {
        return this.f2114x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C0898de m1325k4() {
        return this.f2109dy;
    }

    @Override // com.aspose.slides.IDataTable
    public final void setBorderHorizontal(boolean z) {
        this.f2110k4 = z;
    }

    @Override // com.aspose.slides.IDataTable
    public final void setBorderOutline(boolean z) {
        this.f2111kk = z;
    }

    @Override // com.aspose.slides.IDataTable
    public final void setBorderVertical(boolean z) {
        this.f2114x1 = z;
    }

    @Override // com.aspose.slides.IDataTable
    public final void setShowLegendKey(boolean z) {
        this.f2113to = z;
    }
}
