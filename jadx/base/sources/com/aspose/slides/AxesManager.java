package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C9218xn;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class AxesManager extends DomObject<Chart> implements IAxesManager {

    /* JADX INFO: renamed from: c5 */
    private boolean f967c5;

    /* JADX INFO: renamed from: ck */
    private boolean f968ck;

    /* JADX INFO: renamed from: du */
    private Axis f969du;

    /* JADX INFO: renamed from: dy */
    private boolean f970dy;

    /* JADX INFO: renamed from: fa */
    private boolean f971fa;

    /* JADX INFO: renamed from: jd */
    private boolean f972jd;

    /* JADX INFO: renamed from: k4 */
    private C9218xn f973k4;

    /* JADX INFO: renamed from: kk */
    private Axis f974kk;

    /* JADX INFO: renamed from: m9 */
    private Axis f975m9;

    /* JADX INFO: renamed from: to */
    private Axis f976to;

    /* JADX INFO: renamed from: x1 */
    private Axis f977x1;

    public AxesManager(Chart chart) {
        super(chart);
    }

    /* JADX INFO: renamed from: du */
    private void m306du() {
        Axis axis = new Axis(this);
        this.f974kk = axis;
        axis.setPosition(3);
        Axis axis2 = new Axis(this);
        this.f969du = axis2;
        axis2.setPosition(2);
        m308k4(this.f969du, this.f974kk);
    }

    @Override // com.aspose.slides.IAxesManager
    public final IAxis getHorizontalAxis() {
        if (!this.f970dy) {
            return null;
        }
        if (this.f977x1 == null) {
            Axis axis = new Axis(this);
            this.f977x1 = axis;
            axis.setPosition(0);
        }
        return this.f977x1;
    }

    @Override // com.aspose.slides.IAxesManager
    public final IAxis getSecondaryHorizontalAxis() {
        if (!this.f967c5) {
            return null;
        }
        if (this.f974kk == null) {
            m306du();
        }
        return this.f974kk;
    }

    @Override // com.aspose.slides.IAxesManager
    public final IAxis getSecondaryVerticalAxis() {
        if (!this.f968ck) {
            return null;
        }
        if (this.f969du == null) {
            m306du();
        }
        return this.f969du;
    }

    @Override // com.aspose.slides.IAxesManager
    public final IAxis getSeriesAxis() {
        if (!this.f971fa) {
            return null;
        }
        if (this.f975m9 == null) {
            this.f975m9 = new Axis(this);
        }
        return this.f975m9;
    }

    @Override // com.aspose.slides.IAxesManager
    public final IAxis getVerticalAxis() {
        if (!this.f972jd) {
            return null;
        }
        if (this.f976to == null) {
            Axis axis = new Axis(this);
            this.f976to = axis;
            axis.setPosition(1);
        }
        return this.f976to;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final Chart m312k4() {
        return (Chart) this.f2127h4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m315kk() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        IChartSeriesCollection series = m312k4().getChartData().getSeries();
        if (series.size() == 1 || series.size() == 0) {
            switch (ChartTypeCharacterizer.m762k4(m312k4().getType())) {
                case 0:
                    m309k4(false, false, false, false, false);
                    return;
                case 1:
                    m309k4(false, false, true, false, false);
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                    m309k4(true, false, true, false, m316to() != null);
                    m308k4(getHorizontalAxis(), getVerticalAxis());
                    return;
                case 6:
                    m309k4(true, false, true, false, true);
                    m308k4(getHorizontalAxis(), getVerticalAxis());
                    return;
                case 8:
                    m309k4(true, false, false, true, false);
                    return;
                default:
                    throw new Exception();
            }
        }
        if (series.size() > 1) {
            List<Integer> list = new List<>();
            List<Integer> list2 = new List<>();
            IGenericEnumerator<IChartSeries> it = series.iterator();
            while (it.hasNext()) {
                try {
                    ChartSeries chartSeries = (ChartSeries) it.next();
                    int iM762k4 = ChartTypeCharacterizer.m762k4(chartSeries.getType());
                    if (!chartSeries.getPlotOnSecondAxis() && !list.containsItem(Integer.valueOf(iM762k4))) {
                        list.addItem(Integer.valueOf(iM762k4));
                    }
                    if (chartSeries.getPlotOnSecondAxis() && !list2.containsItem(Integer.valueOf(iM762k4))) {
                        list2.addItem(Integer.valueOf(iM762k4));
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
            if (list.size() != 0) {
                C14093tq<Integer> c14093tqClone = m307k4(list).Clone();
                if (C14093tq.m67295k4(c14093tqClone, null)) {
                    throw new ArgumentException("Unsupported primary axis composition");
                }
                switch (c14093tqClone.m67297k4().intValue()) {
                    case 0:
                        z = false;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                        m309k4(z3, z4, z5, z, z2);
                        break;
                    case 1:
                        z = false;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        z5 = true;
                        m309k4(z3, z4, z5, z, z2);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 7:
                        z2 = m316to() != null;
                        z3 = true;
                        z4 = false;
                        z5 = true;
                        z = false;
                        m309k4(z3, z4, z5, z, z2);
                        break;
                    case 6:
                        z = false;
                        z2 = true;
                        z3 = true;
                        z4 = false;
                        z5 = true;
                        m309k4(z3, z4, z5, z, z2);
                        break;
                    default:
                        throw new Exception();
                }
            }
            if (list2.size() != 0) {
                C14093tq<Integer> c14093tqClone2 = m307k4(list2).Clone();
                if (C14093tq.m67295k4(c14093tqClone2, null)) {
                    throw new ArgumentException("Unsupported secondary axis composition");
                }
                int iIntValue = c14093tqClone2.m67297k4().intValue();
                if (iIntValue != 0) {
                    if (iIntValue == 8) {
                        m310x1(true, false, false, true, false);
                        return;
                    }
                    if (iIntValue == 2 || iIntValue == 3 || iIntValue == 4 || iIntValue == 5) {
                        m310x1(false, true, false, true, false);
                    } else {
                        if (iIntValue == 6) {
                            throw new Exception();
                        }
                        throw new Exception();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    public final C9218xn m316to() {
        return this.f973k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m317x1() {
        m312k4().m503ck();
        m315kk();
    }

    /* JADX INFO: renamed from: k4 */
    private C14093tq<Integer> m307k4(List<Integer> list) {
        if (list.size() == 0) {
            throw new Exception();
        }
        while (list.size() > 1) {
            if (!m311x1(list)) {
                return new C14093tq<>();
            }
        }
        return new C14093tq<>(list.get_Item(0));
    }

    /* JADX INFO: renamed from: x1 */
    private void m310x1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (z) {
            this.f970dy = true;
        }
        if (z2) {
            this.f967c5 = true;
        }
        if (z3) {
            this.f972jd = true;
        }
        if (z4) {
            this.f968ck = true;
        }
        if (z5) {
            this.f971fa = true;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m308k4(IAxis iAxis, IAxis iAxis2) {
        if (iAxis == null || iAxis2 == null) {
            return;
        }
        C14252ou c14252ouM319k4 = ((Axis) iAxis).m319k4();
        C14252ou c14252ouM319k42 = ((Axis) iAxis2).m319k4();
        c14252ouM319k4.m68852to(c14252ouM319k42.m68836dy());
        c14252ouM319k42.m68852to(c14252ouM319k4.m68836dy());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[PHI: r7
      0x0037: PHI (r7v2 int) = (r7v1 int), (r7v1 int), (r7v0 int), (r7v0 int) binds: [B:21:0x0049, B:19:0x0045, B:14:0x0035, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m311x1(List<Integer> list) {
        if (list.size() == 0 || list.size() == 1) {
            throw new ArgumentException();
        }
        int size = list.size();
        int i = size - 2;
        int iIntValue = list.get_Item(i).intValue();
        int i2 = size - 1;
        Integer num = list.get_Item(i2);
        int iIntValue2 = num.intValue();
        if (iIntValue != iIntValue2 && iIntValue2 != 0) {
            int i3 = 2;
            if ((iIntValue != 2 || iIntValue2 != 5) && (iIntValue2 != 2 || iIntValue != 5)) {
                i3 = 4;
                if ((iIntValue == 4 && iIntValue2 == 5) || (iIntValue2 == 4 && iIntValue == 5)) {
                    list.set_Item(i, Integer.valueOf(i3));
                } else {
                    if (iIntValue != 0) {
                        return false;
                    }
                    list.set_Item(i, num);
                }
            }
        }
        list.removeAt(i2);
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m313k4(C9218xn c9218xn) {
        this.f973k4 = c9218xn;
    }

    /* JADX INFO: renamed from: k4 */
    private void m309k4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f970dy = z;
        this.f967c5 = z2;
        this.f972jd = z3;
        this.f968ck = z4;
        this.f971fa = z5;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m314k4(int i, boolean z) {
        C14093tq<Integer> c14093tqM307k4;
        IChartSeriesCollection series = m312k4().getChartData().getSeries();
        if (series.size() == 0) {
            return true;
        }
        List<Integer> list = new List<>();
        List<Integer> list2 = new List<>();
        IGenericEnumerator<IChartSeries> it = series.iterator();
        while (it.hasNext()) {
            try {
                ChartSeries chartSeries = (ChartSeries) it.next();
                int iM762k4 = ChartTypeCharacterizer.m762k4(chartSeries.getType());
                if (!chartSeries.getPlotOnSecondAxis() && !list.containsItem(Integer.valueOf(iM762k4))) {
                    list.addItem(Integer.valueOf(iM762k4));
                }
                if (chartSeries.getPlotOnSecondAxis() && !list2.containsItem(Integer.valueOf(iM762k4))) {
                    list2.addItem(Integer.valueOf(iM762k4));
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
        Integer numValueOf = Integer.valueOf(ChartTypeCharacterizer.m762k4(i));
        if (z) {
            list2.addItem(numValueOf);
        } else {
            list.addItem(numValueOf);
        }
        if (z) {
            if (list2.size() == 0) {
                return true;
            }
            c14093tqM307k4 = m307k4(list2);
        } else {
            if (list.size() == 0) {
                return true;
            }
            c14093tqM307k4 = m307k4(list);
        }
        return C14093tq.m67296x1(c14093tqM307k4.Clone(), null);
    }
}
