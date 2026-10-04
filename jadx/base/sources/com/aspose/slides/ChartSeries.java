package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ChartSeries implements IChartSeries, InterfaceC14397rj {

    /* JADX INFO: renamed from: ar */
    private ChartSeriesGroup f1458ar;

    /* JADX INFO: renamed from: b3 */
    private boolean f1459b3;

    /* JADX INFO: renamed from: bz */
    private String f1461bz;

    /* JADX INFO: renamed from: c5 */
    private boolean f1462c5;

    /* JADX INFO: renamed from: ck */
    private IColorFormat f1464ck;

    /* JADX INFO: renamed from: dq */
    private boolean f1465dq;

    /* JADX INFO: renamed from: du */
    private int f1466du;

    /* JADX INFO: renamed from: e0 */
    private boolean f1468e0;

    /* JADX INFO: renamed from: h4 */
    private int f1470h4;

    /* JADX INFO: renamed from: jd */
    private int f1472jd;

    /* JADX INFO: renamed from: kk */
    private InterfaceC14397rj f1474kk;

    /* JADX INFO: renamed from: qm */
    private int f1479qm;

    /* JADX INFO: renamed from: to */
    private Format f1482to;

    /* JADX INFO: renamed from: ts */
    private int f1483ts;

    /* JADX INFO: renamed from: uz */
    private boolean f1487uz;

    /* JADX INFO: renamed from: wl */
    private LegendEntryProperties f1489wl;

    /* JADX INFO: renamed from: x1 */
    private Chart f1491x1;

    /* JADX INFO: renamed from: yd */
    private C14757wy f1494yd;

    /* JADX INFO: renamed from: fa */
    private int f1469fa = 0;

    /* JADX INFO: renamed from: up */
    private String f1486up = "";

    /* JADX INFO: renamed from: yj */
    private String f1495yj = "";

    /* JADX INFO: renamed from: ks */
    private String f1475ks = "";

    /* JADX INFO: renamed from: rv */
    private String f1481rv = "";

    /* JADX INFO: renamed from: x6 */
    private String f1492x6 = "";

    /* JADX INFO: renamed from: ne */
    private String f1478ne = "";

    /* JADX INFO: renamed from: u4 */
    private boolean f1484u4 = true;

    /* JADX INFO: renamed from: wy */
    private boolean f1490wy = true;

    /* JADX INFO: renamed from: ak */
    private boolean f1457ak = true;

    /* JADX INFO: renamed from: xk */
    private boolean f1493xk = true;

    /* JADX INFO: renamed from: c6 */
    private int f1463c6 = 0;

    /* JADX INFO: renamed from: k4 */
    List<String> f1473k4 = new List<>();

    /* JADX INFO: renamed from: m9 */
    private Marker f1477m9 = new Marker(this, this);

    /* JADX INFO: renamed from: ix */
    private TrendlineCollection f1471ix = new TrendlineCollection(this);

    /* JADX INFO: renamed from: qq */
    private StringChartValue f1480qq = new StringChartValue(this, new C0936ec(), false);

    /* JADX INFO: renamed from: um */
    private final ChartDataPointCollection f1485um = new ChartDataPointCollection(this);

    /* JADX INFO: renamed from: dy */
    private DataLabelCollection f1467dy = new DataLabelCollection(this);

    /* JADX INFO: renamed from: v4 */
    private final ErrorBarsFormat f1488v4 = new ErrorBarsFormat(this);

    /* JADX INFO: renamed from: lr */
    private final ErrorBarsFormat f1476lr = new ErrorBarsFormat(this);

    /* JADX INFO: renamed from: bv */
    private final C13821m5 f1460bv = new C13821m5();

    public ChartSeries(ChartSeriesCollection chartSeriesCollection, int i, boolean z) {
        this.f1474kk = chartSeriesCollection;
        IGenericEnumerator<IChartSeries> it = chartSeriesCollection.iterator();
        int iM64750k4 = -1;
        int order = -1;
        while (it.hasNext()) {
            try {
                ChartSeries chartSeries = (ChartSeries) it.next();
                order = chartSeries.getOrder() > order ? chartSeries.getOrder() : order;
                if (!z && ((int) chartSeries.m726k4().m64750k4()) > iM64750k4) {
                    iM64750k4 = (int) chartSeries.m726k4().m64750k4();
                }
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
        if (!z) {
            this.f1460bv.m64751k4(((((long) iM64750k4) & 4294967295L) + 1) & 4294967295L);
        }
        this.f1470h4 = order + 1;
        this.f1482to = new Format(this);
        this.f1464ck = new ColorFormat(this);
        ((LineFillFormat) this.f1482to.getLine().getFillFormat()).f2609k4.mo27432x1(new AbstractC14383rd() { // from class: com.aspose.slides.ChartSeries.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Charts.ChartSeries.ValidateSeriesType()";
            }

            @Override // com.aspose.slides.AbstractC14383rd
            /* JADX INFO: renamed from: k4 */
            public void mo741k4() {
                ChartSeries.this.m735to();
            }
        });
        if (i == 73) {
            throw new InvalidOperationException("It's meaningless to create series of ChartType.SeriesOfMixedTypes type.");
        }
        if (i == 29 || i == 30 || i == 67) {
            this.f1472jd = 25;
        }
        this.f1466du = i;
        m718rv();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX INFO: renamed from: rv */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m718rv() {
        if (ChartTypeCharacterizer.isBar3DChart(this.f1466du)) {
            int i = this.f1466du;
            if (i != 33) {
                switch (i) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        this.f1469fa = 3;
                        return;
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        this.f1469fa = 1;
                        return;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        this.f1469fa = 4;
                        return;
                    default:
                        switch (i) {
                            case 36:
                            case 37:
                                break;
                            case 38:
                            case 39:
                            case 40:
                                break;
                            case 41:
                            case 42:
                            case 43:
                                break;
                            case 44:
                            case 45:
                            case 46:
                                break;
                            default:
                                throw new ArgumentException();
                        }
                        break;
                }
            }
            this.f1469fa = 0;
            return;
        }
        int i2 = this.f1466du;
        if ((i2 == 19 || i2 == 20 || i2 == 21 || i2 == 55 || i2 == 57 || i2 == 70) && this.f1477m9.getSymbol() == -1) {
            this.f1477m9.f2678x1 = 4;
        } else {
            int i3 = this.f1466du;
            if (i3 == 54 || i3 == 56 || i3 == 53 || i3 == 71 || i3 == 22 || i3 == 24 || i3 == 23) {
                this.f1477m9.f2678x1 = -1;
            }
        }
        int i4 = this.f1466du;
        if (i4 == 55 || i4 == 54) {
            this.f1462c5 = true;
        } else if (i4 == 57 || i4 == 56) {
            this.f1462c5 = false;
        }
        if (i4 == 53) {
            ((LineFillFormat) getFormat().getLine().getFillFormat()).setFillType((byte) 0);
        } else if (getFormat().getLine().getFillFormat().getFillType() == 0) {
            ((LineFillFormat) getFormat().getLine().getFillFormat()).setFillType((byte) -1);
        }
        int i5 = this.f1466du;
        if (i5 == 26 || i5 == 27 || i5 == 66) {
            this.f1472jd = 0;
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final C14757wy m719c5() {
        if (ChartTypeCharacterizer.m768up(getType())) {
            return this.f1494yd;
        }
        return null;
    }

    /* JADX INFO: renamed from: ck */
    public final String m720ck() {
        return this.f1461bz;
    }

    /* JADX INFO: renamed from: du */
    public final String m721du() {
        return this.f1492x6;
    }

    /* JADX INFO: renamed from: dy */
    public final C14757wy m722dy() {
        if (!ChartTypeCharacterizer.m768up(getType())) {
            throw new InvalidOperationException(C14113y2.m67408k4("Aggregated data points are not supported by series type ", C14042ak.m66410k4(ChartType.class, getType())));
        }
        if (this.f1494yd == null) {
            this.f1494yd = new C14757wy(this);
        }
        this.f1494yd.m72977x1();
        return this.f1494yd;
    }

    /* JADX INFO: renamed from: fa */
    public final int m723fa() {
        return this.f1479qm;
    }

    @Override // com.aspose.slides.IChartSeries
    public final Integer getAutomaticSeriesColor() {
        return (Integer) C12003du.m56473x1(m734m9());
    }

    @Override // com.aspose.slides.IChartSeries
    public final int getBar3DShape() {
        if (ChartTypeCharacterizer.isBar3DChart(getType())) {
            return this.f1469fa;
        }
        return -1;
    }

    @Override // com.aspose.slides.IChartSeries
    public final int getBubbleSizeRepresentation() {
        return this.f1458ar.getBubbleSizeRepresentation();
    }

    @Override // com.aspose.slides.IChartSeries
    public final int getBubbleSizeScale() {
        return this.f1458ar.getBubbleSizeScale();
    }

    @Override // com.aspose.slides.IChartComponent
    public final IChart getChart() {
        Chart chart = this.f1491x1;
        if (chart == null) {
            Chart[] chartArr = {chart};
            kke.m63959k4(Chart.class, this.f1474kk, chartArr);
            this.f1491x1 = chartArr[0];
        }
        return this.f1491x1;
    }

    @Override // com.aspose.slides.IChartSeries
    public final IChartDataPointCollection getDataPoints() {
        return this.f1485um;
    }

    @Override // com.aspose.slides.IChartSeries
    public final byte getDoughnutHoleSize() {
        return this.f1458ar.getDoughnutHoleSize();
    }

    @Override // com.aspose.slides.IChartSeries
    public final IErrorBarsFormat getErrorBarsXFormat() {
        if (ChartTypeCharacterizer.isErrorBarsXAllowed(this.f1466du)) {
            return this.f1488v4;
        }
        return null;
    }

    @Override // com.aspose.slides.IChartSeries
    public final IErrorBarsFormat getErrorBarsYFormat() {
        if (ChartTypeCharacterizer.isErrorBarsYAllowed(this.f1466du)) {
            return this.f1476lr;
        }
        return null;
    }

    @Override // com.aspose.slides.IChartSeries
    public final int getExplosion() {
        return this.f1472jd;
    }

    @Override // com.aspose.slides.IChartSeries
    public final int getFirstSliceAngle() {
        return this.f1458ar.getFirstSliceAngle();
    }

    @Override // com.aspose.slides.IChartSeries
    public final IFormat getFormat() {
        return this.f1482to;
    }

    @Override // com.aspose.slides.IChartSeries
    public final int getGapDepth() {
        return this.f1458ar.getGapDepth() & 65535;
    }

    @Override // com.aspose.slides.IChartSeries
    public final int getGapWidth() {
        return this.f1458ar.getGapWidth() & 65535;
    }

    @Override // com.aspose.slides.IChartSeries
    public final boolean getInvertIfNegative() {
        return this.f1484u4;
    }

    @Override // com.aspose.slides.IChartSeries
    public final IColorFormat getInvertedSolidFillColor() {
        return this.f1464ck;
    }

    @Override // com.aspose.slides.IChartSeries
    public final IDataLabelCollection getLabels() {
        return this.f1467dy;
    }

    @Override // com.aspose.slides.IChartSeries
    public final IMarker getMarker() {
        return this.f1477m9;
    }

    @Override // com.aspose.slides.IChartSeries
    public final IStringChartValue getName() {
        return this.f1480qq;
    }

    @Override // com.aspose.slides.IChartSeries
    public final String getNumberFormatOfBubbleSizes() {
        return this.f1481rv;
    }

    @Override // com.aspose.slides.IChartSeries
    public final String getNumberFormatOfValues() {
        return this.f1486up;
    }

    @Override // com.aspose.slides.IChartSeries
    public final String getNumberFormatOfXValues() {
        return this.f1495yj;
    }

    @Override // com.aspose.slides.IChartSeries
    public final String getNumberFormatOfYValues() {
        return this.f1475ks;
    }

    @Override // com.aspose.slides.IChartSeries
    public final int getOrder() {
        return this.f1470h4;
    }

    @Override // com.aspose.slides.IChartSeries
    public final byte getOverlap() {
        return this.f1458ar.getOverlap();
    }

    @Override // com.aspose.slides.IChartSeries
    public final int getParentLabelLayout() {
        return this.f1483ts;
    }

    @Override // com.aspose.slides.IChartSeries
    public final IChartSeriesGroup getParentSeriesGroup() {
        return this.f1458ar;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1474kk;
    }

    @Override // com.aspose.slides.IChartSeries
    public final int getPieSplitBy() {
        return this.f1458ar.getPieSplitBy();
    }

    @Override // com.aspose.slides.IChartSeries
    public final IPieSplitCustomPointCollection getPieSplitCustomPoints() {
        return this.f1458ar.getPieSplitCustomPoints();
    }

    @Override // com.aspose.slides.IChartSeries
    public final double getPieSplitPosition() {
        return this.f1458ar.getPieSplitPosition();
    }

    @Override // com.aspose.slides.IChartSeries
    public final boolean getPlotOnSecondAxis() {
        if (getType() == 77) {
            return true;
        }
        if (getType() == 76) {
            return false;
        }
        return this.f1487uz;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        if (getChart() != null) {
            return getChart().getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.IChartSeries
    public final int getQuartileMethod() {
        return this.f1463c6;
    }

    @Override // com.aspose.slides.IChartSeries
    public final ILegendEntryProperties getRelatedLegendEntry() {
        if (this.f1489wl == null) {
            this.f1489wl = new LegendEntryProperties(this);
        }
        return this.f1489wl;
    }

    @Override // com.aspose.slides.IChartSeries
    public final int getSecondPieSize() {
        return this.f1458ar.getSecondPieSize();
    }

    @Override // com.aspose.slides.IChartSeries
    public final boolean getShowConnectorLines() {
        return this.f1493xk;
    }

    @Override // com.aspose.slides.IChartSeries
    public final boolean getShowInnerPoints() {
        return this.f1459b3;
    }

    @Override // com.aspose.slides.IChartSeries
    public final boolean getShowMeanLine() {
        return this.f1465dq;
    }

    @Override // com.aspose.slides.IChartSeries
    public final boolean getShowMeanMarkers() {
        return this.f1457ak;
    }

    @Override // com.aspose.slides.IChartSeries
    public final boolean getShowOutlierPoints() {
        return this.f1490wy;
    }

    @Override // com.aspose.slides.ISlideComponent
    public final IBaseSlide getSlide() {
        if (getChart() != null) {
            return getChart().getSlide();
        }
        return null;
    }

    @Override // com.aspose.slides.IChartSeries
    public final boolean getSmooth() {
        return this.f1462c5;
    }

    @Override // com.aspose.slides.IChartSeries
    public final ITrendlineCollection getTrendLines() {
        if (ChartTypeCharacterizer.hasSeriesTrendLines(this.f1466du)) {
            return this.f1471ix;
        }
        return null;
    }

    @Override // com.aspose.slides.IChartSeries
    public final int getType() {
        return this.f1466du;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m724h4() {
        return this.f1478ne;
    }

    @Override // com.aspose.slides.IChartSeries
    public final boolean hasSeriesLines() {
        return this.f1458ar.hasSeriesLines();
    }

    @Override // com.aspose.slides.IChartSeries
    public final boolean hasUpDownBars() {
        return this.f1458ar.getUpDownBars().hasUpDownBars();
    }

    @Override // com.aspose.slides.IChartSeries
    public final boolean isColorVaried() {
        return this.f1458ar.isColorVaried();
    }

    /* JADX INFO: renamed from: jd */
    public final String m725jd() {
        return C14113y2.m67403k4(" ", this.f1473k4.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: k4 */
    public final C13821m5 m726k4() {
        return this.f1460bv;
    }

    /* JADX INFO: renamed from: kk */
    public final void m731kk() {
        ((AxesManager) getChart().getAxes()).m317x1();
        ((C14346qh) getChart().getChartData().getSeriesGroups()).m69580k4(this);
    }

    /* JADX INFO: renamed from: ks */
    public final boolean m733ks() {
        return this.f1458ar.m749k4();
    }

    /* JADX INFO: renamed from: m9 */
    public C12003du m734m9() {
        return igr.m7631k4((Chart) getChart(), getChart().getStyle() + 1)[(int) m726k4().m64750k4()];
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setBar3DShape(int i) {
        if (!ChartTypeCharacterizer.isBar3DChart(getType())) {
            throw new InvalidOperationException("Not applicable for non-Bar3dChart series type.");
        }
        int i2 = this.f1469fa;
        if (i2 != i) {
            this.f1469fa = i;
            if (i2 == 1 && i == 2) {
                return;
            }
            if (i2 == 2 && i == 1) {
                return;
            }
            if (i2 == 4 && i == 5) {
                return;
            }
            if (i2 == 5 && i == 4) {
                return;
            }
            m735to();
        }
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setExplosion(int i) {
        if (this.f1472jd != i) {
            this.f1472jd = i;
            m735to();
        }
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setInvertIfNegative(boolean z) {
        this.f1484u4 = z;
        IGenericEnumerator<IChartDataPoint> it = this.f1485um.iterator();
        while (it.hasNext()) {
            try {
                ((ChartDataPoint) it.next()).setInvertIfNegative(z);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setNumberFormatOfBubbleSizes(String str) {
        this.f1481rv = str;
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setNumberFormatOfValues(String str) {
        this.f1486up = str;
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setNumberFormatOfXValues(String str) {
        this.f1495yj = str;
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setNumberFormatOfYValues(String str) {
        this.f1475ks = str;
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setOrder(int i) {
        this.f1470h4 = i;
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setParentLabelLayout(int i) {
        this.f1483ts = i;
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setPlotOnSecondAxis(boolean z) {
        if (z && getType() == 76) {
            throw new InvalidOperationException("Histogram series can't be plotted on secondary axis");
        }
        if (!z && getType() == 77) {
            throw new InvalidOperationException("ParetoLine series can't be plotted on primary axis");
        }
        this.f1487uz = z;
        m731kk();
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setQuartileMethod(int i) {
        this.f1463c6 = i;
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setShowConnectorLines(boolean z) {
        this.f1493xk = z;
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setShowInnerPoints(boolean z) {
        this.f1459b3 = z;
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setShowMeanLine(boolean z) {
        this.f1465dq = z;
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setShowMeanMarkers(boolean z) {
        this.f1457ak = z;
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setShowOutlierPoints(boolean z) {
        this.f1490wy = z;
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setSmooth(boolean z) {
        if (this.f1462c5 != z) {
            this.f1462c5 = z;
            m735to();
        }
    }

    @Override // com.aspose.slides.IChartSeries
    public final void setType(int i) {
        if (i == 73) {
            throw new InvalidOperationException("It's meaningless to assign ChartType.SeriesOfMixedTypes value to ChartSeries.Type.");
        }
        if (this.f1466du != i) {
            if (i == 29 || i == 30 || i == 67) {
                this.f1472jd = 25;
            }
            this.f1466du = i;
            m718rv();
            m731kk();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x019c A[PHI: r5
      0x019c: PHI (r5v1 int) = (r5v0 int), (r5v2 int), (r5v3 int) binds: [B:151:0x01b3, B:145:0x01a3, B:141:0x0198] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ce  */
    /* JADX INFO: renamed from: to */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m735to() {
        int i;
        int i2;
        int i3;
        int i4 = this.f1466du;
        if (ChartTypeCharacterizer.isBar3DChart(i4)) {
            int i5 = this.f1466du;
            i = 33;
            i2 = 5;
            if (i5 != 33) {
                switch (i5) {
                    case 3:
                    case 7:
                    case 11:
                    case 15:
                        int i6 = this.f1469fa;
                        if (i6 == 0) {
                            this.f1466du = 3;
                        } else {
                            if (i6 == 1 || i6 == 2) {
                                i3 = 11;
                            } else if (i6 == 3) {
                                i3 = 7;
                            } else if (i6 == 4 || i6 == 5) {
                                i3 = 15;
                            }
                            this.f1466du = i3;
                        }
                        break;
                    case 4:
                    case 8:
                    case 12:
                    case 16:
                        int i7 = this.f1469fa;
                        if (i7 == 0) {
                            this.f1466du = 4;
                        } else {
                            if (i7 == 1 || i7 == 2) {
                                i3 = 12;
                            } else if (i7 == 3) {
                                i3 = 8;
                            } else if (i7 == 4 || i7 == 5) {
                                i3 = 16;
                            }
                            this.f1466du = i3;
                        }
                        break;
                    case 5:
                    case 9:
                    case 13:
                    case 17:
                        int i8 = this.f1469fa;
                        if (i8 == 0) {
                            this.f1466du = i2;
                        } else {
                            if (i8 == 1 || i8 == 2) {
                                i3 = 13;
                            } else if (i8 == 3) {
                                i3 = 9;
                            } else if (i8 == 4 || i8 == 5) {
                                i3 = 17;
                            }
                            this.f1466du = i3;
                        }
                        break;
                    case 6:
                    case 10:
                    case 14:
                    case 18:
                        int i9 = this.f1469fa;
                        if (i9 == 0) {
                            i3 = 6;
                        } else if (i9 == 1 || i9 == 2) {
                            i3 = 14;
                        } else if (i9 == 3) {
                            i3 = 10;
                        } else if (i9 == 4 || i9 == 5) {
                            i3 = 18;
                        }
                        this.f1466du = i3;
                        break;
                    default:
                        switch (i5) {
                            case 36:
                            case 39:
                            case 42:
                            case 45:
                                int i10 = this.f1469fa;
                                if (i10 == 0) {
                                    i3 = 36;
                                } else if (i10 == 1 || i10 == 2) {
                                    i3 = 42;
                                } else if (i10 == 3) {
                                    i3 = 39;
                                } else if (i10 == 4 || i10 == 5) {
                                    i3 = 45;
                                }
                                this.f1466du = i3;
                                break;
                            case 37:
                            case 40:
                            case 43:
                            case 46:
                                int i11 = this.f1469fa;
                                if (i11 == 0) {
                                    i3 = 37;
                                } else if (i11 == 1 || i11 == 2) {
                                    i3 = 43;
                                } else if (i11 == 3) {
                                    i3 = 40;
                                } else if (i11 == 4 || i11 == 5) {
                                    i3 = 46;
                                }
                                this.f1466du = i3;
                                break;
                            case 38:
                            case 41:
                            case 44:
                                int i12 = this.f1469fa;
                                if (i12 == 0) {
                                    this.f1466du = i;
                                } else {
                                    if (i12 == 1 || i12 == 2) {
                                        i3 = 41;
                                    } else if (i12 == 3) {
                                        i3 = 38;
                                    } else if (i12 == 4 || i12 == 5) {
                                        i3 = 44;
                                    }
                                    this.f1466du = i3;
                                }
                                break;
                            default:
                                throw new Exception();
                        }
                        break;
                }
            }
        } else {
            int i13 = this.f1466du;
            i = 29;
            int i14 = 26;
            if (i13 != 26) {
                i2 = 30;
                if (i13 != 27) {
                    if (i13 == 29) {
                        if (getExplosion() == 0) {
                        }
                        this.f1466du = i;
                    } else if (i13 != 30) {
                        i = 67;
                        i14 = 66;
                        if (i13 == 66 || i13 == 67) {
                            if (getExplosion() == 0) {
                                i = i14;
                            }
                            this.f1466du = i;
                        } else {
                            i = 71;
                            i14 = 70;
                            if (i13 != 70 && i13 != 71) {
                                switch (i13) {
                                    case 19:
                                    case 22:
                                        i3 = getMarker().getSymbol() != 4 ? 22 : 19;
                                        this.f1466du = i3;
                                        break;
                                    case 20:
                                    case 23:
                                        i3 = getMarker().getSymbol() != 4 ? 23 : 20;
                                        this.f1466du = i3;
                                        break;
                                    case 21:
                                    case 24:
                                        i3 = getMarker().getSymbol() != 4 ? 24 : 21;
                                        this.f1466du = i3;
                                        break;
                                    default:
                                        switch (i13) {
                                            case 53:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                                boolean z = getMarker().getSymbol() != 4;
                                                boolean z2 = getFormat().getLine().getFillFormat().getFillType() == 0;
                                                boolean smooth = getSmooth();
                                                if (!z) {
                                                    i3 = !smooth ? 57 : 55;
                                                } else if (!z2) {
                                                    i3 = !smooth ? 56 : 54;
                                                } else {
                                                    i3 = 53;
                                                }
                                                break;
                                        }
                                        this.f1466du = i3;
                                        break;
                                }
                            } else {
                                if (getMarker().getSymbol() == 4) {
                                }
                                this.f1466du = i;
                            }
                        }
                    }
                }
                if (getExplosion() == 0) {
                    i2 = 27;
                }
                this.f1466du = i2;
            }
        }
        if (i4 != this.f1466du) {
            m731kk();
        }
    }

    /* JADX INFO: renamed from: up */
    public final boolean m736up() {
        return this.f1458ar.m751to();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m737x1(String str) {
        this.f1478ne = str;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m740yj() {
        return this.f1458ar.m747du();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m727k4(ChartSeriesGroup chartSeriesGroup) {
        this.f1458ar = chartSeriesGroup;
    }

    /* JADX INFO: renamed from: kk */
    public final void m732kk(String str) {
        this.f1461bz = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m738x1(boolean z) {
        this.f1487uz = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m728k4(IStringChartValue iStringChartValue) {
        this.f1480qq = (StringChartValue) iStringChartValue;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m739x1() {
        return this.f1468e0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m729k4(String str) {
        this.f1492x6 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m730k4(boolean z) {
        this.f1468e0 = z;
    }
}
