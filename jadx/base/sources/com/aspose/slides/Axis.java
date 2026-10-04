package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class Axis extends DomObject<AxesManager> implements IAxis {

    /* JADX INFO: renamed from: ak */
    private long f978ak;

    /* JADX INFO: renamed from: ar */
    private final ChartLinesFormat f979ar;

    /* JADX INFO: renamed from: b3 */
    private long f980b3;

    /* JADX INFO: renamed from: bv */
    private final AxisFormat f981bv;

    /* JADX INFO: renamed from: bz */
    private int f982bz;

    /* JADX INFO: renamed from: c5 */
    private boolean f983c5;

    /* JADX INFO: renamed from: c6 */
    private boolean f984c6;

    /* JADX INFO: renamed from: ck */
    private boolean f985ck;

    /* JADX INFO: renamed from: dq */
    private boolean f986dq;

    /* JADX INFO: renamed from: du */
    private double f987du;

    /* JADX INFO: renamed from: dy */
    private double f988dy;

    /* JADX INFO: renamed from: e0 */
    private int f989e0;

    /* JADX INFO: renamed from: f9 */
    private double f990f9;

    /* JADX INFO: renamed from: fa */
    private double f991fa;

    /* JADX INFO: renamed from: g8 */
    private final C14252ou f992g8;

    /* JADX INFO: renamed from: gi */
    private boolean f993gi;

    /* JADX INFO: renamed from: ix */
    private int f994ix;

    /* JADX INFO: renamed from: j2 */
    private double f995j2;

    /* JADX INFO: renamed from: jd */
    private double f996jd;

    /* JADX INFO: renamed from: k4 */
    private float f997k4;

    /* JADX INFO: renamed from: kk */
    private C14609ty f998kk;

    /* JADX INFO: renamed from: kp */
    private long f999kp;

    /* JADX INFO: renamed from: ks */
    private boolean f1000ks;

    /* JADX INFO: renamed from: lr */
    private int f1001lr;

    /* JADX INFO: renamed from: m9 */
    private boolean f1002m9;

    /* JADX INFO: renamed from: ne */
    private int f1003ne;

    /* JADX INFO: renamed from: os */
    private int f1004os;

    /* JADX INFO: renamed from: qm */
    private ChartTextFormat f1005qm;

    /* JADX INFO: renamed from: qq */
    private boolean f1006qq;

    /* JADX INFO: renamed from: qw */
    private double f1007qw;

    /* JADX INFO: renamed from: rv */
    private boolean f1008rv;

    /* JADX INFO: renamed from: s7 */
    private boolean f1009s7;

    /* JADX INFO: renamed from: ss */
    private double f1010ss;

    /* JADX INFO: renamed from: sv */
    private Chart f1011sv;

    /* JADX INFO: renamed from: t6 */
    private boolean f1012t6;

    /* JADX INFO: renamed from: to */
    private boolean f1013to;

    /* JADX INFO: renamed from: tq */
    private double f1014tq;

    /* JADX INFO: renamed from: ts */
    private boolean f1015ts;

    /* JADX INFO: renamed from: u4 */
    private int f1016u4;

    /* JADX INFO: renamed from: um */
    private final ChartLinesFormat f1017um;

    /* JADX INFO: renamed from: up */
    private boolean f1018up;

    /* JADX INFO: renamed from: uz */
    private int f1019uz;

    /* JADX INFO: renamed from: v4 */
    private final ChartTitle f1020v4;

    /* JADX INFO: renamed from: vh */
    private double f1021vh;

    /* JADX INFO: renamed from: vj */
    private double f1022vj;

    /* JADX INFO: renamed from: w6 */
    private int f1023w6;

    /* JADX INFO: renamed from: wl */
    private int f1024wl;

    /* JADX INFO: renamed from: wp */
    private int f1025wp;

    /* JADX INFO: renamed from: wy */
    private boolean f1026wy;

    /* JADX INFO: renamed from: x1 */
    private int f1027x1;

    /* JADX INFO: renamed from: x6 */
    private int f1028x6;

    /* JADX INFO: renamed from: xk */
    private String f1029xk;

    /* JADX INFO: renamed from: xw */
    private boolean f1030xw;

    /* JADX INFO: renamed from: yd */
    private int f1031yd;

    /* JADX INFO: renamed from: yj */
    private double f1032yj;

    public Axis(AxesManager axesManager) {
        super(axesManager);
        this.f1013to = true;
        this.f1002m9 = true;
        this.f983c5 = true;
        this.f985ck = true;
        this.f1018up = false;
        this.f1032yj = 10.0d;
        this.f1000ks = false;
        this.f1008rv = true;
        this.f1028x6 = 3;
        this.f1003ne = 2;
        this.f994ix = 2;
        this.f1006qq = true;
        this.f980b3 = 1L;
        this.f1026wy = true;
        this.f978ak = 1L;
        this.f986dq = true;
        this.f1029xk = "";
        this.f984c6 = true;
        this.f1015ts = false;
        this.f989e0 = 100;
        this.f982bz = 0;
        this.f992g8 = new C14252ou();
        this.f1025wp = 1;
        this.f1010ss = 4.0d;
        this.f999kp = 6L;
        this.f993gi = false;
        this.f1009s7 = true;
        this.f990f9 = 0.0d;
        this.f1012t6 = false;
        this.f1030xw = true;
        this.f1022vj = 0.0d;
        this.f981bv = new AxisFormat(this);
        this.f1020v4 = new ChartTitle(this);
        this.f998kk = new C14609ty(this);
        this.f979ar = new ChartLinesFormat(this);
        this.f1017um = new ChartLinesFormat(this);
    }

    /* JADX INFO: renamed from: du */
    public final boolean m318du() {
        return this == getChart().getAxes().getSecondaryHorizontalAxis() || this == getChart().getAxes().getSecondaryVerticalAxis();
    }

    @Override // com.aspose.slides.IAxis
    public final double getActualMajorUnit() {
        return this.f1014tq;
    }

    @Override // com.aspose.slides.IAxis
    public final int getActualMajorUnitScale() {
        return this.f1023w6;
    }

    @Override // com.aspose.slides.IAxis
    public final double getActualMaxValue() {
        return this.f1021vh;
    }

    @Override // com.aspose.slides.IAxis
    public final double getActualMinValue() {
        return this.f1007qw;
    }

    @Override // com.aspose.slides.IAxis
    public final double getActualMinorUnit() {
        return this.f995j2;
    }

    @Override // com.aspose.slides.IAxis
    public final int getActualMinorUnitScale() {
        return this.f1004os;
    }

    @Override // com.aspose.slides.IAxis
    public final int getAggregationType() {
        return this.f1025wp;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean getAxisBetweenCategories() {
        Axis axisM325to = m325to();
        return axisM325to == null || axisM325to.m319k4().m68850m9() != 1;
    }

    @Override // com.aspose.slides.IAxis
    public final int getBaseUnitScale() {
        return this.f1024wl;
    }

    @Override // com.aspose.slides.IAxis
    public final double getBinWidth() {
        return this.f1010ss;
    }

    @Override // com.aspose.slides.IAxis
    public final int getCategoryAxisType() {
        return this.f982bz;
    }

    @Override // com.aspose.slides.IChartComponent
    public final IChart getChart() {
        Chart chart = this.f1011sv;
        if (chart == null) {
            Chart[] chartArr = {chart};
            kke.m63959k4(Chart.class, (InterfaceC14397rj) this.f2127h4, chartArr);
            this.f1011sv = chartArr[0];
        }
        return this.f1011sv;
    }

    @Override // com.aspose.slides.IAxis
    public final float getCrossAt() {
        return this.f997k4;
    }

    @Override // com.aspose.slides.IAxis
    public final int getCrossType() {
        return this.f1001lr;
    }

    @Override // com.aspose.slides.IAxis
    public final int getDisplayUnit() {
        return this.f1027x1;
    }

    @Override // com.aspose.slides.IAxis
    public final IAxisFormat getFormat() {
        return this.f981bv;
    }

    @Override // com.aspose.slides.IAxis
    public final int getLabelOffset() {
        return this.f989e0;
    }

    @Override // com.aspose.slides.IAxis
    public final double getLogBase() {
        return this.f1032yj;
    }

    @Override // com.aspose.slides.IAxis
    public final IChartLinesFormat getMajorGridLinesFormat() {
        return this.f1017um;
    }

    @Override // com.aspose.slides.IAxis
    public final int getMajorTickMark() {
        return this.f1028x6;
    }

    @Override // com.aspose.slides.IAxis
    public final double getMajorUnit() {
        return this.f988dy;
    }

    @Override // com.aspose.slides.IAxis
    public final int getMajorUnitScale() {
        return this.f1016u4;
    }

    @Override // com.aspose.slides.IAxis
    public final double getMaxValue() {
        return this.f987du;
    }

    @Override // com.aspose.slides.IAxis
    public final double getMinValue() {
        return this.f991fa;
    }

    @Override // com.aspose.slides.IAxis
    public final IChartLinesFormat getMinorGridLinesFormat() {
        return this.f979ar;
    }

    @Override // com.aspose.slides.IAxis
    public final int getMinorTickMark() {
        return this.f1003ne;
    }

    @Override // com.aspose.slides.IAxis
    public final double getMinorUnit() {
        return this.f996jd;
    }

    @Override // com.aspose.slides.IAxis
    public final int getMinorUnitScale() {
        return this.f1019uz;
    }

    @Override // com.aspose.slides.IAxis
    public final String getNumberFormat() {
        return this.f1029xk;
    }

    @Override // com.aspose.slides.IAxis
    public final long getNumberOfBins() {
        return this.f999kp;
    }

    @Override // com.aspose.slides.IAxis
    public final double getOverflowBin() {
        return this.f990f9;
    }

    @Override // com.aspose.slides.IAxis
    public final int getPosition() {
        return this.f1031yd;
    }

    @Override // com.aspose.slides.IPresentationComponent
    public final IPresentation getPresentation() {
        if (getChart() != null) {
            return getChart().getPresentation();
        }
        return null;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean getShowMajorGridLines() {
        return this.f1017um.getLine().getFillFormat().getFillType() != 0;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean getShowMinorGridLines() {
        return this.f979ar.getLine().getFillFormat().getFillType() != 0;
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
        if (this.f1005qm == null) {
            this.f1005qm = new ChartTextFormat(this);
        }
        return this.f1005qm;
    }

    @Override // com.aspose.slides.IAxis
    public final int getTickLabelPosition() {
        return this.f994ix;
    }

    @Override // com.aspose.slides.IAxis
    public final float getTickLabelRotationAngle() {
        return ((TextFrameFormat) getTextFormat().getTextBlockFormat()).getRotationAngle();
    }

    @Override // com.aspose.slides.IAxis
    public final long getTickLabelSpacing() {
        return this.f980b3;
    }

    @Override // com.aspose.slides.IAxis
    public final long getTickMarksSpacing() {
        return this.f978ak;
    }

    @Override // com.aspose.slides.IAxis
    public final IChartTitle getTitle() {
        return this.f1020v4;
    }

    @Override // com.aspose.slides.IAxis
    public final double getUnderflowBin() {
        return this.f1022vj;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean hasTitle() {
        return this.f1015ts;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean isAutomaticMajorUnit() {
        return this.f1002m9;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean isAutomaticMaxValue() {
        return this.f1013to;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean isAutomaticMinValue() {
        return this.f985ck;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean isAutomaticMinorUnit() {
        return this.f983c5;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean isAutomaticOverflowBin() {
        return this.f1009s7;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean isAutomaticTickLabelSpacing() {
        return this.f1026wy;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean isAutomaticTickMarksSpacing() {
        return this.f986dq;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean isAutomaticUnderflowBin() {
        return this.f1030xw;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean isLogarithmic() {
        return this.f1018up;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean isNumberFormatLinkedToSource() {
        return this.f984c6;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean isOverflowBin() {
        return this.f993gi;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean isPlotOrderReversed() {
        return this.f1000ks;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean isUnderflowBin() {
        return this.f1012t6;
    }

    @Override // com.aspose.slides.IAxis
    public final boolean isVisible() {
        return this.f1008rv;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14252ou m319k4() {
        return this.f992g8;
    }

    /* JADX INFO: renamed from: kk */
    public final void m323kk(double d) {
        this.f1014tq = d;
    }

    @Override // com.aspose.slides.IAxis
    public final void setAggregationType(int i) {
        this.f1025wp = i;
    }

    @Override // com.aspose.slides.IAxis
    public final void setAutomaticMajorUnit(boolean z) {
        this.f1002m9 = z;
    }

    @Override // com.aspose.slides.IAxis
    public final void setAutomaticMaxValue(boolean z) {
        this.f1013to = z;
    }

    @Override // com.aspose.slides.IAxis
    public final void setAutomaticMinValue(boolean z) {
        this.f985ck = z;
    }

    @Override // com.aspose.slides.IAxis
    public final void setAutomaticMinorUnit(boolean z) {
        this.f983c5 = z;
    }

    @Override // com.aspose.slides.IAxis
    public final void setAutomaticOverflowBin(boolean z) {
        this.f1009s7 = z;
    }

    @Override // com.aspose.slides.IAxis
    public final void setAutomaticTickLabelSpacing(boolean z) {
        this.f1026wy = z;
    }

    @Override // com.aspose.slides.IAxis
    public final void setAutomaticTickMarksSpacing(boolean z) {
        this.f986dq = z;
    }

    @Override // com.aspose.slides.IAxis
    public final void setAutomaticUnderflowBin(boolean z) {
        this.f1030xw = z;
    }

    @Override // com.aspose.slides.IAxis
    public final void setAxisBetweenCategories(boolean z) {
        Axis axisM325to = m325to();
        if (axisM325to != null) {
            axisM325to.m319k4().m68856x1(!z ? 1 : 0);
        }
    }

    @Override // com.aspose.slides.IAxis
    public final void setBaseUnitScale(int i) {
        this.f1024wl = i;
    }

    @Override // com.aspose.slides.IAxis
    public final void setBinWidth(double d) {
        this.f1010ss = d;
    }

    @Override // com.aspose.slides.IAxis
    public final void setCategoryAxisType(int i) {
        this.f982bz = i;
    }

    @Override // com.aspose.slides.IAxis
    public final void setCategoryAxisTypeAutomatically() {
        int i;
        ChartData chartData = (ChartData) C7019kk.m27452k4((Object) getChart().getChartData(), ChartData.class);
        IChartCategoryCollection categories = (this == getChart().getAxes().getVerticalAxis() || this == getChart().getAxes().getHorizontalAxis()) ? getChart().getChartData().getCategories() : getChart().getChartData().getSecondaryCategories();
        if (categories == null) {
            return;
        }
        IGenericEnumerator<IChartCategory> it = categories.iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    i = 1;
                    break;
                }
                ChartCategory chartCategory = (ChartCategory) it.next();
                Object objM522k4 = chartData.m553x1().mo5710kk() != 2 ? chartCategory.m522k4() : chartCategory.getValue();
                if (objM522k4 != null && !C7019kk.m27469x1(objM522k4, Double.class)) {
                    i = 0;
                    break;
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
        setCategoryAxisType(i);
    }

    @Override // com.aspose.slides.IAxis
    public final void setCrossAt(float f) {
        this.f997k4 = f;
    }

    @Override // com.aspose.slides.IAxis
    public final void setCrossType(int i) {
        this.f1001lr = i;
    }

    @Override // com.aspose.slides.IAxis
    public final void setDisplayUnit(int i) {
        this.f1027x1 = i;
    }

    @Override // com.aspose.slides.IAxis
    public final void setLabelOffset(int i) {
        this.f989e0 = i;
    }

    @Override // com.aspose.slides.IAxis
    public final void setLogBase(double d) {
        this.f1032yj = d;
    }

    @Override // com.aspose.slides.IAxis
    public final void setLogarithmic(boolean z) {
        this.f1018up = z;
    }

    @Override // com.aspose.slides.IAxis
    public final void setMajorTickMark(int i) {
        this.f1028x6 = i;
    }

    @Override // com.aspose.slides.IAxis
    public final void setMajorUnit(double d) {
        this.f988dy = d;
    }

    @Override // com.aspose.slides.IAxis
    public final void setMajorUnitScale(int i) {
        this.f1016u4 = i;
    }

    @Override // com.aspose.slides.IAxis
    public final void setMaxValue(double d) {
        this.f987du = d;
    }

    @Override // com.aspose.slides.IAxis
    public final void setMinValue(double d) {
        this.f991fa = d;
    }

    @Override // com.aspose.slides.IAxis
    public final void setMinorTickMark(int i) {
        this.f1003ne = i;
    }

    @Override // com.aspose.slides.IAxis
    public final void setMinorUnit(double d) {
        this.f996jd = d;
    }

    @Override // com.aspose.slides.IAxis
    public final void setMinorUnitScale(int i) {
        this.f1019uz = i;
    }

    @Override // com.aspose.slides.IAxis
    public final void setNumberFormat(String str) {
        this.f1029xk = str;
    }

    @Override // com.aspose.slides.IAxis
    public final void setNumberFormatLinkedToSource(boolean z) {
        this.f984c6 = z;
    }

    @Override // com.aspose.slides.IAxis
    public final void setNumberOfBins(long j) {
        this.f999kp = j;
    }

    @Override // com.aspose.slides.IAxis
    public final void setOverflowBin(double d) {
        this.f990f9 = d;
    }

    @Override // com.aspose.slides.IAxis
    public final void setPlotOrderReversed(boolean z) {
        this.f1000ks = z;
    }

    @Override // com.aspose.slides.IAxis
    public final void setPosition(int i) {
        this.f1031yd = i;
    }

    @Override // com.aspose.slides.IAxis
    public final void setTickLabelPosition(int i) {
        this.f994ix = i;
    }

    @Override // com.aspose.slides.IAxis
    public final void setTickLabelRotationAngle(float f) {
        ((TextFrameFormat) getTextFormat().getTextBlockFormat()).setRotationAngle(f);
    }

    @Override // com.aspose.slides.IAxis
    public final void setTickLabelSpacing(long j) {
        if ((4294967295L & j) <= 0) {
            throw new PptxException("Invalid value: must be greater than 0");
        }
        this.f980b3 = j;
    }

    @Override // com.aspose.slides.IAxis
    public final void setTickMarksSpacing(long j) {
        if ((4294967295L & j) <= 0) {
            throw new PptxException("Invalid value: must be greater than 0");
        }
        this.f978ak = j;
    }

    @Override // com.aspose.slides.IAxis
    public final void setTitle(boolean z) {
        this.f1015ts = z;
    }

    @Override // com.aspose.slides.IAxis
    public final void setUnderflowBin(double d) {
        this.f1022vj = d;
    }

    @Override // com.aspose.slides.IAxis
    public final void setVisible(boolean z) {
        this.f1008rv = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    public final Axis m325to() {
        IAxis secondaryVerticalAxis;
        if (((AxesManager) this.f2127h4).getHorizontalAxis() == this) {
            secondaryVerticalAxis = ((AxesManager) this.f2127h4).getVerticalAxis();
        } else if (((AxesManager) this.f2127h4).getVerticalAxis() == this) {
            secondaryVerticalAxis = ((AxesManager) this.f2127h4).getHorizontalAxis();
        } else if (((AxesManager) this.f2127h4).getSecondaryVerticalAxis() == this) {
            secondaryVerticalAxis = ((AxesManager) this.f2127h4).getSecondaryHorizontalAxis();
        } else {
            if (((AxesManager) this.f2127h4).getSecondaryHorizontalAxis() != this) {
                return null;
            }
            secondaryVerticalAxis = ((AxesManager) this.f2127h4).getSecondaryVerticalAxis();
        }
        return (Axis) secondaryVerticalAxis;
    }

    /* JADX INFO: renamed from: x1 */
    public final C14609ty m327x1() {
        return this.f998kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m320k4(double d) {
        this.f1021vh = d;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m324kk() {
        return this.f1006qq;
    }

    @Override // com.aspose.slides.IAxis
    public final void setOverflowBin(boolean z) {
        this.f993gi = z;
    }

    @Override // com.aspose.slides.IAxis
    public final void setUnderflowBin(boolean z) {
        this.f1012t6 = z;
    }

    /* JADX INFO: renamed from: to */
    public final void m326to(double d) {
        this.f995j2 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m328x1(double d) {
        this.f1007qw = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m321k4(int i) {
        this.f1023w6 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m329x1(int i) {
        this.f1004os = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m322k4(boolean z) {
        this.f1006qq = z;
    }
}
