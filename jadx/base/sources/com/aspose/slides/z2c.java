package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7308ba;
import com.aspose.slides.internal.p332p7.C9030ve;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class z2c implements Comparable<z2c> {

    /* JADX INFO: renamed from: ak */
    private z2c f50441ak;

    /* JADX INFO: renamed from: ck */
    private int f50446ck;

    /* JADX INFO: renamed from: du */
    private double f50447du;

    /* JADX INFO: renamed from: fa */
    private int f50449fa;

    /* JADX INFO: renamed from: h4 */
    private double f50450h4;

    /* JADX INFO: renamed from: k4 */
    private bay f50453k4;

    /* JADX INFO: renamed from: kk */
    private double f50454kk;

    /* JADX INFO: renamed from: ks */
    private boolean f50455ks;

    /* JADX INFO: renamed from: ne */
    private double f50458ne;

    /* JADX INFO: renamed from: to */
    private double f50461to;

    /* JADX INFO: renamed from: up */
    private double f50464up;

    /* JADX INFO: renamed from: v4 */
    private double f50466v4;

    /* JADX INFO: renamed from: x1 */
    private SmartArtShape f50469x1;

    /* JADX INFO: renamed from: x6 */
    private double f50470x6;

    /* JADX INFO: renamed from: yj */
    private boolean f50472yj;

    /* JADX INFO: renamed from: m9 */
    private double f50457m9 = Double.NaN;

    /* JADX INFO: renamed from: dy */
    private double f50448dy = Double.NaN;

    /* JADX INFO: renamed from: c5 */
    private double f50445c5 = Double.NaN;

    /* JADX INFO: renamed from: jd */
    private double f50452jd = Double.NaN;

    /* JADX INFO: renamed from: ix */
    private double f50451ix = Double.NaN;

    /* JADX INFO: renamed from: u4 */
    private double f50462u4 = Double.NaN;

    /* JADX INFO: renamed from: uz */
    private double f50465uz = Double.NaN;

    /* JADX INFO: renamed from: wl */
    private double f50467wl = Double.NaN;

    /* JADX INFO: renamed from: qq */
    private double f50459qq = Double.NaN;

    /* JADX INFO: renamed from: ar */
    private boolean f50442ar = false;

    /* JADX INFO: renamed from: um */
    private boolean f50463um = false;

    /* JADX INFO: renamed from: bv */
    private boolean f50444bv = false;

    /* JADX INFO: renamed from: rv */
    private int f50460rv = 0;

    /* JADX INFO: renamed from: lr */
    private List<z2c> f50456lr = new List<>();

    /* JADX INFO: renamed from: b3 */
    private byte f50443b3 = -1;

    /* JADX INFO: renamed from: yd */
    private byte f50471yd = -1;

    /* JADX INFO: renamed from: wy */
    private Dictionary<Integer, Double> f50468wy = new Dictionary<>();

    public z2c(bay bayVar) {
        this.f50453k4 = bayVar;
    }

    /* JADX INFO: renamed from: k4 */
    private static Dictionary<Integer, Boolean> m74214k4(C0899df[] c0899dfArr, int i) {
        Dictionary<Integer, Boolean> dictionary = new Dictionary<>();
        for (C0899df c0899df : c0899dfArr) {
            if (c0899df.m5079h4() == 11) {
                int iM5085to = (int) (c0899df.m5085to() - 27273042316901L);
                if (iM5085to > i && c0899dfArr.length > (iM5085to = (int) ((-27273042329613L) - c0899df.m5085to())) && iM5085to > 0) {
                    iM5085to = (int) (c0899dfArr[iM5085to].m5083kk() - 27273042316901L);
                }
                dictionary.addItem(Integer.valueOf(iM5085to), Boolean.valueOf(C14113y2.m67359c5(C14113y2.m67368h4(c0899df.m5080k4()), "ang")));
            }
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: ss */
    private void m74219ss() {
        boolean z;
        jof jofVar;
        double d;
        z2c z2cVar;
        float f;
        SmartArtShape smartArtShape = this.f50469x1;
        if (smartArtShape != null) {
            nd1 nd1VarMo1214P_ = smartArtShape.mo1214P_();
            jof jofVarClone = m74215k4(m74235e0().Clone()).Clone();
            nd1VarMo1214P_.m67987k4(new tbp(jofVarClone.m63460k4(), jofVarClone.m63473x1()));
            this.f50469x1.mo1650kk(new tbp(jofVarClone.m63453c5(), jofVarClone.m63459jd()));
            if (this.f50453k4.m5147up().m71873kk().m28359fa() != -1) {
                nd1VarMo1214P_.m67983k4(this.f50453k4.m5147up().m71873kk().m28359fa());
            }
            if (this.f50453k4.m5147up().m71873kk().m28351ck() != -1) {
                nd1VarMo1214P_.m67991x1(this.f50453k4.m5147up().m71873kk().m28351ck());
            }
            if (this.f50469x1.m2820kk() == null || m74275uz() == 0) {
                return;
            }
            double dM67988kk = !C14044b3.m66437kk((double) nd1VarMo1214P_.m67988kk()) ? nd1VarMo1214P_.m67988kk() % 360.0f : 0.0d;
            if (dM67988kk < 0.0d) {
                dM67988kk += 360.0d;
            }
            jof jofVar2 = new jof();
            if (this.f50442ar) {
                double dM74233dy = m74233dy();
                double dM74236fa = m74236fa();
                byte anchoringType = this.f50469x1.m2820kk().f3519k4.getAnchoringType();
                double dM74228ck = anchoringType != 0 ? anchoringType != 2 ? (m74228ck() - dM74236fa) / 2.0d : m74228ck() - dM74236fa : 0.0d;
                float[] fArr = {0.0f};
                m74216k4(m74215k4(new jof(m74269to(), m74231du() + dM74228ck, m74269to() + dM74233dy, m74231du() + dM74228ck + dM74236fa)).Clone(), dM67988kk, nd1VarMo1214P_.m67980du() == 1, fArr).CloneTo(jofVar2);
                f = fArr[0];
                z2cVar = this;
            } else {
                double d2 = dM67988kk;
                float[] fArr2 = {0.0f};
                jof jofVarClone2 = jofVarClone.Clone();
                if (nd1VarMo1214P_.m67980du() == 1) {
                    z = true;
                    d = d2;
                    jofVar = jofVarClone2;
                } else {
                    z = false;
                    jofVar = jofVarClone2;
                    d = d2;
                }
                z2cVar = this;
                z2cVar.m74216k4(jofVar, d, z, fArr2).CloneTo(jofVar2);
                f = fArr2[0];
            }
            if (z2cVar.f50469x1.mo272to().m4914m9() == null) {
                z2cVar.f50469x1.mo272to().m4909k4(new C9030ve());
                z2cVar.f50469x1.mo272to().m4914m9().m43006x1();
                z2cVar.f50469x1.mo272to().m4914m9().m43000k4();
            }
            C9030ve c9030veM4914m9 = z2cVar.f50469x1.mo272to().m4914m9();
            c9030veM4914m9.m43004m9().m28297k4(jofVar2.m63453c5());
            c9030veM4914m9.m43004m9().m28299x1(jofVar2.m63459jd());
            c9030veM4914m9.m42999h4().m45890k4(jofVar2.m63460k4());
            c9030veM4914m9.m42999h4().m45892x1(jofVar2.m63473x1());
            c9030veM4914m9.m43001k4(f);
            z2cVar.f50470x6 = jofVar2.m63453c5();
            z2cVar.f50458ne = jofVar2.m63459jd();
        }
    }

    /* JADX INFO: renamed from: ak */
    public final byte m74220ak() {
        return this.f50471yd;
    }

    /* JADX INFO: renamed from: ar */
    public final double m74221ar() {
        return this.f50465uz;
    }

    /* JADX INFO: renamed from: b3 */
    public final boolean m74222b3() {
        return this.f50444bv || this.f50463um;
    }

    /* JADX INFO: renamed from: bv */
    public final double m74223bv() {
        return C14044b3.m66437kk(this.f50451ix) ? m74277wl() : this.f50451ix;
    }

    /* JADX INFO: renamed from: bz */
    public final void m74224bz() {
        this.f50461to = 0.0d;
        this.f50454kk = 0.0d;
        m74219ss();
    }

    /* JADX INFO: renamed from: c5 */
    public final double m74225c5() {
        return this.f50453k4.m4082k4() == null ? this.f50453k4.m4099m9().m72922rv().m3357x1().getWidth() : C14044b3.m66437kk(this.f50457m9) ? m74233dy() : C14116yg.m67502x1(m74233dy(), this.f50457m9);
    }

    /* JADX INFO: renamed from: c6 */
    public final jof[] m74227c6() {
        List list = new List();
        m74218k4(this.f50453k4.m4073du(), this.f50453k4, (List<jof>) list);
        return (jof[]) list.toArray(new jof[0]);
    }

    /* JADX INFO: renamed from: ck */
    public final double m74228ck() {
        return m74236fa() * m74243k4().m4066ar().f49091x1;
    }

    /* JADX INFO: renamed from: dq */
    public final z2c m74230dq() {
        return this.f50441ak;
    }

    /* JADX INFO: renamed from: du */
    public final double m74231du() {
        return this.f50461to;
    }

    /* JADX INFO: renamed from: dy */
    public final double m74233dy() {
        return this.f50447du;
    }

    /* JADX INFO: renamed from: e0 */
    public final jof m74235e0() {
        tbp tbpVarClone = m74243k4().m4066ar().Clone();
        jof jofVar = new jof(m74269to(), m74231du(), m74269to() + m74233dy(), m74231du() + m74236fa());
        if (tbpVarClone.f49090k4 == 1.0d && tbpVarClone.f49091x1 == 1.0d) {
            return jofVar;
        }
        return new jof(jofVar.m63460k4(), jofVar.m63473x1(), jofVar.m63460k4() + m74262m9(), jofVar.m63473x1() + m74228ck());
    }

    /* JADX INFO: renamed from: fa */
    public final double m74236fa() {
        return this.f50450h4;
    }

    /* JADX INFO: renamed from: g8 */
    public final void m74237g8() {
        jof jofVarClone = m74288xk().Clone();
        this.f50447du = jofVarClone.m63453c5();
        this.f50450h4 = jofVarClone.m63459jd();
        this.f50454kk = jofVarClone.m63460k4();
        this.f50461to = jofVarClone.m63473x1();
        m74219ss();
    }

    /* JADX INFO: renamed from: h4 */
    public final tbp m74238h4() {
        bay bayVarM4082k4 = m74243k4().m4082k4();
        return bayVarM4082k4 != null ? new tbp(this.f50454kk - bayVarM4082k4.m4074dy().f50454kk, this.f50461to - bayVarM4082k4.m4074dy().f50461to) : new tbp(this.f50454kk, this.f50461to);
    }

    /* JADX INFO: renamed from: ix */
    public final boolean m74240ix() {
        C1131g4 c1131g4 = (C1131g4) C7019kk.m27452k4((Object) this.f50453k4.m4077jd(), C1131g4.class);
        return (c1131g4 == null || c1131g4.mo3649kk()) ? false : true;
    }

    /* JADX INFO: renamed from: jd */
    public final double m74241jd() {
        return C14044b3.m66437kk(this.f50445c5) ? m74233dy() : this.f50445c5;
    }

    /* JADX INFO: renamed from: kk */
    public final double m74255kk() {
        return this.f50464up;
    }

    /* JADX INFO: renamed from: ks */
    public final int m74260ks() {
        return this.f50446ck;
    }

    /* JADX INFO: renamed from: lr */
    public final boolean m74261lr() {
        return this.f50463um;
    }

    /* JADX INFO: renamed from: m9 */
    public final double m74262m9() {
        return m74233dy() * m74243k4().m4066ar().f49090k4;
    }

    /* JADX INFO: renamed from: ne */
    public final boolean m74264ne() {
        return this.f50455ks;
    }

    /* JADX INFO: renamed from: qm */
    public final void m74265qm() {
        SmartArtShape smartArtShape = this.f50469x1;
        if (smartArtShape != null) {
            smartArtShape.m2819k4((TextFrame) null);
        }
        this.f50450h4 = 0.0d;
        this.f50447du = 0.0d;
        this.f50448dy = Double.NaN;
        this.f50457m9 = Double.NaN;
        this.f50452jd = Double.NaN;
        this.f50445c5 = Double.NaN;
        this.f50462u4 = Double.NaN;
        this.f50451ix = Double.NaN;
        this.f50444bv = false;
        this.f50463um = false;
        this.f50442ar = false;
        m74224bz();
        this.f50456lr.clear();
        this.f50468wy.clear();
    }

    /* JADX INFO: renamed from: qq */
    public final double m74266qq() {
        double d = this.f50458ne;
        return d == 0.0d ? m74228ck() : d;
    }

    /* JADX INFO: renamed from: rv */
    public final int m74267rv() {
        return this.f50449fa;
    }

    /* JADX INFO: renamed from: sv */
    public final void m74268sv() {
        this.f50462u4 = m74266qq();
        this.f50451ix = m74277wl();
    }

    /* JADX INFO: renamed from: to */
    public final double m74269to() {
        return this.f50454kk;
    }

    /* JADX INFO: renamed from: ts */
    public final jof[] m74271ts() {
        List list = new List();
        m74217k4((AbstractC0906dm) null, this.f50453k4, (List<jof>) list);
        return (jof[]) list.toArray(new jof[0]);
    }

    /* JADX INFO: renamed from: u4 */
    public final boolean m74272u4() {
        if (this.f50453k4.m4076h4().size() <= 0 || m74280x1() == null || m74280x1().m2820kk() == null) {
            return false;
        }
        return !C14113y2.m67363du(m74280x1().m2820kk().getText(), C14113y2.f47374k4) || m74280x1().m2820kk().getParagraphs().getCount() > 1;
    }

    /* JADX INFO: renamed from: um */
    public final double m74273um() {
        return this.f50467wl;
    }

    /* JADX INFO: renamed from: up */
    public final double m74274up() {
        return this.f50453k4.m4082k4() == null ? this.f50453k4.m4099m9().m72922rv().m3357x1().getHeight() : C14044b3.m66437kk(this.f50448dy) ? m74236fa() : C14116yg.m67502x1(m74236fa(), this.f50448dy);
    }

    /* JADX INFO: renamed from: uz */
    public final int m74275uz() {
        return this.f50460rv;
    }

    /* JADX INFO: renamed from: v4 */
    public final double m74276v4() {
        return C14044b3.m66437kk(this.f50462u4) ? m74266qq() : this.f50462u4;
    }

    /* JADX INFO: renamed from: wl */
    public final double m74277wl() {
        double d = this.f50470x6;
        return d == 0.0d ? m74262m9() : d;
    }

    /* JADX INFO: renamed from: wp */
    public final void m74278wp() {
        this.f50442ar = true;
        List.Enumerator<bay> it = m74243k4().m4110x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m4074dy().m74278wp();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: wy */
    public final byte m74279wy() {
        return this.f50443b3;
    }

    /* JADX INFO: renamed from: x1 */
    public final SmartArtShape m74280x1() {
        return this.f50469x1;
    }

    /* JADX INFO: renamed from: x6 */
    public final boolean m74287x6() {
        return this.f50472yj;
    }

    /* JADX INFO: renamed from: xk */
    public final jof m74288xk() {
        List<bay> listM4068bv = this.f50453k4.m4068bv();
        if (listM4068bv.size() > 0) {
            List.Enumerator<bay> it = listM4068bv.iterator();
            boolean z = false;
            double dM67502x1 = -1.7976931348623157E308d;
            double dM67502x12 = -1.7976931348623157E308d;
            double dM67491kk = Double.MAX_VALUE;
            double dM67491kk2 = Double.MAX_VALUE;
            while (it.hasNext()) {
                try {
                    jof jofVarClone = it.next().m4074dy().m74235e0().Clone();
                    if (jofVarClone.m63453c5() != 0.0d && jofVarClone.m63459jd() != 0.0d) {
                        dM67491kk2 = C14116yg.m67491kk(dM67491kk2, jofVarClone.m63460k4());
                        dM67491kk = C14116yg.m67491kk(dM67491kk, jofVarClone.m63473x1());
                        dM67502x1 = C14116yg.m67502x1(dM67502x1, jofVarClone.m63464kk());
                        dM67502x12 = C14116yg.m67502x1(dM67502x12, jofVarClone.m63470to());
                        z = true;
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (z) {
                return new jof(dM67491kk2, dM67491kk, dM67502x1, dM67502x12);
            }
        }
        return new jof();
    }

    /* JADX INFO: renamed from: yd */
    public final boolean m74289yd() {
        return this.f50444bv;
    }

    /* JADX INFO: renamed from: yj */
    public final double m74290yj() {
        return C14044b3.m66437kk(this.f50452jd) ? m74236fa() : this.f50452jd;
    }

    /* JADX INFO: renamed from: fa */
    private void m74213fa(double d) {
        if (this.f50469x1 != null) {
            this.f50466v4 = d;
            if (this.f50453k4.m5147up().m71873kk().m28364jd() != 0) {
                d = ((((double) this.f50453k4.m5147up().m71873kk().m28364jd()) / 60000.0d) + d) % 360.0d;
            }
            if ((this.f50453k4.m5147up().m71873kk().m28359fa() == 1) ^ (this.f50453k4.m5147up().m71873kk().m28351ck() == 1)) {
                d = (360.0d - d) % 360.0d;
            }
            this.f50469x1.m2816k4(d);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final void m74226c5(double d) {
        this.f50465uz = d;
    }

    /* JADX INFO: renamed from: ck */
    public final void m74229ck(double d) {
        m74213fa(d);
        m74219ss();
    }

    /* JADX INFO: renamed from: du */
    public final void m74232du(double d) {
        this.f50445c5 = d;
    }

    /* JADX INFO: renamed from: dy */
    public final void m74234dy(double d) {
        this.f50452jd = d;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m74239h4(double d) {
        this.f50450h4 = d;
        m74219ss();
    }

    /* JADX INFO: renamed from: jd */
    public final void m74242jd(double d) {
        this.f50467wl = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final bay m74243k4() {
        return this.f50453k4;
    }

    /* JADX INFO: renamed from: kk */
    public final double m74256kk(int i) {
        if (this.f50468wy.containsKey(Integer.valueOf(i))) {
            return this.f50468wy.get_Item(Integer.valueOf(i)).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m74263m9(double d) {
        this.f50448dy = d;
    }

    /* JADX INFO: renamed from: to */
    public final void m74270to(double d) {
        this.f50457m9 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74281x1(byte b) {
        this.f50471yd = b;
    }

    /* JADX INFO: renamed from: k4 */
    private jof m74215k4(jof jofVar) {
        if (this.f50464up == 0.0d) {
            return jofVar;
        }
        jof jofVar2 = new jof();
        jof[] jofVarArr = {jofVar2};
        tbp tbpVarClone = yz6.m74164k4(new tbp(jofVar.m63453c5(), jofVar.m63459jd()), this.f50464up, jofVarArr).Clone();
        jofVarArr[0].CloneTo(jofVar2);
        double dM74262m9 = ((m74262m9() - jofVar2.m63453c5()) / 2.0d) - jofVar2.m63460k4();
        double dM74228ck = ((m74228ck() - jofVar2.m63459jd()) / 2.0d) - jofVar2.m63473x1();
        double dM63460k4 = jofVar.m63460k4() + dM74262m9;
        double dM63473x1 = jofVar.m63473x1() + dM74228ck;
        return new jof(dM63460k4, dM63473x1, dM63460k4 + tbpVarClone.f49090k4, dM63473x1 + tbpVarClone.f49091x1);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public final int compareTo(z2c z2cVar) {
        int iM74260ks = m74260ks() + m74267rv();
        int iM74260ks2 = z2cVar.m74260ks() + z2cVar.m74267rv();
        if (iM74260ks != iM74260ks2) {
            return (iM74260ks >= 0 || iM74260ks2 >= 0 || !m74240ix() || !z2cVar.m74240ix()) ? iM74260ks > iM74260ks2 ? 1 : -1 : iM74260ks < iM74260ks2 ? 1 : -1;
        }
        if (m74260ks() > z2cVar.m74260ks()) {
            return 1;
        }
        if (m74260ks() < z2cVar.m74260ks()) {
            return -1;
        }
        if (m74267rv() == z2cVar.m74267rv()) {
            return 0;
        }
        return m74267rv() > z2cVar.m74267rv() ? 1 : -1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74282x1(double d) {
        this.f50461to = d;
        List.Enumerator<bay> it = this.f50453k4.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m4074dy().m74282x1(d);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m74219ss();
    }

    /* JADX INFO: renamed from: k4 */
    private jof m74216k4(jof jofVar, double d, boolean z, float[] fArr) {
        double dM56575x1;
        C12007ix c12007ixClone = this.f50469x1.m1591yj().m3313k4(oju.f47834kk.Clone(), new oju((float) jofVar.m63453c5(), (float) jofVar.m63459jd())).Clone();
        C4317dy c4317dy = new C4317dy();
        tbp tbpVarClone = jofVar.m63454ck().Clone();
        c4317dy.m17338k4((float) d, new C12025x6((float) tbpVarClone.f49090k4, (float) tbpVarClone.f49091x1));
        C12025x6 c12025x6Clone = c4317dy.m17333k4(new C12025x6((float) (jofVar.m63460k4() + ((double) c12007ixClone.m56557jd()) + ((double) (c12007ixClone.m56550c5() / 2.0f))), (float) (jofVar.m63473x1() + ((double) c12007ixClone.m56551ck()) + ((double) (c12007ixClone.m56575x1() / 2.0f)) + ((double) ((float) (z ? jofVar.m63459jd() - ((double) c12007ixClone.m56575x1()) : 0.0d)))))).Clone();
        double dM56575x12 = c12007ixClone.m56575x1() / 2.0f;
        double dM56550c5 = c12007ixClone.m56550c5() / 2.0f;
        double d2 = this.f50466v4 % 360.0d;
        float f = 0.0f;
        fArr[0] = 0.0f;
        if (m74275uz() == 2) {
            if (d2 > 90.0d && d2 < 270.0d) {
                f = 180.0f;
            }
            fArr[0] = f;
        } else {
            if (d2 <= 45.0d || d2 >= 135.0d) {
                if (d2 >= 135.0d && d2 <= 225.0d) {
                    fArr[0] = 180.0f;
                } else if (d2 > 225.0d && d2 < 315.0d) {
                    dM56575x1 = c12007ixClone.m56575x1() / 2.0f;
                    fArr[0] = 90.0f;
                }
                if (z && ((d2 >= 0.0d && d2 <= 45.0d) || d2 >= 315.0d)) {
                    fArr[0] = fArr[0] + 180.0f;
                }
            } else {
                dM56575x1 = c12007ixClone.m56575x1() / 2.0f;
                fArr[0] = 270.0f;
            }
            dM56550c5 = dM56575x1;
            dM56575x12 = dM56550c5;
            if (z) {
                fArr[0] = fArr[0] + 180.0f;
            }
        }
        return new jof(((double) c12025x6Clone.m56897x1()) - dM56550c5, ((double) c12025x6Clone.m56895kk()) - dM56575x12, ((double) c12025x6Clone.m56897x1()) + dM56550c5, ((double) c12025x6Clone.m56895kk()) + dM56575x12);
    }

    /* JADX INFO: renamed from: kk */
    public final tbp m74258kk(boolean z) {
        List.Enumerator<bay> it = this.f50453k4.m4110x1().iterator();
        double d = 0.0d;
        double d2 = 0.0d;
        while (it.hasNext()) {
            try {
                bay next = it.next();
                double dM74262m9 = z ? next.m4074dy().m74262m9() : next.m4074dy().m74241jd();
                double dM74228ck = z ? next.m4074dy().m74228ck() : next.m4074dy().m74290yj();
                if (d2 < dM74262m9) {
                    d2 = dM74262m9;
                }
                if (d < dM74228ck) {
                    d = dM74228ck;
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
        return new tbp(d2, d);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74283x1(double d, double d2) {
        if (d == 0.0d && d2 == 0.0d) {
            return;
        }
        List.Enumerator<z2c> it = this.f50456lr.iterator();
        while (it.hasNext()) {
            try {
                it.next().m74246k4(d, d2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74244k4(byte b) {
        this.f50443b3 = b;
    }

    /* JADX INFO: renamed from: kk */
    public final void m74259kk(double d) {
        this.f50447du = d;
        m74277wl();
        m74266qq();
        m74219ss();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74284x1(int i) {
        this.f50460rv = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74245k4(double d) {
        this.f50454kk = d;
        List.Enumerator<bay> it = this.f50453k4.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m4074dy().m74245k4(d);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m74219ss();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74285x1(z2c z2cVar) {
        this.f50456lr.addItem(z2cVar);
        z2cVar.f50441ak = this;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74246k4(double d, double d2) {
        if (d == 0.0d && d2 == 0.0d) {
            return;
        }
        this.f50454kk += d;
        this.f50461to += d2;
        List.Enumerator<bay> it = this.f50453k4.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                it.next().m4074dy().m74246k4(d, d2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m74219ss();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74286x1(boolean z) {
        this.f50444bv = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74247k4(int i) {
        this.f50449fa = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74248k4(int i, double d) {
        if (this.f50468wy.containsKey(Integer.valueOf(i))) {
            this.f50468wy.set_Item(Integer.valueOf(i), Double.valueOf(d));
        } else {
            this.f50468wy.addItem(Integer.valueOf(i), Double.valueOf(d));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74249k4(AutoShape autoShape) {
        SmartArtShape smartArtShape = this.f50469x1;
        if (smartArtShape != null) {
            smartArtShape.m2818k4(autoShape);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74250k4(SmartArt smartArt, vcq vcqVar) {
        this.f50446ck = vcqVar.m72177dy();
        double dM72178h4 = vcqVar.m72178h4() % 360.0d;
        this.f50464up = dM72178h4;
        if (dM72178h4 < 0.0d) {
            this.f50464up = dM72178h4 + 360.0d;
        }
        this.f50472yj = vcqVar.m72176du();
        this.f50455ks = vcqVar.m72175c5();
        if (this.f50469x1 == null) {
            SmartArtShape smartArtShape = new SmartArtShape(smartArt, this);
            this.f50469x1 = smartArtShape;
            smartArtShape.mo272to().m4913kk(this.f50453k4.m5144ks());
            if (this.f50453k4.m5147up().m71866h4() != -1) {
                this.f50469x1.m2817k4(this.f50453k4.m5147up().m71866h4());
                if (this.f50469x1.getShapeType() == 8) {
                    this.f50469x1.m1591yj().m3334x1()[0].m64508k4(false);
                }
            } else if (!vcqVar.m72181to()) {
                this.f50469x1.m2817k4(vcqVar.m72180kk());
                if (vcqVar.m72179jd() != null) {
                    C13760l2 c13760l2M64255c5 = this.f50469x1.m1591yj().m3314k4().m64255c5();
                    Dictionary<Integer, Boolean> dictionaryM74214k4 = m74214k4(c13760l2M64255c5.m64273to(), c13760l2M64255c5.m64270k4().length);
                    for (C7308ba c7308ba : vcqVar.m72179jd()) {
                        int iM28756k4 = ((int) c7308ba.m28756k4()) - 1;
                        if (this.f50469x1.getAdjustments().size() > iM28756k4) {
                            if (dictionaryM74214k4.containsKey(Integer.valueOf(iM28756k4)) && dictionaryM74214k4.get_Item(Integer.valueOf(iM28756k4)).booleanValue()) {
                                this.f50469x1.getAdjustments().get_Item(iM28756k4).setAngleValue((float) (c7308ba.m28757x1() < 0.0d ? c7308ba.m28757x1() + 360.0d : c7308ba.m28757x1()));
                            } else {
                                this.f50469x1.getAdjustments().get_Item(iM28756k4).setRawValue(C7019kk.m27438h4(Double.valueOf(c7308ba.m28757x1() * 100000.0d), 14));
                            }
                        }
                    }
                }
            }
            m74213fa(this.f50464up);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74217k4(AbstractC0906dm abstractC0906dm, bay bayVar, List<jof> list) {
        if (bayVar.m4071dq() && (abstractC0906dm == null || bayVar.m4073du() == abstractC0906dm)) {
            list.addItem(bayVar.m4074dy().m74235e0().Clone());
        }
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                m74217k4(abstractC0906dm, it.next(), list);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74251k4(nd1 nd1Var) {
        jof jofVar;
        boolean z;
        cpm cpmVar = (cpm) C7019kk.m27452k4((Object) m74243k4().m4077jd(), cpm.class);
        if (cpmVar != null) {
            this.f50460rv = ((h4g) cpmVar.m3643k4()).m7005kk();
            float fM67988kk = C14064he.m66715kk(nd1Var.m67988kk()) ? 0.0f : nd1Var.m67988kk();
            double d = fM67988kk;
            this.f50466v4 = d;
            C9030ve c9030veM4914m9 = this.f50469x1.mo272to().m4914m9();
            if (c9030veM4914m9 != null) {
                tbp tbpVarClone = nd1Var.m67982k4().Clone();
                tbp tbpVarClone2 = tbp.m71054k4(tbpVarClone, nd1Var.m67990x1()).Clone();
                jof jofVar2 = new jof(tbpVarClone.f49090k4, tbpVarClone.f49091x1, tbpVarClone2.f49090k4, tbpVarClone2.f49091x1);
                float[] fArr = {0.0f};
                jof jofVarClone = jofVar2.Clone();
                if (nd1Var.m67980du() == 1) {
                    z = true;
                    jofVar = jofVarClone;
                } else {
                    jofVar = jofVarClone;
                    z = false;
                }
                jof jofVarClone2 = m74216k4(jofVar, d, z, fArr).Clone();
                float f = fArr[0];
                c9030veM4914m9.m43004m9().m28299x1(jofVarClone2.m63459jd());
                c9030veM4914m9.m43004m9().m28297k4(jofVarClone2.m63453c5());
                c9030veM4914m9.m42999h4().m45890k4(C14116yg.m67491kk(jofVarClone2.m63453c5(), 0.0d) + jofVarClone2.m63460k4());
                c9030veM4914m9.m42999h4().m45892x1(C14116yg.m67491kk(jofVarClone2.m63459jd(), 0.0d) + jofVarClone2.m63473x1());
                float rotationAngle = this.f50469x1.m2820kk() != null ? this.f50469x1.m2820kk().m2908jd().getRotationAngle() : 0.0f;
                if (!C14064he.m66715kk(rotationAngle)) {
                    c9030veM4914m9.m43001k4(fM67988kk + rotationAngle);
                    return;
                } else {
                    if (c9030veM4914m9.m43003kk() == 0.0f || c9030veM4914m9.m43003kk() == fM67988kk) {
                        c9030veM4914m9.m43001k4(f);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        C1258im c1258imClone = C1258im.f5731k4.Clone();
        if (this.f50469x1.mo272to().m4914m9() != null) {
            tbp tbpVar = new tbp();
            tbp tbpVar2 = new tbp();
            tbp[] tbpVarArr = {tbpVar};
            tbp[] tbpVarArr2 = {tbpVar2};
            C1258im[] c1258imArr = {c1258imClone};
            ai9.m3628k4(this.f50469x1.mo272to().m4914m9(), tbpVarArr, tbpVarArr2, c1258imArr);
            tbpVarArr[0].CloneTo(tbpVar);
            tbpVarArr2[0].CloneTo(tbpVar2);
            c1258imArr[0].CloneTo(c1258imClone);
            if (c1258imClone.f5734x1 == 0.0f) {
                this.f50469x1.mo272to().m4914m9().m43001k4(-nd1Var.m67988kk());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74218k4(C14244on c14244on, bay bayVar, List<jof> list) {
        if (c14244on == bayVar.m4073du() || c14244on.m68732x1().containsItem(bayVar.m4073du())) {
            if (bayVar.m4071dq()) {
                list.addItem(bayVar.m4074dy().m74235e0().Clone());
            }
            List.Enumerator<bay> it = bayVar.m4110x1().iterator();
            while (it.hasNext()) {
                try {
                    m74218k4(c14244on, it.next(), list);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74252k4(tbp tbpVar) {
        tbp tbpVarClone = m74238h4().Clone();
        m74246k4(tbpVar.f49090k4 - tbpVarClone.f49090k4, tbpVar.f49091x1 - tbpVarClone.f49091x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74253k4(boolean z) {
        this.f50463um = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m74254k4(z2c z2cVar) {
        return this.f50456lr.containsItem(z2cVar);
    }
}
