package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14041ai;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ChartDataPointCollection extends DomObject<ChartSeries> implements IChartDataPointCollection {

    /* JADX INFO: renamed from: c5 */
    private String f1387c5;

    /* JADX INFO: renamed from: ck */
    private String f1388ck;

    /* JADX INFO: renamed from: du */
    private String f1389du;

    /* JADX INFO: renamed from: dy */
    private String f1390dy;

    /* JADX INFO: renamed from: fa */
    private boolean f1391fa;

    /* JADX INFO: renamed from: ix */
    private final C0936ec f1392ix;

    /* JADX INFO: renamed from: jd */
    private String f1393jd;

    /* JADX INFO: renamed from: k4 */
    private String f1394k4;

    /* JADX INFO: renamed from: kk */
    private String f1395kk;

    /* JADX INFO: renamed from: ks */
    private final C0936ec f1396ks;

    /* JADX INFO: renamed from: m9 */
    private String f1397m9;

    /* JADX INFO: renamed from: ne */
    private final C0936ec f1398ne;

    /* JADX INFO: renamed from: rv */
    private final C0936ec f1399rv;

    /* JADX INFO: renamed from: to */
    private String f1400to;

    /* JADX INFO: renamed from: u4 */
    private final C0936ec f1401u4;

    /* JADX INFO: renamed from: up */
    private long f1402up;

    /* JADX INFO: renamed from: uz */
    private final nl7<IChartDataPoint> f1403uz;

    /* JADX INFO: renamed from: wl */
    private final DataSourceTypeForErrorBarsCustomValues f1404wl;

    /* JADX INFO: renamed from: x1 */
    private String f1405x1;

    /* JADX INFO: renamed from: x6 */
    private final C0936ec f1406x6;

    /* JADX INFO: renamed from: yj */
    private final C13751kx f1407yj;

    public ChartDataPointCollection(ChartSeries chartSeries) {
        super(chartSeries);
        this.f1407yj = new C13751kx();
        this.f1396ks = new C0936ec();
        this.f1399rv = new C0936ec();
        this.f1406x6 = new C0936ec();
        this.f1398ne = new C0936ec();
        this.f1392ix = new C0936ec();
        this.f1401u4 = new C0936ec();
        this.f1404wl = new DataSourceTypeForErrorBarsCustomValues();
        this.f1403uz = new nl7<>(chartSeries.getChart().getChartData());
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForAreaSeries(double d) {
        if (ChartTypeCharacterizer.isChartTypeArea(m640x1().getType())) {
            return m619k4(d);
        }
        throw new InvalidOperationException("Parent series is not Area series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForBarSeries(double d) {
        if (ChartTypeCharacterizer.isChartTypeColumn(m640x1().getType()) || ChartTypeCharacterizer.isChartTypeBar(m640x1().getType())) {
            return m619k4(d);
        }
        throw new InvalidOperationException("Parent series is not Column or Bar series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForBoxAndWhiskerSeries(IChartDataCell iChartDataCell) {
        if (m640x1().getType() == 78) {
            return m620k4(iChartDataCell);
        }
        throw new InvalidOperationException("Parent series is not BoxAndWhisker series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForBubbleSeries(double d, double d2, double d3) {
        if (!ChartTypeCharacterizer.isChartTypeBubble(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Bubble series.");
        }
        if (getDataSourceTypeForXValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.DoubleLiterals and so ", "xValue cannot be of System.Double type."));
        }
        if (getDataSourceTypeForYValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."));
        }
        if (getDataSourceTypeForBubbleSizes() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForBubbleSizes != DataSourceType.DoubleLiterals and so ", "bubbleSize cannot be of System.Double type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsLiteralDouble(d);
        chartDataPoint.getYValue().setAsLiteralDouble(d2);
        chartDataPoint.getBubbleSize().setAsLiteralDouble(d3);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForDoughnutSeries(double d) {
        if (ChartTypeCharacterizer.isChartTypeDoughnut(m640x1().getType())) {
            return m619k4(d);
        }
        throw new InvalidOperationException("Parent series is not Doughnut series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForFunnelSeries(IChartDataCell iChartDataCell) {
        if (m640x1().getType() == 80) {
            return m620k4(iChartDataCell);
        }
        throw new InvalidOperationException("Parent series is not Funnel series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForHistogramSeries(IChartDataCell iChartDataCell) {
        if (m640x1().getType() == 76) {
            return m620k4(iChartDataCell);
        }
        throw new InvalidOperationException("Parent series is not Histogram series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForLineSeries(double d) {
        if (ChartTypeCharacterizer.isChartTypeLine(m640x1().getType())) {
            return m619k4(d);
        }
        throw new InvalidOperationException("Parent series is not Line series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForMapSeries(IChartDataCell iChartDataCell) {
        if (m640x1().getType() == 81) {
            return m627kk(iChartDataCell);
        }
        throw new InvalidOperationException("Parent series is not Map series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForPieSeries(double d) {
        if (ChartTypeCharacterizer.isChartTypePie(m640x1().getType())) {
            return m619k4(d);
        }
        throw new InvalidOperationException("Parent series is not Pie series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForRadarSeries(double d) {
        if (ChartTypeCharacterizer.isChartTypeRadar(m640x1().getType())) {
            return m619k4(d);
        }
        throw new InvalidOperationException("Parent series is not Radar series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForScatterSeries(double d, double d2) {
        if (!ChartTypeCharacterizer.isChartTypeScatter(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Scatter series.");
        }
        if (getDataSourceTypeForXValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.DoubleLiterals and so ", "xValue cannot be of System.Double type."));
        }
        if (getDataSourceTypeForYValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsLiteralDouble(d);
        chartDataPoint.getYValue().setAsLiteralDouble(d2);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForStockSeries(double d) {
        if (ChartTypeCharacterizer.isChartTypeStock(m640x1().getType())) {
            return m619k4(d);
        }
        throw new InvalidOperationException("Parent series is not Stock series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForSunburstSeries(IChartDataCell iChartDataCell) {
        if (m640x1().getType() == 75) {
            return m641x1(iChartDataCell);
        }
        throw new InvalidOperationException("Parent series is not Sunburst series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForSurfaceSeries(double d) {
        if (ChartTypeCharacterizer.isChartTypeSurface(m640x1().getType())) {
            return m619k4(d);
        }
        throw new InvalidOperationException("Parent series is not Surface series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForTreemapSeries(IChartDataCell iChartDataCell) {
        if (m640x1().getType() == 74) {
            return m641x1(iChartDataCell);
        }
        throw new InvalidOperationException("Parent series is not Treemap series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForWaterfallSeries(IChartDataCell iChartDataCell) {
        if (m640x1().getType() == 79) {
            return m620k4(iChartDataCell);
        }
        throw new InvalidOperationException("Parent series is not Waterfall series.");
    }

    /* JADX INFO: renamed from: c5 */
    public final C0936ec m604c5() {
        return this.f1401u4;
    }

    /* JADX INFO: renamed from: ck */
    public final String m606ck() {
        return this.f1405x1;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.aspose.slides.IChartDataPointCollection
    public final void clear() {
        synchronized (this.f1403uz) {
            try {
                List.Enumerator it = new List(this.f1403uz).iterator();
                while (it.hasNext()) {
                    try {
                        ((IChartDataPoint) it.next()).remove();
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f1403uz.copyTo(abstractC14092to, i);
    }

    /* JADX INFO: renamed from: du */
    public final C0936ec m607du() {
        return this.f1399rv;
    }

    /* JADX INFO: renamed from: dy */
    public final C0936ec m609dy() {
        return this.f1398ne;
    }

    /* JADX INFO: renamed from: fa */
    public final String m611fa() {
        return this.f1395kk;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final int getDataSourceTypeForBubbleSizes() {
        return this.f1406x6.m5400k4();
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IDataSourceTypeForErrorBarsCustomValues getDataSourceTypeForErrorBarsCustomValues() {
        if ((m640x1().getErrorBarsXFormat() == null || m640x1().getErrorBarsXFormat().getValueType() != 0) && (m640x1().getErrorBarsYFormat() == null || m640x1().getErrorBarsYFormat().getValueType() != 0)) {
            return null;
        }
        return this.f1404wl;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final int getDataSourceTypeForValues() {
        return this.f1398ne.m5400k4();
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final int getDataSourceTypeForXValues() {
        return this.f1396ks.m5400k4();
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final int getDataSourceTypeForYValues() {
        return this.f1399rv.m5400k4();
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint getOrCreateDataPointByIdx(long j) {
        long j2 = 4294967295L & j;
        if (j2 < 0) {
            throw new ArgumentOutOfRangeException();
        }
        while (this.f1403uz.size() <= j2) {
            m603x1(new ChartDataPoint(this));
        }
        return this.f1403uz.get_Item((int) j);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final int get_Item(IChartDataPoint iChartDataPoint) {
        return this.f1403uz.indexOf(iChartDataPoint);
    }

    /* JADX INFO: renamed from: h4 */
    public final C0936ec m612h4() {
        return this.f1406x6;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<IChartDataPoint> iterator() {
        return this.f1403uz.iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<IChartDataPoint> iteratorJava() {
        return this.f1403uz.iteratorJava();
    }

    /* JADX INFO: renamed from: ix */
    public final String m614ix() {
        return this.f1388ck;
    }

    /* JADX INFO: renamed from: jd */
    public final String m615jd() {
        return this.f1394k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m617k4(IChartDataPoint iChartDataPoint) {
        return this.f1403uz.indexOf(iChartDataPoint);
    }

    /* JADX INFO: renamed from: kk */
    public final IChartDataPoint m627kk(IChartDataCell iChartDataCell) {
        if (getDataSourceTypeForValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForColorValues != DataSourceType.Worksheet and so ", "value cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getColorValue().setAsCell(iChartDataCell);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    /* JADX INFO: renamed from: ks */
    public final String m630ks() {
        return this.f1397m9;
    }

    /* JADX INFO: renamed from: m9 */
    public final C0936ec m631m9() {
        return this.f1392ix;
    }

    /* JADX INFO: renamed from: ne */
    public final String m633ne() {
        return this.f1393jd;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final void remove(IChartDataPoint iChartDataPoint) {
        iChartDataPoint.remove();
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final void removeAt(int i) {
        get_Item(i).remove();
    }

    /* JADX INFO: renamed from: rv */
    public final String m634rv() {
        return this.f1390dy;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final void setDataSourceTypeForBubbleSizes(int i) {
        if (i != 0 && i != 2) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceTypeForBubbleSizes can be ", "DataSourceType.Worksheet or DataSourceType.DoubleLiterals"));
        }
        this.f1406x6.m5401k4(i);
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final void setDataSourceTypeForValues(int i) {
        if (i != 0 && i != 2) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceTypeForValues can be ", "DataSourceType.Worksheet or DataSourceType.DoubleLiterals"));
        }
        this.f1398ne.m5401k4(i);
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final void setDataSourceTypeForXValues(int i) {
        this.f1396ks.m5401k4(i);
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final void setDataSourceTypeForYValues(int i) {
        if (i != 0 && i != 2) {
            throw new InvalidOperationException(C14113y2.m67408k4("DataSourceTypeForYValues can be ", "DataSourceType.Worksheet or DataSourceType.DoubleLiterals"));
        }
        this.f1399rv.m5401k4(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f1403uz.size();
    }

    /* JADX INFO: renamed from: to */
    public final C0936ec m635to() {
        return this.f1396ks;
    }

    /* JADX INFO: renamed from: u4 */
    public final boolean m637u4() {
        return this.f1391fa;
    }

    /* JADX INFO: renamed from: up */
    public final String m638up() {
        return this.f1400to;
    }

    /* JADX INFO: renamed from: uz */
    public final long m639uz() {
        return this.f1402up;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final ChartSeries m640x1() {
        return (ChartSeries) this.f2127h4;
    }

    /* JADX INFO: renamed from: x6 */
    public final String m643x6() {
        return this.f1387c5;
    }

    /* JADX INFO: renamed from: yj */
    public final String m644yj() {
        return this.f1389du;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForAreaSeries(IChartDataCell iChartDataCell) {
        if (ChartTypeCharacterizer.isChartTypeArea(m640x1().getType())) {
            return m620k4(iChartDataCell);
        }
        throw new InvalidOperationException("Parent series is not Area series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForBarSeries(IChartDataCell iChartDataCell) {
        if (ChartTypeCharacterizer.isChartTypeColumn(m640x1().getType()) || ChartTypeCharacterizer.isChartTypeBar(m640x1().getType())) {
            return m620k4(iChartDataCell);
        }
        throw new InvalidOperationException("Parent series is not Column or Bar series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForBubbleSeries(double d, double d2, IChartDataCell iChartDataCell) {
        if (!ChartTypeCharacterizer.isChartTypeBubble(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Bubble series.");
        }
        if (getDataSourceTypeForXValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.DoubleLiterals and so ", "xValue cannot be of System.Double type."));
        }
        if (getDataSourceTypeForYValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."));
        }
        if (getDataSourceTypeForBubbleSizes() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForBubbleSizes != DataSourceType.Worksheet and so ", "bubbleSize cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsLiteralDouble(d);
        chartDataPoint.getYValue().setAsLiteralDouble(d2);
        chartDataPoint.getBubbleSize().setAsCell(iChartDataCell);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForDoughnutSeries(IChartDataCell iChartDataCell) {
        if (ChartTypeCharacterizer.isChartTypeDoughnut(m640x1().getType())) {
            return m620k4(iChartDataCell);
        }
        throw new InvalidOperationException("Parent series is not Doughnut series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForLineSeries(IChartDataCell iChartDataCell) {
        if (ChartTypeCharacterizer.isChartTypeLine(m640x1().getType())) {
            return m620k4(iChartDataCell);
        }
        throw new InvalidOperationException("Parent series is not Line series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForPieSeries(IChartDataCell iChartDataCell) {
        if (ChartTypeCharacterizer.isChartTypePie(m640x1().getType())) {
            return m620k4(iChartDataCell);
        }
        throw new InvalidOperationException("Parent series is not Pie series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForRadarSeries(IChartDataCell iChartDataCell) {
        if (ChartTypeCharacterizer.isChartTypeRadar(m640x1().getType())) {
            return m620k4(iChartDataCell);
        }
        throw new InvalidOperationException("Parent series is not Radar series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForScatterSeries(double d, IChartDataCell iChartDataCell) {
        if (!ChartTypeCharacterizer.isChartTypeScatter(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Scatter series.");
        }
        if (getDataSourceTypeForXValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.DoubleLiterals and so ", "xValue cannot be of System.Double type."));
        }
        if (getDataSourceTypeForYValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsLiteralDouble(d);
        chartDataPoint.getYValue().setAsCell(iChartDataCell);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForStockSeries(IChartDataCell iChartDataCell) {
        if (ChartTypeCharacterizer.isChartTypeStock(m640x1().getType())) {
            return m620k4(iChartDataCell);
        }
        throw new InvalidOperationException("Parent series is not Stock series.");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForSurfaceSeries(IChartDataCell iChartDataCell) {
        if (ChartTypeCharacterizer.isChartTypeSurface(m640x1().getType())) {
            return m620k4(iChartDataCell);
        }
        throw new InvalidOperationException("Parent series is not Surface series.");
    }

    /* JADX INFO: renamed from: c5 */
    public final void m605c5(String str) {
        this.f1393jd = str;
    }

    /* JADX INFO: renamed from: du */
    public final void m608du(String str) {
        this.f1389du = str;
    }

    /* JADX INFO: renamed from: dy */
    public final void m610dy(String str) {
        this.f1387c5 = str;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint get_Item(int i) {
        return this.f1403uz.get_Item(i);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m613h4(String str) {
        this.f1397m9 = str;
    }

    /* JADX INFO: renamed from: jd */
    public final void m616jd(String str) {
        this.f1388ck = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final IChartDataPoint m618k4() {
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    /* JADX INFO: renamed from: kk */
    public final C13751kx m628kk() {
        return this.f1407yj;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m632m9(String str) {
        this.f1390dy = str;
    }

    /* JADX INFO: renamed from: to */
    public final void m636to(String str) {
        this.f1400to = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final IChartDataPoint m641x1(IChartDataCell iChartDataCell) {
        if (getDataSourceTypeForValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForValues != DataSourceType.Worksheet and so ", "value cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getSizeValue().setAsCell(iChartDataCell);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    /* JADX INFO: renamed from: x1 */
    private void m603x1(ChartDataPoint chartDataPoint) {
        if (chartDataPoint == null) {
            throw new ArgumentNullException("dataPoint");
        }
        chartDataPoint.m588k4(((long) this.f1403uz.size()) & 4294967295L);
        this.f1403uz.addItem(chartDataPoint);
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForBubbleSeries(double d, IChartDataCell iChartDataCell, double d2) {
        if (!ChartTypeCharacterizer.isChartTypeBubble(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Bubble series.");
        }
        if (getDataSourceTypeForXValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.DoubleLiterals and so ", "xValue cannot be of System.Double type."));
        }
        if (getDataSourceTypeForYValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForBubbleSizes() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForBubbleSizes != DataSourceType.DoubleLiterals and so ", "bubbleSize cannot be of System.Double type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsLiteralDouble(d);
        chartDataPoint.getYValue().setAsCell(iChartDataCell);
        chartDataPoint.getBubbleSize().setAsLiteralDouble(d2);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForScatterSeries(IChartDataCell iChartDataCell, double d) {
        if (!ChartTypeCharacterizer.isChartTypeScatter(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Scatter series.");
        }
        if (getDataSourceTypeForXValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.Worksheet and so ", "xValue cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForYValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsCell(iChartDataCell);
        chartDataPoint.getYValue().setAsLiteralDouble(d);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    /* JADX INFO: renamed from: k4 */
    public final IChartDataPoint m619k4(double d) {
        if (getDataSourceTypeForValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForValues != DataSourceType.DoubleLiterals and so ", "value cannot be of System.Double type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getValue().setAsLiteralDouble(d);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    /* JADX INFO: renamed from: kk */
    public final void m629kk(String str) {
        this.f1395kk = str;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForBubbleSeries(double d, IChartDataCell iChartDataCell, IChartDataCell iChartDataCell2) {
        if (!ChartTypeCharacterizer.isChartTypeBubble(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Bubble series.");
        }
        if (getDataSourceTypeForXValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.DoubleLiterals and so ", "xValue cannot be of System.Double type."));
        }
        if (getDataSourceTypeForYValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForBubbleSizes() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForBubbleSizes != DataSourceType.Worksheet and so ", "bubbleSize cannot be of ", C14067j2.m66727k4(iChartDataCell2).mo48629x6(), " type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsLiteralDouble(d);
        chartDataPoint.getYValue().setAsCell(iChartDataCell);
        chartDataPoint.getBubbleSize().setAsCell(iChartDataCell2);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForScatterSeries(IChartDataCell iChartDataCell, IChartDataCell iChartDataCell2) {
        if (!ChartTypeCharacterizer.isChartTypeScatter(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Scatter series.");
        }
        if (getDataSourceTypeForXValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.Worksheet and so ", "xValue cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForYValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", C14067j2.m66727k4(iChartDataCell2).mo48629x6(), " type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsCell(iChartDataCell);
        chartDataPoint.getYValue().setAsCell(iChartDataCell2);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    /* JADX INFO: renamed from: k4 */
    public final IChartDataPoint m620k4(IChartDataCell iChartDataCell) {
        if (getDataSourceTypeForValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForValues != DataSourceType.Worksheet and so ", "value cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getValue().setAsCell(iChartDataCell);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m642x1(String str) {
        this.f1405x1 = str;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForBubbleSeries(IChartDataCell iChartDataCell, double d, double d2) {
        if (!ChartTypeCharacterizer.isChartTypeBubble(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Bubble series.");
        }
        if (getDataSourceTypeForXValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.Worksheet and so ", "xValue cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForYValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."));
        }
        if (getDataSourceTypeForBubbleSizes() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForBubbleSizes != DataSourceType.DoubleLiterals and so ", "bubbleSize cannot be of System.Double type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsCell(iChartDataCell);
        chartDataPoint.getYValue().setAsLiteralDouble(d);
        chartDataPoint.getBubbleSize().setAsLiteralDouble(d2);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForScatterSeries(String str, double d) {
        if (!ChartTypeCharacterizer.isChartTypeScatter(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Scatter series.");
        }
        if (getDataSourceTypeForXValues() != 1) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.StringLiterals and so ", "xValue cannot be of ", C14067j2.m66727k4(str).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForYValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsLiteralString(str);
        chartDataPoint.getYValue().setAsLiteralDouble(d);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    /* JADX INFO: renamed from: k4 */
    public final IChartDataPoint m621k4(AbstractC14041ai<IChartDataPoint> abstractC14041ai) {
        if (abstractC14041ai != null) {
            return this.f1403uz.find(abstractC14041ai);
        }
        throw new ArgumentNullException("match");
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForBubbleSeries(IChartDataCell iChartDataCell, double d, IChartDataCell iChartDataCell2) {
        if (!ChartTypeCharacterizer.isChartTypeBubble(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Bubble series.");
        }
        if (getDataSourceTypeForXValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.Worksheet and so ", "xValue cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForYValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."));
        }
        if (getDataSourceTypeForBubbleSizes() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForBubbleSizes != DataSourceType.Worksheet and so ", "bubbleSize cannot be of ", C14067j2.m66727k4(iChartDataCell2).mo48629x6(), " type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsCell(iChartDataCell);
        chartDataPoint.getYValue().setAsLiteralDouble(d);
        chartDataPoint.getBubbleSize().setAsCell(iChartDataCell2);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForScatterSeries(String str, IChartDataCell iChartDataCell) {
        if (!ChartTypeCharacterizer.isChartTypeScatter(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Scatter series.");
        }
        if (getDataSourceTypeForXValues() != 1) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.StringLiterals and so ", "xValue cannot be of ", C14067j2.m66727k4(str).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForYValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsLiteralString(str);
        chartDataPoint.getYValue().setAsCell(iChartDataCell);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IChartDataPointLevel m622k4(int i) {
        ChartCategoryCollection chartCategoryCollection = (ChartCategoryCollection) m640x1().getChart().getChartData().getCategories();
        if (chartCategoryCollection.getGroupingLevelCount() == 1 || chartCategoryCollection.size() == 0) {
            if (this.f1403uz.size() < i + 1) {
                return null;
            }
            return this.f1403uz.get_Item(i).getDataPointLevels().get_Item(0);
        }
        String[] strArr = new String[chartCategoryCollection.getGroupingLevelCount()];
        int i2 = -1;
        for (int i3 = 0; i3 < chartCategoryCollection.size(); i3++) {
            for (int groupingLevelCount = chartCategoryCollection.getGroupingLevelCount() - 1; groupingLevelCount >= 0; groupingLevelCount--) {
                if (((ChartCategory) chartCategoryCollection.get_Item(i3)).m523k4(groupingLevelCount) != null) {
                    String string = ((ChartCategory) chartCategoryCollection.get_Item(i3)).m523k4(groupingLevelCount).toString();
                    if (i3 == 0) {
                        strArr[groupingLevelCount] = string;
                    } else {
                        if (!C14113y2.m67363du(string, strArr[groupingLevelCount]) && !C14113y2.m67411k4(string)) {
                            strArr[groupingLevelCount] = string;
                        }
                        if (i2 != i) {
                            if (this.f1403uz.size() < i3 + 1) {
                                return null;
                            }
                            return this.f1403uz.get_Item(i3).getDataPointLevels().get_Item(groupingLevelCount);
                        }
                    }
                    i2++;
                    if (i2 != i) {
                    }
                }
            }
        }
        return null;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForBubbleSeries(IChartDataCell iChartDataCell, IChartDataCell iChartDataCell2, double d) {
        if (!ChartTypeCharacterizer.isChartTypeBubble(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Bubble series.");
        }
        if (getDataSourceTypeForXValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.Worksheet and so ", "xValue cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForYValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", C14067j2.m66727k4(iChartDataCell2).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForBubbleSizes() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForBubbleSizes != DataSourceType.DoubleLiterals and so ", "bubbleSize cannot be of System.Double type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsCell(iChartDataCell);
        chartDataPoint.getYValue().setAsCell(iChartDataCell2);
        chartDataPoint.getBubbleSize().setAsLiteralDouble(d);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m623k4(long j) {
        this.f1402up = j;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForBubbleSeries(IChartDataCell iChartDataCell, IChartDataCell iChartDataCell2, IChartDataCell iChartDataCell3) {
        if (!ChartTypeCharacterizer.isChartTypeBubble(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Bubble series.");
        }
        if (getDataSourceTypeForXValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.Worksheet and so ", "xValue cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForYValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", C14067j2.m66727k4(iChartDataCell2).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForBubbleSizes() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForBubbleSizes != DataSourceType.Worksheet and so ", "bubbleSize cannot be of ", C14067j2.m66727k4(iChartDataCell3).mo48629x6(), " type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsCell(iChartDataCell);
        chartDataPoint.getYValue().setAsCell(iChartDataCell2);
        chartDataPoint.getBubbleSize().setAsCell(iChartDataCell3);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m624k4(ChartDataPoint chartDataPoint) {
        if (!this.f1403uz.removeItem(chartDataPoint)) {
            throw new ArgumentException("The value parameter was not found in the collection.");
        }
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForBubbleSeries(String str, double d, double d2) {
        if (!ChartTypeCharacterizer.isChartTypeBubble(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Bubble series.");
        }
        if (getDataSourceTypeForXValues() != 1) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.StringLiterals and so ", "xValue cannot be of ", C14067j2.m66727k4(str).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForYValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."));
        }
        if (getDataSourceTypeForBubbleSizes() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForBubbleSizes != DataSourceType.DoubleLiterals and so ", "bubbleSize cannot be of System.Double type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsLiteralString(str);
        chartDataPoint.getYValue().setAsLiteralDouble(d);
        chartDataPoint.getBubbleSize().setAsLiteralDouble(d2);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m625k4(String str) {
        this.f1394k4 = str;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForBubbleSeries(String str, double d, IChartDataCell iChartDataCell) {
        if (!ChartTypeCharacterizer.isChartTypeBubble(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Bubble series.");
        }
        if (getDataSourceTypeForXValues() != 1) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.StringLiterals and so ", "xValue cannot be of ", C14067j2.m66727k4(str).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForYValues() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.DoubleLiterals and so ", "yValue cannot be of System.Double type."));
        }
        if (getDataSourceTypeForBubbleSizes() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForBubbleSizes != DataSourceType.Worksheet and so ", "bubbleSize cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsLiteralString(str);
        chartDataPoint.getYValue().setAsLiteralDouble(d);
        chartDataPoint.getBubbleSize().setAsCell(iChartDataCell);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m626k4(boolean z) {
        this.f1391fa = z;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForBubbleSeries(String str, IChartDataCell iChartDataCell, double d) {
        if (!ChartTypeCharacterizer.isChartTypeBubble(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Bubble series.");
        }
        if (getDataSourceTypeForXValues() != 1) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.StringLiterals and so ", "xValue cannot be of ", C14067j2.m66727k4(str).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForYValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForBubbleSizes() != 2) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForBubbleSizes != DataSourceType.DoubleLiterals and so ", "bubbleSize cannot be of System.Double type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsLiteralString(str);
        chartDataPoint.getYValue().setAsCell(iChartDataCell);
        chartDataPoint.getBubbleSize().setAsLiteralDouble(d);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }

    @Override // com.aspose.slides.IChartDataPointCollection
    public final IChartDataPoint addDataPointForBubbleSeries(String str, IChartDataCell iChartDataCell, IChartDataCell iChartDataCell2) {
        if (!ChartTypeCharacterizer.isChartTypeBubble(m640x1().getType())) {
            throw new InvalidOperationException("Parent series is not Bubble series.");
        }
        if (getDataSourceTypeForXValues() != 1) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForXValues != DataSourceType.StringLiterals and so ", "xValue cannot be of ", C14067j2.m66727k4(str).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForYValues() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForYValues != DataSourceType.Worksheet and so ", "yValue cannot be of ", C14067j2.m66727k4(iChartDataCell).mo48629x6(), " type."));
        }
        if (getDataSourceTypeForBubbleSizes() != 0) {
            throw new ArgumentException(C14113y2.m67408k4("DataSourceTypeForBubbleSizes != DataSourceType.Worksheet and so ", "bubbleSize cannot be of ", C14067j2.m66727k4(iChartDataCell2).mo48629x6(), " type."));
        }
        ChartDataPoint chartDataPoint = new ChartDataPoint(this);
        chartDataPoint.getXValue().setAsLiteralString(str);
        chartDataPoint.getYValue().setAsCell(iChartDataCell);
        chartDataPoint.getBubbleSize().setAsCell(iChartDataCell2);
        m603x1(chartDataPoint);
        return chartDataPoint;
    }
}
