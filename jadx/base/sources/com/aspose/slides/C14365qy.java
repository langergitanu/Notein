package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.qy */
/* JADX INFO: loaded from: classes3.dex */
class C14365qy {

    /* JADX INFO: renamed from: ar */
    private kg7 f48430ar;

    /* JADX INFO: renamed from: bv */
    private C13743kq f48431bv;

    /* JADX INFO: renamed from: c5 */
    private C14787xi f48432c5;

    /* JADX INFO: renamed from: du */
    private Chart f48434du;

    /* JADX INFO: renamed from: dy */
    private C14787xi f48435dy;

    /* JADX INFO: renamed from: h4 */
    private C14787xi f48437h4;

    /* JADX INFO: renamed from: ix */
    private List<C1210hn>[] f48438ix;

    /* JADX INFO: renamed from: jd */
    private C14787xi f48439jd;

    /* JADX INFO: renamed from: k4 */
    public C1189h8 f48440k4;

    /* JADX INFO: renamed from: kk */
    private C14328q5 f48441kk;

    /* JADX INFO: renamed from: lr */
    private C13743kq f48443lr;

    /* JADX INFO: renamed from: m9 */
    private C14787xi f48444m9;

    /* JADX INFO: renamed from: ne */
    private List<C1210hn> f48445ne;

    /* JADX INFO: renamed from: qq */
    private AbstractC14897zn f48446qq;

    /* JADX INFO: renamed from: rv */
    private List<C1210hn> f48447rv;

    /* JADX INFO: renamed from: to */
    private C14245oo f48448to;

    /* JADX INFO: renamed from: u4 */
    private List<C1210hn>[] f48449u4;

    /* JADX INFO: renamed from: um */
    private C13743kq f48450um;

    /* JADX INFO: renamed from: uz */
    private boolean f48452uz;

    /* JADX INFO: renamed from: v4 */
    private C13743kq f48453v4;

    /* JADX INFO: renamed from: wl */
    private float f48454wl;

    /* JADX INFO: renamed from: x1 */
    private zal f48455x1;

    /* JADX INFO: renamed from: x6 */
    private List<C1210hn> f48456x6;

    /* JADX INFO: renamed from: yj */
    private C1236i2 f48457yj;

    /* JADX INFO: renamed from: ck */
    private List<C13847mr> f48433ck = new List<>();

    /* JADX INFO: renamed from: fa */
    private List<C13847mr> f48436fa = new List<>();

    /* JADX INFO: renamed from: up */
    private List<C13847mr> f48451up = new List<>();

    /* JADX INFO: renamed from: ks */
    private boolean f48442ks = true;

    public C14365qy(Chart chart, AbstractC14897zn abstractC14897zn, kg7 kg7Var) {
        List.Enumerator<C13847mr> it;
        this.f48434du = chart;
        m69843k4(abstractC14897zn);
        m69841k4(kg7Var);
        IGenericEnumerator<IChartSeries> it2 = m69834fa().getChartData().getSeriesGroups().iterator();
        while (it2.hasNext()) {
            try {
                it2 = ((ChartSeriesGroup) it2.next()).getSeries().iterator();
                while (it2.hasNext()) {
                    try {
                        ChartSeries chartSeries = (ChartSeries) it2.next();
                        if (!chartSeries.m739x1()) {
                            C13847mr c13847mr = new C13847mr(chartSeries, this);
                            this.f48433ck.addItem(c13847mr);
                            (!c13847mr.m64945h4().getPlotOnSecondAxis() ? this.f48436fa : this.f48451up).addItem(c13847mr);
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        if (this.f48436fa.size() == 0 && this.f48451up.size() == 0) {
            return;
        }
        if (this.f48434du.hasLegend() || ChartTypeCharacterizer.is3DChart(this.f48434du.getType())) {
            this.f48455x1 = new zal((Legend) this.f48434du.getLegend(), this);
        }
        if (this.f48434du.hasDataTable() || ChartTypeCharacterizer.is3DChart(this.f48434du.getType())) {
            this.f48441kk = new C14328q5((DataTable) this.f48434du.getChartDataTable(), this);
        }
        if (this.f48434du.hasTitle() || ChartTypeCharacterizer.is3DChart(this.f48434du.getType())) {
            this.f48448to = new C14245oo((ChartTitle) this.f48434du.getChartTitle(), this, true);
        }
        m69812k4(chart, this.f48436fa, false);
        m69812k4(chart, this.f48451up, true);
        this.f48439jd = new C14787xi((Axis) chart.getAxes().getSeriesAxis(), this, 4);
        if (ChartTypeCharacterizer.is3DChart(m69834fa().getType())) {
            m69850kk(new C13743kq(this, null));
            m69860to(new C0948ef(this, this.f48434du.getFloor()));
            m69842k4(new C14632ug(this, this.f48434du.getSideWall()));
            m69873x1(new C14400rm(this, this.f48434du.getBackWall()));
        }
        m69840k4(new List<>());
        m69872x1(new List<>());
        m69849kk(new List<>());
        this.f48440k4 = new C1189h8((Format) m69834fa().getPlotArea().getFormat(), this, m69834fa().getPlotArea());
        m69815k4(this.f48434du.getChartData().getCategories(), m69871x1(), m69834fa());
        if (this.f48434du.getChartData().getUseSecondaryCategories()) {
            m69815k4(this.f48434du.getChartData().getSecondaryCategories(), m69848kk(), m69834fa());
        } else {
            m69872x1(m69871x1());
        }
        m69845k4(m69831du(m69871x1()));
        m69875x1(m69831du(m69848kk()));
        m69840k4(m69811h4(m69871x1()));
        m69872x1(m69811h4(m69848kk()));
        C14787xi c14787xi = this.f48437h4;
        if (c14787xi != null && c14787xi.m73384dy() != null && this.f48437h4.m73384dy().getCategoryAxisType() != 1 && m69871x1().size() > 0) {
            it = m69879yj().iterator();
            while (it.hasNext()) {
                try {
                    C13847mr next = it.next();
                    while (next.m64944dy().size() > m69871x1().size()) {
                        m69871x1().addItem(new C1210hn(null, ""));
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        C14787xi c14787xi2 = this.f48444m9;
        if (c14787xi2 != null && c14787xi2.m73384dy() != null && this.f48444m9.m73384dy().getCategoryAxisType() != 1 && m69848kk().size() > 0) {
            it = m69851ks().iterator();
            while (it.hasNext()) {
                try {
                    C13847mr next2 = it.next();
                    while (next2.m64944dy().size() > m69848kk().size()) {
                        m69848kk().addItem(new C1210hn(null, ""));
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (!m69834fa().m512kk()) {
            kc0.m63755k4(m69879yj(), m69857rv(), this.f48437h4, this.f48435dy);
            kc0.m63755k4(m69851ks(), m69876x6(), this.f48444m9, this.f48432c5);
        }
        m69816k4(m69854ne());
        m69816k4(this.f48444m9);
        m69816k4(m69863u4());
        m69816k4(m69866uz());
    }

    /* JADX INFO: renamed from: h4 */
    public static List<C1210hn> m69811h4(List<C1210hn> list) {
        List<C1210hn> list2 = new List<>();
        m69814k4(list, m69818m9(list) - 1, 0, list2);
        return list2;
    }

    /* JADX INFO: renamed from: kp */
    private C12003du m69817kp() {
        Chart chart;
        C12003du c12003duClone = C12003du.f40505to.Clone();
        byte b = 1;
        if (this.f48434du.getStyle() + 1 >= 33 && this.f48434du.getStyle() + 1 <= 40) {
            chart = this.f48434du;
        } else {
            if (this.f48434du.getStyle() + 1 < 41 || this.f48434du.getStyle() + 1 > 48) {
                return c12003duClone;
            }
            chart = this.f48434du;
            b = 0;
        }
        chart.m506k4(b).CloneTo(c12003duClone);
        return c12003duClone;
    }

    /* JADX INFO: renamed from: m9 */
    private static int m69818m9(List<C1210hn> list) {
        if (list.size() == 0) {
            return 0;
        }
        int i = 1;
        for (C1210hn c1210hn = list.get_Item(0); c1210hn.m7236m9().size() > 0; c1210hn = c1210hn.m7236m9().get_Item(0)) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: to */
    public static int m69819to(List<C13847mr> list) {
        List.Enumerator<C13847mr> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            try {
                C13847mr next = it.next();
                if (next.m64944dy().size() > size) {
                    size = next.m64944dy().size();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: ak */
    public final kg7 m69821ak() {
        return this.f48430ar;
    }

    /* JADX INFO: renamed from: ar */
    public final int m69822ar() {
        return 100;
    }

    /* JADX INFO: renamed from: b3 */
    public final float m69823b3() {
        return this.f48434du.getY();
    }

    /* JADX INFO: renamed from: bv */
    public final float m69824bv() {
        return this.f48454wl;
    }

    /* JADX INFO: renamed from: bz */
    public final C13743kq m69825bz() {
        return this.f48443lr;
    }

    /* JADX INFO: renamed from: c5 */
    public final zal m69826c5() {
        return this.f48455x1;
    }

    /* JADX INFO: renamed from: c6 */
    public final C13743kq m69827c6() {
        return this.f48450um;
    }

    /* JADX INFO: renamed from: ck */
    public final C14245oo m69828ck() {
        return this.f48448to;
    }

    /* JADX INFO: renamed from: dq */
    public final int m69829dq() {
        if (C14164n2.m67854k4(this.f48434du)) {
            return 0;
        }
        if (ChartTypeCharacterizer.isChartTypeBar(this.f48434du.getType())) {
            if (this.f48434du.getRotation3D().getRotationX() < 0) {
                return 0;
            }
            if (this.f48434du.getRotation3D().getRotationX() > 44) {
                return 44;
            }
        }
        return this.f48434du.getRotation3D().getRotationX();
    }

    /* JADX INFO: renamed from: du */
    public final List<C1210hn>[] m69830du() {
        return this.f48449u4;
    }

    /* JADX INFO: renamed from: dy */
    public final C1236i2 m69832dy() {
        C1236i2 c1236i2 = this.f48457yj;
        if (c1236i2 != null) {
            return c1236i2;
        }
        throw new InvalidOperationException("3D Renderer for Charts is not initialized");
    }

    /* JADX INFO: renamed from: e0 */
    public final C13743kq m69833e0() {
        return this.f48453v4;
    }

    /* JADX INFO: renamed from: fa */
    public final Chart m69834fa() {
        return this.f48434du;
    }

    /* JADX INFO: renamed from: g8 */
    public final void m69835g8() {
        m69869wp();
    }

    /* JADX INFO: renamed from: ix */
    public final C14787xi m69837ix() {
        return this.f48444m9;
    }

    /* JADX INFO: renamed from: jd */
    public final C14328q5 m69838jd() {
        return this.f48441kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69839k4(float f) {
        this.f48454wl = f;
    }

    /* JADX INFO: renamed from: kk */
    public final List<C1210hn> m69848kk() {
        return this.f48456x6;
    }

    /* JADX INFO: renamed from: ks */
    public final List<C13847mr> m69851ks() {
        return this.f48451up;
    }

    /* JADX INFO: renamed from: lr */
    public final float m69852lr() {
        return m69834fa().getHeight();
    }

    /* JADX INFO: renamed from: ne */
    public final C14787xi m69854ne() {
        return this.f48437h4;
    }

    /* JADX INFO: renamed from: qm */
    public final C12007ix m69855qm() {
        return m69834fa().getRotation3D().getRightAngleAxes() ? m69833e0().m64119ne() : new C12007ix(m69834fa().getX(), m69834fa().getY(), m69834fa().getWidth(), m69834fa().getHeight());
    }

    /* JADX INFO: renamed from: qq */
    public final boolean m69856qq() {
        return this.f48452uz;
    }

    /* JADX INFO: renamed from: rv */
    public final C13847mr m69857rv() {
        if (this.f48436fa.size() > 0) {
            return this.f48436fa.get_Item(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: ss */
    public final C11896dy m69858ss() {
        float x = this.f48434du.getX();
        float y = this.f48434du.getY();
        float width = this.f48434du.getWidth();
        float height = this.f48434du.getHeight();
        C11896dy c11896dy = new C11896dy();
        float f = x + 13.0f;
        float f2 = width + x;
        float f3 = f2 - 26.0f;
        c11896dy.m55574x1(f, y, f3, y);
        c11896dy.m55535k4(f3, y, 26.0f, 26.0f, 270.0f, 90.0f);
        float f4 = y + 13.0f;
        float f5 = height + y;
        float f6 = f5 - 26.0f;
        c11896dy.m55574x1(f2, f4, f2, f6);
        c11896dy.m55535k4(f3, f6, 26.0f, 26.0f, 0.0f, 90.0f);
        c11896dy.m55574x1(f3, f5, f, f5);
        c11896dy.m55535k4(x, f6, 26.0f, 26.0f, 90.0f, 90.0f);
        c11896dy.m55574x1(x, f6, x, f4);
        c11896dy.m55535k4(x, y, 26.0f, 26.0f, 180.0f, 90.0f);
        c11896dy.m55567m9();
        return c11896dy;
    }

    /* JADX INFO: renamed from: sv */
    public final void m69859sv() {
        C12007ix c12007ix = new C12007ix(this.f48434du.getX(), this.f48434du.getY(), this.f48434du.getWidth(), this.f48434du.getHeight());
        if (m69834fa().hasRoundedCorners()) {
            im9.m7694k4(C12003du.f40505to.Clone(), C12003du.f40505to.Clone(), this, m69858ss(), (LineFormat) this.f48434du.getLineFormat(), (FillFormat) null, this.f48434du.getEffectFormat());
        } else {
            im9.m7700k4(C12003du.f40505to.Clone(), C12003du.f40505to.Clone(), this, c12007ix.Clone(), (LineFormat) this.f48434du.getLineFormat(), (FillFormat) null, this.f48434du.getEffectFormat());
        }
    }

    /* JADX INFO: renamed from: ts */
    public final C13743kq m69862ts() {
        return this.f48431bv;
    }

    /* JADX INFO: renamed from: u4 */
    public final C14787xi m69863u4() {
        return this.f48435dy;
    }

    /* JADX INFO: renamed from: um */
    public final int m69864um() {
        return 100;
    }

    /* JADX INFO: renamed from: up */
    public final List<C13847mr> m69865up() {
        return this.f48433ck;
    }

    /* JADX INFO: renamed from: uz */
    public final C14787xi m69866uz() {
        return this.f48432c5;
    }

    /* JADX INFO: renamed from: v4 */
    public final float m69867v4() {
        return m69834fa().getWidth();
    }

    /* JADX INFO: renamed from: wl */
    public final C14787xi m69868wl() {
        return this.f48439jd;
    }

    /* JADX INFO: renamed from: wp */
    public final void m69869wp() {
        if (m69834fa().hasRoundedCorners()) {
            im9.m7694k4(C12003du.f40505to.Clone(), m69817kp().Clone(), this, m69858ss(), (LineFormat) this.f48434du.getLineFormat(), (FillFormat) this.f48434du.getFillFormat(), this.f48434du.getEffectFormat());
            return;
        }
        C12007ix c12007ix = new C12007ix(this.f48434du.getX(), this.f48434du.getY(), this.f48434du.getWidth(), this.f48434du.getHeight());
        im9.m7720x1(C12003du.f40505to.Clone(), m69817kp().Clone(), this, c12007ix.Clone(), (LineFormat) this.f48434du.getLineFormat(), (FillFormat) this.f48434du.getFillFormat(), this.f48434du.getEffectFormat());
        im9.m7700k4(C12003du.f40505to.Clone(), m69817kp().Clone(), this, c12007ix.Clone(), (LineFormat) this.f48434du.getLineFormat(), (FillFormat) this.f48434du.getFillFormat(), this.f48434du.getEffectFormat());
    }

    /* JADX INFO: renamed from: wy */
    public final AbstractC14897zn m69870wy() {
        return this.f48446qq;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C1210hn> m69871x1() {
        return this.f48447rv;
    }

    /* JADX INFO: renamed from: x6 */
    public final C13847mr m69876x6() {
        if (this.f48451up.size() > 0) {
            return this.f48451up.get_Item(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: xk */
    public final int m69877xk() {
        if (C14164n2.m67854k4(this.f48434du)) {
            return 0;
        }
        if (ChartTypeCharacterizer.isChartTypeBar(this.f48434du.getType())) {
            if ((this.f48434du.getRotation3D().getRotationY() & 65535) < 0) {
                return 0;
            }
            if ((this.f48434du.getRotation3D().getRotationY() & 65535) > 44) {
                return 44;
            }
        }
        return this.f48434du.getRotation3D().getRotationY() & 65535;
    }

    /* JADX INFO: renamed from: yd */
    public final float m69878yd() {
        return this.f48434du.getX();
    }

    /* JADX INFO: renamed from: yj */
    public final List<C13847mr> m69879yj() {
        return this.f48436fa;
    }

    /* JADX INFO: renamed from: k4 */
    private void m69812k4(Chart chart, List<C13847mr> list, boolean z) {
        if (list.size() == 0) {
            return;
        }
        switch (ChartTypeCharacterizer.m762k4(list.get_Item(0).m64945h4().getType())) {
            case 0:
                if (!z) {
                    this.f48437h4 = new C14787xi(null, this, 0);
                    this.f48435dy = new C14787xi(null, this, 2);
                }
                this.f48444m9 = new C14787xi(null, this, 1);
                this.f48432c5 = new C14787xi(null, this, 3);
                return;
            case 1:
                if (z) {
                    return;
                }
                this.f48437h4 = new C14787xi((Axis) chart.getAxes().getVerticalAxis(), this, 0);
                this.f48435dy = new C14787xi((Axis) chart.getAxes().getHorizontalAxis(), this, 2);
                return;
            case 2:
            case 3:
            case 5:
            case 6:
                if (!z) {
                    this.f48437h4 = new C14787xi((Axis) chart.getAxes().getHorizontalAxis(), this, 0);
                    this.f48435dy = new C14787xi((Axis) chart.getAxes().getVerticalAxis(), this, 2);
                }
                this.f48444m9 = new C14787xi((Axis) chart.getAxes().getSecondaryHorizontalAxis(), this, 1);
                this.f48432c5 = new C14787xi((Axis) chart.getAxes().getSecondaryVerticalAxis(), this, 3);
                return;
            case 4:
                if (!z) {
                    this.f48437h4 = new C14787xi((Axis) chart.getAxes().getVerticalAxis(), this, 0);
                    this.f48435dy = new C14787xi((Axis) chart.getAxes().getHorizontalAxis(), this, 2);
                }
                this.f48444m9 = new C14787xi((Axis) chart.getAxes().getSecondaryVerticalAxis(), this, 1);
                this.f48432c5 = new C14787xi((Axis) chart.getAxes().getSecondaryHorizontalAxis(), this, 3);
                return;
            case 7:
                if (z) {
                    return;
                }
                this.f48437h4 = new C14787xi((Axis) chart.getAxes().getHorizontalAxis(), this, 0);
                this.f48435dy = new C14787xi((Axis) chart.getAxes().getVerticalAxis(), this, 2);
                return;
            case 8:
                this.f48437h4 = new C14787xi((Axis) chart.getAxes().getHorizontalAxis(), this, 0);
                this.f48432c5 = new C14787xi((Axis) chart.getAxes().getSecondaryVerticalAxis(), this, 3);
                return;
            default:
                throw new Exception();
        }
    }

    /* JADX INFO: renamed from: du */
    public final List<C1210hn>[] m69831du(List<C1210hn> list) {
        int iM69818m9 = m69818m9(list);
        if (iM69818m9 <= 1) {
            return null;
        }
        int i = iM69818m9 - 1;
        List<C1210hn>[] listArr = new List[i];
        for (int i2 = 0; i2 < i; i2++) {
            List<C1210hn> list2 = new List<>();
            listArr[i2] = list2;
            m69814k4(list, i2, 0, list2);
        }
        return listArr;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m69836h4() {
        boolean z = !C7019kk.m27469x1(m69870wy(), omq.class);
        float f = 1.0f;
        if (!m69834fa().getRotation3D().getRightAngleAxes() && m69834fa().getHeight() <= 400.0f) {
            f = 2.0f;
        }
        this.f48457yj = new C1236i2(this, f, z);
    }

    /* JADX INFO: renamed from: kk */
    public final void m69849kk(List<C1210hn> list) {
        this.f48445ne = list;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m69853m9() {
        this.f48457yj.m7389k4();
    }

    /* JADX INFO: renamed from: to */
    public final void m69860to(C13743kq c13743kq) {
        this.f48443lr = c13743kq;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69872x1(List<C1210hn> list) {
        this.f48456x6 = list;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69813k4(ChartCategoryCollection chartCategoryCollection, List<C1210hn> list) {
        ChartCategoryCollection chartCategoryCollection2;
        if (chartCategoryCollection.size() == 0) {
            return;
        }
        int iM4304k4 = ((ChartCategory) chartCategoryCollection.get_Item(0)).m526x1().m4304k4();
        if (iM4304k4 == 0) {
            for (int i = 0; i < chartCategoryCollection.size(); i++) {
                if (((ChartCategory) chartCategoryCollection.get_Item(i)).m522k4() == null) {
                    C1210hn c1210hn = new C1210hn(null, "");
                    list.addItem(c1210hn);
                    c1210hn.m7234k4(true);
                } else {
                    list.addItem(new C1210hn(null, ((ChartCategory) chartCategoryCollection.get_Item(i)).m522k4()));
                }
            }
            return;
        }
        int i2 = iM4304k4 - 1;
        Object objM4305k4 = ((ChartCategory) chartCategoryCollection.get_Item(0)).m526x1().m4305k4(i2);
        int i3 = 0;
        int i4 = 0;
        while (i4 < chartCategoryCollection.size()) {
            Object objM4305k42 = ((ChartCategory) chartCategoryCollection.get_Item(i4)).m526x1().m4305k4(i2);
            if (objM4305k42 == null || ((objM4305k4 != null && C14113y2.m67363du(objM4305k4.toString(), objM4305k42.toString())) || "".equals(objM4305k42.toString()))) {
                chartCategoryCollection2 = chartCategoryCollection;
                i3 = i3;
            } else {
                ChartCategoryCollection chartCategoryCollection3 = chartCategoryCollection;
                chartCategoryCollection2 = chartCategoryCollection3;
                list.addItem(new C1210hn(chartCategoryCollection3, null, iM4304k4 - 2, i3, i4));
                objM4305k4 = objM4305k42;
                i3 = i4;
            }
            i4++;
            chartCategoryCollection = chartCategoryCollection2;
        }
        ChartCategoryCollection chartCategoryCollection4 = chartCategoryCollection;
        list.addItem(new C1210hn(chartCategoryCollection4, null, iM4304k4 - 2, i3, chartCategoryCollection4.size()));
    }

    /* JADX INFO: renamed from: x1 */
    private static void m69820x1(IChartCategoryCollection iChartCategoryCollection, List<C1210hn> list, Chart chart) {
        ChartDataCell chartDataCell;
        Object value;
        String strM567k4;
        C1210hn c1210hn;
        C1210hn c1210hn2;
        C1210hn[] c1210hnArr = new C1210hn[iChartCategoryCollection.getGroupingLevelCount()];
        for (int i = 0; i < iChartCategoryCollection.size(); i++) {
            for (int groupingLevelCount = iChartCategoryCollection.getGroupingLevelCount() - 1; groupingLevelCount >= 0; groupingLevelCount--) {
                int groupingLevelCount2 = (iChartCategoryCollection.getGroupingLevelCount() - 1) - groupingLevelCount;
                if (iChartCategoryCollection.get_Item(i).getGroupingLevels() == null) {
                    ChartCategory chartCategory = (ChartCategory) iChartCategoryCollection.get_Item(i);
                    value = chartCategory.getValue();
                    if (chartCategory.getUseCell()) {
                        chartDataCell = (ChartDataCell) chartCategory.getAsCell();
                    } else {
                        strM567k4 = null;
                        if (((chart.getChartData().getSeries().get_Item(0).getType() == 74 && chart.getChartData().getSeries().get_Item(0).getType() != 75) || (c1210hn = c1210hnArr[groupingLevelCount2]) == null || c1210hn.m7238x1() != value || groupingLevelCount2 == iChartCategoryCollection.getGroupingLevelCount() - 1) && (c1210hnArr[groupingLevelCount2] == null || value != null || groupingLevelCount2 == iChartCategoryCollection.getGroupingLevelCount() - 1)) {
                            if (groupingLevelCount2 == 0) {
                                c1210hn2 = new C1210hn(null, value == null ? "" : value);
                                list.addItem(c1210hn2);
                            } else {
                                int i2 = groupingLevelCount2 - 1;
                                C1210hn c1210hn3 = c1210hnArr[i2];
                                if (c1210hn3 == null) {
                                    throw new InvalidOperationException(C14113y2.m67407k4("Possibly the grouping level value has been used in place of category value: ", value, "."));
                                }
                                C1210hn c1210hn4 = new C1210hn(c1210hn3, value);
                                c1210hnArr[i2].m7236m9().addItem(c1210hn4);
                                c1210hn2 = c1210hn4;
                            }
                            c1210hn2.m7233k4(strM567k4);
                            if (value == null) {
                                c1210hn2.m7234k4(true);
                            }
                            for (int i3 = groupingLevelCount2; i3 < iChartCategoryCollection.getGroupingLevelCount(); i3++) {
                                c1210hnArr[i3] = null;
                            }
                            c1210hnArr[groupingLevelCount2] = c1210hn2;
                        }
                    }
                } else {
                    chartDataCell = (ChartDataCell) ((ChartCategory) iChartCategoryCollection.get_Item(i)).getGroupingLevels().get_Item(groupingLevelCount);
                    if (chartDataCell == null) {
                        continue;
                    } else {
                        value = chartDataCell.getValue();
                    }
                }
                strM567k4 = chartDataCell.m567k4(true);
                if (chart.getChartData().getSeries().get_Item(0).getType() == 74) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m69850kk(C13743kq c13743kq) {
        this.f48453v4 = c13743kq;
    }

    /* JADX INFO: renamed from: to */
    public final List<C1210hn>[] m69861to() {
        return this.f48438ix;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69840k4(List<C1210hn> list) {
        this.f48447rv = list;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69873x1(C13743kq c13743kq) {
        this.f48431bv = c13743kq;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69814k4(List<C1210hn> list, int i, int i2, List<C1210hn> list2) {
        int i3 = 0;
        if (i == i2) {
            while (i3 < list.size()) {
                list2.addItem(list.get_Item(i3));
                i3++;
            }
        } else {
            while (i3 < list.size()) {
                m69814k4(list.get_Item(i3).m7236m9(), i, i2 + 1, list2);
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69874x1(boolean z) {
        this.f48452uz = z;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69815k4(IChartCategoryCollection iChartCategoryCollection, List<C1210hn> list, Chart chart) {
        if (iChartCategoryCollection == null) {
            return;
        }
        if (!iChartCategoryCollection.getUseCells() || ((ChartData) chart.getChartData()).m553x1().mo5710kk() == 2) {
            m69820x1(iChartCategoryCollection, list, chart);
        } else {
            m69813k4((ChartCategoryCollection) iChartCategoryCollection, list);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69875x1(List<C1210hn>[] listArr) {
        this.f48449u4 = listArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69841k4(kg7 kg7Var) {
        this.f48430ar = kg7Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69842k4(C13743kq c13743kq) {
        this.f48450um = c13743kq;
    }

    /* JADX INFO: renamed from: k4 */
    private void m69816k4(C14787xi c14787xi) {
        if (c14787xi == null || c14787xi.m73384dy() == null || c14787xi.m73384dy() == null || c14787xi.m73384dy().getCategoryAxisType() != 1) {
            return;
        }
        List<C1210hn> listM69871x1 = (c14787xi.m73419up() == 0 || c14787xi.m73419up() == 2) ? m69871x1() : m69848kk();
        for (int i = 0; i < listM69871x1.size() && !C7019kk.m27469x1(listM69871x1.get_Item(i).m7238x1(), Double.class); i++) {
            if (C7019kk.m27469x1(listM69871x1.get_Item(i).m7238x1(), String.class) && !C14113y2.m67411k4((String) listM69871x1.get_Item(i).m7238x1())) {
                c14787xi.m73384dy().setCategoryAxisType(0);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69843k4(AbstractC14897zn abstractC14897zn) {
        this.f48446qq = abstractC14897zn;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69844k4(boolean z) {
        this.f48442ks = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69845k4(List<C1210hn>[] listArr) {
        this.f48438ix = listArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69846k4(C12007ix[] c12007ixArr) {
        if (c12007ixArr[0].m56557jd() < m69878yd()) {
            c12007ixArr[0].m56566kk(m69878yd());
        }
        if (c12007ixArr[0].m56551ck() < m69823b3()) {
            c12007ixArr[0].m56572to(m69823b3());
        }
        if (c12007ixArr[0].m56556h4() > m69878yd() + m69867v4()) {
            c12007ixArr[0].m56566kk((m69878yd() + m69867v4()) - c12007ixArr[0].m56550c5());
        }
        if (c12007ixArr[0].m56558k4() > m69823b3() + m69852lr()) {
            c12007ixArr[0].m56572to((m69823b3() + m69852lr()) - c12007ixArr[0].m56575x1());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m69847k4() {
        return this.f48442ks;
    }
}
