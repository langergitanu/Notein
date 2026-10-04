package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC9120wl;
import com.aspose.slides.internal.p332p7.C7380c6;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7402cf;
import com.aspose.slides.internal.p332p7.C7626f0;
import com.aspose.slides.internal.p332p7.C7814h1;
import com.aspose.slides.internal.p332p7.C7876hr;
import com.aspose.slides.internal.p332p7.C7935ij;
import com.aspose.slides.internal.p332p7.C8089ki;
import com.aspose.slides.internal.p332p7.C8212lu;
import com.aspose.slides.internal.p332p7.C8329nd;
import com.aspose.slides.internal.p332p7.C8452ol;
import com.aspose.slides.internal.p332p7.C8555px;
import com.aspose.slides.internal.p332p7.C8557py;
import com.aspose.slides.internal.p332p7.C8583q7;
import com.aspose.slides.internal.p332p7.C9001v5;
import com.aspose.slides.internal.p332p7.C9044vi;
import com.aspose.slides.internal.p332p7.C9069vu;
import com.aspose.slides.internal.p332p7.C9099w9;
import com.aspose.slides.internal.p332p7.C9240xx;
import com.aspose.slides.internal.p332p7.C9311yt;
import com.aspose.slides.internal.p332p7.C9326yy;
import com.aspose.slides.internal.p332p7.C9358zc;
import com.aspose.slides.internal.p332p7.C9392zq;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: renamed from: com.aspose.slides.x4 */
/* JADX INFO: loaded from: classes3.dex */
class C14764x4 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f49956k4 = new C7017h4("strRef", "v", "numRef", "strLit");

    /* JADX INFO: renamed from: k4 */
    public static void m73090k4(int i, ChartDataPoint chartDataPoint, Object obj, String str) {
        C14656uy c14656uyM6074k4 = C1084fb.m6074k4(chartDataPoint, i);
        c14656uyM6074k4.m71990k4(obj);
        c14656uyM6074k4.m71991k4(str);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m73099x1(IChartSeries iChartSeries, AbstractC9120wl abstractC9120wl) {
        C9358zc c9358zcM29434k4 = C7380c6.m29434k4(abstractC9120wl.mo30758du());
        if (c9358zcM29434k4 == null || c9358zcM29434k4.m45575k4() == null) {
            return;
        }
        ((DataLabelCollection) C7019kk.m27452k4((Object) iChartSeries.getLabels(), DataLabelCollection.class)).m1308k4(c9358zcM29434k4.m45575k4());
        if (c9358zcM29434k4.m45576x1() != null) {
            for (C9099w9 c9099w9 : c9358zcM29434k4.m45576x1().m34737k4()) {
                if ((((c9099w9.m43589k4() & 4294967295L) + 1) & 4294967295L) <= iChartSeries.getLabels().getCount()) {
                    ((DataLabel) C7019kk.m27452k4((Object) iChartSeries.getLabels().get_Item((int) c9099w9.m43589k4()), DataLabel.class)).m1299k4(c9099w9.m43592x1());
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73091k4(ChartCategoryCollection chartCategoryCollection, C7935ij c7935ij) {
        C8452ol c8452olM39371k4;
        String strM537kk = chartCategoryCollection.m537kk();
        int i = 0;
        int iM4304k4 = ((ChartCategory) chartCategoryCollection.get_Item(0)).m526x1().m4304k4();
        if (iM4304k4 != 0) {
            C8555px c8555px = (C8555px) c7935ij.m34168k4("multiLvlStrRef").m29542x1();
            c8555px.m39181k4(strM537kk);
            C9240xx c9240xxM39180k4 = c8555px.m39180k4();
            c9240xxM39180k4.m44701k4().m38333k4(((long) chartCategoryCollection.size()) & 4294967295L);
            for (int i2 = 0; i2 < iM4304k4; i2++) {
                C8329nd c8329ndM44704x1 = c9240xxM39180k4.m44704x1();
                for (int i3 = 0; i3 < chartCategoryCollection.size(); i3++) {
                    Object objM4305k4 = ((ChartCategory) chartCategoryCollection.get_Item(i3)).m526x1().m4305k4(i2);
                    if (objM4305k4 != null) {
                        C9099w9 c9099w9M37427k4 = c8329ndM44704x1.m37427k4();
                        c9099w9M37427k4.m43590k4(((long) i3) & 4294967295L);
                        c9099w9M37427k4.m43591k4(C14080ne.m66987ks(objM4305k4, C11697x1.m55250kk()));
                    }
                }
            }
            return;
        }
        String[] strArr = new String[chartCategoryCollection.size()];
        boolean z = true;
        for (int i4 = 0; i4 < chartCategoryCollection.size(); i4++) {
            strArr[i4] = ((ChartCategory) C7019kk.m27452k4((Object) chartCategoryCollection.get_Item(i4), ChartCategory.class)).m522k4() != null ? C14080ne.m66987ks(((ChartCategory) C7019kk.m27452k4((Object) chartCategoryCollection.get_Item(i4), ChartCategory.class)).m522k4(), C11697x1.m55250kk()) : null;
            z &= ((ChartCategory) C7019kk.m27452k4((Object) chartCategoryCollection.get_Item(i4), ChartCategory.class)).m522k4() == null || C7019kk.m27469x1(((ChartCategory) C7019kk.m27452k4((Object) chartCategoryCollection.get_Item(i4), ChartCategory.class)).m522k4(), Double.class);
        }
        long jM43589k4 = 0;
        if (z) {
            C8089ki c8089ki = (C8089ki) c7935ij.m34168k4("numRef").m29542x1();
            c8089ki.m35403k4(strM537kk);
            C7402cf c7402cfM35401k4 = c8089ki.m35401k4();
            c7402cfM35401k4.m29587k4(chartCategoryCollection.m538to().m5743k4());
            while (i < chartCategoryCollection.size()) {
                if (strArr[i] != null) {
                    C9069vu c9069vuM29590x1 = c7402cfM35401k4.m29590x1();
                    c9069vuM29590x1.m43318k4(((long) i) & 4294967295L);
                    c9069vuM29590x1.m43322x1(strArr[i]);
                    if ((((c9069vuM29590x1.m43317k4() & 4294967295L) + 1) & 4294967295L) > (jM43589k4 & 4294967295L)) {
                        jM43589k4 = ((c9069vuM29590x1.m43317k4() & 4294967295L) + 1) & 4294967295L;
                    }
                }
                i++;
            }
            c8452olM39371k4 = c7402cfM35401k4.m29586k4();
        } else {
            C7626f0 c7626f0 = (C7626f0) c7935ij.m34168k4("strRef").m29542x1();
            c7626f0.m31514k4(strM537kk);
            C8583q7 c8583q7M31513k4 = c7626f0.m31513k4();
            while (i < chartCategoryCollection.size()) {
                String str = strArr[i];
                if (str != null && !C14113y2.m67411k4(str)) {
                    C9099w9 c9099w9M39374x1 = c8583q7M31513k4.m39374x1();
                    c9099w9M39374x1.m43590k4(((long) i) & 4294967295L);
                    c9099w9M39374x1.m43591k4(strArr[i]);
                    if ((((c9099w9M39374x1.m43589k4() & 4294967295L) + 1) & 4294967295L) > (jM43589k4 & 4294967295L)) {
                        jM43589k4 = ((c9099w9M39374x1.m43589k4() & 4294967295L) + 1) & 4294967295L;
                    }
                }
                i++;
            }
            c8452olM39371k4 = c8583q7M31513k4.m39371k4();
        }
        c8452olM39371k4.m38333k4(jM43589k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73092k4(ChartCategoryCollection chartCategoryCollection, C8555px c8555px) {
        int iM38332k4;
        int length;
        if (chartCategoryCollection.size() <= 0 && c8555px != null) {
            if (c8555px.m39182kk() == null && c8555px.m39184x1() == null) {
                return;
            }
            chartCategoryCollection.clear();
            if (!C14113y2.m67411k4(c8555px.m39184x1())) {
                chartCategoryCollection.m535k4(c8555px.m39184x1());
            }
            if (c8555px.m39182kk() != null) {
                iM38332k4 = c8555px.m39182kk().m44702kk() != null ? (int) c8555px.m39182kk().m44702kk().m38332k4() : 0;
                length = c8555px.m39182kk().m44703to() != null ? c8555px.m39182kk().m44703to().length : 0;
            } else {
                iM38332k4 = 0;
                length = 0;
            }
            if (iM38332k4 == 0 && !C14113y2.m67411k4(chartCategoryCollection.m537kk())) {
                List<C14857yq> listM686kk = new ChartDataWorkbook((ChartData) C7019kk.m27452k4((Object) ((InterfaceC14397rj) C7019kk.m27452k4((Object) chartCategoryCollection, InterfaceC14397rj.class)).getParent_Immediate().getParent_Immediate(), ChartData.class)).m686kk(chartCategoryCollection.m537kk());
                if (listM686kk.size() == 0) {
                    return;
                }
                int iM74060du = listM686kk.get_Item(0).m74060du();
                int iM74061h4 = listM686kk.get_Item(0).m74061h4();
                for (int i = 1; i < listM686kk.size(); i++) {
                    if (listM686kk.get_Item(i).m74060du() < iM74060du) {
                        iM74060du = listM686kk.get_Item(i).m74060du();
                    }
                    if (listM686kk.get_Item(i).m74061h4() < iM74061h4) {
                        iM74061h4 = listM686kk.get_Item(i).m74061h4();
                    }
                }
                iM38332k4 = (iM74061h4 - iM74060du) + 1;
            }
            for (int i2 = 0; i2 < iM38332k4; i2++) {
                ChartCategory chartCategoryM531k4 = chartCategoryCollection.m531k4((Object) null);
                for (int i3 = 1; i3 < length; i3++) {
                    chartCategoryM531k4.m526x1().m4306k4(i3, null);
                }
            }
            for (int i4 = 0; i4 < length; i4++) {
                for (C9099w9 c9099w9 : c8555px.m39182kk().m44703to()[i4].m37428x1()) {
                    ((ChartCategory) chartCategoryCollection.get_Item((int) c9099w9.m43589k4())).m526x1().m4306k4(i4, c9099w9.m43592x1());
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73093k4(ChartCategoryCollection chartCategoryCollection, C8557py c8557py) {
        m73094k4(chartCategoryCollection, (C9392zq) c8557py.m39198k4("strDim").m29542x1());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73094k4(ChartCategoryCollection chartCategoryCollection, C9392zq c9392zq) {
        c9392zq.m45901k4(1);
        C8212lu c8212lu = new C8212lu();
        c8212lu.m36438k4(chartCategoryCollection.m537kk());
        c9392zq.m45902k4(c8212lu);
        int iM4304k4 = ((ChartCategory) chartCategoryCollection.get_Item(0)).m526x1().m4304k4();
        if (iM4304k4 == 0) {
            C9044vi c9044viM45905x1 = c9392zq.m45905x1();
            c9044viM45905x1.m43120k4(((long) chartCategoryCollection.size()) & 4294967295L);
            for (int i = 0; i < chartCategoryCollection.size(); i++) {
                Object objM522k4 = ((ChartCategory) chartCategoryCollection.get_Item(i)).m522k4();
                if (objM522k4 != null) {
                    C7814h1 c7814h1M43119k4 = c9044viM45905x1.m43119k4();
                    c7814h1M43119k4.m33012k4(((long) i) & 4294967295L);
                    c7814h1M43119k4.m33013k4(C14080ne.m66987ks(objM522k4, C11697x1.m55250kk()));
                }
            }
            return;
        }
        for (int i2 = 0; i2 < iM4304k4; i2++) {
            C9044vi c9044viM45905x12 = c9392zq.m45905x1();
            c9044viM45905x12.m43120k4(((long) chartCategoryCollection.size()) & 4294967295L);
            for (int i3 = 0; i3 < chartCategoryCollection.size(); i3++) {
                Object objM4305k4 = ((ChartCategory) chartCategoryCollection.get_Item(i3)).m526x1().m4305k4(i2);
                if (objM4305k4 != null) {
                    C7814h1 c7814h1M43119k42 = c9044viM45905x12.m43119k4();
                    c7814h1M43119k42.m33012k4(((long) i3) & 4294967295L);
                    c7814h1M43119k42.m33013k4(C14080ne.m66987ks(objM4305k4, C11697x1.m55250kk()));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c4 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m73095k4(ChartSeries chartSeries, int i, C8557py c8557py) {
        String numberFormatOfXValues;
        C14656uy c14656uyM585jd;
        if (!C13728kh.m63866k4(chartSeries.getType(), i)) {
            return;
        }
        C9311yt c9311yt = (C9311yt) c8557py.m39198k4("numDim").m29542x1();
        C8212lu c8212lu = new C8212lu();
        C9326yy c9326yyM45131x1 = c9311yt.m45131x1();
        if (i == 0) {
            c9311yt.m45127k4(2);
            c8212lu.m36438k4(((ChartDataPointCollection) C7019kk.m27452k4((Object) chartSeries.getDataPoints(), ChartDataPointCollection.class)).m615jd());
            if (!"".equals(C14113y2.m67440x1(chartSeries.getNumberFormatOfXValues()))) {
                numberFormatOfXValues = chartSeries.getNumberFormatOfXValues();
                c9326yyM45131x1.m45273k4(numberFormatOfXValues);
            }
        } else if (i == 1) {
            c9311yt.m45127k4(3);
            c8212lu.m36438k4(((ChartDataPointCollection) C7019kk.m27452k4((Object) chartSeries.getDataPoints(), ChartDataPointCollection.class)).m606ck());
            if (!"".equals(C14113y2.m67440x1(chartSeries.getNumberFormatOfYValues()))) {
                numberFormatOfXValues = chartSeries.getNumberFormatOfYValues();
                c9326yyM45131x1.m45273k4(numberFormatOfXValues);
            }
        } else if (i == 3) {
            c9311yt.m45127k4(1);
            c8212lu.m36438k4(((ChartDataPointCollection) C7019kk.m27452k4((Object) chartSeries.getDataPoints(), ChartDataPointCollection.class)).m611fa());
            if (!"".equals(C14113y2.m67440x1(chartSeries.getNumberFormatOfValues()))) {
                numberFormatOfXValues = chartSeries.getNumberFormatOfValues();
                c9326yyM45131x1.m45273k4(numberFormatOfXValues);
            }
        } else if (i == 8) {
            c9311yt.m45127k4(4);
            c8212lu.m36438k4(((ChartDataPointCollection) C7019kk.m27452k4((Object) chartSeries.getDataPoints(), ChartDataPointCollection.class)).m633ne());
            if (!"".equals(C14113y2.m67440x1(chartSeries.m721du()))) {
                numberFormatOfXValues = chartSeries.m721du();
                c9326yyM45131x1.m45273k4(numberFormatOfXValues);
            }
        } else if (i == 9) {
            c9311yt.m45127k4(6);
            c8212lu.m36438k4(((ChartDataPointCollection) C7019kk.m27452k4((Object) chartSeries.getDataPoints(), ChartDataPointCollection.class)).m614ix());
            if (!"".equals(C14113y2.m67440x1(chartSeries.m721du()))) {
                numberFormatOfXValues = chartSeries.m724h4();
                c9326yyM45131x1.m45273k4(numberFormatOfXValues);
            }
        }
        c9311yt.m45128k4(c8212lu);
        long j = 4294967295L;
        long size = ((long) chartSeries.getDataPoints().size()) & 4294967295L;
        Object objM71989k4 = null;
        int i2 = 0;
        while (true) {
            long j2 = i2;
            long j3 = size & j;
            if (j2 >= j3) {
                c9326yyM45131x1.m45272k4(size);
                return;
            }
            long j4 = j;
            if (i == 0) {
                c14656uyM585jd = ((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i2), ChartDataPoint.class)).m585jd();
            } else if (i == 1) {
                c14656uyM585jd = ((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i2), ChartDataPoint.class)).m580ck();
            } else if (i == 3) {
                c14656uyM585jd = ((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i2), ChartDataPoint.class)).m579c5();
            } else if (i != 8) {
                if (i == 9) {
                    c14656uyM585jd = ((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i2), ChartDataPoint.class)).m594ne();
                }
                if (objM71989k4 == null) {
                    C7876hr c7876hrM45271k4 = c9326yyM45131x1.m45271k4();
                    c7876hrM45271k4.m33598k4(j2 & j4);
                    if ((((c7876hrM45271k4.m33597k4() & j4) + 1) & j4) > j3) {
                        size = ((c7876hrM45271k4.m33597k4() & j4) + 1) & j4;
                    }
                    c7876hrM45271k4.m33599k4(C14080ne.m66987ks(objM71989k4, C11697x1.m55250kk()));
                }
                i2++;
                j = j4;
            } else {
                c14656uyM585jd = ((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i2), ChartDataPoint.class)).m601x6();
            }
            objM71989k4 = c14656uyM585jd.m71989k4();
            if (objM71989k4 == null) {
            }
            i2++;
            j = j4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73096k4(IChartCategoryCollection iChartCategoryCollection, C7394ca c7394ca, boolean z) {
        int size = iChartCategoryCollection.size();
        int iM27428k4 = f49956k4.m27428k4(c7394ca.m29539k4());
        int i = 0;
        if (iM27428k4 == 0) {
            C7626f0 c7626f0 = (C7626f0) c7394ca.m29542x1();
            ((ChartCategoryCollection) C7019kk.m27452k4((Object) iChartCategoryCollection, ChartCategoryCollection.class)).m535k4(c7626f0.m31517x1());
            if (c7626f0.m31515kk() == null || c7626f0.m31515kk().m39373to() == null) {
                return;
            }
            int iM38332k4 = (int) c7626f0.m31515kk().m39372kk().m38332k4();
            if (z && c7626f0.m31515kk().m39373to().length > 0) {
                iM38332k4 = ((int) c7626f0.m31515kk().m39373to()[c7626f0.m31515kk().m39373to().length - 1].m43589k4()) + 1;
            }
            for (int i2 = size; i2 < iM38332k4; i2++) {
                ((ChartCategoryCollection) C7019kk.m27452k4((Object) iChartCategoryCollection, ChartCategoryCollection.class)).m531k4((Object) null);
            }
            C9099w9[] c9099w9ArrM39373to = c7626f0.m31515kk().m39373to();
            int length = c9099w9ArrM39373to.length;
            while (i < length) {
                C9099w9 c9099w9 = c9099w9ArrM39373to[i];
                int iM43589k4 = (int) c9099w9.m43589k4();
                if (iM43589k4 >= size && c9099w9.m43592x1() != null) {
                    ((ChartCategory) iChartCategoryCollection.get_Item(iM43589k4)).m524k4(C14113y2.m67401k4(c9099w9.m43592x1(), "_x000d_", ""));
                }
                i++;
            }
            return;
        }
        if (iM27428k4 != 2) {
            if (iM27428k4 == 3) {
                throw new InvalidOperationException("strLit values can't be loaded into categories cache");
            }
            return;
        }
        C8089ki c8089ki = (C8089ki) c7394ca.m29542x1();
        ((ChartCategoryCollection) C7019kk.m27452k4((Object) iChartCategoryCollection, ChartCategoryCollection.class)).m535k4(c8089ki.m35406x1());
        if (c8089ki.m35404kk() == null || c8089ki.m35404kk().m29584du() == null) {
            return;
        }
        int iM38332k42 = (int) c8089ki.m35404kk().m29589to().m38332k4();
        if (z && c8089ki.m35404kk().m29584du().length > 0) {
            iM38332k42 = ((int) c8089ki.m35404kk().m29584du()[c8089ki.m35404kk().m29584du().length - 1].m43317k4()) + 1;
        }
        for (int i3 = size; i3 < iM38332k42; i3++) {
            ((ChartCategoryCollection) C7019kk.m27452k4((Object) iChartCategoryCollection, ChartCategoryCollection.class)).m531k4((Object) null);
        }
        C9069vu[] c9069vuArrM29584du = c8089ki.m35404kk().m29584du();
        int length2 = c9069vuArrM29584du.length;
        while (i < length2) {
            C9069vu c9069vu = c9069vuArrM29584du[i];
            int iM43317k4 = (int) c9069vu.m43317k4();
            if (iM43317k4 >= size && AbstractC14092to.m67201k4(oen.f47761k4, c9069vu.m43320kk()) < 0) {
                ((ChartCategory) iChartCategoryCollection.get_Item(iM43317k4)).m524k4(Double.valueOf(C14080ne.m66906fa(c9069vu.m43320kk(), (InterfaceC14073kp) C11697x1.m55250kk())));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73097k4(IChartSeries iChartSeries, IGenericEnumerable<C7394ca> iGenericEnumerable, int i) {
        C9311yt c9311ytM63855k4;
        if (iGenericEnumerable == null) {
            return;
        }
        ChartDataPointCollection chartDataPointCollection = (ChartDataPointCollection) C7019kk.m27452k4((Object) iChartSeries.getDataPoints(), ChartDataPointCollection.class);
        if (i == 0) {
            c9311ytM63855k4 = C13728kh.m63855k4(iGenericEnumerable, 2);
            if (c9311ytM63855k4 != null && c9311ytM63855k4.m45130to() != null) {
                chartDataPointCollection.m625k4(c9311ytM63855k4.m45130to().m36437k4());
            }
        } else if (i == 1) {
            c9311ytM63855k4 = C13728kh.m63855k4(iGenericEnumerable, 3);
            if (c9311ytM63855k4 != null && c9311ytM63855k4.m45130to() != null) {
                chartDataPointCollection.m642x1(c9311ytM63855k4.m45130to().m36437k4());
            }
        } else if (i == 3) {
            c9311ytM63855k4 = C13728kh.m63855k4(iGenericEnumerable, 1);
            if (c9311ytM63855k4 != null && c9311ytM63855k4.m45130to() != null) {
                chartDataPointCollection.m629kk(c9311ytM63855k4.m45130to().m36437k4());
            }
        } else if (i == 8) {
            c9311ytM63855k4 = C13728kh.m63855k4(iGenericEnumerable, 4);
            if (c9311ytM63855k4 != null && c9311ytM63855k4.m45130to() != null) {
                chartDataPointCollection.m605c5(c9311ytM63855k4.m45130to().m36437k4());
            }
        } else if (i != 9) {
            c9311ytM63855k4 = null;
        } else {
            c9311ytM63855k4 = C13728kh.m63855k4(iGenericEnumerable, 6);
            if (c9311ytM63855k4 != null && c9311ytM63855k4.m45130to() != null) {
                chartDataPointCollection.m616jd(c9311ytM63855k4.m45130to().m36437k4());
            }
        }
        if (c9311ytM63855k4 == null || c9311ytM63855k4.m45125du().length == 0) {
            return;
        }
        if (c9311ytM63855k4.m45125du()[0].m45274kk() != null) {
            if (i == 0) {
                iChartSeries.setNumberFormatOfXValues(c9311ytM63855k4.m45125du()[0].m45274kk());
            } else if (i == 1) {
                iChartSeries.setNumberFormatOfYValues(c9311ytM63855k4.m45125du()[0].m45274kk());
            } else if (i == 3) {
                iChartSeries.setNumberFormatOfValues(c9311ytM63855k4.m45125du()[0].m45274kk());
            } else if (i == 8) {
                ((ChartSeries) C7019kk.m27452k4((Object) iChartSeries, ChartSeries.class)).m729k4(c9311ytM63855k4.m45125du()[0].m45274kk());
            } else if (i == 9) {
                ((ChartSeries) C7019kk.m27452k4((Object) iChartSeries, ChartSeries.class)).m737x1(c9311ytM63855k4.m45125du()[0].m45274kk());
            }
        }
        for (int size = iChartSeries.getDataPoints().size(); size < (c9311ytM63855k4.m45125du()[0].m45276x1() & 4294967295L); size++) {
            ((ChartDataPointCollection) iChartSeries.getDataPoints()).m618k4();
        }
        for (C7876hr c7876hr : c9311ytM63855k4.m45125du()[0].m45275to()) {
            double[] dArr = {0.0d};
            m73090k4(i, (ChartDataPoint) iChartSeries.getDataPoints().get_Item((int) c7876hr.m33597k4()), AbstractC13703jv.m63556k4(c7876hr.m33600x1(), dArr) ? Double.valueOf(dArr[0]) : c7876hr.m33600x1(), C14113y2.f47374k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73098k4(IChartSeries iChartSeries, AbstractC9120wl abstractC9120wl) {
        C9099w9[] c9099w9ArrM39373to;
        C9001v5 c9001v5Mo30767m9 = abstractC9120wl.mo30767m9();
        if (c9001v5Mo30767m9 != null) {
            int iM27428k4 = f49956k4.m27428k4(c9001v5Mo30767m9.m42725k4().m29539k4());
            if (iM27428k4 != 0) {
                if (iM27428k4 != 1) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c9001v5Mo30767m9.m42725k4().m29539k4(), "\""));
                }
                iChartSeries.getName().setDataSourceType(1);
                iChartSeries.getName().setAsLiteralString((String) c9001v5Mo30767m9.m42725k4().m29541kk());
                return;
            }
            iChartSeries.getName().setDataSourceType(0);
            C7626f0 c7626f0 = (C7626f0) c9001v5Mo30767m9.m42725k4().m29542x1();
            ((ChartSeries) C7019kk.m27452k4((Object) iChartSeries, ChartSeries.class)).m732kk(c7626f0.m31517x1());
            if (c7626f0.m31515kk() == null || (c9099w9ArrM39373to = c7626f0.m31515kk().m39373to()) == null) {
                return;
            }
            for (C9099w9 c9099w9 : c9099w9ArrM39373to) {
                ((ChartSeries) iChartSeries).f1473k4.addItem(c9099w9.m43592x1());
            }
        }
    }
}
