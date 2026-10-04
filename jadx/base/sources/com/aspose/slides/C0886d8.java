package com.aspose.slides;

import android.content.Context;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.d8 */
/* JADX INFO: loaded from: classes3.dex */
class C0886d8 {

    /* JADX INFO: renamed from: m9 */
    private static final C12003du f4549m9 = C12003du.m56385i5().Clone();

    /* JADX INFO: renamed from: du */
    private s5e f4552du;

    /* JADX INFO: renamed from: fa */
    private boolean f4554fa;

    /* JADX INFO: renamed from: h4 */
    private C0852cf f4555h4;

    /* JADX INFO: renamed from: k4 */
    private ChartDataPoint f4557k4;

    /* JADX INFO: renamed from: kk */
    private C14567tm f4558kk;

    /* JADX INFO: renamed from: to */
    private final C13847mr f4559to;

    /* JADX INFO: renamed from: x1 */
    private C14567tm f4561x1;

    /* JADX INFO: renamed from: dy */
    private boolean f4553dy = true;

    /* JADX INFO: renamed from: c5 */
    private double f4550c5 = Double.NaN;

    /* JADX INFO: renamed from: jd */
    private double f4556jd = Double.NaN;

    /* JADX INFO: renamed from: ck */
    private boolean f4551ck = false;

    /* JADX INFO: renamed from: up */
    private C12003du f4560up = C12003du.f40505to.Clone();

    /* JADX INFO: renamed from: yj */
    private C12003du f4562yj = C12003du.f40505to.Clone();

    public C0886d8(ChartDataPoint chartDataPoint, C13847mr c13847mr) {
        this.f4559to = c13847mr;
        if (chartDataPoint == null) {
            return;
        }
        this.f4557k4 = chartDataPoint;
        if (c13847mr.m64945h4().getErrorBarsXFormat() != null && c13847mr.m64945h4().getErrorBarsXFormat().isVisible()) {
            this.f4561x1 = new C14567tm(false, this);
        }
        if (c13847mr.m64945h4().getErrorBarsYFormat() != null && c13847mr.m64945h4().getErrorBarsYFormat().isVisible()) {
            this.f4558kk = new C14567tm(true, this);
        }
        if (chartDataPoint.m599x1() != null) {
            this.f4552du = new s5e(c13847mr.m64941c5(), chartDataPoint.m599x1(), c13847mr);
        }
        DataLabel dataLabel = (DataLabel) C7019kk.m27452k4((Object) chartDataPoint.getLabel(), DataLabel.class);
        if (dataLabel.isVisible() || (!(dataLabel.m1302m9() == null || C14113y2.m67411k4(dataLabel.getTextFrameForOverriding().getText())) || ChartTypeCharacterizer.is3DChart(c13847mr.m64945h4().getType()))) {
            this.f4555h4 = new C0852cf((DataLabel) chartDataPoint.getLabel(), c13847mr.m64941c5());
        }
    }

    /* JADX INFO: renamed from: ar */
    private C12003du m4975ar() {
        return (this.f4559to.m64945h4().getFormat().getFill().getFillType() != 1 || this.f4559to.m64945h4().getInvertedSolidFillColor().getColorType() == -1) ? f4549m9 : ((ColorFormat) this.f4559to.m64945h4().getInvertedSolidFillColor()).m1084to();
    }

    /* JADX INFO: renamed from: bv */
    private FillFormat m4976bv() {
        IFormat format;
        ChartDataPoint chartDataPoint = this.f4557k4;
        if (chartDataPoint == null) {
            return null;
        }
        if (chartDataPoint.getFormat().getFill().getFillType() == -1) {
            format = this.f4557k4.m584h4();
            if (this.f4559to.m64945h4().getFormat().getFill().getFillType() != -1 || format == null) {
                format = this.f4559to.m64945h4().getFormat();
            }
        } else {
            format = this.f4557k4.getFormat();
        }
        return (FillFormat) format.getFill();
    }

    /* JADX INFO: renamed from: um */
    private boolean m4977um() {
        return ((ChartData) this.f4559to.m64941c5().m69834fa().getChartData()).m553x1().mo5710kk() != 2;
    }

    /* JADX INFO: renamed from: v4 */
    private boolean m4978v4() {
        byte fillType;
        int type = this.f4559to.m64945h4().getType();
        return (ChartTypeCharacterizer.isChartTypeColumn(type) || ChartTypeCharacterizer.isChartTypeBar(type)) && m5005ne() && m4988jd().getInvertIfNegative() && (fillType = m4988jd().getFormat().getFill().getFillType()) != 2 && fillType != 3 && fillType != 4 && fillType != 0 && m5012up().m64941c5().m69834fa().getStyle() + 1 <= 16;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m4979c5() {
        return this.f4554fa;
    }

    /* JADX INFO: renamed from: ck */
    public final C14567tm m4980ck() {
        return this.f4561x1;
    }

    /* JADX INFO: renamed from: du */
    public final String m4981du() {
        ChartDataCell chartDataCell;
        IDoubleChartValue value;
        if (!m4977um()) {
            if (m4988jd().getYValue().getDataSourceType() == 0 && ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(this.f4559to.m64945h4().getType())) {
                value = m4988jd().getYValue();
            } else if (m4988jd().getValue().getDataSourceType() == 0) {
                value = m4988jd().getValue();
            } else {
                chartDataCell = null;
                if (chartDataCell != null && !chartDataCell.m576to()) {
                    return chartDataCell.m567k4(true);
                }
            }
            chartDataCell = (ChartDataCell) C7019kk.m27452k4((Object) value.getAsCell(), ChartDataCell.class);
            if (chartDataCell != null) {
                return chartDataCell.m567k4(true);
            }
        } else {
            if (m4988jd().getYValue().getDataSourceType() == 0 && ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(this.f4559to.m64945h4().getType()) && !C14113y2.m67411k4(m4988jd().m580ck().m71992x1())) {
                return m4988jd().m580ck().m71992x1();
            }
            if (m4988jd().getValue().getDataSourceType() == 0 && !C14113y2.m67411k4(m4988jd().m579c5().m71992x1())) {
                return m4988jd().m579c5().m71992x1();
            }
        }
        return m5008to();
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m4983dy() {
        if (this.f4557k4 == null) {
            return this.f4551ck;
        }
        boolean zIsSeriesUsesValueCoordinate = ChartTypeCharacterizer.isSeriesUsesValueCoordinate(this.f4559to.m64945h4().getType());
        Class cls = Double.TYPE;
        if (zIsSeriesUsesValueCoordinate) {
            if (this.f4557k4.getValue().getDataSourceType() == 2 && !C14044b3.m66437kk(this.f4557k4.getValue().getAsLiteralDouble())) {
                return false;
            }
            if (m4977um()) {
                if (this.f4557k4.m579c5().m71989k4() == null) {
                    return true;
                }
                if ("#N/A".equals(this.f4557k4.m579c5().m71989k4().toString())) {
                    m5001kk(true);
                    return true;
                }
                if (C14044b3.m66437kk(((Double) C7019kk.m27464to(this.f4557k4.m579c5().m71989k4(), cls)).doubleValue())) {
                    return true;
                }
            } else if ((this.f4557k4.getValue().getDataSourceType() == 0 && this.f4557k4.getValue().getAsCell() == null) || DoubleChartValue.m1353k4((ISingleCellChartValue) this.f4557k4.getValue())) {
                return true;
            }
        }
        if (ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(this.f4559to.m64945h4().getType())) {
            if (this.f4557k4.getYValue().getDataSourceType() == 2 && !C14044b3.m66437kk(this.f4557k4.getYValue().getAsLiteralDouble())) {
                return false;
            }
            if (m4977um()) {
                if (this.f4557k4.m580ck().m71989k4() == null) {
                    return true;
                }
                if ("#N/A".equals(this.f4557k4.m580ck().m71989k4().toString())) {
                    m5001kk(true);
                    return true;
                }
                if (C14044b3.m66437kk(((Double) C7019kk.m27464to(this.f4557k4.m580ck().m71989k4(), cls)).doubleValue())) {
                    return true;
                }
            } else if ((this.f4557k4.getYValue().getDataSourceType() == 0 && this.f4557k4.getYValue().getAsCell() == null) || ((this.f4557k4.getXValue().getDataSourceType() == 0 && this.f4557k4.getXValue().getAsCell() == null) || DoubleChartValue.m1353k4((ISingleCellChartValue) this.f4557k4.getYValue()) || DoubleChartValue.m1353k4((ISingleCellChartValue) this.f4557k4.getXValue()))) {
                return true;
            }
        }
        return this.f4551ck;
    }

    /* JADX INFO: renamed from: fa */
    public final C14567tm m4984fa() {
        return this.f4558kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m4985h4() {
        return this.f4559to.m64945h4().getNumberFormatOfXValues();
    }

    /* JADX INFO: renamed from: ix */
    public final LineFormat m4987ix() {
        IFormat format;
        ChartDataPoint chartDataPoint = this.f4557k4;
        if (chartDataPoint == null) {
            return null;
        }
        if (chartDataPoint.getFormat().getLine().getFillFormat().getFillType() == -1) {
            format = this.f4557k4.m584h4();
            if (this.f4559to.m64945h4().getFormat().getLine().getFillFormat().getFillType() != -1 || format == null) {
                format = this.f4559to.m64945h4().getFormat();
            }
        } else {
            format = this.f4557k4.getFormat();
        }
        return (LineFormat) format.getLine();
    }

    /* JADX INFO: renamed from: jd */
    public final ChartDataPoint m4988jd() {
        return this.f4557k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m4989k4() {
        if (!C14044b3.m66437kk(this.f4550c5)) {
            return this.f4550c5;
        }
        if (this.f4557k4 == null || m4983dy()) {
            return 0.0d;
        }
        boolean zIsSeriesUsesYValueCoordinate = ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(this.f4559to.m64945h4().getType());
        Class cls = Double.TYPE;
        return zIsSeriesUsesYValueCoordinate ? (this.f4557k4.getYValue().getDataSourceType() != 2 || C14044b3.m66437kk(this.f4557k4.getYValue().getAsLiteralDouble())) ? m4977um() ? ((Double) C7019kk.m27464to(this.f4557k4.m580ck().m71989k4(), cls)).doubleValue() : DoubleChartValue.m1356x1(this.f4557k4.getYValue()) : this.f4557k4.getYValue().getAsLiteralDouble() : (this.f4557k4.getValue().getDataSourceType() != 2 || C14044b3.m66437kk(this.f4557k4.getValue().getAsLiteralDouble())) ? m4977um() ? ((Double) C7019kk.m27464to(this.f4557k4.m579c5().m71989k4(), cls)).doubleValue() : DoubleChartValue.m1356x1(this.f4557k4.getValue()) : this.f4557k4.getValue().getAsLiteralDouble();
    }

    /* JADX INFO: renamed from: kk */
    public final double m4999kk() {
        if (m4983dy()) {
            return 0.0d;
        }
        if (this.f4557k4.getBubbleSize().getDataSourceType() == 2 && !C14044b3.m66437kk(this.f4557k4.getBubbleSize().getAsLiteralDouble())) {
            return this.f4557k4.getBubbleSize().getAsLiteralDouble();
        }
        if (!m4977um()) {
            return DoubleChartValue.m1356x1(this.f4557k4.getBubbleSize());
        }
        if (this.f4557k4.m583fa().m71989k4() == null) {
            return 0.0d;
        }
        return ((Double) C7019kk.m27464to(this.f4557k4.m583fa().m71989k4(), Double.TYPE)).doubleValue();
    }

    /* JADX INFO: renamed from: ks */
    public final C0852cf m5003ks() {
        return this.f4555h4;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m5004m9() {
        return this.f4559to.m64945h4().getNumberFormatOfBubbleSizes();
    }

    /* JADX INFO: renamed from: ne */
    public final boolean m5005ne() {
        return m4989k4() < 0.0d;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX INFO: renamed from: qq */
    public final C12003du m5006qq() {
        if (C12003du.m56476x1(this.f4562yj, C12003du.f40505to)) {
            return this.f4562yj;
        }
        Chart chart = (Chart) this.f4559to.m64945h4().getChart();
        int style = chart.getStyle();
        int i = style + 1;
        if (ChartTypeCharacterizer.m757du(this.f4559to.m64945h4().getType())) {
            return m5014wl();
        }
        if (i >= 9 && i <= 16) {
            return C12003du.m56400k4(255, im9.m7689k4(chart.m506k4((byte) 1).Clone().Clone()).Clone());
        }
        if (i == 33) {
            return C12003du.m56400k4(255, igr.m7629k4(chart.m506k4((byte) 1).Clone().Clone(), 0.925d).Clone().Clone());
        }
        if (i == 34) {
            return C12003du.m56400k4(255, igr.m7634x1(m5014wl().Clone(), 0.5d).Clone().Clone());
        }
        if (i == 39) {
            return C12003du.m56400k4(255, chart.m504h4()[0].Clone());
        }
        if (i < 35 || i > 40) {
            return C12003du.f40505to;
        }
        igr.m7634x1(chart.m506k4((byte) (style - 29)).Clone().Clone(), 0.5d);
        return Context.getPackageManager();
    }

    /* JADX INFO: renamed from: rv */
    public final int m5007rv() {
        return this.f4559to.m64944dy().indexOf(this);
    }

    /* JADX INFO: renamed from: to */
    public final String m5008to() {
        return ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(this.f4559to.m64945h4().getType()) ? (!m4977um() || C14113y2.m67411k4(this.f4557k4.m580ck().m71992x1())) ? this.f4559to.m64945h4().getNumberFormatOfYValues() : this.f4557k4.m580ck().m71992x1() : (!m4977um() || C14113y2.m67411k4(this.f4557k4.m579c5().m71992x1())) ? this.f4559to.m64945h4().getNumberFormatOfValues() : this.f4557k4.m579c5().m71992x1();
    }

    /* JADX INFO: renamed from: u4 */
    public final IThreeDFormat m5011u4() {
        IFormat format;
        IFormat iFormatM584h4;
        ChartDataPoint chartDataPoint = this.f4557k4;
        if (chartDataPoint == null) {
            return null;
        }
        if (chartDataPoint.getFormat().getEffect3D().getCamera().getCameraType() == -1) {
            ChartSeries chartSeriesM64945h4 = this.f4559to.m64945h4();
            if (chartSeriesM64945h4.getFormat().getEffect3D().getCamera().getCameraType() == -1 && (iFormatM584h4 = this.f4557k4.m584h4()) != null) {
                return iFormatM584h4.getEffect3D();
            }
            format = chartSeriesM64945h4.getFormat();
        } else {
            format = this.f4557k4.getFormat();
        }
        return format.getEffect3D();
    }

    /* JADX INFO: renamed from: up */
    public final C13847mr m5012up() {
        return this.f4559to;
    }

    /* JADX INFO: renamed from: uz */
    public final IEffectFormat m5013uz() {
        IFormat format;
        ChartDataPoint chartDataPoint = this.f4557k4;
        if (chartDataPoint == null) {
            return null;
        }
        if (chartDataPoint.getFormat().getEffect().isNoEffects()) {
            ChartSeries chartSeriesM64945h4 = this.f4559to.m64945h4();
            if (chartSeriesM64945h4.getFormat().getEffect().isNoEffects()) {
                IEffectFormatEffectiveData effective = chartSeriesM64945h4.getFormat().getEffect().getEffective();
                if (!effective.isNoEffects()) {
                    EffectFormat effectFormat = new EffectFormat(chartSeriesM64945h4);
                    effectFormat.m1388k4(effective);
                    return effectFormat;
                }
                IFormat iFormatM584h4 = this.f4557k4.m584h4();
                if (iFormatM584h4 != null) {
                    return iFormatM584h4.getEffect();
                }
            }
            format = chartSeriesM64945h4.getFormat();
        } else {
            format = this.f4557k4.getFormat();
        }
        return format.getEffect();
    }

    /* JADX INFO: renamed from: wl */
    public final C12003du m5014wl() {
        if (C12003du.m56476x1(this.f4560up, C12003du.f40505to)) {
            return this.f4560up;
        }
        Chart chart = (Chart) this.f4559to.m64945h4().getChart();
        int style = chart.getStyle() + 1;
        if (!this.f4559to.m64945h4().isColorVaried() || (!ChartTypeCharacterizer.isChartTypePie(this.f4559to.m64945h4().getType()) && !ChartTypeCharacterizer.isChartTypeDoughnut(this.f4559to.m64945h4().getType()) && this.f4559to.m64941c5().m69865up().size() != 1)) {
            return this.f4559to.m64945h4().m734m9();
        }
        return igr.m7632k4(chart, style, this.f4559to.m64944dy().size())[this.f4559to.m64944dy().indexOf(this)];
    }

    /* JADX INFO: renamed from: x1 */
    public final double m5015x1() {
        if (!C14044b3.m66437kk(this.f4556jd)) {
            return this.f4556jd;
        }
        if (this.f4557k4.getXValue().getDataSourceType() == 2 && !C14044b3.m66437kk(this.f4557k4.getXValue().getAsLiteralDouble())) {
            return this.f4557k4.getXValue().getAsLiteralDouble();
        }
        if (!m4977um()) {
            return this.f4557k4.getXValue().toDouble();
        }
        if (this.f4557k4.m585jd().m71989k4() != null && C7019kk.m27469x1(this.f4557k4.m585jd().m71989k4(), Double.class)) {
            return ((Double) C7019kk.m27464to(this.f4557k4.m585jd().m71989k4(), Double.TYPE)).doubleValue();
        }
        return Double.NaN;
    }

    /* JADX INFO: renamed from: x6 */
    public final int m5020x6() {
        return this.f4557k4.getExplosion() == -1 ? this.f4559to.m64945h4().getExplosion() : this.f4557k4.getExplosion();
    }

    /* JADX INFO: renamed from: yj */
    public final s5e m5021yj() {
        return this.f4552du;
    }

    /* JADX INFO: renamed from: du */
    public final void m4982du(C11896dy c11896dy) {
        IEffectFormat iEffectFormatM5013uz = m5013uz();
        if (iEffectFormatM5013uz == null || iEffectFormatM5013uz.isNoEffects()) {
            return;
        }
        FillFormat fillFormatM4976bv = m4976bv();
        LineFormat lineFormatM4987ix = m4987ix();
        if (lineFormatM4987ix == null) {
            throw new NullReferenceException("LineFormat couldn't be empty.");
        }
        if (C14044b3.m66437kk(lineFormatM4987ix.getWidth())) {
            im9.m7704k4(m5014wl().Clone(), this.f4559to.m64941c5(), c11896dy, fillFormatM4976bv, iEffectFormatM5013uz);
        } else {
            im9.m7719x1(m5006qq().Clone(), m5014wl().Clone(), this.f4559to.m64941c5(), c11896dy, lineFormatM4987ix, fillFormatM4976bv, iEffectFormatM5013uz, 1.0f);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m4986h4(C11896dy c11896dy) {
        im9.m7704k4(m5014wl().Clone(), this.f4559to.m64941c5(), c11896dy, m4976bv(), m5013uz());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4990k4(double d) {
        this.f4550c5 = d;
    }

    /* JADX INFO: renamed from: kk */
    public final void m5000kk(C11896dy c11896dy) {
        m4993k4(c11896dy, 1.0f);
    }

    /* JADX INFO: renamed from: to */
    public final void m5009to(C11896dy c11896dy) {
        FillFormat fillFormatM4976bv = m4976bv();
        LineFormat lineFormatM4987ix = m4987ix();
        IEffectFormat iEffectFormatM5013uz = m5013uz();
        if (lineFormatM4987ix == null || !C14044b3.m66437kk(lineFormatM4987ix.getWidth())) {
            im9.m7695k4(m5006qq().Clone(), m5014wl().Clone(), this.f4559to.m64941c5(), c11896dy, lineFormatM4987ix, fillFormatM4976bv, iEffectFormatM5013uz, 1.0f);
        } else {
            im9.m7703k4(m5014wl().Clone(), this.f4559to.m64941c5(), c11896dy, fillFormatM4976bv, 1.0f, iEffectFormatM5013uz);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5016x1(double d) {
        this.f4556jd = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4991k4(ijy ijyVar) {
        C14365qy c14365qyM64941c5 = this.f4559to.m64941c5();
        C12007ix c12007ixClone = c14365qyM64941c5.m69855qm().Clone();
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55578x1(c12007ixClone.Clone());
            c14365qyM64941c5.m69832dy().m7390k4(ijyVar, c12007ixClone.Clone(), im9.m7684k4(m5014wl().Clone(), m4976bv(), this.f4559to.m64941c5(), 1.0f, c11896dy));
        } finally {
            c11896dy.dispose();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m5001kk(boolean z) {
        this.f4554fa = z;
    }

    /* JADX INFO: renamed from: to */
    public final void m5010to(C12007ix c12007ix) {
        C12003du c12003duClone = m5014wl().Clone();
        FillFormat fillFormatM4976bv = m4976bv();
        if (m4978v4()) {
            m4975ar().CloneTo(c12003duClone);
            fillFormatM4976bv = null;
        }
        im9.m7721x1(c12003duClone.Clone(), this.f4559to.m64941c5(), c12007ix.Clone(), fillFormatM4976bv, m5013uz());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5017x1(C12007ix c12007ix) {
        C12003du c12003duClone = m5014wl().Clone();
        FillFormat fillFormatM4976bv = m4976bv();
        if (m4978v4()) {
            m4975ar().CloneTo(c12003duClone);
            fillFormatM4976bv = null;
        }
        im9.m7707k4(c12003duClone.Clone(), this.f4559to.m64941c5(), c12007ix.Clone(), fillFormatM4976bv, m5013uz());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4992k4(C11896dy c11896dy) {
        LineFormat lineFormatM4987ix = m4987ix();
        C12003du c12003duClone = (this.f4559to.m64945h4().getType() == 75 ? C12003du.m56385i5() : m5006qq()).Clone();
        im9.m7717kk(c12003duClone.Clone(), this.f4560up.Clone(), this.f4559to.m64941c5(), c11896dy, lineFormatM4987ix, m4976bv(), m5013uz(), 1.0f);
        im9.m7705k4(c12003duClone.Clone(), this.f4559to.m64941c5(), c11896dy, lineFormatM4987ix, m5013uz());
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m5002kk(C12007ix c12007ix) {
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55578x1(c12007ix.Clone());
            return m5019x1(c11896dy);
        } finally {
            c11896dy.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5018x1(boolean z) {
        this.f4551ck = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4993k4(C11896dy c11896dy, float f) {
        im9.m7703k4(m5014wl().Clone(), this.f4559to.m64941c5(), c11896dy, m4976bv(), f, m5013uz());
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m5019x1(C11896dy c11896dy) {
        IThreeDFormat iThreeDFormatM5011u4 = m5011u4();
        if (c11896dy == null || iThreeDFormatM5011u4 == null) {
            return false;
        }
        return im9.m7715k4(c11896dy, c11896dy.m55523c5().Clone(), m5012up().m64941c5(), iThreeDFormatM5011u4, m4976bv(), m4987ix(), m5014wl().Clone().Clone(), (this.f4559to.m64945h4().getType() == 75 ? C12003du.m56385i5() : m5006qq()).Clone().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4994k4(C11896dy c11896dy, float f, float f2, ilw ilwVar) {
        C0962es c0962esM7684k4 = im9.m7684k4(m5014wl().Clone(), m4976bv(), this.f4559to.m64941c5(), 1.0f, c11896dy);
        C14365qy c14365qyM64941c5 = this.f4559to.m64941c5();
        c14365qyM64941c5.m69832dy().m7392k4(c14365qyM64941c5.m69855qm().Clone().Clone(), c0962esM7684k4, null, c11896dy, f, f2, ilwVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4995k4(C11896dy c11896dy, C11896dy c11896dy2, float f) {
        im9.m7706k4(m5014wl().Clone(), this.f4559to.m64941c5(), c11896dy, c11896dy2, m4976bv(), f);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4996k4(C12007ix c12007ix) {
        LineFormat lineFormat;
        C12003du c12003duClone = m5006qq().Clone();
        LineFormat lineFormatM4987ix = m4987ix();
        if (m4978v4() && m4975ar().m56506h4() == f4549m9.m56506h4()) {
            C12003du.m56460uz().CloneTo(c12003duClone);
            lineFormat = null;
        } else {
            lineFormat = lineFormatM4987ix;
        }
        im9.m7701k4(c12003duClone.Clone(), this.f4560up.Clone(), this.f4559to.m64941c5(), c12007ix.Clone(), lineFormat, m4976bv(), m5013uz(), 1.0f);
        im9.m7708k4(c12003duClone.Clone(), this.f4559to.m64941c5(), c12007ix.Clone(), lineFormat, (IEffectFormat) null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4997k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        im9.m7709k4(c12025x6.Clone(), c12025x62.Clone(), C12003du.f40505to.Clone(), m4987ix(), this.f4559to.m64941c5());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4998k4(boolean z) {
        if (this.f4553dy != z) {
            this.f4553dy = z;
            if (m5012up() == null || m5012up().m64955k4() == z) {
                return;
            }
            m5012up().m64954k4(z);
        }
    }
}
