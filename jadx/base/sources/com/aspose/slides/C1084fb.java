package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC8619qq;
import com.aspose.slides.internal.p332p7.AbstractC9120wl;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7402cf;
import com.aspose.slides.internal.p332p7.C7626f0;
import com.aspose.slides.internal.p332p7.C7935ij;
import com.aspose.slides.internal.p332p7.C8089ki;
import com.aspose.slides.internal.p332p7.C8262mg;
import com.aspose.slides.internal.p332p7.C8555px;
import com.aspose.slides.internal.p332p7.C8583q7;
import com.aspose.slides.internal.p332p7.C9069vu;
import com.aspose.slides.internal.p332p7.C9099w9;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: renamed from: com.aspose.slides.fb */
/* JADX INFO: loaded from: classes3.dex */
class C1084fb extends AbstractC13703jv {
    /* JADX INFO: renamed from: k4 */
    private long m6073k4(AbstractC8619qq abstractC8619qq) {
        if (C7019kk.m27469x1(abstractC8619qq, C8262mg.class)) {
            C8089ki c8089ki = (C8089ki) ((C8262mg) C7019kk.m27452k4((Object) abstractC8619qq, C8262mg.class)).m36929du().m29542x1();
            if (c8089ki.m35404kk().m29584du().length > 0) {
                return c8089ki.m35404kk().m29584du()[c8089ki.m35404kk().m29584du().length - 1].m43317k4();
            }
            return 4294967295L;
        }
        if (!C7019kk.m27469x1(abstractC8619qq, C7935ij.class)) {
            return 4294967295L;
        }
        C7935ij c7935ij = (C7935ij) C7019kk.m27452k4((Object) abstractC8619qq, C7935ij.class);
        if (C7019kk.m27469x1(c7935ij.m34166du().m29542x1(), C8089ki.class)) {
            C8089ki c8089ki2 = (C8089ki) c7935ij.m34166du().m29542x1();
            if (c8089ki2.m35404kk().m29584du().length > 0) {
                return c8089ki2.m35404kk().m29584du()[c8089ki2.m35404kk().m29584du().length - 1].m43317k4();
            }
            return 4294967295L;
        }
        if (!C7019kk.m27469x1(c7935ij.m34166du().m29542x1(), C7626f0.class)) {
            return 4294967295L;
        }
        C7626f0 c7626f0 = (C7626f0) c7935ij.m34166du().m29542x1();
        if (c7626f0.m31515kk().m39373to().length > 0) {
            return c7626f0.m31515kk().m39373to()[c7626f0.m31515kk().m39373to().length - 1].m43589k4();
        }
        return 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m6077x1(IChartSeries iChartSeries, int i) {
        for (int i2 = 0; i2 < iChartSeries.getDataPoints().size(); i2++) {
            C14656uy c14656uyM6074k4 = m6074k4((ChartDataPoint) iChartSeries.getDataPoints().get_Item(i2), i);
            if (c14656uyM6074k4 != null && c14656uyM6074k4.m71989k4() != null && !AbstractC13703jv.m63556k4(C14080ne.m66987ks(c14656uyM6074k4.m71989k4(), C11697x1.m55250kk()), new double[]{0.0d})) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14656uy m6074k4(ChartDataPoint chartDataPoint, int i) {
        switch (i) {
            case 0:
                return chartDataPoint.m585jd();
            case 1:
                return chartDataPoint.m580ck();
            case 2:
                return chartDataPoint.m583fa();
            case 3:
                return chartDataPoint.m579c5();
            case 4:
                return chartDataPoint.m598up();
            case 5:
                return chartDataPoint.m602yj();
            case 6:
                return chartDataPoint.m592ks();
            case 7:
                return chartDataPoint.m595rv();
            case 8:
                return chartDataPoint.m601x6();
            case 9:
                return chartDataPoint.m594ne();
            default:
                throw new ArgumentOutOfRangeException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m6075k4(ChartSeries chartSeries, C7626f0 c7626f0, int i) {
        int i2;
        String strM615jd;
        ChartDataPointCollection chartDataPointCollection = (ChartDataPointCollection) C7019kk.m27452k4((Object) chartSeries.getDataPoints(), ChartDataPointCollection.class);
        switch (i) {
            case 0:
                strM615jd = chartDataPointCollection.m615jd();
                break;
            case 1:
                strM615jd = chartDataPointCollection.m606ck();
                break;
            case 2:
                strM615jd = chartDataPointCollection.m638up();
                break;
            case 3:
                strM615jd = chartDataPointCollection.m611fa();
                break;
            case 4:
                strM615jd = chartDataPointCollection.m644yj();
                break;
            case 5:
                strM615jd = chartDataPointCollection.m630ks();
                break;
            case 6:
                strM615jd = chartDataPointCollection.m634rv();
                break;
            case 7:
                strM615jd = chartDataPointCollection.m643x6();
                break;
            default:
                C8583q7 c8583q7M31513k4 = c7626f0.m31513k4();
                long jM43589k4 = 0;
                for (i2 = 0; i2 < chartDataPointCollection.size(); i2++) {
                    C14656uy c14656uyM6074k4 = m6074k4((ChartDataPoint) chartDataPointCollection.get_Item(i2), i);
                    if (chartDataPointCollection.get_Item(i2).getValue() != null) {
                        C9099w9 c9099w9M39374x1 = c8583q7M31513k4.m39374x1();
                        c9099w9M39374x1.m43590k4(((long) i2) & 4294967295L);
                        c9099w9M39374x1.m43591k4(C14080ne.m66987ks(c14656uyM6074k4.m71989k4(), C11697x1.m55250kk()));
                        if ((((c9099w9M39374x1.m43589k4() & 4294967295L) + 1) & 4294967295L) > (jM43589k4 & 4294967295L)) {
                            jM43589k4 = ((c9099w9M39374x1.m43589k4() & 4294967295L) + 1) & 4294967295L;
                        }
                    }
                }
                c8583q7M31513k4.m39371k4().m38333k4(jM43589k4);
        }
        c7626f0.m31514k4(strM615jd);
        C8583q7 c8583q7M31513k42 = c7626f0.m31513k4();
        long jM43589k42 = 0;
        while (i2 < chartDataPointCollection.size()) {
        }
        c8583q7M31513k42.m39371k4().m38333k4(jM43589k42);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m6076k4(ChartSeries chartSeries, C8089ki c8089ki, int i) {
        String strM615jd;
        C7402cf c7402cfM35401k4 = c8089ki.m35401k4();
        ChartDataPointCollection chartDataPointCollection = (ChartDataPointCollection) C7019kk.m27452k4((Object) chartSeries.getDataPoints(), ChartDataPointCollection.class);
        c7402cfM35401k4.m29586k4();
        switch (i) {
            case 0:
                if (!"".equals(C14113y2.m67440x1(chartSeries.getNumberFormatOfXValues()))) {
                    c7402cfM35401k4.m29587k4(chartSeries.getNumberFormatOfXValues());
                }
                strM615jd = chartDataPointCollection.m615jd();
                break;
            case 1:
                if (!"".equals(C14113y2.m67440x1(chartSeries.getNumberFormatOfYValues()))) {
                    c7402cfM35401k4.m29587k4(chartSeries.getNumberFormatOfYValues());
                }
                strM615jd = chartDataPointCollection.m606ck();
                break;
            case 2:
                if (!"".equals(C14113y2.m67440x1(chartSeries.getNumberFormatOfBubbleSizes()))) {
                    c7402cfM35401k4.m29587k4(chartSeries.getNumberFormatOfBubbleSizes());
                }
                strM615jd = chartDataPointCollection.m638up();
                break;
            case 3:
                if (!"".equals(C14113y2.m67440x1(chartSeries.getNumberFormatOfValues()))) {
                    c7402cfM35401k4.m29587k4(chartSeries.getNumberFormatOfValues());
                }
                strM615jd = chartDataPointCollection.m611fa();
                break;
            case 4:
                strM615jd = chartDataPointCollection.m644yj();
                break;
            case 5:
                strM615jd = chartDataPointCollection.m630ks();
                break;
            case 6:
                strM615jd = chartDataPointCollection.m634rv();
                break;
            case 7:
                strM615jd = chartDataPointCollection.m643x6();
                break;
            default:
                if (!chartSeries.m739x1()) {
                    c8089ki.m35402k4((C7402cf) null);
                    return;
                }
                c7402cfM35401k4.m29589to().m38333k4(((ChartDataPointCollection) C7019kk.m27452k4((Object) chartSeries.getDataPoints(), ChartDataPointCollection.class)).m639uz());
                for (int i2 = 0; i2 < chartSeries.getDataPoints().size(); i2++) {
                    C14656uy c14656uyM6074k4 = m6074k4((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i2), ChartDataPoint.class), i);
                    Object objM71989k4 = c14656uyM6074k4.m71989k4();
                    String strM71992x1 = c14656uyM6074k4.m71992x1();
                    if (objM71989k4 != null) {
                        if (C7019kk.m27469x1(objM71989k4, Double.class) && C14044b3.m66437kk(((Double) C7019kk.m27464to(objM71989k4, Double.TYPE)).doubleValue())) {
                            objM71989k4 = "#N/A";
                        }
                        C9069vu c9069vuM29590x1 = c7402cfM35401k4.m29590x1();
                        c9069vuM29590x1.m43318k4(((long) i2) & 4294967295L);
                        c9069vuM29590x1.m43322x1(C14080ne.m66987ks(objM71989k4, C11697x1.m55250kk()));
                        if (!C14113y2.m67411k4(strM71992x1)) {
                            c9069vuM29590x1.m43319k4(strM71992x1);
                        }
                    } else if (chartSeries.getChart().getType() != 32 && i2 == chartSeries.getDataPoints().size() - 1 && c7402cfM35401k4.m29584du().length == 0) {
                        c7402cfM35401k4.m29589to().m38333k4(0L);
                    }
                }
                return;
        }
        c8089ki.m35403k4(strM615jd);
        if (!chartSeries.m739x1()) {
        }
    }

    @Override // com.aspose.slides.AbstractC13703jv
    /* JADX INFO: renamed from: k4 */
    public void mo6078k4(IChartSeries iChartSeries, AbstractC8619qq abstractC8619qq, int i) {
        if (C7019kk.m27469x1(abstractC8619qq, C8262mg.class)) {
            m6076k4((ChartSeries) iChartSeries, (C8089ki) ((C8262mg) abstractC8619qq).m36930k4("numRef").m29542x1(), i);
            return;
        }
        boolean zM6077x1 = m6077x1(iChartSeries, i);
        ChartSeries chartSeries = (ChartSeries) iChartSeries;
        C7935ij c7935ij = (C7935ij) abstractC8619qq;
        if (zM6077x1) {
            m6076k4(chartSeries, (C8089ki) c7935ij.m34168k4("numRef").m29542x1(), i);
        } else {
            m6075k4(chartSeries, (C7626f0) c7935ij.m34168k4("strRef").m29542x1(), i);
        }
    }

    @Override // com.aspose.slides.AbstractC13703jv
    /* JADX INFO: renamed from: k4 */
    public void mo6079k4(IChartSeries iChartSeries, AbstractC8619qq abstractC8619qq, int i, gnb gnbVar, boolean z) {
        C7394ca c7394caM34166du;
        Object objValueOf;
        int i2 = 0;
        m63557x1(iChartSeries, abstractC8619qq, i);
        ChartDataPointCollection chartDataPointCollection = (ChartDataPointCollection) C7019kk.m27452k4((Object) iChartSeries.getDataPoints(), ChartDataPointCollection.class);
        switch (i) {
            case 0:
                chartDataPointCollection.m625k4(abstractC8619qq.mo34171x1());
                break;
            case 1:
                chartDataPointCollection.m642x1(abstractC8619qq.mo34171x1());
                break;
            case 2:
                chartDataPointCollection.m636to(abstractC8619qq.mo34171x1());
                break;
            case 3:
                chartDataPointCollection.m629kk(abstractC8619qq.mo34171x1());
                break;
            case 4:
                chartDataPointCollection.m608du(abstractC8619qq.mo34171x1());
                break;
            case 5:
                chartDataPointCollection.m613h4(abstractC8619qq.mo34171x1());
                break;
            case 6:
                chartDataPointCollection.m632m9(abstractC8619qq.mo34171x1());
                break;
            case 7:
                chartDataPointCollection.m610dy(abstractC8619qq.mo34171x1());
                break;
        }
        if (C7019kk.m27469x1(abstractC8619qq, C8262mg.class)) {
            c7394caM34166du = ((C8262mg) C7019kk.m27452k4((Object) abstractC8619qq, C8262mg.class)).m36929du();
        } else {
            if (!C7019kk.m27469x1(abstractC8619qq, C7935ij.class)) {
                return;
            }
            C7935ij c7935ij = (C7935ij) C7019kk.m27452k4((Object) abstractC8619qq, C7935ij.class);
            if (!C7019kk.m27469x1(c7935ij.m34166du().m29542x1(), C8089ki.class)) {
                if (C7019kk.m27469x1(c7935ij.m34166du().m29542x1(), C8555px.class)) {
                    C8555px c8555px = (C8555px) c7935ij.m34166du().m29542x1();
                    int iM38332k4 = (int) c8555px.m39182kk().m44702kk().m38332k4();
                    for (int size = iChartSeries.getDataPoints().size(); size < iM38332k4; size++) {
                        ((ChartDataPointCollection) iChartSeries.getDataPoints()).m618k4();
                    }
                    C9099w9[] c9099w9ArrM37428x1 = c8555px.m39182kk().m44703to()[0].m37428x1();
                    int length = c9099w9ArrM37428x1.length;
                    while (i2 < length) {
                        C9099w9 c9099w9 = c9099w9ArrM37428x1[i2];
                        m6074k4((ChartDataPoint) iChartSeries.getDataPoints().get_Item((int) c9099w9.m43589k4()), i).m71990k4((Object) c9099w9.m43592x1());
                        i2++;
                    }
                    return;
                }
                C7626f0 c7626f0 = (C7626f0) c7935ij.m34166du().m29542x1();
                int iM67499to = (int) C14116yg.m67499to(c7626f0.m31515kk().m39372kk().m38332k4(), ((m6073k4(abstractC8619qq) & 4294967295L) + 1) & 4294967295L);
                for (int size2 = iChartSeries.getDataPoints().size(); size2 < iM67499to; size2++) {
                    ((ChartDataPointCollection) iChartSeries.getDataPoints()).m618k4();
                }
                C9099w9[] c9099w9ArrM39373to = c7626f0.m31515kk().m39373to();
                int length2 = c9099w9ArrM39373to.length;
                while (i2 < length2) {
                    C9099w9 c9099w92 = c9099w9ArrM39373to[i2];
                    m6074k4((ChartDataPoint) iChartSeries.getDataPoints().get_Item((int) c9099w92.m43589k4()), i).m71990k4((Object) c9099w92.m43592x1());
                    i2++;
                }
                return;
            }
            c7394caM34166du = c7935ij.m34166du();
        }
        C8089ki c8089ki = (C8089ki) c7394caM34166du.m29542x1();
        if (c8089ki.m35404kk() == null) {
            return;
        }
        if (i == 0) {
            ((ChartDataPointCollection) C7019kk.m27452k4((Object) iChartSeries.getDataPoints(), ChartDataPointCollection.class)).m626k4(true);
        }
        if (c8089ki.m35404kk().m29584du() == null) {
            return;
        }
        long jM38332k4 = c8089ki.m35404kk().m29589to().m38332k4();
        ((ChartDataPointCollection) C7019kk.m27452k4((Object) iChartSeries.getDataPoints(), ChartDataPointCollection.class)).m623k4(c8089ki.m35404kk().m29589to().m38332k4());
        if (i == 1 || i == 2) {
            jM38332k4 = C14116yg.m67499to(c8089ki.m35404kk().m29589to().m38332k4(), ((m6073k4(abstractC8619qq) & 4294967295L) + 1) & 4294967295L);
        }
        if (i == 4 || i == 5 || i == 6 || i == 7) {
            jM38332k4 = ((long) iChartSeries.getDataPoints().size()) & 4294967295L;
        }
        if (z) {
            jM38332k4 = ((m6073k4(abstractC8619qq) & 4294967295L) + 1) & 4294967295L;
        }
        long size3 = ((long) iChartSeries.getDataPoints().size()) & 4294967295L;
        while (true) {
            long j = jM38332k4 & 4294967295L;
            if ((size3 & 4294967295L) >= j) {
                for (C9069vu c9069vu : c8089ki.m35404kk().m29584du()) {
                    int iM43317k4 = (int) c9069vu.m43317k4();
                    if (iM43317k4 < chartDataPointCollection.size()) {
                        C14656uy c14656uyM6074k4 = m6074k4((ChartDataPoint) iChartSeries.getDataPoints().get_Item(iM43317k4), i);
                        String strM43321x1 = c9069vu.m43321x1();
                        if ("#N/A".equals(c9069vu.m43320kk())) {
                            objValueOf = c9069vu.m43320kk();
                            c14656uyM6074k4.m71990k4(objValueOf);
                            c14656uyM6074k4.m71991k4(strM43321x1);
                        } else {
                            double[] dArr = {0.0d};
                            boolean zM63556k4 = AbstractC13703jv.m63556k4(c9069vu.m43320kk(), dArr);
                            double d = dArr[0];
                            if (zM63556k4) {
                                objValueOf = Double.valueOf(d);
                                c14656uyM6074k4.m71990k4(objValueOf);
                                c14656uyM6074k4.m71991k4(strM43321x1);
                            } else {
                                if (C14113y2.m67411k4(c9069vu.m43320kk())) {
                                }
                                objValueOf = c9069vu.m43320kk();
                                c14656uyM6074k4.m71990k4(objValueOf);
                                c14656uyM6074k4.m71991k4(strM43321x1);
                            }
                        }
                    }
                }
                if (c8089ki.m35404kk().m29584du().length == 0 && j == 1 && i < 2) {
                    m6074k4((ChartDataPoint) iChartSeries.getDataPoints().get_Item(0), i).m71990k4(Double.valueOf(Double.NaN));
                    return;
                }
                return;
            }
            ((ChartDataPointCollection) iChartSeries.getDataPoints()).m618k4();
            size3++;
        }
    }

    @Override // com.aspose.slides.AbstractC13703jv
    /* JADX INFO: renamed from: k4 */
    public void mo6080k4(IChartSeries iChartSeries, AbstractC9120wl abstractC9120wl) {
        ChartSeries chartSeries = (ChartSeries) iChartSeries;
        if (C14113y2.m67411k4(chartSeries.m725jd())) {
            return;
        }
        C7626f0 c7626f0 = (C7626f0) abstractC9120wl.mo30759dy().m42726k4("strRef").m29542x1();
        c7626f0.m31514k4(chartSeries.m720ck());
        C8583q7 c8583q7M31513k4 = c7626f0.m31513k4();
        c8583q7M31513k4.m39371k4().m38333k4(((long) chartSeries.f1473k4.size()) & 4294967295L);
        for (int i = 0; i < chartSeries.f1473k4.size(); i++) {
            C9099w9 c9099w9M39374x1 = c8583q7M31513k4.m39374x1();
            c9099w9M39374x1.m43590k4(((long) i) & 4294967295L);
            c9099w9M39374x1.m43591k4(C14080ne.m67058yj(chartSeries.f1473k4.get_Item(i), (InterfaceC14073kp) C11697x1.m55250kk()));
        }
    }

    @Override // com.aspose.slides.AbstractC13703jv
    /* JADX INFO: renamed from: k4 */
    public boolean mo6081k4(IChartSeries iChartSeries, int i) {
        ChartDataPointCollection chartDataPointCollection = (ChartDataPointCollection) C7019kk.m27452k4((Object) iChartSeries.getDataPoints(), ChartDataPointCollection.class);
        switch (i) {
            case 0:
                return chartDataPointCollection.m615jd() != null;
            case 1:
                return chartDataPointCollection.m606ck() != null;
            case 2:
                return chartDataPointCollection.m638up() != null;
            case 3:
                return chartDataPointCollection.m611fa() != null;
            case 4:
                return chartDataPointCollection.m644yj() != null;
            case 5:
                return chartDataPointCollection.m630ks() != null;
            case 6:
                return chartDataPointCollection.m634rv() != null;
            case 7:
                return chartDataPointCollection.m643x6() != null;
            default:
                return false;
        }
    }
}
