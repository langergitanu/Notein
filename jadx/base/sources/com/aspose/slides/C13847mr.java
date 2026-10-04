package com.aspose.slides;

import android.content.Context;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.mr */
/* JADX INFO: loaded from: classes3.dex */
class C13847mr {

    /* JADX INFO: renamed from: du */
    private C0886d8 f46287du;

    /* JADX INFO: renamed from: dy */
    private double f46288dy;

    /* JADX INFO: renamed from: kk */
    private C14365qy f46291kk;

    /* JADX INFO: renamed from: to */
    private s5e f46293to;

    /* JADX INFO: renamed from: x1 */
    private ChartSeries f46294x1;

    /* JADX INFO: renamed from: k4 */
    private List<C0886d8> f46290k4 = new List<>();

    /* JADX INFO: renamed from: h4 */
    private List<z3t> f46289h4 = new List<>();

    /* JADX INFO: renamed from: m9 */
    private boolean f46292m9 = true;

    /* JADX WARN: Removed duplicated region for block: B:35:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C13847mr(ChartSeries chartSeries, C14365qy c14365qy) {
        List<C0886d8> list;
        C0886d8 c0886d8;
        if (ChartTypeCharacterizer.m768up(chartSeries.getType())) {
            chartSeries.m722dy();
        }
        this.f46294x1 = chartSeries;
        this.f46291kk = c14365qy;
        this.f46293to = new s5e(c14365qy, chartSeries.getMarker(), this);
        if (chartSeries.getTrendLines() != null) {
            for (int i = 0; i < chartSeries.getTrendLines().getCount(); i++) {
                this.f46289h4.addItem(new z3t((Trendline) chartSeries.getTrendLines().get_Item(i), this));
            }
        }
        int size = chartSeries.getDataPoints().size();
        this.f46287du = new C0886d8(null, this);
        boolean z = ((ChartData) c14365qy.m69834fa().getChartData()).m553x1().mo5710kk() != 2;
        for (int i2 = 0; i2 < size; i2++) {
            ChartDataPoint chartDataPoint = (ChartDataPoint) chartSeries.getDataPoints().get_Item(i2);
            if (ChartTypeCharacterizer.isSeriesUsesValueCoordinate(chartSeries.getType())) {
                if (!z) {
                    IDoubleChartValue value = chartSeries.getDataPoints().get_Item(i2).getValue();
                    if (value.getDataSourceType() != 0 || value.getAsCell() != null) {
                        this.f46290k4.addItem(new C0886d8((ChartDataPoint) chartSeries.getDataPoints().get_Item(i2), this));
                        if (ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(chartSeries.getType())) {
                        }
                    }
                } else if (!chartDataPoint.m582dy()) {
                    this.f46290k4.addItem(new C0886d8((ChartDataPoint) chartSeries.getDataPoints().get_Item(i2), this));
                    if (chartSeries.getDataPoints().get_Item(i2).getValue().getDataSourceType() == 0 && chartDataPoint.m579c5().m71989k4() == null) {
                        ((C0886d8) OooO0O0.OooO00o(this.f46290k4, 1)).m5018x1(true);
                    }
                    if (ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(chartSeries.getType())) {
                    }
                }
            } else if (ChartTypeCharacterizer.isSeriesUsesYValueCoordinate(chartSeries.getType())) {
                IDoubleChartValue yValue = chartSeries.getDataPoints().get_Item(i2).getYValue();
                if (yValue.getDataSourceType() != 0) {
                    list = this.f46290k4;
                    c0886d8 = new C0886d8((ChartDataPoint) chartSeries.getDataPoints().get_Item(i2), this);
                } else if (z) {
                    this.f46290k4.addItem(new C0886d8((ChartDataPoint) chartSeries.getDataPoints().get_Item(i2), this));
                    Object objM71989k4 = chartDataPoint.m580ck().m71989k4();
                    Class cls = Double.TYPE;
                    if (objM71989k4 == null || (C7019kk.m27469x1(chartDataPoint.m580ck().m71989k4(), Double.class) && C14044b3.m66437kk(((Double) C7019kk.m27464to(chartDataPoint.m580ck().m71989k4(), cls)).doubleValue()))) {
                        ((C0886d8) OooO0O0.OooO00o(this.f46290k4, 1)).m5018x1(true);
                    }
                    if (chartDataPoint.m596to().m637u4() && chartDataPoint.m585jd().m71989k4() == null) {
                        ((C0886d8) OooO0O0.OooO00o(this.f46290k4, 1)).m5018x1(true);
                    }
                    if ((chartDataPoint.m585jd().m71989k4() != null && "#N/A".equals(chartDataPoint.m585jd().m71989k4().toString())) || (C7019kk.m27469x1(chartDataPoint.m585jd().m71989k4(), Double.class) && C14044b3.m66437kk(((Double) C7019kk.m27464to(chartDataPoint.m585jd().m71989k4(), cls)).doubleValue()))) {
                        ((C0886d8) OooO0O0.OooO00o(this.f46290k4, 1)).m5018x1(true);
                    }
                    if (chartSeries.getType() == 74 || chartSeries.getType() == 75) {
                        this.f46290k4.addItem(new C0886d8((ChartDataPoint) chartSeries.getDataPoints().get_Item(i2), this));
                    }
                } else if (yValue.getDataSourceType() != 0 || yValue.getAsCell() != null) {
                    list = this.f46290k4;
                    c0886d8 = new C0886d8((ChartDataPoint) chartSeries.getDataPoints().get_Item(i2), this);
                }
                list.addItem(c0886d8);
                if (chartSeries.getType() == 74) {
                    this.f46290k4.addItem(new C0886d8((ChartDataPoint) chartSeries.getDataPoints().get_Item(i2), this));
                }
            } else if (chartSeries.getType() == 74) {
            }
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final C14365qy m64941c5() {
        return this.f46291kk;
    }

    /* JADX INFO: renamed from: ck */
    public final C0886d8 m64942ck() {
        return this.f46287du;
    }

    /* JADX INFO: renamed from: du */
    public final List<z3t> m64943du() {
        return this.f46289h4;
    }

    /* JADX INFO: renamed from: dy */
    public final List<C0886d8> m64944dy() {
        return this.f46290k4;
    }

    /* JADX INFO: renamed from: h4 */
    public final ChartSeries m64945h4() {
        return this.f46294x1;
    }

    /* JADX INFO: renamed from: jd */
    public final s5e m64946jd() {
        return this.f46293to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64947k4(double d) {
        this.f46288dy = d;
    }

    /* JADX INFO: renamed from: kk */
    public final String m64957kk() {
        boolean z = ((ChartData) this.f46291kk.m69834fa().getChartData()).m553x1().mo5710kk() != 2;
        if (this.f46294x1.getName().getDataSourceType() == 0 && z) {
            return C14113y2.m67411k4(this.f46294x1.m725jd()) ? C14113y2.m67411k4(this.f46294x1.m720ck()) ? C14113y2.m67408k4("Series", C14057f9.m66591x1(m64963x1() + 1)) : "" : this.f46294x1.m725jd();
        }
        ChartCellCollection chartCellCollection = (ChartCellCollection) C7019kk.m27452k4(((StringChartValue) this.f46294x1.getName()).getData(), ChartCellCollection.class);
        return (C14113y2.m67411k4(this.f46294x1.getName().toString()) && chartCellCollection != null && chartCellCollection.getCount() == 0) ? C14113y2.m67408k4("Series", C14057f9.m66591x1(m64963x1() + 1)) : this.f46294x1.getName().toString();
    }

    /* JADX INFO: renamed from: m9 */
    public final C12003du m64960m9() {
        return this.f46291kk.m69834fa().m504h4()[(int) this.f46294x1.m726k4().m64750k4()];
    }

    /* JADX INFO: renamed from: to */
    public final void m64961to(C12025x6 c12025x6, C12025x6 c12025x62) {
        im9.m7709k4(c12025x6.Clone(), c12025x62.Clone(), this.f46291kk.m69834fa().m506k4(this.f46291kk.m69834fa().getStyle() + 1 <= 40 ? (byte) 0 : (byte) 1).Clone().Clone(), (LineFormat) ((ChartSeriesGroup) C7019kk.m27452k4((Object) this.f46294x1.getParentSeriesGroup(), ChartSeriesGroup.class)).getHiLowLinesFormat().getLine(), m64941c5());
    }

    /* JADX INFO: renamed from: x1 */
    public final int m64963x1() {
        return this.f46291kk.m69865up().indexOf(this);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v15, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v17, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v18, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v21, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v24, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v27, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v28, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v29, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v30, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v32, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v33, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v34, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v35, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v36, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v37, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v38, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX INFO: renamed from: x1 */
    private C12003du m64940x1(boolean z) {
        C12003du c12003duClone = C12003du.f40505to.Clone();
        int style = this.f46291kk.m69834fa().getStyle();
        int i = style + 1;
        C12003du c12003duClone2 = this.f46291kk.m69834fa().m506k4((byte) 0).Clone();
        if (z) {
            if (i == 1) {
                igr.m7629k4(c12003duClone2.Clone(), 0.25d);
                return Context.getPackageManager();
            }
            if (i == 2) {
                igr.m7629k4(c12003duClone2.Clone(), 0.05d);
                return Context.getPackageManager();
            }
            if (i <= 8) {
                this.f46291kk.m69834fa().m506k4((byte) i).CloneTo(c12003duClone);
                igr.m7629k4(c12003duClone.Clone(), 0.25d);
                return Context.getPackageManager();
            }
            if (i == 9) {
                igr.m7629k4(c12003duClone2.Clone(), 0.25d);
                return Context.getPackageManager();
            }
            if (i == 10) {
                igr.m7629k4(c12003duClone2.Clone(), 0.05d);
                return Context.getPackageManager();
            }
            if (i <= 16) {
                this.f46291kk.m69834fa().m506k4((byte) (style - 6)).CloneTo(c12003duClone);
                igr.m7629k4(c12003duClone.Clone(), 0.25d);
                return Context.getPackageManager();
            }
            if (i == 17) {
                igr.m7629k4(c12003duClone2.Clone(), 0.25d);
                return Context.getPackageManager();
            }
            if (i == 18) {
                igr.m7629k4(c12003duClone2.Clone(), 0.05d);
                return Context.getPackageManager();
            }
            if (i <= 24) {
                this.f46291kk.m69834fa().m506k4((byte) (style - 14)).CloneTo(c12003duClone);
                igr.m7629k4(c12003duClone.Clone(), 0.25d);
                return Context.getPackageManager();
            }
            if (i == 25) {
                igr.m7629k4(c12003duClone2.Clone(), 0.25d);
                return Context.getPackageManager();
            }
            if (i == 26) {
                igr.m7629k4(c12003duClone2.Clone(), 0.05d);
                return Context.getPackageManager();
            }
            if (i <= 32) {
                this.f46291kk.m69834fa().m506k4((byte) (style - 22)).CloneTo(c12003duClone);
                igr.m7629k4(c12003duClone.Clone(), 0.25d);
                return Context.getPackageManager();
            }
            if (i <= 40) {
                this.f46291kk.m69834fa().m506k4((byte) 1).CloneTo(c12003duClone);
                return C12003du.m56400k4(255, c12003duClone.Clone());
            }
            if (i == 41) {
                igr.m7629k4(c12003duClone2.Clone(), 0.25d);
                return Context.getPackageManager();
            }
            if (i == 42) {
                this.f46291kk.m69834fa().m506k4((byte) 1).CloneTo(c12003duClone);
                return C12003du.m56400k4(255, c12003duClone.Clone());
            }
            if (i <= 48) {
                this.f46291kk.m69834fa().m506k4((byte) (style - 38)).CloneTo(c12003duClone);
                igr.m7629k4(c12003duClone.Clone(), 0.25d);
                return Context.getPackageManager();
            }
        } else {
            if (i == 1) {
                igr.m7629k4(c12003duClone2.Clone(), 0.85d);
                return Context.getPackageManager();
            }
            if (i == 2) {
                igr.m7629k4(c12003duClone2.Clone(), 0.95d);
                return Context.getPackageManager();
            }
            if (i <= 8) {
                this.f46291kk.m69834fa().m506k4((byte) i).CloneTo(c12003duClone);
                igr.m7634x1(c12003duClone.Clone(), 0.25d);
                return Context.getPackageManager();
            }
            if (i == 9) {
                igr.m7629k4(c12003duClone2.Clone(), 0.85d);
                return Context.getPackageManager();
            }
            if (i == 10) {
                igr.m7629k4(c12003duClone2.Clone(), 0.95d);
                return Context.getPackageManager();
            }
            if (i <= 16) {
                this.f46291kk.m69834fa().m506k4((byte) (style - 6)).CloneTo(c12003duClone);
                igr.m7634x1(c12003duClone.Clone(), 0.25d);
                return Context.getPackageManager();
            }
            if (i == 17) {
                igr.m7629k4(c12003duClone2.Clone(), 0.85d);
                return Context.getPackageManager();
            }
            if (i == 18) {
                igr.m7629k4(c12003duClone2.Clone(), 0.95d);
                return Context.getPackageManager();
            }
            if (i <= 24) {
                this.f46291kk.m69834fa().m506k4((byte) (style - 14)).CloneTo(c12003duClone);
                igr.m7634x1(c12003duClone.Clone(), 0.25d);
                return Context.getPackageManager();
            }
            if (i == 25) {
                igr.m7629k4(c12003duClone2.Clone(), 0.85d);
                return Context.getPackageManager();
            }
            if (i == 26) {
                igr.m7629k4(c12003duClone2.Clone(), 0.95d);
                return Context.getPackageManager();
            }
            if (i <= 32) {
                this.f46291kk.m69834fa().m506k4((byte) (style - 22)).CloneTo(c12003duClone);
                igr.m7634x1(c12003duClone.Clone(), 0.25d);
                return Context.getPackageManager();
            }
            if (i == 33) {
                igr.m7629k4(c12003duClone2.Clone(), 0.85d);
                return Context.getPackageManager();
            }
            if (i == 34) {
                igr.m7629k4(c12003duClone2.Clone(), 0.95d);
                return Context.getPackageManager();
            }
            if (i <= 40) {
                this.f46291kk.m69834fa().m506k4((byte) (style - 30)).CloneTo(c12003duClone);
                igr.m7634x1(c12003duClone.Clone(), 0.25d);
                return Context.getPackageManager();
            }
            if (i == 41) {
                igr.m7629k4(c12003duClone2.Clone(), 0.85d);
                return Context.getPackageManager();
            }
            if (i == 42) {
                return Context.getPackageManager();
            }
            if (i <= 48) {
                this.f46291kk.m69834fa().m506k4((byte) (style - 38)).CloneTo(c12003duClone);
                igr.m7634x1(c12003duClone.Clone(), 0.25d);
                return Context.getPackageManager();
            }
        }
        return C12003du.f40505to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64948k4(C11896dy c11896dy) {
        im9.m7693k4(C12003du.f40505to.Clone(), C12003du.f40505to.Clone(), m64941c5(), c11896dy, (Format) this.f46294x1.getFormat());
    }

    /* JADX INFO: renamed from: kk */
    public final void m64958kk(C12025x6 c12025x6, C12025x6 c12025x62) {
        im9.m7709k4(c12025x6.Clone(), c12025x62.Clone(), this.f46291kk.m69834fa().m506k4(this.f46291kk.m69834fa().getStyle() + 1 <= 40 ? (byte) 0 : (byte) 1).Clone().Clone(), (LineFormat) ((ChartSeriesGroup) C7019kk.m27452k4((Object) this.f46294x1.getParentSeriesGroup(), ChartSeriesGroup.class)).m750kk().getLine(), m64941c5());
    }

    /* JADX INFO: renamed from: to */
    public final boolean m64962to() {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64949k4(C11896dy c11896dy, float f) {
        C1236i2.m7387k4(C12003du.f40505to.Clone(), m64945h4().m734m9().Clone(), this.f46291kk, c11896dy, (LineFormat) this.f46294x1.getFormat().getLine(), (FillFormat) this.f46294x1.getFormat().getFill(), 1.0f, f);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m64959kk(C11896dy c11896dy) {
        if (c11896dy == null) {
            return false;
        }
        return im9.m7715k4(c11896dy, c11896dy.m55523c5().Clone(), this.f46291kk, this.f46294x1.getFormat().getEffect3D(), (FillFormat) this.f46294x1.getFormat().getFill(), (LineFormat) this.f46294x1.getFormat().getLine(), C12003du.f40505to.Clone(), C12003du.f40505to.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64950k4(C12003du c12003du, C11896dy c11896dy, LineFormat lineFormat, float f) {
        im9.m7697k4(c12003du.Clone(), C12003du.f40505to.Clone(), m64941c5(), c11896dy, lineFormat, this.f46294x1.getFormat().getEffect(), f);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64951k4(C12007ix c12007ix) {
        im9.m7701k4(C12003du.f40505to.Clone(), C12003du.f40505to.Clone(), this.f46291kk, c12007ix.Clone(), (LineFormat) this.f46294x1.getFormat().getLine(), (FillFormat) this.f46294x1.getFormat().getFill(), this.f46294x1.getFormat().getEffect(), 1.0f);
        im9.m7708k4(C12003du.f40505to.Clone(), this.f46291kk, c12007ix.Clone(), (LineFormat) this.f46294x1.getFormat().getLine(), this.f46294x1.getFormat().getEffect());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m64952k4(C12007ix c12007ix, boolean z) {
        C12003du c12003duM56400k4;
        C12003du c12003duClone = C12003du.f40505to.Clone();
        C12003du c12003duClone2 = C12003du.f40505to.Clone();
        int style = this.f46291kk.m69834fa().getStyle() + 1;
        IUpDownBarsManager upDownBars = this.f46294x1.getParentSeriesGroup().getUpDownBars();
        Format format = (Format) (z ? upDownBars.getUpBarsFormat() : upDownBars.getDownBarsFormat());
        if (format.getLine().getFillFormat().getFillType() != 0) {
            if (c12007ix.m56550c5() > format.getLine().getWidth() / 2.0d) {
                c12007ix.m56576x1(c12007ix.m56550c5() - (((float) format.getLine().getWidth()) / 2.0f));
            }
            if (c12007ix.m56575x1() < 1.0f) {
                c12007ix.m56560k4(1.0f);
            }
            if (style > 16) {
                if (style > 32) {
                    if (style <= 34) {
                        c12003duM56400k4 = this.f46291kk.m69834fa().m506k4((byte) 0);
                    } else if (style <= 40) {
                        C12003du c12003duClone3 = this.f46291kk.m69834fa().m506k4((byte) (this.f46291kk.m69834fa().getStyle() - 30)).Clone();
                        igr.m7634x1(c12003duClone3.Clone(), 0.25d).CloneTo(c12003duClone3);
                        c12003duM56400k4 = C12003du.m56400k4(255, c12003duClone3.Clone());
                    } else {
                        c12003duM56400k4 = C12003du.f40505to;
                    }
                    c12003duM56400k4.CloneTo(c12003duClone);
                    im9.m7698k4(c12003duClone.Clone(), C12003du.f40505to.Clone(), m64941c5(), c12007ix.Clone(), format);
                }
            }
        }
        m64940x1(z).CloneTo(c12003duClone2);
        im9.m7698k4(C12003du.f40505to.Clone(), c12003duClone2.Clone(), m64941c5(), c12007ix.Clone(), format);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64953k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        im9.m7709k4(c12025x6.Clone(), c12025x62.Clone(), m64960m9().Clone(), (LineFormat) this.f46294x1.getFormat().getLine(), m64941c5());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64954k4(boolean z) {
        if (this.f46292m9 != z) {
            this.f46292m9 = z;
            C14365qy c14365qy = this.f46291kk;
            if (c14365qy == null || c14365qy.m69847k4() == z) {
                return;
            }
            this.f46291kk.m69844k4(z);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m64955k4() {
        return this.f46292m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m64956k4(int[] iArr) {
        for (int i : iArr) {
            if (this.f46294x1.getType() == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64964x1(C11896dy c11896dy) {
        im9.m7693k4(C12003du.f40505to.Clone(), m64945h4().m734m9().Clone(), m64941c5(), c11896dy, (Format) this.f46294x1.getFormat());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64965x1(C11896dy c11896dy, float f) {
        C1236i2.m7387k4(C12003du.f40505to.Clone(), C12003du.f40505to.Clone(), this.f46291kk, c11896dy, (LineFormat) this.f46294x1.getFormat().getLine(), (FillFormat) this.f46294x1.getFormat().getFill(), 1.0f, f);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64966x1(C12003du c12003du, C11896dy c11896dy, LineFormat lineFormat, float f) {
        im9.m7719x1(c12003du.Clone(), C12003du.f40505to.Clone(), m64941c5(), c11896dy, lineFormat, null, this.f46294x1.getFormat().getEffect(), 1.0f);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64967x1(C12007ix c12007ix) {
        im9.m7698k4(C12003du.f40505to.Clone(), m64945h4().m734m9().Clone(), m64941c5(), c12007ix.Clone(), (Format) this.f46294x1.getFormat());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64968x1(C12025x6 c12025x6, C12025x6 c12025x62) {
        im9.m7709k4(c12025x6.Clone(), c12025x62.Clone(), this.f46291kk.m69834fa().m506k4(this.f46291kk.m69834fa().getStyle() + 1 <= 40 ? (byte) 0 : (byte) 1).Clone().Clone(), (LineFormat) ((ChartSeriesGroup) C7019kk.m27452k4((Object) this.f46294x1.getParentSeriesGroup(), ChartSeriesGroup.class)).m752x1().getLine(), m64941c5());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m64969x1(C12007ix c12007ix, boolean z) {
        C12003du c12003duM56400k4;
        int style = this.f46291kk.m69834fa().getStyle() + 1;
        IUpDownBarsManager upDownBars = this.f46294x1.getParentSeriesGroup().getUpDownBars();
        Format format = (Format) (z ? upDownBars.getUpBarsFormat() : upDownBars.getDownBarsFormat());
        C12003du c12003duClone = C12003du.f40505to.Clone();
        if (format.getLine().getFillFormat().getFillType() != 0) {
            if (c12007ix.m56550c5() > format.getLine().getWidth() / 2.0d) {
                c12007ix.m56576x1(c12007ix.m56550c5() - (((float) format.getLine().getWidth()) / 2.0f));
            }
            if (c12007ix.m56575x1() < 1.0f) {
                c12007ix.m56560k4(1.0f);
            }
            if (style > 16) {
                if (style > 32) {
                    if (style <= 34) {
                        c12003duM56400k4 = this.f46291kk.m69834fa().m506k4((byte) 0);
                    } else if (style <= 40) {
                        C12003du c12003duClone2 = this.f46291kk.m69834fa().m506k4((byte) (this.f46291kk.m69834fa().getStyle() - 30)).Clone();
                        igr.m7634x1(c12003duClone2.Clone(), 0.25d).CloneTo(c12003duClone2);
                        c12003duM56400k4 = C12003du.m56400k4(255, c12003duClone2.Clone());
                    } else {
                        c12003duM56400k4 = C12003du.f40505to;
                    }
                    c12003duM56400k4.CloneTo(c12003duClone);
                }
            }
        }
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55578x1(c12007ix.Clone());
            return im9.m7715k4(c11896dy, c12007ix.Clone(), this.f46291kk, format.getEffect3D(), (FillFormat) format.getFill(), (LineFormat) format.getLine(), m64940x1(z).Clone().Clone(), c12003duClone.Clone());
        } finally {
            c11896dy.dispose();
        }
    }
}
