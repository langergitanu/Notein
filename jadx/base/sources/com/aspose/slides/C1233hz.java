package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7402cf;
import com.aspose.slides.internal.p332p7.C7626f0;
import com.aspose.slides.internal.p332p7.C7935ij;
import com.aspose.slides.internal.p332p7.C8089ki;
import com.aspose.slides.internal.p332p7.C8329nd;
import com.aspose.slides.internal.p332p7.C8452ol;
import com.aspose.slides.internal.p332p7.C8555px;
import com.aspose.slides.internal.p332p7.C8583q7;
import com.aspose.slides.internal.p332p7.C9069vu;
import com.aspose.slides.internal.p332p7.C9099w9;
import com.aspose.slides.internal.p332p7.C9240xx;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.hz */
/* JADX INFO: loaded from: classes3.dex */
class C1233hz {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f5594k4 = new C7017h4("multiLvlStrRef", "numRef", "strRef", "numLit", "strLit");

    /* JADX INFO: renamed from: k4 */
    public static void m7335k4(IChartCategoryCollection iChartCategoryCollection, AbstractC4685kk<C7935ij> abstractC4685kk, ChartData chartData) {
        if (iChartCategoryCollection.size() == 0) {
            return;
        }
        C7935ij c7935ijInvoke = abstractC4685kk.invoke();
        if (!iChartCategoryCollection.getUseCells()) {
            m7340kk(iChartCategoryCollection, c7935ijInvoke);
        } else if (chartData.m553x1().mo5710kk() == 2) {
            m7341x1(iChartCategoryCollection, c7935ijInvoke);
        } else {
            C14764x4.m73091k4((ChartCategoryCollection) iChartCategoryCollection, c7935ijInvoke);
        }
    }

    /* JADX INFO: renamed from: kk */
    private static void m7340kk(IChartCategoryCollection iChartCategoryCollection, C7935ij c7935ij) {
        String[] strArr = new String[iChartCategoryCollection.size()];
        int i = 0;
        boolean zM66435k4 = true;
        for (int i2 = 0; i2 < iChartCategoryCollection.size(); i2++) {
            String strM66987ks = iChartCategoryCollection.get_Item(i2).getValue() != null ? C14080ne.m66987ks(iChartCategoryCollection.get_Item(i2).getValue(), C11697x1.m55250kk()) : null;
            strArr[i2] = strM66987ks;
            zM66435k4 &= C14044b3.m66435k4(strM66987ks, 503, C11697x1.m55250kk(), new double[]{0.0d});
        }
        if (zM66435k4) {
            C7402cf c7402cf = (C7402cf) c7935ij.m34168k4("numLit").m29542x1();
            c7402cf.m29587k4("General");
            c7402cf.m29586k4().m38333k4(((long) iChartCategoryCollection.size()) & 4294967295L);
            while (i < iChartCategoryCollection.size()) {
                C9069vu c9069vuM29590x1 = c7402cf.m29590x1();
                c9069vuM29590x1.m43318k4(((long) i) & 4294967295L);
                c9069vuM29590x1.m43322x1(strArr[i]);
                i++;
            }
            return;
        }
        C8583q7 c8583q7 = (C8583q7) c7935ij.m34168k4("strLit").m29542x1();
        c8583q7.m39371k4().m38333k4(((long) iChartCategoryCollection.size()) & 4294967295L);
        while (i < iChartCategoryCollection.size()) {
            if (strArr[i] != null) {
                C9099w9 c9099w9M39374x1 = c8583q7.m39374x1();
                c9099w9M39374x1.m43590k4(((long) i) & 4294967295L);
                c9099w9M39374x1.m43591k4(strArr[i]);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m7341x1(IChartCategoryCollection iChartCategoryCollection, C7935ij c7935ij) {
        C8452ol c8452olM39371k4;
        String strM529du = ((ChartCategoryCollection) iChartCategoryCollection).m529du();
        int i = 0;
        if (iChartCategoryCollection.getGroupingLevelCount() != 1) {
            C8555px c8555px = (C8555px) c7935ij.m34168k4("multiLvlStrRef").m29542x1();
            c8555px.m39181k4(strM529du);
            C9240xx c9240xxM39180k4 = c8555px.m39180k4();
            c9240xxM39180k4.m44701k4().m38333k4(((long) iChartCategoryCollection.size()) & 4294967295L);
            for (int i2 = 0; i2 < iChartCategoryCollection.getGroupingLevelCount(); i2++) {
                C8329nd c8329ndM44704x1 = c9240xxM39180k4.m44704x1();
                for (int i3 = 0; i3 < iChartCategoryCollection.size(); i3++) {
                    IChartDataCell iChartDataCell = iChartCategoryCollection.get_Item(i3).getGroupingLevels().get_Item(i2);
                    if (iChartDataCell != null && iChartDataCell.getValue() != null) {
                        C9099w9 c9099w9M37427k4 = c8329ndM44704x1.m37427k4();
                        c9099w9M37427k4.m43590k4(((long) i3) & 4294967295L);
                        c9099w9M37427k4.m43591k4(C14080ne.m66987ks(iChartDataCell.getValue(), C11697x1.m55250kk()));
                    }
                }
            }
            return;
        }
        String[] strArr = new String[iChartCategoryCollection.size()];
        boolean z = true;
        for (int i4 = 0; i4 < iChartCategoryCollection.size(); i4++) {
            strArr[i4] = iChartCategoryCollection.get_Item(i4).getValue() != null ? C14080ne.m66987ks(iChartCategoryCollection.get_Item(i4).getValue(), C11697x1.m55250kk()) : null;
            z &= iChartCategoryCollection.get_Item(i4).getValue() == null || C14044b3.m66435k4(strArr[i4], 503, C11697x1.m55250kk(), new double[]{0.0d});
        }
        long jM43589k4 = 0;
        if (z) {
            C8089ki c8089ki = (C8089ki) c7935ij.m34168k4("numRef").m29542x1();
            c8089ki.m35403k4(strM529du);
            C7402cf c7402cfM35401k4 = c8089ki.m35401k4();
            c7402cfM35401k4.m29587k4(((ChartCategoryCollection) iChartCategoryCollection).m538to().m5743k4());
            while (i < iChartCategoryCollection.size()) {
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
            c7626f0.m31514k4(strM529du);
            C8583q7 c8583q7M31513k4 = c7626f0.m31513k4();
            while (i < iChartCategoryCollection.size()) {
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
    private static void m7336k4(IChartCategoryCollection iChartCategoryCollection, C7935ij c7935ij) {
        String strM43592x1;
        C7394ca c7394caM34166du = c7935ij.m34166du();
        if (iChartCategoryCollection.size() <= 0 || !iChartCategoryCollection.getUseCells()) {
            iChartCategoryCollection.setUseCells(false);
            int iM27428k4 = f5594k4.m27428k4(c7394caM34166du.m29539k4());
            if (iM27428k4 == 0 || iM27428k4 == 1 || iM27428k4 == 2) {
                throw new Exception();
            }
            if (iM27428k4 == 3) {
                for (C9069vu c9069vu : ((C7402cf) c7394caM34166du.m29542x1()).m29584du()) {
                    if (((int) c9069vu.m43317k4()) >= iChartCategoryCollection.size()) {
                        iChartCategoryCollection.add(Double.valueOf(C13850af.m65132uz(c9069vu.m43320kk())));
                    }
                }
                return;
            }
            if (iM27428k4 != 4) {
                throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394caM34166du.m29539k4(), "\""));
            }
            C8583q7 c8583q7 = (C8583q7) c7394caM34166du.m29542x1();
            long jM38332k4 = c8583q7.m39372kk().m38332k4();
            for (int i = 0; i < (4294967295L & jM38332k4); i++) {
                C9099w9[] c9099w9ArrM39373to = c8583q7.m39373to();
                int length = c9099w9ArrM39373to.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        strM43592x1 = null;
                        break;
                    }
                    C9099w9 c9099w9 = c9099w9ArrM39373to[i2];
                    if (((int) c9099w9.m43589k4()) == i) {
                        strM43592x1 = c9099w9.m43592x1();
                        break;
                    }
                    i2++;
                }
                iChartCategoryCollection.add(strM43592x1);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m7342x1(IChartCategoryCollection iChartCategoryCollection, C7935ij c7935ij, boolean z) {
        C7394ca c7394caM34166du = c7935ij.m34166du();
        int iM27428k4 = f5594k4.m27428k4(c7394caM34166du.m29539k4());
        if (iM27428k4 == 0) {
            C14764x4.m73092k4((ChartCategoryCollection) iChartCategoryCollection, (C8555px) c7394caM34166du.m29542x1());
            return;
        }
        if (iM27428k4 == 1) {
            ((ChartCategoryCollection) iChartCategoryCollection).m538to().m5744k4(((C8089ki) c7394caM34166du.m29542x1()).m35404kk().m29588kk());
            C14764x4.m73096k4(iChartCategoryCollection, c7394caM34166du, z);
        } else if (iM27428k4 == 2) {
            C14764x4.m73096k4(iChartCategoryCollection, c7394caM34166du, z);
        } else {
            if (iM27428k4 != 3 && iM27428k4 != 4) {
                throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394caM34166du.m29539k4(), "\""));
            }
            throw new Exception();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7337k4(IChartCategoryCollection iChartCategoryCollection, C7935ij c7935ij, boolean z) {
        if (c7935ij == null) {
            ((ChartCategoryCollection) iChartCategoryCollection).m536k4(true);
        } else if (c7935ij.mo34167k4() == 0) {
            m7342x1(iChartCategoryCollection, c7935ij, z);
        } else {
            m7336k4(iChartCategoryCollection, c7935ij);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7338k4(IChartCategoryCollection iChartCategoryCollection, String str, ChartDataWorkbook chartDataWorkbook, int i) {
        List.Enumerator<C14857yq> it = chartDataWorkbook.m686kk(str).iterator();
        int size = 0;
        while (it.hasNext()) {
            try {
                C14857yq next = it.next();
                if (next.m74064m9() == i || next.m74065to() == i) {
                    ChartDataWorksheet chartDataWorksheetM707x1 = ((ChartDataWorksheetCollection) chartDataWorkbook.getWorksheets()).m707x1(next.m74062k4());
                    if (chartDataWorksheetM707x1 != null) {
                        boolean z = next.m74065to() == i;
                        int iM74060du = z ? next.m74060du() : next.m74066x1();
                        int iM74061h4 = z ? next.m74061h4() : next.m74063kk();
                        int i2 = 0;
                        for (int i3 = iM74060du; i3 <= iM74061h4; i3++) {
                            ChartDataCell chartDataCellM63051x1 = z ? chartDataWorksheetM707x1.m703x1().m63051x1(i3, next.m74063kk()) : chartDataWorksheetM707x1.m703x1().m63051x1(next.m74061h4(), i3);
                            if (!chartDataCellM63051x1.isHidden()) {
                                if (iChartCategoryCollection.size() >= i2 + 1) {
                                    iChartCategoryCollection.get_Item(i2).setAsCell(chartDataCellM63051x1);
                                } else {
                                    iChartCategoryCollection.add((IChartDataCell) chartDataCellM63051x1);
                                }
                            }
                            i2++;
                        }
                        for (int i4 = 1; i4 < i; i4++) {
                            int i5 = size;
                            for (int i6 = iM74060du; i6 <= iM74061h4; i6++) {
                                ChartDataCell chartDataCellM63051x12 = z ? chartDataWorksheetM707x1.m703x1().m63051x1(i6, next.m74063kk() - i4) : chartDataWorksheetM707x1.m703x1().m63051x1(next.m74061h4() - i4, i6);
                                if (!chartDataCellM63051x12.isHidden()) {
                                    iChartCategoryCollection.get_Item(i5).getGroupingLevels().setGroupingItem(i4, chartDataCellM63051x12);
                                    i5++;
                                }
                            }
                        }
                        size = iChartCategoryCollection.size();
                    }
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
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7339k4(IChartCategoryCollection iChartCategoryCollection, String str, IChartDataWorkbook iChartDataWorkbook, boolean z) {
        IChartCellCollection cellCollection = iChartDataWorkbook.getCellCollection(str, true);
        int count = cellCollection.getCount();
        if (z) {
            int count2 = cellCollection.getCount() - 1;
            while (true) {
                if (count2 < 0) {
                    break;
                }
                if (cellCollection.get_Item(count2).getValue() != null) {
                    count = count2 + 1;
                    break;
                }
                count2--;
            }
        }
        while (iChartCategoryCollection.size() > cellCollection.getCount()) {
            iChartCategoryCollection.removeAt(iChartCategoryCollection.size() - 1);
        }
        for (int i = 0; i < count; i++) {
            if (i >= iChartCategoryCollection.size()) {
                iChartCategoryCollection.add(cellCollection.get_Item(i));
            } else {
                iChartCategoryCollection.get_Item(i).setAsCell(cellCollection.get_Item(i));
            }
        }
    }
}
