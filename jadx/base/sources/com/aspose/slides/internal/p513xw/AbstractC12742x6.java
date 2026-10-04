package com.aspose.slides.internal.p513xw;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p462vj.C11675v4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.x6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12742x6 {

    /* JADX INFO: renamed from: ar */
    private boolean f42480ar;

    /* JADX INFO: renamed from: c5 */
    protected boolean f42481c5;

    /* JADX INFO: renamed from: ck */
    protected int f42482ck;

    /* JADX INFO: renamed from: dy */
    protected int f42484dy;

    /* JADX INFO: renamed from: jd */
    protected kk[] f42488jd;

    /* JADX INFO: renamed from: kk */
    protected int f42490kk;

    /* JADX INFO: renamed from: m9 */
    protected int f42492m9;

    /* JADX INFO: renamed from: ne */
    private double f42493ne;

    /* JADX INFO: renamed from: to */
    protected AbstractC12725sv f42496to;

    /* JADX INFO: renamed from: u4 */
    private kk f42497u4;

    /* JADX INFO: renamed from: um */
    private kk f42498um;

    /* JADX INFO: renamed from: up */
    public int f42499up;

    /* JADX INFO: renamed from: uz */
    private kk f42500uz;

    /* JADX INFO: renamed from: wl */
    private kk f42501wl;

    /* JADX INFO: renamed from: k4 */
    protected int f42489k4 = 50;

    /* JADX INFO: renamed from: x1 */
    protected int f42502x1 = 50;

    /* JADX INFO: renamed from: du */
    protected int f42483du = -1;

    /* JADX INFO: renamed from: ix */
    private boolean f42487ix = false;

    /* JADX INFO: renamed from: h4 */
    protected boolean f42486h4 = false;

    /* JADX INFO: renamed from: qq */
    private int f42494qq = 0;

    /* JADX INFO: renamed from: fa */
    protected int f42485fa = 0;

    /* JADX INFO: renamed from: yj */
    protected int f42504yj = 0;

    /* JADX INFO: renamed from: ks */
    public int f42491ks = 0;

    /* JADX INFO: renamed from: x6 */
    protected int f42503x6 = 0;

    /* JADX INFO: renamed from: rv */
    protected k4 f42495rv = new k4();

    /* JADX INFO: renamed from: com.aspose.slides.internal.xw.x6$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private double[] f42507k4 = new double[4];

        /* JADX INFO: renamed from: x1 */
        private kk[] f42511x1 = new kk[4];

        /* JADX INFO: renamed from: kk */
        private double[] f42508kk = new double[4];

        /* JADX INFO: renamed from: to */
        private int[] f42510to = new int[4];

        /* JADX INFO: renamed from: du */
        private int[] f42505du = new int[4];

        /* JADX INFO: renamed from: h4 */
        private int[] f42506h4 = new int[4];

        /* JADX INFO: renamed from: m9 */
        private int f42509m9 = -1;

        public k4() {
            m59400kk();
        }

        /* JADX INFO: renamed from: du */
        public final int m59395du(int i) {
            return this.f42505du[i];
        }

        /* JADX INFO: renamed from: h4 */
        public final int m59396h4(int i) {
            return this.f42506h4[i];
        }

        /* JADX INFO: renamed from: k4 */
        public void mo59121k4(double d, kk kkVar, double d2, int i, int i2, int i3, int i4) {
            double[] dArr = this.f42507k4;
            double d3 = dArr[i4];
            dArr[i4] = d;
            this.f42511x1[i4] = kkVar;
            this.f42508kk[i4] = d2;
            this.f42505du[i4] = i;
            this.f42506h4[i4] = i2;
            this.f42510to[i4] = i3;
            int i5 = this.f42509m9;
            if (i5 == -1 || d < dArr[i5]) {
                this.f42509m9 = i4;
            }
        }

        /* JADX INFO: renamed from: kk */
        public final kk m59399kk(int i) {
            return this.f42511x1[i];
        }

        /* JADX INFO: renamed from: m9 */
        public final int m59401m9(int i) {
            return this.f42510to[i];
        }

        /* JADX INFO: renamed from: to */
        public final double m59402to(int i) {
            return this.f42508kk[i];
        }

        /* JADX INFO: renamed from: x1 */
        public final double m59403x1() {
            int i = this.f42509m9;
            if (i != -1) {
                return m59404x1(i);
            }
            return Double.POSITIVE_INFINITY;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m59397k4() {
            return this.f42509m9 != -1;
        }

        /* JADX INFO: renamed from: kk */
        public final void m59400kk() {
            for (int i = 0; i < 4; i++) {
                this.f42507k4[i] = Double.POSITIVE_INFINITY;
            }
            this.f42509m9 = -1;
        }

        /* JADX INFO: renamed from: x1 */
        public final double m59404x1(int i) {
            return this.f42507k4[i];
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m59398k4(int i) {
            return this.f42507k4[i] != Double.POSITIVE_INFINITY;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.xw.x6$kk */
    public static class kk {

        /* JADX INFO: renamed from: c5 */
        public int f42512c5;

        /* JADX INFO: renamed from: ck */
        public double f42513ck;

        /* JADX INFO: renamed from: du */
        public int f42514du;

        /* JADX INFO: renamed from: dy */
        public int f42515dy;

        /* JADX INFO: renamed from: fa */
        public kk f42516fa;

        /* JADX INFO: renamed from: h4 */
        public int f42517h4;

        /* JADX INFO: renamed from: jd */
        public int f42518jd;

        /* JADX INFO: renamed from: k4 */
        public int f42519k4;

        /* JADX INFO: renamed from: kk */
        public int f42520kk;

        /* JADX INFO: renamed from: m9 */
        public double f42521m9;

        /* JADX INFO: renamed from: to */
        public int f42522to;

        /* JADX INFO: renamed from: up */
        public kk f42523up;

        /* JADX INFO: renamed from: x1 */
        public int f42524x1;

        /* JADX INFO: renamed from: yj */
        public int f42525yj = 0;

        public kk(int i, int i2, int i3, int i4, int i5, int i6, double d, int i7, int i8, int i9, double d2, kk kkVar) {
            this.f42519k4 = i;
            this.f42524x1 = i2;
            this.f42520kk = i3;
            this.f42522to = i4;
            this.f42514du = i5;
            this.f42517h4 = i6;
            this.f42521m9 = d;
            this.f42515dy = i7;
            this.f42512c5 = i8;
            this.f42518jd = i9;
            this.f42513ck = d2;
            this.f42516fa = kkVar;
        }

        public final String toString() {
            String strM66591x1 = C14057f9.m66591x1(this.f42519k4);
            String strM66591x12 = C14057f9.m66591x1(this.f42522to);
            String strM66591x13 = C14057f9.m66591x1(this.f42514du);
            String strM66591x14 = C14057f9.m66591x1(this.f42517h4);
            String strM66591x15 = C14057f9.m66591x1(this.f42524x1);
            kk kkVar = this.f42516fa;
            return C14113y2.m67408k4("<KnuthNode at ", strM66591x1, " ", strM66591x12, "+", strM66591x13, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, strM66591x14, " line:", strM66591x15, " prev:", C14057f9.m66591x1(kkVar != null ? kkVar.f42519k4 : -1), " dem:", C14044b3.m66425h4(this.f42513ck), " fitness:", x1.f42526k4[this.f42520kk], ">");
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.xw.x6$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: k4 */
        public static final String[] f42526k4 = {"VERY TIGHT", "TIGHT", "LOOSE", "VERY LOOSE"};

        /* JADX INFO: renamed from: k4 */
        public static int m59405k4(double d) {
            if (d < -0.5d) {
                return 0;
            }
            if (d <= 0.5d) {
                return 1;
            }
            return d <= 1.0d ? 2 : 3;
        }
    }

    public AbstractC12742x6(int i, int i2, boolean z, boolean z2, int i3) {
        this.f42492m9 = i;
        this.f42484dy = i2;
        this.f42481c5 = z;
        this.f42480ar = z2;
        this.f42490kk = i3;
    }

    /* JADX INFO: renamed from: c5 */
    public final kk m59373c5() {
        if (!m59385kk()) {
            return this.f42497u4;
        }
        if (this.f42498um == null) {
            this.f42498um = this.f42497u4;
        }
        kk kkVarMo59104k4 = mo59104k4(this.f42497u4);
        int i = this.f42497u4.f42516fa.f42525yj + 1;
        kkVarMo59104k4.f42525yj = i;
        if (i <= m59389x1()) {
            return kkVarMo59104k4;
        }
        while (kkVarMo59104k4.f42525yj > 0 && (kkVarMo59104k4 = kkVarMo59104k4.f42516fa) != null) {
            this.f42501wl = kkVarMo59104k4.f42516fa;
        }
        kk kkVar = this.f42498um;
        this.f42498um = null;
        m59381k4(kkVar.f42524x1);
        this.f42485fa = kkVar.f42524x1;
        return kkVar;
    }

    /* JADX INFO: renamed from: ck */
    public int m59374ck() {
        return this.f42483du;
    }

    /* JADX INFO: renamed from: du */
    public int mo59096du() {
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: dy */
    public final void m59376dy() {
        kk kkVar = this.f42501wl;
        if (kkVar.f42521m9 > 0.0d) {
            this.f42500uz = kkVar;
        } else {
            this.f42497u4 = kkVar;
        }
    }

    /* JADX INFO: renamed from: fa */
    public abstract int mo54806fa();

    /* JADX INFO: renamed from: h4 */
    public void mo59098h4() {
        this.f42499up = 0;
        this.f42504yj = 0;
        this.f42491ks = 0;
        this.f42500uz = null;
        this.f42497u4 = null;
        m59381k4(0);
        this.f42485fa = 0;
        this.f42488jd = new kk[20];
    }

    /* JADX INFO: renamed from: jd */
    public void mo59099jd() {
    }

    /* JADX INFO: renamed from: k4 */
    public double mo58928k4(kk kkVar, AbstractC12729ts abstractC12729ts, int i, double d) {
        double d2;
        double dM67475k4 = C14116yg.m67475k4(d);
        double d3 = (100.0d * dM67475k4 * dM67475k4 * dM67475k4) + 1.0d;
        if (abstractC12729ts.mo59086y_()) {
            double dMo59085x6 = abstractC12729ts.mo59085x6();
            if (dMo59085x6 >= 0.0d) {
                d3 += dMo59085x6;
            } else if (!abstractC12729ts.mo59082dy()) {
                d2 = (d3 * d3) - (dMo59085x6 * dMo59085x6);
            }
            d2 = d3 * d3;
        } else {
            d2 = d3 * d3;
        }
        if (abstractC12729ts.mo59086y_() && ((C12718qm) abstractC12729ts).m59083m9() && m59387to(kkVar.f42519k4).mo59086y_() && ((C12718qm) m59387to(kkVar.f42519k4)).m59083m9()) {
            d2 += (double) this.f42489k4;
            int i2 = 2;
            for (kk kkVar2 = kkVar.f42516fa; kkVar2 != null && i2 <= this.f42490kk; kkVar2 = kkVar2.f42516fa) {
                AbstractC12729ts abstractC12729tsM59387to = m59387to(kkVar2.f42519k4);
                if (!abstractC12729tsM59387to.mo59086y_() || !((C12718qm) abstractC12729tsM59387to).m59083m9()) {
                    break;
                }
                i2++;
            }
            int i3 = this.f42490kk;
            if (i3 >= 1 && i2 > i3) {
                d2 += Double.POSITIVE_INFINITY;
            }
        }
        if (C14116yg.m67482k4(i - kkVar.f42520kk) > 1) {
            d2 += (double) this.f42502x1;
        }
        return d2 + kkVar.f42513ck;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo54808k4(int i, double d);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo54810k4(kk kkVar, AbstractC12725sv abstractC12725sv, int i);

    /* JADX INFO: renamed from: kk */
    public double mo59112kk(kk kkVar, int i) {
        int i2;
        if (i > 0) {
            i2 = this.f42504yj - kkVar.f42514du;
            if (i2 <= 0) {
                return 1000.0d;
            }
        } else {
            if (i >= 0) {
                return 0.0d;
            }
            i2 = this.f42491ks - kkVar.f42517h4;
            if (i2 <= 0) {
                return -1000.0d;
            }
        }
        return ((double) i) / ((double) i2);
    }

    /* JADX INFO: renamed from: m9 */
    public final kk m59386m9() {
        return this.f42500uz;
    }

    /* JADX INFO: renamed from: to */
    public int mo59117to() {
        return 0;
    }

    /* JADX INFO: renamed from: up */
    public final int m59388up() {
        return this.f42492m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m59389x1() {
        return 5;
    }

    /* JADX INFO: renamed from: yj */
    public final int m59394yj() {
        return this.f42484dy;
    }

    /* JADX INFO: renamed from: du */
    public final kk m59375du(int i) {
        return this.f42488jd[i * 2];
    }

    /* JADX INFO: renamed from: k4 */
    public final int m59377k4() {
        return this.f42494qq;
    }

    /* JADX INFO: renamed from: kk */
    public void mo54811kk(int i) {
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC12729ts m59387to(int i) {
        return (AbstractC12729ts) this.f42496to.get_Item(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59390x1(int i) {
        this.f42483du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public int mo54807k4(int i, int i2, boolean[] zArr) {
        return this.f42483du;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m59385kk() {
        return this.f42480ar;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59391x1(int i, kk kkVar) {
        int i2 = i * 2;
        kk kkVarM59375du = m59375du(i);
        kk kkVar2 = null;
        if (kkVarM59375du != kkVar) {
            while (kkVarM59375du != kkVar) {
                kkVar2 = kkVarM59375du;
                kkVarM59375du = kkVarM59375du.f42523up;
            }
            kk kkVar3 = kkVarM59375du.f42523up;
            kkVar2.f42523up = kkVar3;
            if (kkVar3 == null) {
                this.f42488jd[i2 + 1] = kkVar2;
            }
        } else {
            kk[] kkVarArr = this.f42488jd;
            kk kkVar4 = kkVar.f42523up;
            kkVarArr[i2] = kkVar4;
            if (kkVar4 == null) {
                kkVarArr[i2 + 1] = null;
            }
            while (m59377k4() < this.f42485fa && m59375du(m59377k4()) == null) {
                m59381k4(m59377k4() + 1);
            }
        }
        this.f42482ck--;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m59378k4(AbstractC12725sv abstractC12725sv, double d, boolean z, int i) {
        return m59379k4(abstractC12725sv, 0, d, z, i);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59392x1(kk kkVar, int i) {
        m59391x1(i, kkVar);
        this.f42501wl = mo59105k4(this.f42501wl, kkVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m59379k4(AbstractC12725sv abstractC12725sv, int i, double d, boolean z, int i2) {
        this.f42496to = abstractC12725sv;
        this.f42493ne = d;
        this.f42487ix = z;
        mo59098h4();
        int iM59201x1 = this.f42492m9 != 23 ? abstractC12725sv.m59201x1(i) : i;
        if (iM59201x1 < 0) {
            iM59201x1 = 0;
        }
        mo59106k4(0, mo59103k4(iM59201x1, 0, 1, 0, 0, 0, 0.0d, 0, 0, 0, 0.0d, null));
        kk kkVarM59375du = m59375du(0);
        boolean zMo58895yj = false;
        int iMo59100k4 = i;
        while (iMo59100k4 < abstractC12725sv.size()) {
            try {
                zMo58895yj = m59380k4(iMo59100k4, zMo58895yj, i2).mo58895yj();
                if (this.f42482ck == 0) {
                    if (mo59117to() != 0) {
                        return mo59096du();
                    }
                    if (!z) {
                        return 0;
                    }
                    kk kkVar = this.f42501wl;
                    if (kkVar != null && kkVar != kkVarM59375du) {
                        m59376dy();
                    }
                    kk kkVarM59373c5 = this.f42500uz;
                    if (kkVarM59373c5 == null || kkVarM59375du.f42519k4 == kkVarM59373c5.f42519k4) {
                        kkVarM59373c5 = m59373c5();
                    } else {
                        this.f42498um = null;
                    }
                    iMo59100k4 = mo59100k4(kkVarM59373c5, iMo59100k4);
                    kkVarM59375du = kkVarM59373c5;
                }
            } catch (C12680ai unused) {
                while (iMo59100k4 >= 0 && !C7019kk.m27469x1(abstractC12725sv.get_Item(iMo59100k4), C12688c6.class)) {
                    iMo59100k4--;
                }
                abstractC12725sv.insertItem(iMo59100k4, new C12694e0(0, 1000, 0, null, true));
                abstractC12725sv.insertItem(iMo59100k4, new C11675v4(0, null, null, true));
                iMo59100k4--;
            }
            iMo59100k4++;
        }
        mo59099jd();
        int iMo54806fa = mo54806fa();
        for (int iM59377k4 = m59377k4(); iM59377k4 < this.f42485fa; iM59377k4++) {
            for (kk kkVarM59375du2 = m59375du(iM59377k4); kkVarM59375du2 != null; kkVarM59375du2 = kkVarM59375du2.f42523up) {
                mo54808k4(kkVarM59375du2.f42524x1, kkVarM59375du2.f42513ck);
                m59393x1(kkVarM59375du2, abstractC12725sv, kkVarM59375du2.f42524x1);
            }
        }
        this.f42488jd = null;
        mo54811kk(iMo54806fa);
        return iMo54806fa;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59393x1(kk kkVar, AbstractC12725sv abstractC12725sv, int i) {
        for (int i2 = kkVar.f42524x1; i2 > 0; i2--) {
            mo54810k4(kkVar, abstractC12725sv, i);
            kkVar = kkVar.f42516fa;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public int mo59100k4(kk kkVar, int i) {
        kkVar.f42513ck = 0.0d;
        mo59106k4(kkVar.f42524x1, kkVar);
        m59381k4(kkVar.f42524x1);
        this.f42485fa = m59377k4() + 1;
        this.f42499up = kkVar.f42522to;
        this.f42504yj = kkVar.f42514du;
        this.f42491ks = kkVar.f42517h4;
        this.f42500uz = null;
        this.f42497u4 = null;
        int i2 = kkVar.f42519k4;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= this.f42496to.size() || m59387to(i3).mo58895yj()) {
                break;
            }
            i2 = i3;
        }
        return i2;
    }

    /* JADX INFO: renamed from: k4 */
    public int mo59101k4(kk kkVar, AbstractC12729ts abstractC12729ts, int i, int i2, boolean[] zArr) {
        int iM59252rv = this.f42499up - kkVar.f42522to;
        if (abstractC12729ts.mo59086y_()) {
            iM59252rv += abstractC12729ts.m59252rv();
        }
        return mo54807k4(i2, i, zArr) - iM59252rv;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC12729ts m59380k4(int i, boolean z, int i2) {
        AbstractC12729ts abstractC12729tsM59387to = m59387to(i);
        if (abstractC12729tsM59387to.mo58895yj()) {
            mo59107k4((C12688c6) abstractC12729tsM59387to);
            return abstractC12729tsM59387to;
        }
        if (abstractC12729tsM59387to.mo58932x_()) {
            m59382k4((C12694e0) abstractC12729tsM59387to, i, z, i2);
            return abstractC12729tsM59387to;
        }
        if (!abstractC12729tsM59387to.mo59086y_()) {
            throw new ArgumentException("Unknown KnuthElement type: expecting KnuthBox, KnuthGlue or KnuthPenalty");
        }
        mo59108k4((C12718qm) abstractC12729tsM59387to, i, i2);
        return abstractC12729tsM59387to;
    }

    /* JADX INFO: renamed from: k4 */
    public kk mo59102k4(int i, int i2, int i3, int i4, int i5, int i6) {
        return new kk(i, i2, i3, i4, i5, i6, this.f42495rv.m59402to(i3), this.f42495rv.m59395du(i3), this.f42495rv.m59396h4(i3), this.f42495rv.m59401m9(i3), this.f42495rv.m59404x1(i3), this.f42495rv.m59399kk(i3));
    }

    /* JADX INFO: renamed from: k4 */
    public kk mo59103k4(int i, int i2, int i3, int i4, int i5, int i6, double d, int i7, int i8, int i9, double d2, kk kkVar) {
        return new kk(i, i2, i3, i4, i5, i6, d, i7, i8, i9, d2, kkVar);
    }

    /* JADX INFO: renamed from: k4 */
    public kk mo59104k4(kk kkVar) {
        if (kkVar.f42516fa.f42516fa == null && !((AbstractC12723s7) this.f42496to.get_Item(0)).mo59086y_()) {
            this.f42496to.insertItem(0, C12718qm.f42303k4);
        }
        kk kkVar2 = kkVar.f42516fa;
        return mo59103k4(kkVar2.f42519k4, kkVar2.f42524x1 + 1, 1, 0, 0, 0, 0.0d, 0, 0, 0, 0.0d, kkVar2);
    }

    /* JADX INFO: renamed from: k4 */
    public kk mo59105k4(kk kkVar, kk kkVar2) {
        int i;
        int i2;
        return (kkVar == null || (i = kkVar2.f42519k4) > (i2 = kkVar.f42519k4)) ? kkVar2 : (i != i2 || kkVar2.f42513ck >= kkVar.f42513ck) ? kkVar : kkVar2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59381k4(int i) {
        this.f42494qq = i;
    }

    /* JADX INFO: renamed from: k4 */
    private void m59372k4(int i, int i2) {
        int i3;
        if (this.f42495rv.m59397k4()) {
            this.f42503x6 = i;
            int i4 = this.f42499up;
            int i5 = this.f42504yj;
            int iMo58930ix = this.f42491ks;
            for (int i6 = i2; i6 < this.f42496to.size(); i6++) {
                AbstractC12729ts abstractC12729tsM59387to = m59387to(i6);
                if (abstractC12729tsM59387to.mo58895yj()) {
                    break;
                }
                if (!abstractC12729tsM59387to.mo58932x_()) {
                    if (abstractC12729tsM59387to.mo59082dy() && i6 != i2) {
                        break;
                    }
                } else {
                    int iM59252rv = abstractC12729tsM59387to.m59252rv() + i4;
                    int iMo58931ne = abstractC12729tsM59387to.mo58931ne() + i5;
                    iMo58930ix = abstractC12729tsM59387to.mo58930ix() + iMo58930ix;
                    i4 = iM59252rv;
                    i5 = iMo58931ne;
                }
            }
            double dM59403x1 = this.f42495rv.m59403x1() + ((double) this.f42502x1);
            int i7 = 0;
            while (i7 <= 3) {
                if (!this.f42495rv.m59398k4(i7) || this.f42495rv.m59404x1(i7) > dM59403x1) {
                    i3 = i2;
                } else {
                    int i8 = i + 1;
                    i3 = i2;
                    mo59106k4(i8, mo59102k4(i3, i8, i7, i4, i5, iMo58930ix));
                }
                i7++;
                i2 = i3;
            }
            this.f42495rv.m59400kk();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo59106k4(int i, kk kkVar) {
        int i2 = i * 2;
        kk[] kkVarArr = this.f42488jd;
        if (i2 >= kkVarArr.length) {
            this.f42488jd = new kk[i2 + i2];
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) kkVarArr), 0, AbstractC14092to.m67208k4((Object) this.f42488jd), 0, kkVarArr.length);
        }
        kkVar.f42523up = null;
        kk[] kkVarArr2 = this.f42488jd;
        int i3 = i2 + 1;
        kk kkVar2 = kkVarArr2[i3];
        if (kkVar2 != null) {
            kkVar2.f42523up = kkVar;
        } else {
            kkVarArr2[i2] = kkVar;
            this.f42485fa = i + 1;
        }
        kkVarArr2[i3] = kkVar;
        this.f42482ck++;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo54809k4(int i, boolean z, int i2, int i3) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo59107k4(C12688c6 c12688c6) {
        this.f42499up = c12688c6.m59252rv() + this.f42499up;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59382k4(C12694e0 c12694e0, int i, boolean z, int i2) {
        if (z && i2 != 2) {
            mo59109k4(c12694e0, i);
        }
        this.f42499up = c12694e0.m59252rv() + this.f42499up;
        this.f42504yj = c12694e0.mo58931ne() + this.f42504yj;
        this.f42491ks = c12694e0.mo58930ix() + this.f42491ks;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo59108k4(C12718qm c12718qm, int i, int i2) {
        if (c12718qm.mo59085x6() < 1000) {
            if (i2 == 1 && c12718qm.m59083m9()) {
                return;
            }
            if (i2 != 2 || c12718qm.mo59082dy()) {
                mo59109k4(c12718qm, i);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo59109k4(AbstractC12729ts abstractC12729ts, int i) {
        int i2;
        double d;
        int i3 = i;
        this.f42501wl = null;
        this.f42497u4 = null;
        int iM59377k4 = m59377k4();
        while (iM59377k4 < this.f42485fa) {
            kk kkVarM59375du = m59375du(iM59377k4);
            while (true) {
                if (kkVarM59375du == null) {
                    break;
                }
                if (kkVarM59375du.f42519k4 != i3) {
                    boolean[] zArr = {false};
                    int i4 = iM59377k4;
                    int iMo59101k4 = mo59101k4(kkVarM59375du, abstractC12729ts, i3, i4, zArr);
                    int i5 = i3;
                    mo54809k4(i5, zArr[0], iMo59101k4, i4);
                    if (!mo59111k4(abstractC12729ts, this.f42485fa, iMo59101k4)) {
                        i3 = i5;
                        iM59377k4 = i4;
                        break;
                    }
                    double dMo59112kk = mo59112kk(kkVarM59375du, iMo59101k4);
                    int i6 = this.f42491ks - kkVarM59375du.f42517h4;
                    int i7 = this.f42504yj - kkVarM59375du.f42514du;
                    if (dMo59112kk < -1.0d || abstractC12729ts.mo59082dy()) {
                        m59392x1(kkVarM59375du, i4);
                    }
                    int iM59405k4 = x1.m59405k4(dMo59112kk);
                    double dMo58928k4 = mo58928k4(kkVarM59375du, abstractC12729ts, iM59405k4, dMo59112kk);
                    if (dMo59112kk < -1.0d || dMo59112kk > this.f42493ne) {
                        i2 = iMo59101k4;
                        d = dMo58928k4;
                    } else {
                        i2 = iMo59101k4;
                        d = dMo58928k4;
                        m59383k4(kkVarM59375du, i2, dMo59112kk, d, iM59405k4, i6, i7);
                    }
                    if (!this.f42487ix || (dMo59112kk > -1.0d && dMo59112kk <= this.f42493ne)) {
                        i3 = i5;
                        iM59377k4 = i4;
                    } else {
                        int i8 = i2;
                        i3 = i5;
                        iM59377k4 = i4;
                        m59384k4(kkVarM59375du, iM59377k4, i3, i8, dMo59112kk, d, iM59405k4, i6, i7);
                    }
                }
                kkVarM59375du = kkVarM59375du.f42523up;
            }
            m59372k4(iM59377k4, i3);
            iM59377k4++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59383k4(kk kkVar, int i, double d, double d2, int i2, int i3, int i4) {
        if (d2 < this.f42495rv.m59404x1(i2)) {
            this.f42495rv.mo59121k4(d2, kkVar, d, i3, i4, i, i2);
            this.f42500uz = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59384k4(kk kkVar, int i, int i2, int i3, double d, double d2, int i4, int i5, int i6) {
        int i7 = this.f42499up;
        int i8 = i7;
        int i9 = this.f42504yj;
        int iMo58930ix = this.f42491ks;
        for (int i10 = i2; i10 < this.f42496to.size(); i10++) {
            AbstractC12729ts abstractC12729tsM59387to = m59387to(i10);
            if (abstractC12729tsM59387to.mo58895yj()) {
                break;
            }
            if (abstractC12729tsM59387to.mo58932x_()) {
                int iM59252rv = abstractC12729tsM59387to.m59252rv() + i8;
                int iMo58931ne = abstractC12729tsM59387to.mo58931ne() + i9;
                iMo58930ix = abstractC12729tsM59387to.mo58930ix() + iMo58930ix;
                i9 = iMo58931ne;
                i8 = iM59252rv;
            } else if (abstractC12729tsM59387to.mo59082dy() && i10 != i2) {
                break;
            }
        }
        if (d <= -1.0d) {
            kk kkVar2 = this.f42497u4;
            if (kkVar2 == null || d2 < kkVar2.f42513ck) {
                this.f42497u4 = mo59103k4(i2, i + 1, i4, i8, i9, iMo58930ix, d, i5, i6, i3, d2, kkVar);
                return;
            }
            return;
        }
        int i11 = i8;
        int i12 = i9;
        int i13 = iMo58930ix;
        kk kkVar3 = this.f42500uz;
        if (kkVar3 == null || d2 <= kkVar3.f42513ck) {
            if (this.f42486h4) {
                this.f42495rv.mo59121k4(d2, kkVar, d, i5, i6, i3, i4);
            }
            this.f42500uz = mo59103k4(i2, i + 1, i4, i11, i12, i13, d, i5, i6, i3, d2, kkVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo59111k4(AbstractC12729ts abstractC12729ts, int i, int i2) {
        return !abstractC12729ts.mo59086y_() || abstractC12729ts.mo59085x6() < 1000;
    }
}
