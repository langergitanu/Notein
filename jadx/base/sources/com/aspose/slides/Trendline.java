package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: loaded from: classes3.dex */
public class Trendline extends DomObject<TrendlineCollection> implements ITrendline {

    /* JADX INFO: renamed from: c5 */
    private String f3609c5;

    /* JADX INFO: renamed from: ck */
    private byte f3610ck;

    /* JADX INFO: renamed from: du */
    private boolean f3611du;

    /* JADX INFO: renamed from: dy */
    private double f3612dy;

    /* JADX INFO: renamed from: fa */
    private int f3613fa;

    /* JADX INFO: renamed from: jd */
    private byte f3614jd;

    /* JADX INFO: renamed from: k4 */
    private Chart f3615k4;

    /* JADX INFO: renamed from: kk */
    private double f3616kk;

    /* JADX INFO: renamed from: ks */
    private Format f3617ks;

    /* JADX INFO: renamed from: m9 */
    private double f3618m9;

    /* JADX INFO: renamed from: rv */
    private LegendEntryProperties f3619rv;

    /* JADX INFO: renamed from: to */
    private boolean f3620to;

    /* JADX INFO: renamed from: up */
    private ChartTextFormat f3621up;

    /* JADX INFO: renamed from: x1 */
    private final sdr f3622x1;

    /* JADX INFO: renamed from: yj */
    private TextFrame f3623yj;

    public Trendline(TrendlineCollection trendlineCollection) {
        super(trendlineCollection);
        this.f3622x1 = new sdr();
        this.f3616kk = Double.NaN;
        this.f3618m9 = Double.NaN;
        this.f3612dy = Double.NaN;
        this.f3614jd = (byte) 2;
        this.f3610ck = (byte) 2;
        this.f3613fa = 1;
        this.f3617ks = new Format(this);
        this.f3623yj = new TextFrame(this);
    }

    @Override // com.aspose.slides.IOverridableText
    public final ITextFrame addTextFrameForOverriding(String str) {
        if (this.f3623yj == null) {
            this.f3623yj = new TextFrame(this);
        }
        ((ParagraphCollection) this.f3623yj.getParagraphs()).m2178k4(str);
        return this.f3623yj;
    }

    @Override // com.aspose.slides.ITrendline
    public final double getBackward() {
        return this.f3616kk;
    }

    @Override // com.aspose.slides.IChartComponent
    public final IChart getChart() {
        Chart chart = this.f3615k4;
        if (chart == null) {
            Chart[] chartArr = {chart};
            kke.m63959k4(Chart.class, (InterfaceC14397rj) this.f2127h4, chartArr);
            this.f3615k4 = chartArr[0];
        }
        return this.f3615k4;
    }

    @Override // com.aspose.slides.ITrendline
    public final boolean getDisplayEquation() {
        return this.f3620to;
    }

    @Override // com.aspose.slides.ITrendline
    public final boolean getDisplayRSquaredValue() {
        return this.f3611du;
    }

    @Override // com.aspose.slides.ITrendline
    public final IFormat getFormat() {
        return this.f3617ks;
    }

    @Override // com.aspose.slides.ITrendline
    public final double getForward() {
        return this.f3618m9;
    }

    @Override // com.aspose.slides.ITrendline
    public final double getIntercept() {
        return this.f3612dy;
    }

    @Override // com.aspose.slides.ITrendline
    public final byte getOrder() {
        return this.f3614jd;
    }

    @Override // com.aspose.slides.ITrendline
    public final byte getPeriod() {
        return this.f3610ck;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        if (getChart() != null) {
            return getChart().getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.ITrendline
    public final ILegendEntryProperties getRelatedLegendEntry() {
        if (this.f3619rv == null) {
            this.f3619rv = new LegendEntryProperties(this);
        }
        return this.f3619rv;
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
        if (this.f3621up == null) {
            this.f3621up = new ChartTextFormat(this);
        }
        return this.f3621up;
    }

    @Override // com.aspose.slides.IOverridableText
    public final ITextFrame getTextFrameForOverriding() {
        return this.f3623yj;
    }

    @Override // com.aspose.slides.ITrendline
    public final String getTrendlineName() {
        return this.f3609c5;
    }

    @Override // com.aspose.slides.ITrendline
    public final int getTrendlineType() {
        return this.f3613fa;
    }

    /* JADX INFO: renamed from: k4 */
    public final sdr m3026k4() {
        return this.f3622x1;
    }

    @Override // com.aspose.slides.ITrendline
    public final void setBackward(double d) {
        this.f3616kk = d;
    }

    @Override // com.aspose.slides.ITrendline
    public final void setDisplayEquation(boolean z) {
        this.f3620to = z;
    }

    @Override // com.aspose.slides.ITrendline
    public final void setDisplayRSquaredValue(boolean z) {
        this.f3611du = z;
    }

    @Override // com.aspose.slides.ITrendline
    public final void setFormat(IFormat iFormat) {
        this.f3617ks = (Format) iFormat;
    }

    @Override // com.aspose.slides.ITrendline
    public final void setForward(double d) {
        this.f3618m9 = d;
    }

    @Override // com.aspose.slides.ITrendline
    public final void setIntercept(double d) {
        this.f3612dy = d;
    }

    @Override // com.aspose.slides.ITrendline
    public final void setOrder(byte b) {
        int i = b & 255;
        if (i < 2 || i > 6) {
            throw new ArgumentOutOfRangeException("Value must be between 2 and 6");
        }
        this.f3614jd = b;
    }

    @Override // com.aspose.slides.ITrendline
    public final void setPeriod(byte b) {
        if ((b & 255) < 2) {
            throw new ArgumentOutOfRangeException("Value must be between 2 and 255");
        }
        this.f3610ck = b;
    }

    @Override // com.aspose.slides.ITrendline
    public final void setTrendlineName(String str) {
        this.f3609c5 = str;
    }

    @Override // com.aspose.slides.ITrendline
    public final void setTrendlineType(int i) {
        this.f3613fa = i;
    }
}
