package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: loaded from: classes3.dex */
public class ChartSeriesGroup implements IChartSeriesGroup, InterfaceC14397rj {

    /* JADX INFO: renamed from: ck */
    private int f1500ck;

    /* JADX INFO: renamed from: du */
    private boolean f1501du;

    /* JADX INFO: renamed from: dy */
    private int f1502dy;

    /* JADX INFO: renamed from: fa */
    private byte f1503fa;

    /* JADX INFO: renamed from: h4 */
    private C14886zi f1504h4;

    /* JADX INFO: renamed from: ix */
    private int f1505ix;

    /* JADX INFO: renamed from: jd */
    private boolean f1506jd;

    /* JADX INFO: renamed from: k4 */
    private final C14346qh f1507k4;

    /* JADX INFO: renamed from: ks */
    private IChartLinesFormat f1509ks;

    /* JADX INFO: renamed from: m9 */
    private UpDownBarsManager f1510m9;

    /* JADX INFO: renamed from: rv */
    private int f1512rv;

    /* JADX INFO: renamed from: to */
    private int f1513to;

    /* JADX INFO: renamed from: up */
    private IChartLinesFormat f1515up;

    /* JADX INFO: renamed from: x1 */
    private Chart f1518x1;

    /* JADX INFO: renamed from: x6 */
    private final PieSplitCustomPointCollection f1519x6;

    /* JADX INFO: renamed from: yj */
    private IChartLinesFormat f1520yj;

    /* JADX INFO: renamed from: c5 */
    private int f1499c5 = 150;

    /* JADX INFO: renamed from: ne */
    private double f1511ne = 2.0d;

    /* JADX INFO: renamed from: u4 */
    private byte f1514u4 = 10;

    /* JADX INFO: renamed from: uz */
    private int f1516uz = 75;

    /* JADX INFO: renamed from: wl */
    private int f1517wl = 100;

    /* JADX INFO: renamed from: kk */
    private C14235of f1508kk = new C14235of();

    public ChartSeriesGroup(C14346qh c14346qh, ChartSeries chartSeries) {
        this.f1507k4 = c14346qh;
        this.f1513to = ChartTypeCharacterizer.m756ck(chartSeries.getType());
        this.f1501du = chartSeries.getPlotOnSecondAxis();
        C14886zi c14886zi = new C14886zi(this);
        this.f1504h4 = c14886zi;
        c14886zi.m74527k4(chartSeries);
        this.f1510m9 = new UpDownBarsManager(this);
        this.f1519x6 = new PieSplitCustomPointCollection(this);
        this.f1502dy = ChartTypeCharacterizer.m769x1(chartSeries.getType());
    }

    /* JADX INFO: renamed from: du */
    public final boolean m747du() {
        IChartLinesFormat iChartLinesFormat = this.f1520yj;
        return (iChartLinesFormat == null || iChartLinesFormat.getLine().getFillFormat().getFillType() == 0) ? false : true;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final int getBubbleSizeRepresentation() {
        return this.f1512rv;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final int getBubbleSizeScale() {
        return this.f1517wl;
    }

    @Override // com.aspose.slides.IChartComponent
    public final IChart getChart() {
        Chart chart = this.f1518x1;
        if (chart == null) {
            Chart[] chartArr = {chart};
            kke.m63959k4(Chart.class, this.f1507k4, chartArr);
            this.f1518x1 = chartArr[0];
        }
        return this.f1518x1;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final byte getDoughnutHoleSize() {
        return this.f1514u4;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final int getFirstSliceAngle() {
        return this.f1500ck;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final int getGapDepth() {
        return this.f1499c5;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final int getGapWidth() {
        return this.f1502dy;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final IChartLinesFormat getHiLowLinesFormat() {
        if (this.f1520yj == null) {
            this.f1520yj = new ChartLinesFormat(this);
        }
        return this.f1520yj;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final byte getOverlap() {
        return this.f1503fa;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1507k4;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final int getPieSplitBy() {
        return this.f1505ix;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final IPieSplitCustomPointCollection getPieSplitCustomPoints() {
        return this.f1519x6;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final double getPieSplitPosition() {
        return this.f1511ne;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final boolean getPlotOnSecondAxis() {
        return this.f1501du;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        if (getChart() != null) {
            return getChart().getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final int getSecondPieSize() {
        return this.f1516uz;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final IChartSeriesReadonlyCollection getSeries() {
        return this.f1504h4;
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        if (getChart() != null) {
            return getChart().getSlide();
        }
        return null;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final int getType() {
        return this.f1513to;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final IUpDownBarsManager getUpDownBars() {
        return this.f1510m9;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final IChartSeries get_Item(int i) {
        return this.f1504h4.get_Item(i);
    }

    /* JADX INFO: renamed from: h4 */
    public final C14235of m748h4() {
        return this.f1508kk;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final boolean hasSeriesLines() {
        IChartLinesFormat iChartLinesFormat = this.f1509ks;
        return (iChartLinesFormat == null || iChartLinesFormat.getLine().getFillFormat().getFillType() == 0) ? false : true;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final boolean isColorVaried() {
        return this.f1506jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m749k4() {
        return m748h4().m68508k4();
    }

    /* JADX INFO: renamed from: kk */
    public final IChartLinesFormat m750kk() {
        if (this.f1515up == null) {
            this.f1515up = new ChartLinesFormat(this);
        }
        return this.f1515up;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final void setBubbleSizeRepresentation(int i) {
        this.f1512rv = i;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final void setBubbleSizeScale(int i) {
        if (i < 0 || i > 300) {
            throw new ArgumentOutOfRangeException("BubbleSizeScale can be from 0 to 300.");
        }
        this.f1517wl = i;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final void setColorVaried(boolean z) {
        this.f1506jd = z;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final void setDoughnutHoleSize(byte b) {
        int i = b & 255;
        if (i < 0 || i > 90) {
            throw new ArgumentOutOfRangeException("DoughnutHoleSize can be from 0 to 90 persents.");
        }
        this.f1514u4 = b;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final void setFirstSliceAngle(int i) {
        int i2 = 65535 & i;
        if (i2 < 0 || i2 > 360) {
            throw new ArgumentOutOfRangeException("FirstSliceAngle can be from 0 to 360 degrees.");
        }
        this.f1500ck = i;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final void setGapDepth(int i) {
        this.f1499c5 = i;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final void setGapWidth(int i) {
        this.f1502dy = i;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final void setOverlap(byte b) {
        if (b < -100 || b > 100) {
            throw new ArgumentOutOfRangeException("Overlap value should be in the range from -100 to 100.");
        }
        this.f1503fa = b;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final void setPieSplitBy(int i) {
        this.f1505ix = i;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final void setPieSplitPosition(double d) {
        this.f1511ne = d;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final void setSecondPieSize(int i) {
        int i2 = 65535 & i;
        if (i2 < 5 || i2 > 200) {
            throw new ArgumentOutOfRangeException("SecondPieSize can be from 5 to 200.");
        }
        this.f1516uz = i;
    }

    @Override // com.aspose.slides.IChartSeriesGroup
    public final void setSeriesLines(boolean z) {
        IChartLinesFormat iChartLinesFormat = this.f1509ks;
        if (iChartLinesFormat != null) {
            iChartLinesFormat.getLine().getFillFormat().setFillType(z ? (byte) -1 : (byte) 0);
        } else if (z) {
            ChartLinesFormat chartLinesFormat = new ChartLinesFormat(this);
            this.f1509ks = chartLinesFormat;
            chartLinesFormat.getLine().getFillFormat().setFillType((byte) -1);
        }
    }

    /* JADX INFO: renamed from: to */
    public final boolean m751to() {
        IChartLinesFormat iChartLinesFormat = this.f1515up;
        return (iChartLinesFormat == null || iChartLinesFormat.getLine().getFillFormat().getFillType() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: x1 */
    public final IChartLinesFormat m752x1() {
        if (this.f1509ks == null) {
            this.f1509ks = new ChartLinesFormat(this);
        }
        return this.f1509ks;
    }
}
