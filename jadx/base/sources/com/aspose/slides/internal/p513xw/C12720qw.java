package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p513xw.AbstractC12741x1;
import com.aspose.slides.internal.p513xw.AbstractC12742x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.qw */
/* JADX INFO: loaded from: classes5.dex */
public class C12720qw extends AbstractC12742x6 {

    /* JADX INFO: renamed from: ak */
    private int f42309ak;

    /* JADX INFO: renamed from: ar */
    private int f42310ar;

    /* JADX INFO: renamed from: b3 */
    private boolean f42311b3;

    /* JADX INFO: renamed from: bv */
    private int f42312bv;

    /* JADX INFO: renamed from: c6 */
    private AbstractC12742x6.kk f42313c6;

    /* JADX INFO: renamed from: dq */
    private AbstractC12742x6.kk f42314dq;

    /* JADX INFO: renamed from: ix */
    private C12728tq f42315ix;

    /* JADX INFO: renamed from: lr */
    private int f42316lr;

    /* JADX INFO: renamed from: ne */
    private InterfaceC12711lr f42317ne;

    /* JADX INFO: renamed from: qq */
    private C12726t6 f42318qq;

    /* JADX INFO: renamed from: u4 */
    private InterfaceC12683b3 f42319u4;

    /* JADX INFO: renamed from: um */
    private int f42320um;

    /* JADX INFO: renamed from: uz */
    private List<AbstractC12741x1.x1> f42321uz;

    /* JADX INFO: renamed from: v4 */
    private int f42322v4;

    /* JADX INFO: renamed from: wl */
    private C12726t6 f42323wl;

    /* JADX INFO: renamed from: wy */
    private boolean f42324wy;

    /* JADX INFO: renamed from: xk */
    private int f42325xk;

    /* JADX INFO: renamed from: yd */
    private boolean f42326yd;

    /* JADX INFO: renamed from: com.aspose.slides.internal.xw.qw$k4 */
    public static class k4 extends AbstractC12742x6.k4 {

        /* JADX INFO: renamed from: kk */
        private C12720qw f42328kk;

        /* JADX INFO: renamed from: k4 */
        private C12748zj[] f42327k4 = new C12748zj[4];

        /* JADX INFO: renamed from: x1 */
        private C12748zj[] f42329x1 = new C12748zj[4];

        public k4(C12720qw c12720qw) {
            this.f42328kk = c12720qw;
        }

        /* JADX INFO: renamed from: c5 */
        public final C12748zj m59119c5(int i) {
            return this.f42329x1[i];
        }

        /* JADX INFO: renamed from: dy */
        public final C12748zj m59120dy(int i) {
            return this.f42327k4[i];
        }

        @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6.k4
        /* JADX INFO: renamed from: k4 */
        public void mo59121k4(double d, AbstractC12742x6.kk kkVar, double d2, int i, int i2, int i3, int i4) {
            super.mo59121k4(d, kkVar, d2, i, i2, i3, i4);
            this.f42327k4[i4] = this.f42328kk.f42323wl.m59219x1().m59422x1();
            this.f42329x1[i4] = this.f42328kk.f42318qq.m59219x1().m59422x1();
        }
    }

    public C12720qw(InterfaceC12711lr interfaceC12711lr, C12728tq c12728tq, InterfaceC12683b3 interfaceC12683b3, int i, int i2, C1375h4 c1375h4, C1375h4 c1375h42, boolean z, boolean z2, boolean z3) {
        super(i, i2, true, z, 0);
        this.f42321uz = null;
        this.f42310ar = 5000;
        this.f42320um = 10000;
        this.f42312bv = 10000;
        this.f42322v4 = -1;
        this.f42316lr = -1;
        this.f42326yd = false;
        this.f42311b3 = false;
        this.f42324wy = false;
        this.f42325xk = 9;
        this.f42317ne = interfaceC12711lr;
        this.f42315ix = c12728tq;
        this.f42319u4 = interfaceC12683b3;
        this.f42495rv = new k4(this);
        this.f42323wl = new C12726t6((C1375h4) c1375h4.clone());
        this.f42318qq = new C12726t6((C1375h4) c1375h42.clone());
        this.f42311b3 = z2;
        this.f42324wy = z3;
    }

    /* JADX INFO: renamed from: dy */
    private int m59091dy(int i) {
        C12728tq c12728tq = this.f42315ix;
        if (c12728tq == null) {
            return 0;
        }
        return c12728tq.m59248kk(i);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: du */
    public int mo59096du() {
        AbstractC12742x6.kk kkVar = this.f42314dq;
        m59393x1(kkVar, this.f42496to, kkVar.f42524x1 + 1);
        this.f42488jd = null;
        return this.f42314dq.f42524x1;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: fa */
    public int mo54806fa() {
        AbstractC12742x6.kk kkVarMo59105k4 = null;
        for (int iM59377k4 = m59377k4(); iM59377k4 < this.f42485fa; iM59377k4++) {
            for (AbstractC12742x6.kk kkVarM59375du = m59375du(iM59377k4); kkVarM59375du != null; kkVarM59375du = kkVarM59375du.f42523up) {
                if (!this.f42324wy || kkVarM59375du.f42524x1 <= 1 || kkVarMo59105k4 == null || C14116yg.m67482k4(kkVarMo59105k4.f42518jd) >= kkVarMo59105k4.f42515dy) {
                    kkVarMo59105k4 = mo59105k4(kkVarMo59105k4, kkVarM59375du);
                }
                if (kkVarM59375du != kkVarMo59105k4) {
                    m59391x1(iM59377k4, kkVarM59375du);
                }
            }
        }
        return kkVarMo59105k4.f42524x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final List<InterfaceC1861h4> m59097h4(int i) {
        return this.f42323wl.m59211k4(i);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: jd */
    public void mo59099jd() {
        for (int iM59377k4 = m59377k4(); iM59377k4 < this.f42485fa; iM59377k4++) {
            AbstractC12742x6.kk kkVarM59375du = m59375du(iM59377k4);
            while (true) {
                C12686bz c12686bz = (C12686bz) kkVarM59375du;
                if (c12686bz != null) {
                    if (c12686bz.f42172ks.m59420kk() < this.f42323wl.m59218to()) {
                        this.f42323wl.m59214k4(c12686bz, this, m59374ck());
                    }
                    if (c12686bz.f42173rv.m59420kk() < this.f42318qq.m59218to()) {
                        this.f42318qq.m59221x1(c12686bz, this, m59374ck());
                    }
                    kkVarM59375du = c12686bz.f42523up;
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public double mo58928k4(AbstractC12742x6.kk kkVar, AbstractC12729ts abstractC12729ts, int i, double d) {
        double dM59203c5;
        double dM67475k4 = C14116yg.m67475k4(d);
        if (dM67475k4 > 1.0d) {
            dM67475k4 = 1.0d;
        }
        double d2 = (100.0d * dM67475k4 * dM67475k4 * dM67475k4) + 1.0d;
        if (abstractC12729ts.mo59086y_()) {
            double dMo59085x6 = abstractC12729ts.mo59085x6();
            if (dMo59085x6 >= 0.0d) {
                d2 += dMo59085x6;
            } else if (!abstractC12729ts.mo59082dy()) {
                dM59203c5 = (d2 * d2) - (dMo59085x6 * dMo59085x6);
            }
            dM59203c5 = d2 * d2;
        } else {
            dM59203c5 = d2 * d2;
        }
        if (abstractC12729ts.mo59086y_() && ((C12718qm) abstractC12729ts).m59083m9() && m59387to(kkVar.f42519k4).mo59086y_() && ((C12718qm) m59387to(kkVar.f42519k4)).m59083m9()) {
            dM59203c5 += (double) this.f42489k4;
        }
        if (C14116yg.m67482k4(i - kkVar.f42520kk) > 1) {
            dM59203c5 += (double) this.f42502x1;
        }
        if (this.f42323wl.m59205du()) {
            dM59203c5 += (double) (this.f42323wl.m59203c5() * this.f42320um);
            if (this.f42323wl.m59208jd()) {
                dM59203c5 += (double) this.f42310ar;
            }
        }
        if (this.f42318qq.m59205du()) {
            dM59203c5 += (double) (this.f42318qq.m59203c5() * this.f42312bv);
        }
        return dM59203c5 + kkVar.f42513ck;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: kk */
    public double mo59112kk(AbstractC12742x6.kk kkVar, int i) {
        int i2;
        C12686bz c12686bz = (C12686bz) kkVar;
        if (i > 0) {
            i2 = this.f42504yj - kkVar.f42514du;
            if (c12686bz.f42172ks.m59420kk() < this.f42323wl.m59218to()) {
                i2 += this.f42323wl.m59216kk().f5964to - this.f42323wl.m59216kk().f5963kk;
            }
            if (c12686bz.f42173rv.m59420kk() < this.f42318qq.m59218to()) {
                i2 += this.f42318qq.m59216kk().f5964to - this.f42318qq.m59216kk().f5963kk;
            }
            if (i2 <= 0) {
                return 1000.0d;
            }
        } else {
            if (i >= 0) {
                return 0.0d;
            }
            i2 = this.f42491ks - kkVar.f42517h4;
            if (c12686bz.f42172ks.m59420kk() < this.f42323wl.m59218to()) {
                i2 += this.f42323wl.m59216kk().f5963kk - this.f42323wl.m59216kk().f5965x1;
            }
            if (c12686bz.f42173rv.m59420kk() < this.f42318qq.m59218to()) {
                i2 += this.f42318qq.m59216kk().f5963kk - this.f42318qq.m59216kk().f5965x1;
            }
            if (i2 <= 0) {
                return -1000.0d;
            }
        }
        return ((double) i) / ((double) i2);
    }

    /* JADX INFO: renamed from: ks */
    public final List<AbstractC12741x1.x1> m59113ks() {
        return this.f42321uz;
    }

    /* JADX INFO: renamed from: m9 */
    public final List<InterfaceC1861h4> m59114m9(int i) {
        return this.f42318qq.m59211k4(i);
    }

    /* JADX INFO: renamed from: ne */
    public final AbstractC12742x6.kk m59115ne() {
        return this.f42314dq;
    }

    /* JADX INFO: renamed from: rv */
    public final void m59116rv() {
        List<AbstractC12741x1.x1> list = this.f42321uz;
        if (list == null || list.size() == 0) {
            return;
        }
        this.f42321uz.removeRange(0, r0.size() - 1);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: to */
    public int mo59117to() {
        return this.f42309ak;
    }

    /* JADX INFO: renamed from: x6 */
    public final AbstractC3524ks m59118x6() {
        return this.f42317ne.mo59012up();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: h4 */
    public void mo59098h4() {
        super.mo59098h4();
        this.f42323wl.m59212k4();
        this.f42318qq.m59212k4();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public int mo54807k4(int i, int i2, boolean[] zArr) {
        C12728tq c12728tq = this.f42315ix;
        return c12728tq != null ? c12728tq.m59250x1(i) : super.mo54807k4(i, i2, zArr);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public int mo59100k4(AbstractC12742x6.kk kkVar, int i) {
        int iMo59100k4 = super.mo59100k4(kkVar, i);
        this.f42323wl.m59207h4();
        this.f42318qq.m59207h4();
        if (this.f42323wl.m59205du() || this.f42318qq.m59205du()) {
            while (i >= kkVar.f42519k4) {
                AbstractC12729ts abstractC12729tsM59387to = m59387to(i);
                if (C7019kk.m27469x1(abstractC12729tsM59387to, C12743xk.class)) {
                    C12743xk c12743xk = (C12743xk) abstractC12729tsM59387to;
                    if (c12743xk.m59414m9()) {
                        this.f42323wl.m59220x1(c12743xk.m59411jd());
                    }
                }
                C12743xk c12743xk2 = (C12743xk) C7019kk.m27452k4((Object) abstractC12729tsM59387to, C12743xk.class);
                if (c12743xk2 != null && c12743xk2.m59406c5()) {
                    this.f42318qq.m59220x1(c12743xk2.m59407ck());
                }
                i--;
            }
        }
        return iMo59100k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public int mo59101k4(AbstractC12742x6.kk kkVar, AbstractC12729ts abstractC12729ts, int i, int i2, boolean[] zArr) {
        int iM59209k4;
        boolean zM59094k4;
        int iM59210k4;
        C12686bz c12686bz = (C12686bz) kkVar;
        int iM59252rv = this.f42499up - c12686bz.f42522to;
        if (abstractC12729ts.mo59086y_()) {
            iM59252rv += abstractC12729ts.m59252rv();
        }
        if (this.f42323wl.m59205du()) {
            this.f42323wl.m59215k4(c12686bz.f42172ks);
            int iM59218to = this.f42323wl.m59218to() - c12686bz.f42172ks.m59420kk();
            if (iM59218to > 0) {
                int i3 = iM59252rv + this.f42323wl.m59216kk().f5963kk;
                int i4 = iM59218to + i3;
                if (i4 > mo54807k4(kkVar.f42524x1, i, zArr) && (((zM59094k4 = m59094k4(this.f42323wl, c12686bz.f42519k4, i)) || this.f42323wl.m59217m9()) && (iM59210k4 = this.f42323wl.m59210k4(c12686bz.f42172ks, m59374ck() - i3, zM59094k4)) > 0)) {
                    iM59252rv = i3 + iM59210k4;
                } else {
                    this.f42323wl.m59204ck();
                    iM59252rv = i4;
                }
            }
        }
        if (this.f42318qq.m59205du()) {
            this.f42318qq.m59215k4(c12686bz.f42173rv);
            if (this.f42318qq.m59218to() - c12686bz.f42173rv.m59420kk() > 0 && (m59374ck() - iM59252rv) - this.f42318qq.m59216kk().f5963kk > 0 && (iM59209k4 = this.f42318qq.m59209k4(c12686bz.f42173rv, (m59374ck() - iM59252rv) - this.f42318qq.m59216kk().f5963kk)) > 0) {
                iM59252rv += this.f42318qq.m59216kk().f5963kk + iM59209k4;
            }
        }
        int iMo54807k4 = mo54807k4(kkVar.f42524x1, i, zArr) - iM59252rv;
        if (!this.f42311b3 || iMo54807k4 >= 0) {
            return iMo54807k4;
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public AbstractC12742x6.kk mo59102k4(int i, int i2, int i3, int i4, int i5, int i6) {
        return new C12686bz(i, i2, i3, i4, i5, i6, ((k4) this.f42495rv).m59120dy(i3), ((k4) this.f42495rv).m59119c5(i3), this.f42495rv.m59402to(i3), this.f42495rv.m59395du(i3), this.f42495rv.m59396h4(i3), this.f42495rv.m59401m9(i3), this.f42495rv.m59404x1(i3), this.f42495rv.m59399kk(i3));
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public AbstractC12742x6.kk mo59103k4(int i, int i2, int i3, int i4, int i5, int i6, double d, int i7, int i8, int i9, double d2, AbstractC12742x6.kk kkVar) {
        return new C12686bz(i, i2, i3, i4, i5, i6, this.f42323wl.m59219x1(), this.f42318qq.m59219x1(), d, i7, i8, i9, d2, kkVar);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public AbstractC12742x6.kk mo59104k4(AbstractC12742x6.kk kkVar) {
        AbstractC12742x6.kk kkVar2 = this.f42313c6;
        if (kkVar2 == null || this.f42325xk == 9) {
            return super.mo59104k4(kkVar);
        }
        this.f42313c6 = null;
        AbstractC12742x6.kk kkVarMo59103k4 = kkVar2;
        while (!this.f42315ix.m59249to(kkVarMo59103k4.f42524x1 - 1)) {
            kkVarMo59103k4 = mo59103k4(kkVarMo59103k4.f42519k4, kkVarMo59103k4.f42524x1 + 1, 1, 0, 0, 0, 0.0d, 0, 0, 0, 0.0d, kkVarMo59103k4);
        }
        return kkVarMo59103k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public AbstractC12742x6.kk mo59105k4(AbstractC12742x6.kk kkVar, AbstractC12742x6.kk kkVar2) {
        if (kkVar == null || kkVar2 == null) {
            return kkVar == null ? kkVar2 : kkVar;
        }
        C12728tq c12728tq = this.f42315ix;
        if (c12728tq != null) {
            if (c12728tq.m59249to(kkVar.f42524x1 - 1) && !this.f42315ix.m59249to(kkVar2.f42524x1 - 1)) {
                return kkVar;
            }
            if (this.f42315ix.m59249to(kkVar2.f42524x1 - 1) && !this.f42315ix.m59249to(kkVar.f42524x1 - 1)) {
                return kkVar2;
            }
        }
        return super.mo59105k4(kkVar, kkVar2);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public void mo54808k4(int i, double d) {
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public void mo59106k4(int i, AbstractC12742x6.kk kkVar) {
        if (kkVar.f42519k4 < this.f42496to.size() - 1 && i > 0) {
            int iM59091dy = m59091dy(i - 1);
            this.f42309ak = iM59091dy;
            if (iM59091dy != 0) {
                AbstractC12742x6.kk kkVar2 = this.f42314dq;
                if (kkVar2 == null || kkVar.f42513ck < kkVar2.f42513ck) {
                    this.f42314dq = kkVar;
                    return;
                }
                return;
            }
        }
        if (kkVar.f42519k4 == this.f42496to.size() - 1) {
            this.f42309ak = 0;
        }
        super.mo59106k4(i, kkVar);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public void mo59107k4(C12688c6 c12688c6) {
        super.mo59107k4(c12688c6);
        C12743xk c12743xk = (C12743xk) C7019kk.m27452k4((Object) c12688c6, C12743xk.class);
        if (c12743xk == null || !c12743xk.m59414m9()) {
            return;
        }
        List<List<InterfaceC1861h4>> listM59411jd = c12743xk.m59411jd();
        List<List<InterfaceC1861h4>> list = new List<>();
        list.addRange(listM59411jd);
        listM59411jd.clear();
        this.f42323wl.m59213k4(list);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public void mo59108k4(C12718qm c12718qm, int i, int i2) {
        super.mo59108k4(c12718qm, i, i2);
        if (c12718qm.mo59085x6() == 1000) {
            int iM59081c5 = c12718qm.m59081c5();
            if (iM59081c5 == 104 || iM59081c5 == 28) {
                mo59109k4(c12718qm, i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo59109k4(AbstractC12729ts abstractC12729ts, int i) {
        if (abstractC12729ts.mo59086y_()) {
            int iM59081c5 = ((C12718qm) abstractC12729ts).m59081c5();
            if (iM59081c5 == 9) {
                this.f42325xk = iM59081c5;
            } else if (iM59081c5 == 28) {
                if (this.f42325xk != iM59081c5) {
                }
                this.f42325xk = iM59081c5;
            } else if (iM59081c5 == 104) {
                if (this.f42325xk != iM59081c5) {
                    this.f42313c6 = m59386m9();
                }
                this.f42325xk = iM59081c5;
            }
        }
        super.mo59109k4(abstractC12729ts, i);
        this.f42323wl.m59207h4();
        this.f42318qq.m59207h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59110k4(AbstractC12741x1.x1 x1Var) {
        if (this.f42321uz == null) {
            this.f42321uz = new List<>();
        }
        this.f42321uz.insertItem(0, x1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo54810k4(AbstractC12742x6.kk kkVar, AbstractC12725sv abstractC12725sv, int i) {
        int i2;
        double d;
        InterfaceC12683b3 interfaceC12683b3;
        int i3 = kkVar.f42518jd;
        if (kkVar.f42515dy + i3 < 0 && !this.f42311b3 && (interfaceC12683b3 = this.f42319u4) != null) {
            interfaceC12683b3.mo58839k4(kkVar.f42524x1 - 1, -i3, m59118x6());
        }
        int i4 = 0;
        boolean z = kkVar.f42524x1 < i;
        int i5 = z ? this.f42492m9 : this.f42484dy;
        double d2 = kkVar.f42521m9;
        if (d2 >= 0.0d && (d2 > 1.0d || !z)) {
            if (d2 > 1.0d) {
                i2 = i3 - kkVar.f42512c5;
                d = 1.0d;
            } else if (i5 != 70) {
                i2 = i3;
                d = 0.0d;
            } else {
                i2 = 0;
                d = d2;
            }
        }
        int iM59418du = ((C12686bz) kkVar.f42516fa).f42172ks.m59418du();
        int iM59421to = ((C12686bz) kkVar.f42516fa).f42172ks.m59421to();
        if (iM59418du != -1 && (this.f42323wl.m59211k4(iM59418du) == null || iM59421to != this.f42323wl.m59211k4(iM59418du).size() - 1)) {
            i4 = iM59421to + 1;
        } else {
            iM59418du++;
        }
        int i6 = iM59418du;
        C12686bz c12686bz = (C12686bz) kkVar;
        m59110k4(new AbstractC12741x1.x1(this.f42317ne, kkVar.f42519k4, i6, i4, c12686bz.f42172ks.m59418du(), c12686bz.f42172ks.m59421to(), ((C12686bz) kkVar.f42516fa).f42173rv.m59418du() + 1, c12686bz.f42173rv.m59418du(), d, i2));
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m59093k4(int i, int i2) {
        int i3 = this.f42322v4;
        if (i3 == -1 || ((i < i3 || i2 != this.f42316lr || !this.f42326yd) && (i > i3 || i2 < this.f42316lr || this.f42326yd))) {
            int i4 = i + 1;
            while (!this.f42496to.m59198k4(i4).mo58895yj()) {
                i4++;
            }
            while (i4 < i2 && ((!this.f42496to.m59198k4(i4).mo58932x_() || !this.f42496to.m59198k4(i4 - 1).mo58895yj()) && (!this.f42496to.m59198k4(i4).mo59086y_() || ((AbstractC12729ts) this.f42496to.m59198k4(i4)).mo59085x6() >= 1000))) {
                i4++;
            }
            this.f42322v4 = i;
            this.f42316lr = i2;
            this.f42326yd = i4 == i2;
        }
        return this.f42326yd;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m59094k4(C12726t6 c12726t6, int i, int i2) {
        return m59093k4(i, i2) && c12726t6.m59206dy();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12742x6
    /* JADX INFO: renamed from: k4 */
    public boolean mo59111k4(AbstractC12729ts abstractC12729ts, int i, int i2) {
        int iM59081c5;
        if (abstractC12729ts.mo59086y_() && this.f42315ix != null) {
            C12718qm c12718qm = (C12718qm) abstractC12729ts;
            if (c12718qm.mo59085x6() > 0 && (iM59081c5 = c12718qm.m59081c5()) != 9) {
                if (iM59081c5 == 28 || iM59081c5 == 75) {
                    return c12718qm.mo59085x6() < 1000;
                }
                int iMo59085x6 = c12718qm.mo59085x6();
                return iM59081c5 != 104 ? iMo59085x6 < 1000 : iMo59085x6 < 1000 || !this.f42315ix.m59249to(i - 1);
            }
        }
        return true;
    }
}
