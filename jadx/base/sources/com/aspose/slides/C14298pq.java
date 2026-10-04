package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7814h1;
import com.aspose.slides.internal.p332p7.C7876hr;
import com.aspose.slides.internal.p332p7.C8212lu;
import com.aspose.slides.internal.p332p7.C8324nc;
import com.aspose.slides.internal.p332p7.C8557py;
import com.aspose.slides.internal.p332p7.C9044vi;
import com.aspose.slides.internal.p332p7.C9192xf;
import com.aspose.slides.internal.p332p7.C9311yt;
import com.aspose.slides.internal.p332p7.C9326yy;
import com.aspose.slides.internal.p332p7.C9392zq;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.pq */
/* JADX INFO: loaded from: classes3.dex */
class C14298pq {
    /* JADX INFO: renamed from: k4 */
    public static C9311yt m69185k4(IGenericEnumerable<C7394ca> iGenericEnumerable) {
        IGenericEnumerator<C7394ca> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                C9311yt c9311yt = (C9311yt) C7019kk.m27452k4((Object) it.next().m29542x1(), C9311yt.class);
                if (c9311yt != null && c9311yt.m45129kk() == 5) {
                    return c9311yt;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public static C9392zq m69190x1(IGenericEnumerable<C7394ca> iGenericEnumerable) {
        IGenericEnumerator<C7394ca> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                C9392zq c9392zq = (C9392zq) C7019kk.m27452k4((Object) it.next().m29542x1(), C9392zq.class);
                if (c9392zq != null && c9392zq.m45903kk() == 1) {
                    return c9392zq;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69186k4(ChartCategoryCollection chartCategoryCollection, C8324nc c8324nc, C9192xf c9192xf) {
        List<C7394ca> listM63854k4 = C13728kh.m63854k4(c8324nc, c9192xf.m44324x1());
        if (listM63854k4 == null) {
            return;
        }
        C9392zq c9392zqM69190x1 = m69190x1(listM63854k4);
        if (c9392zqM69190x1 != null) {
            m69189k4(chartCategoryCollection, c9392zqM69190x1);
            return;
        }
        C9311yt c9311ytM69185k4 = m69185k4(listM63854k4);
        if (c9311ytM69185k4 == null) {
            return;
        }
        m69188k4(chartCategoryCollection, c9311ytM69185k4);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m69191x1(ChartCategoryCollection chartCategoryCollection, C9311yt c9311yt) {
        c9311yt.m45127k4(5);
        C8212lu c8212lu = new C8212lu();
        c8212lu.m36438k4(chartCategoryCollection.m529du());
        c9311yt.m45128k4(c8212lu);
        for (int i = 0; i < chartCategoryCollection.getGroupingLevelCount(); i++) {
            C9326yy c9326yyM45131x1 = c9311yt.m45131x1();
            c9326yyM45131x1.m45272k4(((long) chartCategoryCollection.size()) & 4294967295L);
            for (int i2 = 0; i2 < chartCategoryCollection.size(); i2++) {
                IChartDataCell iChartDataCell = chartCategoryCollection.get_Item(i2).getGroupingLevels().get_Item(i);
                if (iChartDataCell != null && iChartDataCell.getValue() != null) {
                    C7876hr c7876hrM45271k4 = c9326yyM45131x1.m45271k4();
                    c7876hrM45271k4.m33598k4(((long) i2) & 4294967295L);
                    c7876hrM45271k4.m33599k4(C14080ne.m66987ks(iChartDataCell.getValue(), C11697x1.m55250kk()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69187k4(ChartCategoryCollection chartCategoryCollection, C8557py c8557py) {
        if (chartCategoryCollection.size() == 0) {
            return;
        }
        if (chartCategoryCollection.m539x1()) {
            m69191x1(chartCategoryCollection, (C9311yt) c8557py.m39198k4("numDim").m29542x1());
        } else {
            m69192x1(chartCategoryCollection, (C9392zq) c8557py.m39198k4("strDim").m29542x1());
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m69192x1(ChartCategoryCollection chartCategoryCollection, C9392zq c9392zq) {
        c9392zq.m45901k4(1);
        C8212lu c8212lu = new C8212lu();
        c8212lu.m36438k4(chartCategoryCollection.m529du());
        c9392zq.m45902k4(c8212lu);
        for (int i = 0; i < chartCategoryCollection.getGroupingLevelCount(); i++) {
            C9044vi c9044viM45905x1 = c9392zq.m45905x1();
            c9044viM45905x1.m43120k4(((long) chartCategoryCollection.size()) & 4294967295L);
            for (int i2 = 0; i2 < chartCategoryCollection.size(); i2++) {
                IChartDataCell iChartDataCell = chartCategoryCollection.get_Item(i2).getGroupingLevels().get_Item(i);
                if (iChartDataCell != null && iChartDataCell.getValue() != null) {
                    C7814h1 c7814h1M43119k4 = c9044viM45905x1.m43119k4();
                    c7814h1M43119k4.m33012k4(((long) i2) & 4294967295L);
                    c7814h1M43119k4.m33013k4(C14080ne.m66987ks(iChartDataCell.getValue(), C11697x1.m55250kk()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69188k4(ChartCategoryCollection chartCategoryCollection, C9311yt c9311yt) {
        chartCategoryCollection.setUseCells(true);
        chartCategoryCollection.m535k4(c9311yt.m45130to().m36437k4());
        chartCategoryCollection.clear();
        int i = 0;
        for (int i2 = 0; i2 < c9311yt.m45125du().length; i2++) {
            if ((c9311yt.m45125du()[i2].m45276x1() & 4294967295L) > 0) {
                i++;
            }
        }
        int iM67483k4 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            iM67483k4 = C14116yg.m67483k4(iM67483k4, (int) c9311yt.m45125du()[i3].m45276x1());
        }
        for (int i4 = 0; i4 < iM67483k4; i4++) {
            ChartCategory chartCategoryM531k4 = chartCategoryCollection.m531k4((Object) null);
            for (int i5 = 1; i5 < i; i5++) {
                chartCategoryM531k4.m526x1().m4306k4(i5, null);
            }
        }
        for (int i6 = 0; i6 < i; i6++) {
            for (C7876hr c7876hr : c9311yt.m45125du()[i6].m45275to()) {
                ((ChartCategory) chartCategoryCollection.get_Item((int) c7876hr.m33597k4())).m526x1().m4306k4(i6, c7876hr.m33600x1());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69189k4(ChartCategoryCollection chartCategoryCollection, C9392zq c9392zq) {
        chartCategoryCollection.setUseCells(true);
        chartCategoryCollection.m535k4(c9392zq.m45904to().m36437k4());
        chartCategoryCollection.clear();
        int i = 0;
        for (int i2 = 0; i2 < c9392zq.m45899du().length; i2++) {
            if ((c9392zq.m45899du()[i2].m43122x1() & 4294967295L) > 0) {
                i++;
            }
        }
        int iM67483k4 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            iM67483k4 = C14116yg.m67483k4(iM67483k4, (int) c9392zq.m45899du()[i3].m43122x1());
        }
        for (int i4 = 0; i4 < iM67483k4; i4++) {
            ChartCategory chartCategoryM531k4 = chartCategoryCollection.m531k4((Object) null);
            for (int i5 = 1; i5 < i; i5++) {
                chartCategoryM531k4.m526x1().m4306k4(i5, null);
            }
        }
        for (int i6 = 0; i6 < i; i6++) {
            for (C7814h1 c7814h1 : c9392zq.m45899du()[i6].m43121kk()) {
                ((ChartCategory) chartCategoryCollection.get_Item((int) c7814h1.m33011k4())).m526x1().m4306k4(i6, c7814h1.m33014x1());
            }
        }
        if (((ChartCategory) chartCategoryCollection.get_Item(0)).m526x1().m4304k4() == 0) {
            ((ChartCategory) chartCategoryCollection.get_Item(0)).m526x1().m4306k4(0, null);
        }
    }
}
