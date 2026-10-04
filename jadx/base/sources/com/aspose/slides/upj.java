package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class upj extends AbstractC14770x9 {

    /* JADX INFO: renamed from: du */
    private final double f49354du;

    /* JADX INFO: renamed from: h4 */
    private final double f49355h4;

    /* JADX INFO: renamed from: k4 */
    private final C13847mr f49356k4;

    /* JADX INFO: renamed from: kk */
    private final List<C0886d8> f49357kk;

    /* JADX INFO: renamed from: to */
    private double f49358to;

    /* JADX INFO: renamed from: x1 */
    private final List<C0886d8> f49359x1;

    public upj(C13847mr c13847mr) {
        this.f49356k4 = c13847mr;
        List<C0886d8> list = new List<>();
        this.f49359x1 = list;
        List<C0886d8> list2 = new List<>();
        this.f49357kk = list2;
        int pieSplitBy = c13847mr.m64945h4().getPieSplitBy();
        if (pieSplitBy == 1) {
            m71740k4(c13847mr.m64944dy(), c13847mr.m64945h4().getParentSeriesGroup().getPieSplitCustomPoints());
        } else if (pieSplitBy == 2) {
            m71742k4(c13847mr.m64944dy(), c13847mr.m64945h4().getPieSplitPosition());
        } else if (pieSplitBy == 3) {
            m71743k4(c13847mr.m64944dy(), C7019kk.m27462to(Double.valueOf(c13847mr.m64945h4().getPieSplitPosition()), 14));
        } else if (pieSplitBy != 4) {
            m71741k4(c13847mr.m64944dy());
        } else {
            m71744x1(c13847mr.m64944dy(), c13847mr.m64945h4().getPieSplitPosition());
        }
        list.insertItem(0, m71739k4(c13847mr, eca.m5402k4(list2)));
        double dM5402k4 = eca.m5402k4(list);
        this.f49355h4 = dM5402k4;
        double dM4989k4 = list.size() == 1 ? 0.0d : (list.get_Item(0).m4989k4() / dM5402k4) * 180.0d;
        double d = 90.0d - dM4989k4;
        this.f49358to = d;
        if (d < 0.0d) {
            this.f49358to = d + 360.0d;
        }
        this.f49354du = (dM4989k4 + 90.0d) % 360.0d;
    }

    /* JADX INFO: renamed from: k4 */
    private static C0886d8 m71739k4(C13847mr c13847mr, double d) {
        int size = c13847mr.m64944dy().size();
        C0886d8 c0886d8 = size >= c13847mr.m64945h4().getDataPoints().size() ? new C0886d8(null, c13847mr) : new C0886d8((ChartDataPoint) c13847mr.m64945h4().getDataPoints().get_Item(size), c13847mr);
        c13847mr.m64944dy().addItem(c0886d8);
        c0886d8.m4990k4(d);
        return c0886d8;
    }

    /* JADX INFO: renamed from: x1 */
    private void m71744x1(List<C0886d8> list, double d) {
        List.Enumerator<C0886d8> it = list.iterator();
        while (it.hasNext()) {
            try {
                C0886d8 next = it.next();
                (next.m4989k4() < d ? this.f49357kk : this.f49359x1).addItem(next);
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

    /* JADX INFO: renamed from: c5 */
    public final double m71745c5() {
        return this.f49354du;
    }

    /* JADX INFO: renamed from: ck */
    public final C13847mr m71746ck() {
        return this.f49356k4;
    }

    /* JADX INFO: renamed from: dy */
    public final double m71747dy() {
        return this.f49358to;
    }

    /* JADX INFO: renamed from: jd */
    public final double m71748jd() {
        return this.f49355h4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C0886d8[] m71750m9() {
        return this.f49357kk.toArray(new C0886d8[0]);
    }

    /* JADX INFO: renamed from: to */
    public final C0886d8[] m71751to() {
        return this.f49359x1.toArray(new C0886d8[0]);
    }

    /* JADX INFO: renamed from: k4 */
    private void m71740k4(IGenericEnumerable<C0886d8> iGenericEnumerable, IPieSplitCustomPointCollection iPieSplitCustomPointCollection) {
        IGenericEnumerator<C0886d8> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            try {
                C0886d8 next = it.next();
                (!iPieSplitCustomPointCollection.containsItem(next.m4988jd()) ? this.f49359x1 : this.f49357kk).addItem(next);
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
    private void m71741k4(List<C0886d8> list) {
        int size = list.size();
        m71743k4(list, (size / 3) + (size % 3 > 0 ? 1 : 0));
    }

    /* JADX INFO: renamed from: k4 */
    private void m71742k4(List<C0886d8> list, double d) {
        double dM5402k4 = eca.m5402k4(list);
        double d2 = d / 100.0d;
        List.Enumerator<C0886d8> it = list.iterator();
        while (it.hasNext()) {
            try {
                C0886d8 next = it.next();
                (next.m4989k4() / dM5402k4 < d2 ? this.f49357kk : this.f49359x1).addItem(next);
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
    private void m71743k4(List<C0886d8> list, int i) {
        int size = list.size() - i;
        int i2 = 0;
        int iM67483k4 = C14116yg.m67483k4(0, size);
        while (i2 < list.size()) {
            (i2 < iM67483k4 ? this.f49359x1 : this.f49357kk).addItem(list.get_Item(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71749k4(eh0 eh0Var, C12025x6[] c12025x6Arr, C12025x6[] c12025x6Arr2) {
        C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
        c12025x6Clone.CloneTo(c12025x6Arr2[0]);
        c12025x6Clone.CloneTo(c12025x6Arr[0]);
        float fM56895kk = Float.MAX_VALUE;
        float fM56895kk2 = -3.4028235E38f;
        for (C12025x6 c12025x6 : eh0Var.m5531k4(1.0d, 1.0d, 5).m63357k4()) {
            if (c12025x6.m56895kk() < fM56895kk) {
                fM56895kk = c12025x6.m56895kk();
                c12025x6.CloneTo(c12025x6Arr[0]);
            }
            if (c12025x6.m56895kk() > fM56895kk2) {
                fM56895kk2 = c12025x6.m56895kk();
                c12025x6.CloneTo(c12025x6Arr2[0]);
            }
        }
    }
}
