package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.x3 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14763x3 extends AbstractC14770x9 {

    /* JADX INFO: renamed from: c5 */
    private int f49899c5;

    /* JADX INFO: renamed from: dy */
    private C14787xi f49901dy;

    /* JADX INFO: renamed from: m9 */
    private AbstractC14763x3 f49906m9;

    /* JADX INFO: renamed from: k4 */
    List<nxm> f49904k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    List<C13847mr> f49908x1 = new List<>();

    /* JADX INFO: renamed from: kk */
    protected C14713vw f49905kk = new C14713vw(1000.0f, 1000.0f);

    /* JADX INFO: renamed from: to */
    float f49907to = 0.0f;

    /* JADX INFO: renamed from: du */
    float f49900du = 0.0f;

    /* JADX INFO: renamed from: h4 */
    protected double f49902h4 = 0.0d;

    /* JADX INFO: renamed from: jd */
    private Dictionary<String, C12015qq> f49903jd = new Dictionary<>();

    public AbstractC14763x3(C14787xi c14787xi) {
        this.f49901dy = c14787xi;
        if (m73026k4().m73384dy().getTickLabelPosition() == 3 || !m73026k4().m73384dy().isVisible()) {
            mo63967x1(false);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final void m73018c5() {
        if (m73021fa() == null) {
            return;
        }
        if (this.f49908x1.get_Item(0).m64945h4().getType() == 77) {
            this.f49899c5 = 2;
            return;
        }
        if (m73021fa().m73026k4().m73384dy().getCrossType() == 0) {
            m73021fa().f49902h4 = 0.0d;
            return;
        }
        if (m73021fa().m73026k4().m73384dy().getCrossType() != 2) {
            return;
        }
        if (m73021fa().f49902h4 <= m73021fa().m73026k4().m73410ne()) {
            if (m73021fa().m73026k4().m73384dy().isPlotOrderReversed()) {
                this.f49899c5 = 2;
            } else {
                this.f49899c5 = 1;
            }
        }
    }

    /* JADX INFO: renamed from: ck */
    public final float m73019ck() {
        return C14116yg.m67480k4((m73026k4().m73386h4() / 90.0f) * (m73026k4().m73400kk().m56638du() / 2.0f));
    }

    /* JADX INFO: renamed from: du */
    public abstract void mo4962du(C14713vw c14713vw);

    /* JADX INFO: renamed from: du */
    public final boolean m73020du() {
        return C7019kk.m27469x1(this, d6s.class) || C7019kk.m27469x1(this, tsh.class) || C7019kk.m27469x1(this, f2h.class) || C7019kk.m27469x1(this, iuf.class);
    }

    /* JADX INFO: renamed from: dy */
    public abstract void mo4963dy();

    /* JADX INFO: renamed from: fa */
    public final AbstractC14763x3 m73021fa() {
        return this.f49906m9;
    }

    /* JADX INFO: renamed from: h4 */
    public abstract C12015qq mo3034h4(C14713vw c14713vw);

    /* JADX INFO: renamed from: h4 */
    public String mo3035h4() {
        return m73026k4().m73384dy().getNumberFormat();
    }

    /* JADX INFO: renamed from: ix */
    public final int m73022ix() {
        return this.f49899c5;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0 A[PHI: r3
      0x00a0: PHI (r3v9 double) = (r3v7 double), (r3v8 double) binds: [B:26:0x009e, B:29:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: jd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m73023jd() {
        boolean z;
        AbstractC14763x3 abstractC14763x3M73021fa;
        double dM73410ne;
        if (m73021fa().m73026k4().m73384dy().getCrossType() == 0) {
            if (C7019kk.m27469x1(m73021fa(), ValueAxisBase.class)) {
                abstractC14763x3M73021fa = m73021fa();
                dM73410ne = 0.0d;
            } else {
                abstractC14763x3M73021fa = m73021fa();
                dM73410ne = m73021fa().m73026k4().m73410ne();
            }
            abstractC14763x3M73021fa.f49902h4 = dM73410ne;
            z = true;
        } else {
            z = false;
        }
        if (m73021fa().m73026k4().m73384dy().getCrossType() == 2 || z) {
            int iM69819to = C14365qy.m69819to(this.f49908x1);
            if (m73021fa().m73026k4().m73375b3() || m73021fa().m73026k4().m73423wy().m69834fa().hasDataTable()) {
                iM69819to++;
            }
            int i = iM69819to > 1 ? iM69819to : 2;
            double d = m73021fa().f49902h4;
            if (m73021fa().m73026k4().m73384dy().getCrossType() == 1) {
                d = i;
            }
            double d2 = i;
            if (d > d2) {
                d = d2;
            } else {
                d2 = 1;
                if (d < d2) {
                }
            }
            if (m73021fa().m73026k4().m73384dy().isPlotOrderReversed()) {
                if (d == 1) {
                    this.f49899c5 = 3;
                }
            } else if (d == 1) {
                this.f49899c5 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract float mo4964k4(double d);

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m73024k4(String str) {
        if (this.f49903jd.containsKey(str)) {
            return this.f49903jd.get_Item(str);
        }
        C12015qq c12015qqClone = m73017k4(str, false).Clone();
        this.f49903jd.addItem(str, c12015qqClone.Clone());
        return c12015qqClone;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [float, java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r2v10, types: [float, java.lang.String] */
    /* JADX INFO: renamed from: kk */
    public final float m73030kk() {
        float fM56639dy = (m73026k4().m73425x1().m56639dy() * m73026k4().m73425x1().m56651x1().m56536x1(0)) / m73026k4().m73425x1().m56651x1().m56535to(0);
        m73026k4().m73425x1().m56651x1().m56532kk(0);
        return StringBuffer.append((String) m73026k4().m73425x1().m56639dy());
    }

    /* JADX INFO: renamed from: ks */
    public abstract C12015qq mo4966ks();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX INFO: renamed from: m9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m73033m9() {
        int tickLabelPosition = m73026k4().m73384dy().getTickLabelPosition();
        if (tickLabelPosition == 0) {
            this.f49899c5 = m73020du() ? 2 : 3;
            if (m73021fa().m73026k4().m73384dy().isPlotOrderReversed()) {
                this.f49899c5 = m73020du() ? 1 : 0;
                return;
            }
            return;
        }
        if (tickLabelPosition == 1) {
            this.f49899c5 = m73020du() ? 1 : 0;
            if (m73021fa().m73026k4().m73384dy().isPlotOrderReversed()) {
                this.f49899c5 = m73020du() ? 2 : 3;
                return;
            }
            return;
        }
        if (tickLabelPosition != 2) {
            if (tickLabelPosition != 3) {
                return;
            }
            this.f49899c5 = m73020du() ? 1 : 0;
            return;
        }
        if (m73021fa() == null) {
            this.f49899c5 = 1;
        } else if (m73021fa().m73026k4().m73384dy().getCrossType() != 0) {
            if (m73021fa().m73026k4().m73384dy().getCrossType() == 1 && !m73021fa().m73026k4().m73384dy().isPlotOrderReversed() && (m73036to() != 1 || m73021fa().m73036to() != 3)) {
                if (m73020du()) {
                }
                this.f49899c5 = i;
            }
            this.f49899c5 = m73020du() ? 1 : 0;
        } else if (m73021fa().m73026k4().m73384dy().isPlotOrderReversed()) {
            if (m73020du()) {
                i = 2;
            }
            this.f49899c5 = i;
        } else {
            if (m73036to() == 2 && m73021fa().m73036to() == 0) {
                if (m73020du()) {
                }
                this.f49899c5 = i;
            }
            this.f49899c5 = m73020du() ? 1 : 0;
        }
        mo4963dy();
    }

    /* JADX INFO: renamed from: ne */
    public final float m73034ne() {
        if (!mo3221T_()) {
            return 0.0f;
        }
        float fM56638du = m73026k4().m73400kk().m56638du() / (m73020du() ? 2.8f : 4.0f);
        return (((float) (((double) (m73026k4().m73384dy().getLabelOffset() & 65535)) / 100.0d)) * fM56638du) + fM56638du;
    }

    /* JADX INFO: renamed from: rv */
    public final C12015qq m73035rv() {
        if (!mo3221T_()) {
            return new C12015qq(m73225wy(), 0.0f);
        }
        if (m73026k4().m73384dy().getTickLabelPosition() == 2) {
            float fM73203ak = m73021fa().m73203ak();
            float fMo63718up = m73021fa().mo63718up();
            if (!m73021fa().m73026k4().m73384dy().isPlotOrderReversed()) {
                if (m73026k4().m73384dy().getPosition() == 0) {
                    float fM73203ak2 = (fMo63718up + m73203ak()) - fM73203ak;
                    return fM73203ak2 > 0.0f ? new C12015qq(m73225wy(), fM73203ak2) : new C12015qq(m73225wy(), 0.0f);
                }
                float fM73203ak3 = fMo63718up - m73203ak();
                return fM73203ak3 < 0.0f ? new C12015qq(m73225wy(), fM73203ak3 * (-1.0f)) : new C12015qq(m73225wy(), 0.0f);
            }
            if (m73026k4().m73384dy().getPosition() == 3) {
                float fM73203ak4 = fMo63718up - m73203ak();
                return fM73203ak4 < 0.0f ? new C12015qq(m73225wy(), -fM73203ak4) : new C12015qq(m73225wy(), 0.0f);
            }
        }
        return new C12015qq(m73225wy(), m73203ak());
    }

    /* JADX INFO: renamed from: to */
    public final int m73036to() {
        return this.f49901dy.m73384dy().getPosition();
    }

    /* JADX INFO: renamed from: u4 */
    public abstract List<Float> mo63717u4();

    /* JADX INFO: renamed from: up */
    public abstract float mo63718up();

    /* JADX INFO: renamed from: uz */
    public abstract List<Float> mo63719uz();

    /* JADX INFO: renamed from: x1 */
    public final C12015qq m73037x1(String str) {
        return m73017k4(str, true);
    }

    /* JADX INFO: renamed from: x6 */
    public final C12015qq m73038x6() {
        if (!mo3221T_()) {
            return new C12015qq(0.0f, m73203ak());
        }
        if (m73021fa() != null && this.f49908x1.get_Item(0).m64945h4().getType() != 77) {
            if (m73026k4().m73384dy().getTickLabelPosition() == 2) {
                float fM73225wy = m73021fa().m73225wy();
                float fMo63718up = m73021fa().mo63718up();
                if (m73021fa().m73026k4().m73384dy().isPlotOrderReversed()) {
                    if (m73026k4().m73384dy().getPosition() == 2) {
                        float fM73225wy2 = fMo63718up + m73225wy();
                        return fM73225wy2 <= fM73225wy ? new C12015qq(0.0f, m73203ak()) : new C12015qq(fM73225wy2 - fM73225wy, m73203ak());
                    }
                } else {
                    if (m73026k4().m73384dy().getPosition() == 1) {
                        float fM73225wy3 = fMo63718up - m73225wy();
                        return fM73225wy3 >= 0.0f ? new C12015qq(0.0f, m73203ak()) : new C12015qq(-fM73225wy3, m73203ak());
                    }
                    if ((fM73225wy - fMo63718up) - m73225wy() < 0.0f) {
                        return new C12015qq(m73225wy(), m73203ak());
                    }
                }
            }
            return new C12015qq(m73225wy(), m73203ak());
        }
        return new C12015qq(m73225wy(), m73203ak());
    }

    /* JADX INFO: renamed from: yj */
    public abstract double mo63720yj();

    /* JADX INFO: renamed from: k4 */
    private C12015qq m73017k4(String str, boolean z) {
        nxm nxmVarM73025k4 = m73025k4((Object) str);
        nxmVarM73025k4.m68257k4(z);
        oju ojuVarClone = nxmVarM73025k4.m68258kk(new C14713vw(500.0f, 500.0f)).Clone();
        C12015qq c12015qq = new C12015qq(ojuVarClone.f47836k4, ojuVarClone.f47837x1);
        m73028k4(nxmVarM73025k4);
        return c12015qq;
    }

    /* JADX INFO: renamed from: kk */
    public final C12015qq m73031kk(String str) {
        int iM73386h4 = m73026k4().m73386h4();
        m73026k4().m73394k4(0);
        try {
            nxm nxmVarM73025k4 = m73025k4((Object) str);
            nxmVarM73025k4.m68257k4(true);
            oju ojuVarClone = nxmVarM73025k4.m68258kk(new C14713vw(500.0f, 500.0f)).Clone();
            m73028k4(nxmVarM73025k4);
            return new C12015qq(ojuVarClone.f47836k4, ojuVarClone.f47837x1);
        } finally {
            m73026k4().m73394k4(iM73386h4);
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    /* JADX INFO: renamed from: k4 */
    public final nxm m73025k4(Object obj) {
        nxm nxmVar = new nxm(obj, this);
        this.f49904k4.addItem(nxmVar);
        m73215k4((AbstractC14770x9) nxmVar);
        return nxmVar;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m73032kk(C14713vw c14713vw) {
        if (c14713vw.m72555k4() != 0.0f && c14713vw.m72556x1() != 0.0f) {
            C12015qq c12015qqClone = m73024k4("0").Clone();
            float fM56699x1 = m73026k4().m73386h4() == 0 ? c12015qqClone.m56699x1() : c12015qqClone.m56697kk();
            if (c14713vw.m72556x1() >= (m73026k4().m73386h4() == 0 ? c12015qqClone.m56697kk() : c12015qqClone.m56699x1()) && c14713vw.m72555k4() >= fM56699x1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14787xi m73026k4() {
        return this.f49901dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73027k4(C12015qq c12015qq) {
        nxm nxmVar;
        C14713vw c14713vw;
        int iM73376bv = 0;
        while (iM73376bv < this.f49904k4.size()) {
            if ((m73026k4().m73386h4() == 0 || m73026k4().m73386h4() % 90 == 0) && (!C7019kk.m27469x1(this, C1195hd.class) || this.f49904k4.get_Item(iM73376bv).m68253jd().length() > 2)) {
                nxmVar = this.f49904k4.get_Item(iM73376bv);
                c14713vw = new C14713vw(c12015qq.m56699x1(), c12015qq.m56697kk());
            } else {
                nxmVar = this.f49904k4.get_Item(iM73376bv);
                c14713vw = this.f49905kk;
            }
            nxmVar.m73210fa(c14713vw);
            iM73376bv += m73026k4().m73376bv();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73028k4(nxm nxmVar) {
        this.f49904k4.removeItem(nxmVar);
        m73226x1(nxmVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73029k4(AbstractC14763x3 abstractC14763x3) {
        this.f49906m9 = abstractC14763x3;
    }
}
