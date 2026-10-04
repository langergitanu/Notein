package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC8986uz;
import com.aspose.slides.internal.p332p7.AbstractC9120wl;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7402cf;
import com.aspose.slides.internal.p332p7.C7626f0;
import com.aspose.slides.internal.p332p7.C7814h1;
import com.aspose.slides.internal.p332p7.C7876hr;
import com.aspose.slides.internal.p332p7.C7935ij;
import com.aspose.slides.internal.p332p7.C8089ki;
import com.aspose.slides.internal.p332p7.C8262mg;
import com.aspose.slides.internal.p332p7.C8294mw;
import com.aspose.slides.internal.p332p7.C8324nc;
import com.aspose.slides.internal.p332p7.C8329nd;
import com.aspose.slides.internal.p332p7.C8555px;
import com.aspose.slides.internal.p332p7.C8557py;
import com.aspose.slides.internal.p332p7.C8578q5;
import com.aspose.slides.internal.p332p7.C8583q7;
import com.aspose.slides.internal.p332p7.C8754sb;
import com.aspose.slides.internal.p332p7.C8806su;
import com.aspose.slides.internal.p332p7.C9001v5;
import com.aspose.slides.internal.p332p7.C9044vi;
import com.aspose.slides.internal.p332p7.C9069vu;
import com.aspose.slides.internal.p332p7.C9099w9;
import com.aspose.slides.internal.p332p7.C9192xf;
import com.aspose.slides.internal.p332p7.C9240xx;
import com.aspose.slides.internal.p332p7.C9311yt;
import com.aspose.slides.internal.p332p7.C9392zq;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p464vq.AbstractC11700af;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p541z6.C13452x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class oen {

    /* JADX INFO: renamed from: k4 */
    static final String[] f47761k4 = {"#DIV/0!", "#NAME?", "#VALUE!", "#NULL!", "#NUM!", "#REF!", "#N/A", "#GETTING_DATA"};

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f47762x1 = new C7017h4("strRef", "v", "multiLvlStrRef", "numRef", "numLit", "strLit");

    /* JADX INFO: renamed from: k4 */
    private static List<String> m68481k4(ChartData chartData) {
        List<String> list = new List<>();
        IGenericEnumerator<IChartSeries> it = chartData.getSeries().iterator();
        while (it.hasNext()) {
            try {
                ChartSeries chartSeries = (ChartSeries) it.next();
                if (!C14113y2.m67411k4(chartSeries.m720ck())) {
                    list.addItem(chartSeries.m720ck());
                }
                ChartDataPointCollection chartDataPointCollection = (ChartDataPointCollection) chartSeries.getDataPoints();
                if (!C14113y2.m67411k4(chartDataPointCollection.m611fa())) {
                    list.addItem(chartDataPointCollection.m611fa());
                }
                if (!C14113y2.m67411k4(chartDataPointCollection.m606ck())) {
                    list.addItem(chartDataPointCollection.m606ck());
                }
                if (!C14113y2.m67411k4(chartDataPointCollection.m615jd())) {
                    list.addItem(chartDataPointCollection.m615jd());
                }
                if (!C14113y2.m67411k4(chartDataPointCollection.m638up())) {
                    list.addItem(chartDataPointCollection.m638up());
                }
                if (!C14113y2.m67411k4(chartDataPointCollection.m644yj())) {
                    list.addItem(chartDataPointCollection.m644yj());
                }
                if (!C14113y2.m67411k4(chartDataPointCollection.m630ks())) {
                    list.addItem(chartDataPointCollection.m630ks());
                }
                if (!C14113y2.m67411k4(chartDataPointCollection.m634rv())) {
                    list.addItem(chartDataPointCollection.m634rv());
                }
                if (!C14113y2.m67411k4(chartDataPointCollection.m643x6())) {
                    list.addItem(chartDataPointCollection.m643x6());
                }
                if (!C14113y2.m67411k4(((DataLabelCollection) C7019kk.m27452k4((Object) chartSeries.getLabels(), DataLabelCollection.class)).m1307k4())) {
                    list.addItem(((DataLabelCollection) C7019kk.m27452k4((Object) chartSeries.getLabels(), DataLabelCollection.class)).m1307k4());
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
        if (chartData.getCategories() != null && !C14113y2.m67411k4(((ChartCategoryCollection) C7019kk.m27452k4((Object) chartData.getCategories(), ChartCategoryCollection.class)).m537kk())) {
            list.addItem(((ChartCategoryCollection) C7019kk.m27452k4((Object) chartData.getCategories(), ChartCategoryCollection.class)).m537kk());
        }
        if (chartData.getSecondaryCategories() != null && !C14113y2.m67411k4(((ChartCategoryCollection) C7019kk.m27452k4((Object) chartData.getSecondaryCategories(), ChartCategoryCollection.class)).m537kk())) {
            list.addItem(((ChartCategoryCollection) C7019kk.m27452k4((Object) chartData.getSecondaryCategories(), ChartCategoryCollection.class)).m537kk());
        }
        list.sort();
        int i = 0;
        while (i < list.size() - 1) {
            if (C14113y2.m67363du(list.get_Item(i), list.get_Item(i + 1))) {
                list.removeAt(i);
                i--;
            }
            i++;
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private static C7814h1 m68482k4(C7814h1[] c7814h1Arr, int i) {
        for (C7814h1 c7814h1 : c7814h1Arr) {
            if ((c7814h1.m33011k4() & 4294967295L) == i) {
                return c7814h1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static C7876hr m68483k4(C7876hr[] c7876hrArr, int i) {
        for (C7876hr c7876hr : c7876hrArr) {
            if ((c7876hr.m33597k4() & 4294967295L) == i) {
                return c7876hr;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static C9069vu m68484k4(C9069vu[] c9069vuArr, int i) {
        for (C9069vu c9069vu : c9069vuArr) {
            if ((c9069vu.m43317k4() & 4294967295L) == i && AbstractC14092to.m67201k4(f47761k4, c9069vu.m43320kk()) < 0) {
                return c9069vu;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static C9099w9 m68485k4(C9099w9[] c9099w9Arr, int i) {
        for (C9099w9 c9099w9 : c9099w9Arr) {
            if ((c9099w9.m43589k4() & 4294967295L) == i) {
                return c9099w9;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m68486k4(C8557py c8557py, C9311yt c9311yt, ChartDataWorkbook chartDataWorkbook) {
        if (c9311yt.m45125du().length == 0 || c9311yt.m45125du()[0].m45275to().length == 0) {
            return "";
        }
        C7876hr[] c7876hrArrM45275to = c9311yt.m45125du()[0].m45275to();
        int iM39197k4 = ((int) c8557py.m39197k4()) + 1;
        int iM33597k4 = (int) c7876hrArrM45275to[c7876hrArrM45275to.length - 1].m33597k4();
        if (iM33597k4 + 1 == 1) {
            String strM63035kk = C13646iq.m63035kk(1, iM39197k4);
            String strM67358c5 = C14113y2.m67358c5(strM63035kk);
            int i = 0;
            while (true) {
                if (i >= strM67358c5.length()) {
                    break;
                }
                if (C14117yj.m67539to(strM63035kk.charAt(i))) {
                    strM67358c5 = C14113y2.m67397k4(strM67358c5, i, "$");
                    break;
                }
                i++;
            }
            return C14113y2.m67402k4("Sheet1!{0}", C14113y2.m67397k4(strM67358c5, 0, "$"));
        }
        String strM63035kk2 = C13646iq.m63035kk(1, iM39197k4);
        String strM67358c52 = C14113y2.m67358c5(strM63035kk2);
        int i2 = 0;
        while (true) {
            if (i2 >= strM67358c52.length()) {
                break;
            }
            if (C14117yj.m67539to(strM63035kk2.charAt(i2))) {
                strM67358c52 = C14113y2.m67397k4(strM67358c52, i2, "$");
                break;
            }
            i2++;
        }
        String strM63035kk3 = C13646iq.m63035kk(iM33597k4 + 1, iM39197k4);
        String strM67358c53 = C14113y2.m67358c5(strM63035kk3);
        int i3 = 0;
        while (true) {
            if (i3 >= strM67358c53.length()) {
                break;
            }
            if (C14117yj.m67539to(strM63035kk3.charAt(i3))) {
                strM67358c53 = C14113y2.m67397k4(strM67358c53, i3, "$");
                break;
            }
            i3++;
        }
        return C14113y2.m67402k4("Sheet1!{0}:{1}", C14113y2.m67397k4(strM67358c52, 0, "$"), C14113y2.m67397k4(strM67358c53, 0, "$"));
    }

    /* JADX INFO: renamed from: k4 */
    private static String m68487k4(C8557py c8557py, C9392zq c9392zq, ChartDataWorkbook chartDataWorkbook) {
        if (c9392zq.m45899du().length == 0 || c9392zq.m45899du()[0].m43121kk().length == 0) {
            return "";
        }
        C7814h1[] c7814h1ArrM43121kk = c9392zq.m45899du()[0].m43121kk();
        int iM33011k4 = (int) c7814h1ArrM43121kk[c7814h1ArrM43121kk.length - 1].m33011k4();
        if (iM33011k4 + 1 == 1) {
            String strM63035kk = C13646iq.m63035kk(1, 0);
            String strM67358c5 = C14113y2.m67358c5(strM63035kk);
            int i = 0;
            while (true) {
                if (i >= strM67358c5.length()) {
                    break;
                }
                if (C14117yj.m67539to(strM63035kk.charAt(i))) {
                    strM67358c5 = C14113y2.m67397k4(strM67358c5, i, "$");
                    break;
                }
                i++;
            }
            return C14113y2.m67402k4("Sheet1!{0}", C14113y2.m67397k4(strM67358c5, 0, "$"));
        }
        String strM63035kk2 = C13646iq.m63035kk(1, 0);
        String strM67358c52 = C14113y2.m67358c5(strM63035kk2);
        int i2 = 0;
        while (true) {
            if (i2 >= strM67358c52.length()) {
                break;
            }
            if (C14117yj.m67539to(strM63035kk2.charAt(i2))) {
                strM67358c52 = C14113y2.m67397k4(strM67358c52, i2, "$");
                break;
            }
            i2++;
        }
        String strM63035kk3 = C13646iq.m63035kk(iM33011k4 + 1, 0);
        String strM67358c53 = C14113y2.m67358c5(strM63035kk3);
        int i3 = 0;
        while (true) {
            if (i3 >= strM67358c53.length()) {
                break;
            }
            if (C14117yj.m67539to(strM63035kk3.charAt(i3))) {
                strM67358c53 = C14113y2.m67397k4(strM67358c53, i3, "$");
                break;
            }
            i3++;
        }
        return C14113y2.m67402k4("Sheet1!{0}:{1}", C14113y2.m67397k4(strM67358c52, 0, "$"), C14113y2.m67397k4(strM67358c53, 0, "$"));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68488k4(ChartDataWorkbook chartDataWorkbook, IChartData iChartData) {
        int i;
        IGenericEnumerator<IChartSeries> it = iChartData.getSeries().iterator();
        while (true) {
            try {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                ChartSeries chartSeries = (ChartSeries) it.next();
                ChartDataPointCollection chartDataPointCollection = (ChartDataPointCollection) chartSeries.getDataPoints();
                if (chartSeries.m723fa() == 0 && chartSeries.getName().getDataSourceType() == 0 && !C14113y2.m67411k4(chartSeries.m720ck())) {
                    IChartCellCollection cellCollection = chartDataWorkbook.getCellCollection(chartSeries.m720ck(), false);
                    if (cellCollection.getCount() > 0) {
                        if (cellCollection.getCount() == chartSeries.f1473k4.size()) {
                            for (int i2 = 0; i2 < cellCollection.getCount(); i2++) {
                                cellCollection.get_Item(i2).setValue(chartSeries.f1473k4.get_Item(i2));
                            }
                        } else {
                            cellCollection.get_Item(0).setValue(chartSeries.m725jd());
                        }
                    }
                }
                if (chartSeries.getDataPoints().getDataSourceTypeForValues() == 0 && !C14113y2.m67411k4(chartDataPointCollection.m611fa())) {
                    IChartCellCollection cellCollection2 = chartDataWorkbook.getCellCollection(chartDataPointCollection.m611fa(), false);
                    int iM67507x1 = C14116yg.m67507x1(cellCollection2.getCount(), chartSeries.getDataPoints().size());
                    for (int i3 = 0; i3 < iM67507x1; i3++) {
                        cellCollection2.get_Item(i3).setValue(((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i3), ChartDataPoint.class)).m579c5().m71989k4());
                    }
                }
                if (chartSeries.getDataPoints().getDataSourceTypeForValues() == 0 && !C14113y2.m67411k4(chartDataPointCollection.m606ck())) {
                    IChartCellCollection cellCollection3 = chartDataWorkbook.getCellCollection(chartDataPointCollection.m606ck(), false);
                    int iM67507x12 = C14116yg.m67507x1(cellCollection3.getCount(), chartSeries.getDataPoints().size());
                    for (int i4 = 0; i4 < iM67507x12; i4++) {
                        cellCollection3.get_Item(i4).setValue(((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i4), ChartDataPoint.class)).m580ck().m71989k4());
                    }
                }
                if (chartSeries.getDataPoints().getDataSourceTypeForValues() == 0 && !C14113y2.m67411k4(chartDataPointCollection.m615jd())) {
                    IChartCellCollection cellCollection4 = chartDataWorkbook.getCellCollection(chartDataPointCollection.m615jd(), false);
                    int iM67507x13 = C14116yg.m67507x1(cellCollection4.getCount(), chartSeries.getDataPoints().size());
                    for (int i5 = 0; i5 < iM67507x13; i5++) {
                        cellCollection4.get_Item(i5).setValue(((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i5), ChartDataPoint.class)).m585jd().m71989k4());
                    }
                }
                if (chartSeries.getDataPoints().getDataSourceTypeForValues() == 0 && !C14113y2.m67411k4(chartDataPointCollection.m638up())) {
                    IChartCellCollection cellCollection5 = chartDataWorkbook.getCellCollection(chartDataPointCollection.m638up(), false);
                    int iM67507x14 = C14116yg.m67507x1(cellCollection5.getCount(), chartSeries.getDataPoints().size());
                    for (int i6 = 0; i6 < iM67507x14; i6++) {
                        cellCollection5.get_Item(i6).setValue(((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i6), ChartDataPoint.class)).m583fa().m71989k4());
                    }
                }
                if (chartSeries.getDataPoints().getDataSourceTypeForValues() == 0 && !C14113y2.m67411k4(chartDataPointCollection.m644yj())) {
                    IChartCellCollection cellCollection6 = chartDataWorkbook.getCellCollection(chartDataPointCollection.m644yj(), false);
                    int iM67507x15 = C14116yg.m67507x1(cellCollection6.getCount(), chartSeries.getDataPoints().size());
                    for (int i7 = 0; i7 < iM67507x15; i7++) {
                        cellCollection6.get_Item(i7).setValue(((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i7), ChartDataPoint.class)).m598up().m71989k4());
                    }
                }
                if (chartSeries.getDataPoints().getDataSourceTypeForValues() == 0 && !C14113y2.m67411k4(chartDataPointCollection.m630ks())) {
                    IChartCellCollection cellCollection7 = chartDataWorkbook.getCellCollection(chartDataPointCollection.m630ks(), false);
                    int iM67507x16 = C14116yg.m67507x1(cellCollection7.getCount(), chartSeries.getDataPoints().size());
                    for (int i8 = 0; i8 < iM67507x16; i8++) {
                        cellCollection7.get_Item(i8).setValue(((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i8), ChartDataPoint.class)).m602yj().m71989k4());
                    }
                }
                if (chartSeries.getDataPoints().getDataSourceTypeForValues() == 0 && !C14113y2.m67411k4(chartDataPointCollection.m634rv())) {
                    IChartCellCollection cellCollection8 = chartDataWorkbook.getCellCollection(chartDataPointCollection.m634rv(), true);
                    int iM67507x17 = C14116yg.m67507x1(cellCollection8.getCount(), chartSeries.getDataPoints().size());
                    for (int i9 = 0; i9 < iM67507x17; i9++) {
                        cellCollection8.get_Item(i9).setValue(((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i9), ChartDataPoint.class)).m592ks().m71989k4());
                    }
                }
                if (chartSeries.getDataPoints().getDataSourceTypeForValues() == 0 && !C14113y2.m67411k4(chartDataPointCollection.m643x6())) {
                    IChartCellCollection cellCollection9 = chartDataWorkbook.getCellCollection(chartDataPointCollection.m643x6(), false);
                    int iM67507x18 = C14116yg.m67507x1(cellCollection9.getCount(), chartSeries.getDataPoints().size());
                    for (int i10 = 0; i10 < iM67507x18; i10++) {
                        cellCollection9.get_Item(i10).setValue(((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i10), ChartDataPoint.class)).m595rv().m71989k4());
                    }
                }
                if (chartSeries.getDataPoints().getDataSourceTypeForValues() == 0 && !C14113y2.m67411k4(chartDataPointCollection.m633ne())) {
                    IChartCellCollection cellCollection10 = chartDataWorkbook.getCellCollection(chartDataPointCollection.m633ne(), false);
                    int iM67507x19 = C14116yg.m67507x1(cellCollection10.getCount(), chartSeries.getDataPoints().size());
                    for (int i11 = 0; i11 < iM67507x19; i11++) {
                        cellCollection10.get_Item(i11).setValue(((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i11), ChartDataPoint.class)).m601x6().m71989k4());
                    }
                }
                if (!C14113y2.m67411k4(((DataLabelCollection) C7019kk.m27452k4((Object) chartSeries.getLabels(), DataLabelCollection.class)).m1307k4())) {
                    List<ChartDataCell> listM678k4 = chartDataWorkbook.m678k4(((DataLabelCollection) C7019kk.m27452k4((Object) chartSeries.getLabels(), DataLabelCollection.class)).m1307k4(), true, true);
                    int iM67507x110 = C14116yg.m67507x1(listM678k4.size(), chartSeries.getLabels().getCount());
                    while (i < iM67507x110) {
                        listM678k4.get_Item(i).setValue(chartSeries.getLabels().get_Item(i).getValueFromCell().getValue());
                        i++;
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
        if (iChartData.getCategories() != null && iChartData.getCategories().size() > 0) {
            ChartCategoryCollection chartCategoryCollection = (ChartCategoryCollection) iChartData.getCategories();
            String strM537kk = chartCategoryCollection.m537kk();
            int groupingLevelCount = chartCategoryCollection.getGroupingLevelCount();
            IChartCellCollection cellCollection11 = chartDataWorkbook.getCellCollection(strM537kk, true);
            if (groupingLevelCount > 1) {
                int i12 = 0;
                for (int i13 = 0; i13 < iChartData.getCategories().size(); i13++) {
                    for (int i14 = groupingLevelCount - 1; i14 >= 0; i14--) {
                        cellCollection11.get_Item(i12).setValue(((ChartCategory) C7019kk.m27452k4((Object) iChartData.getCategories().get_Item(i13), ChartCategory.class)).m526x1().m4305k4(i14));
                        i12++;
                    }
                }
            } else {
                int iM67507x111 = C14116yg.m67507x1(cellCollection11.getCount(), iChartData.getCategories().size());
                for (int i15 = 0; i15 < iM67507x111; i15++) {
                    cellCollection11.get_Item(i15).setValue(((ChartCategory) C7019kk.m27452k4((Object) iChartData.getCategories().get_Item(i15), ChartCategory.class)).m522k4());
                }
            }
        }
        if (iChartData.getSecondaryCategories() == null || iChartData.getSecondaryCategories().size() <= 0 || !iChartData.getSecondaryCategories().getUseCells()) {
            return;
        }
        String strM537kk2 = ((ChartCategoryCollection) iChartData.getSecondaryCategories()).m537kk();
        int groupingLevelCount2 = iChartData.getSecondaryCategories().getGroupingLevelCount();
        IChartCellCollection cellCollection12 = chartDataWorkbook.getCellCollection(strM537kk2, true);
        if (groupingLevelCount2 <= 0) {
            int iM67507x112 = C14116yg.m67507x1(cellCollection12.getCount(), iChartData.getSecondaryCategories().size());
            while (i < iM67507x112) {
                cellCollection12.get_Item(i).setValue(((ChartCategory) C7019kk.m27452k4((Object) iChartData.getSecondaryCategories().get_Item(i), ChartCategory.class)).m522k4());
                iChartData.getSecondaryCategories().get_Item(i).setAsCell(cellCollection12.get_Item(i));
                i++;
            }
            return;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < iChartData.getSecondaryCategories().size(); i17++) {
            for (int i18 = 0; i18 < groupingLevelCount2; i18++) {
                iChartData.getSecondaryCategories().get_Item(i17).getGroupingLevels().setGroupingItem(i18, cellCollection12.get_Item(i16));
                i16++;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68489k4(ChartDataWorkbook chartDataWorkbook, C8578q5 c8578q5) {
        List.Enumerator<C7394ca> it = c8578q5.m39344du().iterator();
        while (it.hasNext()) {
            try {
                m68503k4(((AbstractC8986uz) it.next().m29542x1()).mo28526x1(), chartDataWorkbook);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68490k4(ChartDataWorkbook chartDataWorkbook, C9192xf c9192xf) {
        for (C8557py c8557py : c9192xf.m44324x1().m39945x1()) {
            List.Enumerator<C7394ca> it = c8557py.m39200x1().iterator();
            while (it.hasNext()) {
                try {
                    C7394ca next = it.next();
                    if (C7019kk.m27469x1(next.m29542x1(), C9311yt.class)) {
                        m68499k4(c8557py, chartDataWorkbook, (C9311yt) C7019kk.m27452k4((Object) next.m29542x1(), C9311yt.class));
                    }
                    if (C7019kk.m27469x1(next.m29542x1(), C9392zq.class)) {
                        m68500k4(c8557py, chartDataWorkbook, (C9392zq) C7019kk.m27452k4((Object) next.m29542x1(), C9392zq.class));
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
        for (C8324nc c8324nc : c9192xf.m44321kk().m31298to().m32993x1().m34686to()) {
            m68497k4(c8324nc, chartDataWorkbook);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68491k4(IChart iChart, gnb gnbVar, C8578q5 c8578q5, C9192xf c9192xf) {
        C11709bg[] c11709bgArrM55309k4 = gnbVar.m55338u4() != null ? gnbVar.m55338u4().m55309k4(AbstractC11700af.f39664k4) : null;
        ChartData chartData = (ChartData) iChart.getChartData();
        if (iChart.getChartData().getDataSourceType() == 1) {
            return;
        }
        if (c11709bgArrM55309k4 == null || c11709bgArrM55309k4.length <= 0) {
            ChartDataWorkbook chartDataWorkbook = new ChartDataWorkbook((ChartData) iChart.getChartData());
            if (c8578q5 != null) {
                m68489k4(chartDataWorkbook, c8578q5);
            } else {
                m68490k4(chartDataWorkbook, c9192xf);
            }
            chartData.m553x1().mo5714x1(new C3152yj());
            chartDataWorkbook.m680k4(chartData.m553x1().mo5702dy());
            return;
        }
        chartData.m553x1().mo5714x1(new C3152yj(c11709bgArrM55309k4[0].m55296x1().m55426to()));
        c11709bgArrM55309k4[0].m55296x1().m55422k4(true);
        ((oaj) chartData.m553x1()).m68430k4(C3141rv.m13403k4(c11709bgArrM55309k4[0].m55296x1().m55427x1()));
        String strMo55273k4 = c11709bgArrM55309k4[0].m55296x1().m55372fa().mo55273k4();
        if ("application/vnd.ms-excel.sheet.macroEnabled.12".equals(strMo55273k4)) {
            chartData.m553x1().mo5705k4(1);
        } else if ("application/vnd.ms-excel.sheet.binary.macroEnabled.12".equals(strMo55273k4)) {
            chartData.m553x1().mo5705k4(4);
        } else {
            chartData.m553x1().mo5705k4(0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68492k4(IChart iChart, C3152yj c3152yj) {
        if (c3152yj != null) {
            C13452x1 c13452x1M2388qq = ((Presentation) C7019kk.m27452k4((Object) iChart.getPresentation(), Presentation.class)).m2388qq();
            ((ChartData) iChart.getChartData()).m553x1().mo5709k4(c3152yj, m68481k4((ChartData) iChart.getChartData()), c13452x1M2388qq, InterruptionToken.getNone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68493k4(C7626f0 c7626f0, ChartDataWorkbook chartDataWorkbook) {
        C9099w9 c9099w9M68485k4;
        C8583q7 c8583q7M31515kk = c7626f0.m31515kk();
        if (c8583q7M31515kk == null || c8583q7M31515kk.m39372kk() == null) {
            return;
        }
        C9099w9[] c9099w9ArrM39373to = c8583q7M31515kk.m39373to();
        long jM38332k4 = c8583q7M31515kk.m39372kk().m38332k4() & 4294967295L;
        if (jM38332k4 <= 0 || c9099w9ArrM39373to.length <= 0) {
            return;
        }
        List.Enumerator<C14857yq> it = chartDataWorkbook.m676k4(c7626f0).iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                C14857yq next = it.next();
                ChartDataWorksheet chartDataWorksheetM674k4 = chartDataWorkbook.m674k4(next.m74062k4());
                for (int iM74060du = next.m74060du(); iM74060du <= next.m74061h4(); iM74060du++) {
                    for (int iM74066x1 = next.m74066x1(); iM74066x1 <= next.m74063kk(); iM74066x1++) {
                        if (i < jM38332k4 && (c9099w9M68485k4 = m68485k4(c9099w9ArrM39373to, i)) != null) {
                            chartDataWorksheetM674k4.m703x1().m63051x1(iM74060du, iM74066x1).setValue(c9099w9M68485k4.m43592x1());
                        }
                        i++;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68494k4(C7935ij c7935ij, ChartDataWorkbook chartDataWorkbook) {
        if (c7935ij == null) {
            return;
        }
        int iM27428k4 = f47762x1.m27428k4(c7935ij.m34166du().m29539k4());
        if (iM27428k4 == 0) {
            m68493k4((C7626f0) c7935ij.m34166du().m29542x1(), chartDataWorkbook);
            return;
        }
        if (iM27428k4 == 2) {
            m68498k4((C8555px) c7935ij.m34166du().m29542x1(), chartDataWorkbook);
        } else if (iM27428k4 == 3) {
            m68495k4((C8089ki) c7935ij.m34166du().m29542x1(), chartDataWorkbook);
        } else if (iM27428k4 != 4 && iM27428k4 != 5) {
            throw new ArgumentOutOfRangeException(C14113y2.m67408k4("Unknown element \"", c7935ij.m34166du().m29539k4(), "\""));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68495k4(C8089ki c8089ki, ChartDataWorkbook chartDataWorkbook) {
        C9069vu c9069vuM68484k4;
        C7402cf c7402cfM35404kk = c8089ki.m35404kk();
        if (c7402cfM35404kk == null || c7402cfM35404kk.m29589to() == null) {
            return;
        }
        C9069vu[] c9069vuArrM29584du = c7402cfM35404kk.m29584du();
        long jM38332k4 = c7402cfM35404kk.m29589to().m38332k4() & 4294967295L;
        if (jM38332k4 <= 0 || c9069vuArrM29584du.length <= 0) {
            return;
        }
        String strM29588kk = c7402cfM35404kk.m29588kk();
        List.Enumerator<C14857yq> it = chartDataWorkbook.m677k4(c8089ki).iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                C14857yq next = it.next();
                ChartDataWorksheet chartDataWorksheetM674k4 = chartDataWorkbook.m674k4(next.m74062k4());
                for (int iM74060du = next.m74060du(); iM74060du <= next.m74061h4(); iM74060du++) {
                    for (int iM74066x1 = next.m74066x1(); iM74066x1 <= next.m74063kk(); iM74066x1++) {
                        if (i < jM38332k4 && (c9069vuM68484k4 = m68484k4(c9069vuArrM29584du, i)) != null && !C14113y2.m67411k4(c9069vuM68484k4.m43320kk())) {
                            ChartDataCell chartDataCellM63051x1 = chartDataWorksheetM674k4.m703x1().m63051x1(iM74060du, iM74066x1);
                            chartDataCellM63051x1.setValue(Double.valueOf(C14044b3.m66428k4(c9069vuM68484k4.m43320kk(), C11697x1.m55250kk())));
                            if (!C14113y2.m67411k4(c9069vuM68484k4.m43321x1()) && !C14113y2.m67363du(c9069vuM68484k4.m43321x1(), strM29588kk)) {
                                chartDataCellM63051x1.setCustomNumberFormat(c9069vuM68484k4.m43321x1());
                            }
                        }
                        i++;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68496k4(C8262mg c8262mg, ChartDataWorkbook chartDataWorkbook) {
        if (c8262mg == null) {
            return;
        }
        int iM27428k4 = f47762x1.m27428k4(c8262mg.m36929du().m29539k4());
        if (iM27428k4 == 3) {
            m68495k4((C8089ki) c8262mg.m36929du().m29542x1(), chartDataWorkbook);
        } else if (iM27428k4 != 4) {
            throw new ArgumentOutOfRangeException(C14113y2.m67408k4("Unknown element \"", c8262mg.m36929du().m29539k4(), "\""));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68497k4(C8324nc c8324nc, ChartDataWorkbook chartDataWorkbook) {
        C8294mw c8294mwM37381dy = c8324nc.m37381dy();
        if (c8294mwM37381dy == null) {
            return;
        }
        if (!"txData".equals(c8294mwM37381dy.m37149k4().m29539k4())) {
            throw new Exception(C14113y2.m67408k4("Unknown element \"", c8294mwM37381dy.m37149k4().m29539k4(), "\""));
        }
        List<C14857yq> listM686kk = chartDataWorkbook.m686kk(((C8754sb) C7019kk.m27452k4((Object) c8294mwM37381dy.m37149k4().m29542x1(), C8754sb.class)).m40878k4().m36437k4());
        if (listM686kk.size() == 0) {
            String strM63035kk = C13646iq.m63035kk(0, ((int) c8324nc.m37399up().m39315k4()) + 1);
            String strM67358c5 = C14113y2.m67358c5(strM63035kk);
            int i = 0;
            while (true) {
                if (i >= strM67358c5.length()) {
                    break;
                }
                if (C14117yj.m67539to(strM63035kk.charAt(i))) {
                    strM67358c5 = C14113y2.m67397k4(strM67358c5, i, "$");
                    break;
                }
                i++;
            }
            listM686kk = chartDataWorkbook.m686kk(C14113y2.m67402k4("Sheet1!{0}", C14113y2.m67397k4(strM67358c5, 0, "$")));
        }
        chartDataWorkbook.m674k4(listM686kk.get_Item(0).m74062k4()).m703x1().m63051x1(listM686kk.get_Item(0).m74060du(), listM686kk.get_Item(0).m74066x1()).setValue(((C8754sb) C7019kk.m27452k4((Object) c8294mwM37381dy.m37149k4().m29542x1(), C8754sb.class)).m40881x1());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68498k4(C8555px c8555px, ChartDataWorkbook chartDataWorkbook) {
        C9240xx c9240xxM39182kk;
        if (c8555px == null || (c9240xxM39182kk = c8555px.m39182kk()) == null || c9240xxM39182kk.m44702kk() == null) {
            return;
        }
        C8329nd[] c8329ndArrM44703to = c9240xxM39182kk.m44703to();
        if ((c9240xxM39182kk.m44702kk().m38332k4() & 4294967295L) <= 0 || c8329ndArrM44703to.length <= 0) {
            return;
        }
        int length = c8329ndArrM44703to.length;
        C9099w9[][] c9099w9Arr = new C9099w9[length][];
        for (int i = 0; i < length; i++) {
            c9099w9Arr[i] = c8329ndArrM44703to[i].m37428x1();
        }
        List.Enumerator<C14857yq> it = chartDataWorkbook.m686kk(c8555px.m39184x1()).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            try {
                C14857yq next = it.next();
                if (next.m74064m9() == c8329ndArrM44703to.length || next.m74065to() == c8329ndArrM44703to.length) {
                    ChartDataWorksheet chartDataWorksheetM674k4 = chartDataWorkbook.m674k4(next.m74062k4());
                    boolean z = next.m74065to() == c8329ndArrM44703to.length;
                    int iM74061h4 = z ? next.m74061h4() : next.m74063kk();
                    for (int iM74060du = z ? next.m74060du() : next.m74066x1(); iM74060du <= iM74061h4; iM74060du++) {
                        for (int i3 = 0; i3 < length; i3++) {
                            C9099w9 c9099w9M68485k4 = m68485k4(c9099w9Arr[i3], i2);
                            if (c9099w9M68485k4 != null) {
                                (z ? chartDataWorksheetM674k4.m703x1().m63051x1(iM74060du, next.m74063kk() - i3) : chartDataWorksheetM674k4.m703x1().m63051x1(next.m74061h4() - i3, iM74060du)).setValue(c9099w9M68485k4.m43592x1());
                            }
                        }
                        i2++;
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
    private static void m68499k4(C8557py c8557py, ChartDataWorkbook chartDataWorkbook, C9311yt c9311yt) {
        C7876hr c7876hrM68483k4;
        if (c9311yt == null) {
            return;
        }
        if (c9311yt.m45130to() == null) {
            c9311yt.m45126k4().m36438k4(C14113y2.f47374k4);
        }
        List<C14857yq> listM686kk = chartDataWorkbook.m686kk(c9311yt.m45130to().m36437k4());
        if (listM686kk.size() == 0) {
            c9311yt.m45130to().m36438k4(m68486k4(c8557py, c9311yt, chartDataWorkbook));
            listM686kk = chartDataWorkbook.m686kk(c9311yt.m45130to().m36437k4());
        }
        int i = 0;
        long jM45276x1 = c9311yt.m45125du()[0].m45276x1();
        C7876hr[] c7876hrArrM45275to = c9311yt.m45125du()[0].m45275to();
        List.Enumerator<C14857yq> it = listM686kk.iterator();
        while (it.hasNext()) {
            try {
                C14857yq next = it.next();
                ChartDataWorksheet chartDataWorksheetM674k4 = chartDataWorkbook.m674k4(next.m74062k4());
                for (int iM74060du = next.m74060du(); iM74060du <= next.m74061h4(); iM74060du++) {
                    for (int iM74066x1 = next.m74066x1(); iM74066x1 <= next.m74063kk(); iM74066x1++) {
                        if (i < (4294967295L & jM45276x1) && (c7876hrM68483k4 = m68483k4(c7876hrArrM45275to, i)) != null) {
                            chartDataWorksheetM674k4.m703x1().m63051x1(iM74060du, iM74066x1).setValue(Double.valueOf(C14044b3.m66428k4(c7876hrM68483k4.m33600x1(), C11697x1.m55250kk())));
                        }
                        i++;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68500k4(C8557py c8557py, ChartDataWorkbook chartDataWorkbook, C9392zq c9392zq) {
        List.Enumerator<C14857yq> it;
        C7814h1 c7814h1M68482k4;
        if (c9392zq == null) {
            return;
        }
        if (c9392zq.m45904to() == null && c9392zq.m45899du().length > 0) {
            c9392zq.m45900k4();
            c9392zq.m45904to().m36438k4(C14113y2.f47374k4);
        }
        List<C14857yq> listM686kk = chartDataWorkbook.m686kk(c9392zq.m45904to().m36437k4());
        if (listM686kk.size() == 0) {
            c9392zq.m45904to().m36438k4(m68487k4(c8557py, c9392zq, chartDataWorkbook));
            listM686kk = chartDataWorkbook.m686kk(c9392zq.m45904to().m36437k4());
        }
        boolean z = true;
        if (c9392zq.m45899du().length <= 1) {
            C7814h1[] c7814h1ArrM43121kk = c9392zq.m45899du()[0].m43121kk();
            long jM43122x1 = c9392zq.m45899du()[0].m43122x1();
            it = listM686kk.iterator();
            int i = 0;
            while (it.hasNext()) {
                try {
                    C14857yq next = it.next();
                    ChartDataWorksheet chartDataWorksheetM674k4 = chartDataWorkbook.m674k4(next.m74062k4());
                    for (int iM74060du = next.m74060du(); iM74060du <= next.m74061h4(); iM74060du++) {
                        for (int iM74066x1 = next.m74066x1(); iM74066x1 <= next.m74063kk(); iM74066x1++) {
                            if (i < (4294967295L & jM43122x1) && (c7814h1M68482k4 = m68482k4(c7814h1ArrM43121kk, i)) != null) {
                                chartDataWorksheetM674k4.m703x1().m63051x1(iM74060du, iM74066x1).setValue(c7814h1M68482k4.m33014x1());
                            }
                            i++;
                        }
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
                return;
            }
            return;
        }
        C9044vi[] c9044viArrM45899du = c9392zq.m45899du();
        int length = c9044viArrM45899du.length;
        C7814h1[][] c7814h1Arr = new C7814h1[length][];
        for (int i2 = 0; i2 < length; i2++) {
            c7814h1Arr[i2] = c9044viArrM45899du[i2].m43121kk();
        }
        it = listM686kk.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            try {
                C14857yq next2 = it.next();
                ChartDataWorksheet chartDataWorksheetM674k42 = chartDataWorkbook.m674k4(next2.m74062k4());
                boolean z2 = next2.m74065to() == c9044viArrM45899du.length ? z : false;
                int iM74060du2 = z2 ? next2.m74060du() : next2.m74066x1();
                int iM74061h4 = z2 ? next2.m74061h4() : next2.m74063kk();
                while (iM74060du2 <= iM74061h4) {
                    for (int i4 = 0; i4 < length; i4++) {
                        C7814h1 c7814h1M68482k42 = m68482k4(c7814h1Arr[i4], i3);
                        if (c7814h1M68482k42 != null) {
                            (z2 ? chartDataWorksheetM674k42.m703x1().m63051x1(iM74060du2, next2.m74063kk() - i4) : chartDataWorksheetM674k42.m703x1().m63051x1(next2.m74061h4() - i4, iM74060du2)).setValue(c7814h1M68482k42.m33014x1());
                        }
                    }
                    i3++;
                    iM74060du2++;
                    z = true;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68501k4(C9001v5 c9001v5, ChartDataWorkbook chartDataWorkbook) {
        if (c9001v5 == null) {
            return;
        }
        int iM27428k4 = f47762x1.m27428k4(c9001v5.m42725k4().m29539k4());
        if (iM27428k4 == 0) {
            m68493k4((C7626f0) c9001v5.m42725k4().m29542x1(), chartDataWorkbook);
        } else if (iM27428k4 != 1) {
            throw new ArgumentOutOfRangeException(C14113y2.m67408k4("Unknown element \"", c9001v5.m42725k4().m29539k4(), "\""));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68502k4(C8806su[] c8806suArr, ChartDataWorkbook chartDataWorkbook) {
        if (c8806suArr == null) {
            return;
        }
        for (C8806su c8806su : c8806suArr) {
            m68496k4(c8806su.m41311fa(), chartDataWorkbook);
            m68496k4(c8806su.m41308ck(), chartDataWorkbook);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m68503k4(AbstractC9120wl[] abstractC9120wlArr, ChartDataWorkbook chartDataWorkbook) {
        for (AbstractC9120wl abstractC9120wl : abstractC9120wlArr) {
            m68501k4(abstractC9120wl.mo30767m9(), chartDataWorkbook);
            m68494k4(abstractC9120wl.aG_(), chartDataWorkbook);
            m68494k4(abstractC9120wl.aB_(), chartDataWorkbook);
            m68496k4(abstractC9120wl.aC_(), chartDataWorkbook);
            m68496k4(abstractC9120wl.aH_(), chartDataWorkbook);
            m68496k4(abstractC9120wl.aL_(), chartDataWorkbook);
            if (abstractC9120wl.mo30755ar() != null) {
                m68502k4(abstractC9120wl.mo30755ar(), chartDataWorkbook);
            } else if (abstractC9120wl.mo43745um() != null) {
                m68502k4(new C8806su[]{abstractC9120wl.mo43745um()}, chartDataWorkbook);
            }
        }
    }
}
