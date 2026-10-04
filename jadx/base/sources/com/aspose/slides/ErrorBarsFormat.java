package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: loaded from: classes3.dex */
public class ErrorBarsFormat extends DomObject<ChartSeries> implements IErrorBarsFormat {

    /* JADX INFO: renamed from: du */
    private float f2211du;

    /* JADX INFO: renamed from: dy */
    private boolean f2212dy;

    /* JADX INFO: renamed from: k4 */
    private final C14332q8 f2213k4;

    /* JADX INFO: renamed from: kk */
    private int f2214kk;

    /* JADX INFO: renamed from: m9 */
    private Format f2215m9;

    /* JADX INFO: renamed from: to */
    private boolean f2216to;

    /* JADX INFO: renamed from: x1 */
    private int f2217x1;

    public ErrorBarsFormat(ChartSeries chartSeries) {
        super(chartSeries);
        this.f2213k4 = new C14332q8();
        this.f2217x1 = 0;
        this.f2214kk = 4;
        this.f2216to = true;
        this.f2215m9 = new Format(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IChartComponent
    public final IChart getChart() {
        return ((ChartSeries) this.f2127h4).getChart();
    }

    @Override // com.aspose.slides.IErrorBarsFormat
    public final IFormat getFormat() {
        return this.f2215m9;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        TParent tparent = this.f2127h4;
        if (tparent != 0) {
            return ((IPresentationComponent) tparent).getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        TParent tparent = this.f2127h4;
        if (tparent != 0) {
            return ((ISlideComponent) tparent).getSlide();
        }
        return null;
    }

    @Override // com.aspose.slides.IErrorBarsFormat
    public final int getType() {
        return this.f2217x1;
    }

    @Override // com.aspose.slides.IErrorBarsFormat
    public final float getValue() {
        if (getValueType() == 0 || getValueType() == 4) {
            return Float.NaN;
        }
        return this.f2211du;
    }

    @Override // com.aspose.slides.IErrorBarsFormat
    public final int getValueType() {
        return this.f2214kk;
    }

    @Override // com.aspose.slides.IErrorBarsFormat
    public final boolean hasEndCap() {
        return this.f2216to;
    }

    @Override // com.aspose.slides.IErrorBarsFormat
    public final boolean isVisible() {
        return this.f2212dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14332q8 m1423k4() {
        return this.f2213k4;
    }

    @Override // com.aspose.slides.IErrorBarsFormat
    public final void setEndCap(boolean z) {
        this.f2216to = z;
    }

    @Override // com.aspose.slides.IErrorBarsFormat
    public final void setFormat(IFormat iFormat) {
        this.f2215m9 = (Format) iFormat;
    }

    @Override // com.aspose.slides.IErrorBarsFormat
    public final void setType(int i) {
        this.f2217x1 = i;
    }

    @Override // com.aspose.slides.IErrorBarsFormat
    public final void setValue(float f) {
        if (getValueType() == 0 || getValueType() == 4) {
            throw new InvalidOperationException("Value of ValueType property must be Fixed, Percentage or StandardDeviation");
        }
        this.f2211du = f;
    }

    @Override // com.aspose.slides.IErrorBarsFormat
    public final void setValueType(int i) {
        this.f2214kk = i;
    }

    @Override // com.aspose.slides.IErrorBarsFormat
    public final void setVisible(boolean z) {
        this.f2212dy = z;
    }
}
