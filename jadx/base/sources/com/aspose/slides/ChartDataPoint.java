package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: loaded from: classes3.dex */
public class ChartDataPoint implements IChartDataPoint, InterfaceC14397rj {

    /* JADX INFO: renamed from: ak */
    private C14656uy f1350ak;

    /* JADX INFO: renamed from: b3 */
    private C14656uy f1352b3;

    /* JADX INFO: renamed from: bv */
    private boolean f1353bv;

    /* JADX INFO: renamed from: c6 */
    private C14656uy f1355c6;

    /* JADX INFO: renamed from: ck */
    private DoubleChartValue f1356ck;

    /* JADX INFO: renamed from: dq */
    private C14656uy f1357dq;

    /* JADX INFO: renamed from: du */
    private float f1358du;

    /* JADX INFO: renamed from: dy */
    private ChartDataPointCollection f1359dy;

    /* JADX INFO: renamed from: e0 */
    private IChartDataPointLevelsManager f1360e0;

    /* JADX INFO: renamed from: fa */
    private DoubleChartValue f1361fa;

    /* JADX INFO: renamed from: h4 */
    private float f1362h4;

    /* JADX INFO: renamed from: jd */
    private StringOrDoubleChartValue f1364jd;

    /* JADX INFO: renamed from: k4 */
    private long f1365k4;

    /* JADX INFO: renamed from: kk */
    private boolean f1366kk;

    /* JADX INFO: renamed from: ks */
    private DoubleChartValue f1367ks;

    /* JADX INFO: renamed from: lr */
    private C14656uy f1368lr;

    /* JADX INFO: renamed from: m9 */
    private float f1369m9;

    /* JADX INFO: renamed from: ne */
    private boolean f1370ne;

    /* JADX INFO: renamed from: qq */
    private IFormat f1371qq;

    /* JADX INFO: renamed from: rv */
    private DataLabel f1372rv;

    /* JADX INFO: renamed from: to */
    private float f1373to;

    /* JADX INFO: renamed from: ts */
    private C14656uy f1374ts;

    /* JADX INFO: renamed from: u4 */
    private Marker f1375u4;

    /* JADX INFO: renamed from: up */
    private DoubleChartValue f1377up;

    /* JADX INFO: renamed from: uz */
    private LegendEntryProperties f1378uz;

    /* JADX INFO: renamed from: v4 */
    private C14656uy f1379v4;

    /* JADX INFO: renamed from: wl */
    private ErrorBarsCustomValues f1380wl;

    /* JADX INFO: renamed from: wy */
    private C14656uy f1381wy;

    /* JADX INFO: renamed from: x1 */
    private boolean f1382x1;

    /* JADX INFO: renamed from: x6 */
    private Format f1383x6;

    /* JADX INFO: renamed from: xk */
    private C14656uy f1384xk;

    /* JADX INFO: renamed from: yd */
    private C14656uy f1385yd;

    /* JADX INFO: renamed from: yj */
    private DoubleChartValue f1386yj;

    /* JADX INFO: renamed from: c5 */
    private C13822m6 f1354c5 = new C13822m6();

    /* JADX INFO: renamed from: ix */
    private int f1363ix = -1;

    /* JADX INFO: renamed from: ar */
    private int f1351ar = -1;

    /* JADX INFO: renamed from: um */
    private int f1376um = -1;

    public ChartDataPoint(ChartDataPointCollection chartDataPointCollection) {
        this.f1359dy = chartDataPointCollection;
        setInvertIfNegative(chartDataPointCollection.m640x1().getInvertIfNegative());
    }

    /* JADX INFO: renamed from: c5 */
    public final C14656uy m579c5() {
        if (this.f1379v4 == null) {
            this.f1379v4 = new C14656uy();
        }
        return this.f1379v4;
    }

    /* JADX INFO: renamed from: ck */
    public final C14656uy m580ck() {
        if (this.f1385yd == null) {
            this.f1385yd = new C14656uy();
        }
        return this.f1385yd;
    }

    /* JADX INFO: renamed from: du */
    public C12003du m581du() {
        ChartSeries chartSeriesM640x1 = m596to().m640x1();
        Chart chart = (Chart) chartSeriesM640x1.getChart();
        int style = chart.getStyle() + 1;
        if (chartSeriesM640x1.getFormat().getFill().getFillType() == 1) {
            return ((ColorFormat) chartSeriesM640x1.getFormat().getFill().getSolidFillColor()).m1084to();
        }
        if (m584h4() != null) {
            return ((ColorFormat) m584h4().getFill().getSolidFillColor()).m1084to();
        }
        if (!chartSeriesM640x1.isColorVaried() || (!ChartTypeCharacterizer.isChartTypePie(chartSeriesM640x1.getType()) && !ChartTypeCharacterizer.isChartTypeDoughnut(chartSeriesM640x1.getType()) && chartSeriesM640x1.getParentSeriesGroup().getSeries().size() != 1)) {
            return chartSeriesM640x1.m734m9();
        }
        return igr.m7632k4(chart, style, chartSeriesM640x1.getDataPoints().size())[m596to().m617k4((IChartDataPoint) this)];
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m582dy() {
        return this.f1366kk;
    }

    /* JADX INFO: renamed from: fa */
    public final C14656uy m583fa() {
        if (this.f1352b3 == null) {
            this.f1352b3 = new C14656uy();
        }
        return this.f1352b3;
    }

    @Override // com.aspose.slides.IActualLayout
    public final float getActualHeight() {
        return this.f1369m9;
    }

    @Override // com.aspose.slides.IActualLayout
    public final float getActualWidth() {
        return this.f1362h4;
    }

    @Override // com.aspose.slides.IActualLayout
    public final float getActualX() {
        return this.f1373to;
    }

    @Override // com.aspose.slides.IActualLayout
    public final float getActualY() {
        return this.f1358du;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final Integer getAutomaticDataPointColor() {
        return (Integer) C12003du.m56473x1(m581du());
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final IDoubleChartValue getBubbleSize() {
        if (this.f1361fa == null) {
            this.f1361fa = new DoubleChartValue(this, m596to().m612h4(), true);
        }
        return this.f1361fa;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final IDoubleChartValue getColorValue() {
        if (this.f1367ks == null) {
            this.f1367ks = new DoubleChartValue(this, m596to().m604c5(), true);
        }
        return this.f1367ks;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final IChartDataPointLevelsManager getDataPointLevels() {
        if (this.f1359dy.m640x1().getType() != 74 && this.f1359dy.m640x1().getType() != 75) {
            return null;
        }
        if (this.f1360e0 == null) {
            this.f1360e0 = new ChartDataPointLevelsManager(this);
        }
        return this.f1360e0;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final IErrorBarsCustomValues getErrorBarsCustomValues() {
        if (this.f1380wl == null) {
            this.f1380wl = new ErrorBarsCustomValues(this);
        }
        return this.f1380wl;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final int getExplosion() {
        return this.f1363ix;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final IFormat getFormat() {
        if (this.f1383x6 == null) {
            this.f1383x6 = new Format(this);
        }
        return this.f1383x6;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final long getIndex() {
        return this.f1365k4;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final boolean getInvertIfNegative() {
        return this.f1382x1;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final IDataLabel getLabel() {
        if (this.f1372rv == null) {
            this.f1372rv = new DataLabel(this);
        }
        return this.f1372rv;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final IMarker getMarker() {
        if (this.f1375u4 == null) {
            this.f1375u4 = new Marker(this, this.f1359dy.m640x1());
        }
        return this.f1375u4;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1359dy;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final ILegendEntryProperties getRelatedLegendEntry() {
        if (this.f1378uz == null) {
            this.f1378uz = new LegendEntryProperties(this);
        }
        return this.f1378uz;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final boolean getSetAsTotal() {
        return this.f1353bv;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final IDoubleChartValue getSizeValue() {
        if (this.f1386yj == null) {
            this.f1386yj = new DoubleChartValue(this, m596to().m631m9(), true);
        }
        return this.f1386yj;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final IDoubleChartValue getValue() {
        if (this.f1377up == null) {
            this.f1377up = new DoubleChartValue(this, m596to().m609dy(), true);
        }
        return this.f1377up;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final IStringOrDoubleChartValue getXValue() {
        if (this.f1364jd == null) {
            this.f1364jd = new StringOrDoubleChartValue(this, m596to().m635to(), true);
        }
        return this.f1364jd;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final IDoubleChartValue getYValue() {
        if (this.f1356ck == null) {
            this.f1356ck = new DoubleChartValue(this, m596to().m607du(), true);
        }
        return this.f1356ck;
    }

    /* JADX INFO: renamed from: h4 */
    public final IFormat m584h4() {
        ChartDataPointCollection chartDataPointCollectionM596to = m596to();
        ChartSeries chartSeriesM640x1 = m596to().m640x1();
        Chart chart = (Chart) chartSeriesM640x1.getChart();
        if (m593m9()) {
            int iM617k4 = chartDataPointCollectionM596to.m617k4((IChartDataPoint) this);
            int size = chartDataPointCollectionM596to.size();
            if (this.f1371qq == null || this.f1351ar != iM617k4 || this.f1376um != size) {
                this.f1351ar = iM617k4;
                this.f1376um = size;
                this.f1371qq = chart.m513ks().m63797h4().m71124k4(this, iM617k4, size);
            }
            return this.f1371qq;
        }
        if (!chart.m513ks().m63805kk()) {
            return null;
        }
        int iIndexOf = chart.getChartData().getSeries().indexOf(chartSeriesM640x1);
        int size2 = chart.getChartData().getSeries().size();
        if (this.f1371qq == null || this.f1351ar != iIndexOf || this.f1376um != size2) {
            if (chartDataPointCollectionM596to.m640x1().getType() == 79) {
                iIndexOf = 2;
                double dDoubleValue = ((ChartData) chart.getChartData()).m553x1().mo5710kk() != 2 ? ((Double) C7019kk.m27464to(m579c5().m71989k4(), Double.TYPE)).doubleValue() : getValue().toDouble();
                if (!getSetAsTotal()) {
                    iIndexOf = dDoubleValue < 0.0d ? 1 : 0;
                }
            }
            this.f1351ar = iIndexOf;
            this.f1376um = size2;
            this.f1371qq = chart.m513ks().m63797h4().m71124k4(this, iIndexOf, size2);
        }
        return this.f1371qq;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final boolean isBubble3D() {
        return this.f1370ne;
    }

    /* JADX INFO: renamed from: jd */
    public final C14656uy m585jd() {
        if (this.f1368lr == null) {
            this.f1368lr = new C14656uy();
        }
        return this.f1368lr;
    }

    /* JADX INFO: renamed from: k4 */
    public final IFormat m586k4() {
        return this.f1383x6;
    }

    /* JADX INFO: renamed from: kk */
    public final C13822m6 m590kk() {
        return this.f1354c5;
    }

    /* JADX INFO: renamed from: ks */
    public final C14656uy m592ks() {
        if (this.f1357dq == null) {
            this.f1357dq = new C14656uy();
        }
        return this.f1357dq;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m593m9() {
        ChartSeries chartSeriesM640x1 = m596to().m640x1();
        Chart chart = (Chart) chartSeriesM640x1.getChart();
        return (ChartTypeCharacterizer.isChartTypePie(chartSeriesM640x1.getType()) || ChartTypeCharacterizer.isChartTypeDoughnut(chartSeriesM640x1.getType()) || chartSeriesM640x1.getParentSeriesGroup().getSeries().size() == 1) && chartSeriesM640x1.isColorVaried() && chart.m513ks().m63805kk() && chart.getStyle() <= 7;
    }

    /* JADX INFO: renamed from: ne */
    public final C14656uy m594ne() {
        if (this.f1374ts == null) {
            this.f1374ts = new C14656uy();
        }
        return this.f1374ts;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final void remove() {
        if (m596to() == null) {
            throw new PptxEditException("Data point is already removed from series.");
        }
        synchronized (m596to().getSyncRoot()) {
            m596to().m624k4(this);
            this.f1359dy = null;
        }
    }

    /* JADX INFO: renamed from: rv */
    public final C14656uy m595rv() {
        if (this.f1384xk == null) {
            this.f1384xk = new C14656uy();
        }
        return this.f1384xk;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final void setBubble3D(boolean z) {
        this.f1370ne = z;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final void setExplosion(int i) {
        this.f1363ix = i;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final void setFormat(IFormat iFormat) {
        this.f1383x6 = (Format) iFormat;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final void setInvertIfNegative(boolean z) {
        this.f1382x1 = z;
    }

    @Override // com.aspose.slides.IChartDataPoint
    public final void setSetAsTotal(boolean z) {
        this.f1353bv = z;
    }

    /* JADX INFO: renamed from: to */
    public final ChartDataPointCollection m596to() {
        return this.f1359dy;
    }

    /* JADX INFO: renamed from: up */
    public final C14656uy m598up() {
        if (this.f1381wy == null) {
            this.f1381wy = new C14656uy();
        }
        return this.f1381wy;
    }

    /* JADX INFO: renamed from: x1 */
    public final IMarker m599x1() {
        return this.f1375u4;
    }

    /* JADX INFO: renamed from: x6 */
    public final C14656uy m601x6() {
        if (this.f1355c6 == null) {
            this.f1355c6 = new C14656uy();
        }
        return this.f1355c6;
    }

    /* JADX INFO: renamed from: yj */
    public final C14656uy m602yj() {
        if (this.f1350ak == null) {
            this.f1350ak = new C14656uy();
        }
        return this.f1350ak;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m587k4(float f) {
        this.f1373to = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m591kk(float f) {
        this.f1362h4 = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m597to(float f) {
        this.f1369m9 = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m600x1(float f) {
        this.f1358du = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m588k4(long j) {
        this.f1365k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m589k4(boolean z) {
        this.f1366kk = z;
    }
}
