package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p034b3.C1581c5;
import com.aspose.slides.internal.p034b3.C1586fa;
import com.aspose.slides.internal.p034b3.C1597rv;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p406ss.C10336ks;
import com.aspose.slides.internal.p406ss.C10343um;
import com.aspose.slides.internal.p513xw.AbstractC12741x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.vh */
/* JADX INFO: loaded from: classes5.dex */
public class C12735vh extends AbstractC12741x1 {

    /* JADX INFO: renamed from: ck */
    private boolean f42426ck;

    /* JADX INFO: renamed from: dy */
    private C12728tq f42428dy;

    /* JADX INFO: renamed from: fa */
    private C12719qq f42429fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f42430h4;

    /* JADX INFO: renamed from: m9 */
    private boolean f42432m9;

    /* JADX INFO: renamed from: to */
    private C12703j2 f42433to;

    /* JADX INFO: renamed from: du */
    private boolean f42427du = true;

    /* JADX INFO: renamed from: c5 */
    private C1581c5 f42425c5 = null;

    /* JADX INFO: renamed from: jd */
    private C1581c5 f42431jd = null;

    /* JADX INFO: renamed from: up */
    private C12706jw f42434up = null;

    /* JADX INFO: renamed from: yj */
    private C12706jw f42435yj = null;

    /* JADX INFO: renamed from: com.aspose.slides.internal.xw.vh$k4 */
    public static class k4 implements InterfaceC12683b3 {

        /* JADX INFO: renamed from: k4 */
        private C12735vh f42436k4;

        public k4(C12735vh c12735vh) {
            this.f42436k4 = c12735vh;
        }

        @Override // com.aspose.slides.internal.p513xw.InterfaceC12683b3
        /* JADX INFO: renamed from: k4 */
        public final void mo58839k4(int i, int i2, AbstractC3524ks abstractC3524ks) {
            C12736vj c12736vjM59245k4 = this.f42436k4.f42428dy.m59245k4(false, i, 1);
            C10336ks c10336ks = (C10336ks) c12736vjM59245k4.m59331k4().m50385m9(58);
            C12697fa.m58940k4(c10336ks.m14111q_().m59580u4()).mo53634k4(this, c10336ks.m14105ks(), c12736vjM59245k4.m59332x1().m59338h4(), i2, c10336ks.m50343qm() == 57 || c10336ks.m50343qm() == 42, c10336ks.m50343qm() != 42, c10336ks.m14106m_());
        }
    }

    public C12735vh(C12703j2 c12703j2) {
        this.f42429fa = null;
        this.f42433to = c12703j2;
        this.f42428dy = c12703j2.m58990ak();
        this.f42429fa = c12703j2.m58927yd().mo59022k4(c12703j2, c12703j2.m58991dq().m50332sv());
    }

    /* JADX INFO: renamed from: du */
    private boolean m59313du(int i) {
        if (i != 104 && !this.f42433to.mo58913ar().m59332x1().m59335du().m8499x1()) {
            if (this.f42433to.m58914b3() % 2 == 0) {
                return i == 44;
            }
            if (i == 100) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: fa */
    private void m59314fa() {
        C10343um c10343umM50323du = this.f42433to.m58991dq().m50323du("xsl-footnote-separator");
        if (c10343umM50323du != null) {
            C1581c5 c1581c5 = new C1581c5();
            this.f42425c5 = c1581c5;
            c1581c5.m8679x1(this.f42433to.m59235um().m59350x1(58).m8678x1());
            C12706jw c12706jwMo59019k4 = this.f42433to.m58927yd().mo59019k4(this.f42433to, c10343umM50323du, this.f42425c5);
            this.f42434up = c12706jwMo59019k4;
            c12706jwMo59019k4.m59000yd();
            this.f42466x1 = C1375h4.m8145k4(this.f42425c5.mo8658e_());
        }
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m59315h4(int i) {
        if (!this.f42433to.mo58913ar().m59332x1().m59335du().m8499x1()) {
            return true;
        }
        if (i == 104) {
            return false;
        }
        return this.f42433to.m58914b3() % 2 == 0 ? i == 100 : i == 44;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: dy */
    public InterfaceC12683b3 mo59003dy() {
        return new k4(this);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: jd */
    public void mo59322jd() {
        this.f42433to.m59235um().m59335du().m8496k4();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: k4 */
    public int mo54957k4() {
        return this.f42433to.mo58913ar().m59331k4().m50385m9(58).m50339g8();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: kk */
    public int mo59327kk(C12724ss c12724ss, int i) {
        return mo59323k4(c12724ss, i, (C12717os) null, (InterfaceC12711lr) null, (List<InterfaceC1861h4>) null);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: m9 */
    public C12728tq mo59328m9() {
        return this.f42433to.m58990ak();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: to */
    public InterfaceC12711lr mo58890to() {
        return this.f42429fa;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: x1 */
    public int mo59329x1(C12724ss c12724ss, int i) {
        boolean z = false;
        this.f42432m9 = false;
        if (c12724ss.m59182v4() != 0) {
            i = c12724ss.m59182v4();
            if (c12724ss.m59182v4() == 5 && c12724ss.m59193xk() == 48) {
                z = true;
            }
            this.f42432m9 = z;
        }
        return i;
    }

    /* JADX INFO: renamed from: to */
    private void m59321to(int i) {
        C12736vj c12736vjMo58913ar = this.f42433to.mo58913ar();
        if (i != -1) {
            if (i == 5) {
                c12736vjMo58913ar.m59332x1().m59340k4(true);
                this.f42426ck = true;
                return;
            }
            if (i != 9 && i != 28) {
                if (i == 95) {
                    c12736vjMo58913ar.m59332x1().m59340k4(false);
                    this.f42426ck = false;
                    return;
                } else if (i != 104) {
                    if (m59313du(i)) {
                        this.f42433to.mo58923to(true);
                    }
                    if (m59315h4(i)) {
                        this.f42433to.mo58923to(false);
                        return;
                    }
                    return;
                }
            }
        }
        C12737w6 c12737w6M59332x1 = c12736vjMo58913ar.m59332x1();
        if (((C10336ks) c12736vjMo58913ar.m59331k4().m50385m9(58)).m50369ss() > 1 && c12737w6M59332x1.m59334ck().m8478u4() == 1) {
            this.f42433to.mo58923to(false).m59332x1().m59340k4(true);
        } else if (c12737w6M59332x1.m59334ck().m8473bv()) {
            c12737w6M59332x1.m59334ck().m8479um();
        } else {
            this.f42433to.mo58923to(false);
        }
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: k4 */
    public int mo59323k4(C12724ss c12724ss, int i, C12717os c12717os, InterfaceC12711lr interfaceC12711lr, List<InterfaceC1861h4> list) {
        if (!this.f42427du) {
            m59321to(i);
        }
        this.f42427du = false;
        this.f42430h4 = true;
        this.f42428dy.m59247k4(this.f42433to.m58914b3(), this.f42433to.m59235um().m59334ck().m8472ar(), this.f42426ck);
        return super.mo59323k4(c12724ss, i, c12717os, interfaceC12711lr, list);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: kk */
    public InterfaceC12711lr mo58889kk() {
        return this.f42433to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59330x1(int i) {
        m59365k4(i, false);
    }

    /* JADX INFO: renamed from: kk */
    private void m59319kk(int i) {
        this.f42428dy.m59246k4(this.f42433to.m58992kk(i));
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo54958k4(C12724ss c12724ss, int i) {
        List<InterfaceC1861h4> listMo48950k4 = null;
        while (!this.f42429fa.mo54980wl() && listMo48950k4 == null) {
            listMo48950k4 = this.f42429fa.mo48950k4(c12724ss, i);
        }
        boolean[] zArr = {false};
        boolean zM59318k4 = m59318k4(listMo48950k4, c12724ss, zArr);
        boolean z = zArr[0];
        if (zM59318k4) {
            m59314fa();
        }
        m59317k4(z);
        return listMo48950k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: x1 */
    public boolean mo58892x1() {
        return !this.f42429fa.mo54980wl();
    }

    /* JADX INFO: renamed from: kk */
    private void m59320kk(C12720qw c12720qw, int i, AbstractC12741x1.k4 k4Var, AbstractC12741x1.k4 k4Var2) {
        int i2;
        C12720qw c12720qw2;
        int iM59243du = this.f42428dy.m59243du(i);
        if (iM59243du > 0) {
            m59367x1(c12720qw, iM59243du, k4Var, k4Var2);
            int iM58941k4 = c12720qw.m59113ks().get_Item(iM59243du - 1).m58941k4() + 1;
            if (iM58941k4 > 0) {
                m59321to(104);
            }
            i2 = iM58941k4;
        } else {
            i2 = 0;
        }
        this.f42430h4 = true;
        int iM58914b3 = this.f42433to.m58914b3();
        this.f42428dy.m59247k4(iM58914b3, this.f42433to.m59235um().m59334ck().m8472ar(), this.f42426ck);
        k4Var2.f42468k4 = i2;
        if (this.f42432m9) {
            c12720qw2 = new C12693dy(mo58889kk(), mo59328m9(), mo59003dy(), this.f42463k4, 135, this.f42466x1, this.f42464kk, mo58884du(), this.f42433to.m59235um().m59339jd().m8569uz());
        } else {
            C1586fa c1586faM59339jd = this.f42428dy.m59244k4(false, iM58914b3).m59332x1().m59339jd();
            m59319kk(iM58914b3);
            this.f42428dy.m59244k4(false, iM58914b3).m59332x1().m59339jd().m8566qq().m8620x1(c1586faM59339jd.m8566qq().m8616u4());
            c12720qw2 = new C12720qw(mo58889kk(), mo59328m9(), mo59003dy(), c12720qw.m59388up(), c12720qw.m59394yj(), this.f42466x1, this.f42464kk, mo58884du(), false, false);
        }
        int iM59379k4 = c12720qw2.m59379k4((AbstractC12725sv) k4Var2, i2, 1.0d, true, 0);
        boolean z = iM59379k4 <= this.f42433to.m59235um().m59339jd().m8566qq().m8617uz().m8478u4();
        if (!this.f42432m9) {
            if (z) {
                this.f42433to.m58920k4(this.f42428dy.m59244k4(false, iM58914b3));
            } else {
                m59366k4(c12720qw, iM59243du, i - iM59243du, k4Var, k4Var2);
                m59319kk(iM58914b3 + 1);
                C12703j2 c12703j2 = this.f42433to;
                c12703j2.m58920k4(c12703j2.mo58923to(true));
                return;
            }
        }
        m59367x1(c12720qw2, iM59379k4, k4Var, k4Var2);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: k4 */
    public List<InterfaceC1861h4> mo59324k4(C12724ss c12724ss, int i, C12717os c12717os, InterfaceC12711lr interfaceC12711lr) {
        List<InterfaceC1861h4> listM59089k4;
        do {
            listM59089k4 = this.f42429fa.m59089k4(c12724ss, i, c12717os, interfaceC12711lr);
            if (this.f42429fa.mo54980wl()) {
                break;
            }
        } while (listM59089k4 == null);
        boolean[] zArr = {false};
        boolean zM59318k4 = m59318k4(listM59089k4, c12724ss, zArr);
        boolean z = zArr[0];
        if (zM59318k4) {
            m59314fa();
        }
        m59317k4(z);
        return listM59089k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: k4 */
    public void mo54959k4(InterfaceC1870up<C12717os> interfaceC1870up, C12724ss c12724ss) {
        if (this.f42434up != null) {
            C10343um c10343umM50323du = this.f42433to.m58991dq().m50323du("xsl-footnote-separator");
            C1581c5 c1581c5 = new C1581c5();
            this.f42425c5 = c1581c5;
            c1581c5.m8679x1(this.f42433to.m59235um().m59350x1(58).m8678x1());
            C12706jw c12706jwMo59019k4 = this.f42433to.m58927yd().mo59019k4(this.f42433to, c10343umM50323du, this.f42425c5);
            this.f42434up = c12706jwMo59019k4;
            c12706jwMo59019k4.m59000yd();
        }
        if (this.f42435yj != null) {
            C10343um c10343umM50323du2 = this.f42433to.m58991dq().m50323du("xsl-before-float-separator");
            C1581c5 c1581c52 = new C1581c5();
            this.f42431jd = c1581c52;
            c1581c52.m8679x1(this.f42433to.m59235um().m59350x1(58).m8678x1());
            C12706jw c12706jwMo59019k42 = this.f42433to.m58927yd().mo59019k4(this.f42433to, c10343umM50323du2, this.f42431jd);
            this.f42435yj = c12706jwMo59019k42;
            c12706jwMo59019k42.m59000yd();
        }
        this.f42429fa.mo49023k4(interfaceC1870up, c12724ss);
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: k4 */
    public void mo58887k4(C12720qw c12720qw, int i, AbstractC12741x1.k4 k4Var, AbstractC12741x1.k4 k4Var2) {
        if (this.f42432m9) {
            m59320kk(c12720qw, i, k4Var, k4Var2);
            return;
        }
        boolean zM50329kp = this.f42433to.m58991dq().m50329kp();
        if (mo58892x1() || !zM50329kp) {
            m59367x1(c12720qw, i, k4Var, k4Var2);
        } else {
            m59320kk(c12720qw, i, k4Var, k4Var2);
        }
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: k4 */
    public void mo58888k4(C12720qw c12720qw, AbstractC12741x1.x1 x1Var) {
        int i = x1Var.f42477m9;
        if (i <= x1Var.f42473dy) {
            while (i <= x1Var.f42473dy) {
                List<InterfaceC1861h4> listM59114m9 = c12720qw.m59114m9(i);
                int size = listM59114m9.size();
                C12684bs.m58844k4(listM59114m9, 0, size - 1, -1);
                C12714m9.m59058k4(null, new C12698g8(listM59114m9, 0, size), new C12724ss(0));
                i++;
            }
            this.f42433to.m59235um().m59339jd().m8568um().m8562k4(this.f42431jd);
        }
        int i2 = x1Var.f42476kk;
        if (i2 < x1Var.f42472du || x1Var.f42478to <= x1Var.f42474h4) {
            while (i2 <= x1Var.f42472du) {
                List<InterfaceC1861h4> listM59097h4 = c12720qw.m59097h4(i2);
                int i3 = i2 == x1Var.f42476kk ? x1Var.f42478to : 0;
                int size2 = i2 == x1Var.f42472du ? x1Var.f42474h4 : listM59097h4.size() - 1;
                C12684bs.m58844k4(listM59097h4, i3, size2, -1);
                C12714m9.m59058k4(null, new C12698g8(listM59097h4, i3, size2 + 1), new C12724ss(0));
                i2++;
            }
            C1597rv c1597rvM8565bv = this.f42433to.m59235um().m59339jd().m8565bv();
            int iMo8658e_ = (this.f42433to.m59235um().m59339jd().mo8658e_() - c1597rvM8565bv.mo8658e_()) - this.f42433to.m59235um().m59339jd().m8568um().mo8658e_();
            C1581c5 c1581c5 = this.f42425c5;
            if (c1581c5 != null) {
                iMo8658e_ -= c1581c5.mo8658e_();
            }
            c1597rvM8565bv.m8621c5(iMo8658e_);
            c1597rvM8565bv.m8622k4(this.f42425c5);
        }
        this.f42433to.m59235um().m59334ck().m8481v4();
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: k4 */
    public void mo59325k4(C12724ss c12724ss) {
        c12724ss.m59186x1(this.f42433to.m59235um().m59334ck().m8480uz());
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12741x1
    /* JADX INFO: renamed from: k4 */
    public void mo59326k4(AbstractC12741x1.k4 k4Var, int i) {
        if (this.f42433to.mo58913ar() == null) {
            throw new InvalidOperationException("curPage must not be null");
        }
        if (!this.f42430h4) {
            if (!this.f42427du) {
                m59321to(i);
            }
            this.f42428dy.m59247k4(this.f42433to.m58914b3(), this.f42433to.m59235um().m59334ck().m8472ar(), this.f42426ck);
        }
        this.f42430h4 = false;
        this.f42427du = false;
    }

    /* JADX INFO: renamed from: k4 */
    private void m59317k4(boolean z) {
        C10343um c10343umM50323du;
        if (!z || (c10343umM50323du = this.f42433to.m58991dq().m50323du("xsl-before-float-separator")) == null) {
            return;
        }
        C1581c5 c1581c5 = new C1581c5();
        this.f42431jd = c1581c5;
        c1581c5.m8679x1(this.f42433to.m59235um().m59350x1(58).m8678x1());
        C12706jw c12706jwMo59019k4 = this.f42433to.m58927yd().mo59019k4(this.f42433to, c10343umM50323du, this.f42431jd);
        this.f42435yj = c12706jwMo59019k4;
        c12706jwMo59019k4.m59000yd();
        this.f42464kk = C1375h4.m8145k4(this.f42431jd.mo8658e_());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private boolean m59318k4(List<InterfaceC1861h4> list, C12724ss c12724ss, boolean[] zArr) {
        zArr[0] = false;
        if (list != null) {
            C1869to c1869to = new C1869to(list);
            boolean z = false;
            while (c1869to.mo9764x1()) {
                AbstractC12723s7 abstractC12723s7Mo9727k4 = ((InterfaceC1861h4) c1869to.mo9760kk()).mo9727k4();
                C12743xk c12743xk = (C12743xk) C7019kk.m27452k4((Object) abstractC12723s7Mo9727k4, C12743xk.class);
                if (C7019kk.m27469x1(abstractC12723s7Mo9727k4, C12743xk.class)) {
                    if (c12743xk.m59414m9()) {
                        C12724ss c12724ss2 = new C12724ss(c12724ss);
                        c12724ss2.m59160k4(c12724ss.m59173ne());
                        c12724ss2.m59186x1(this.f42433to.m59235um().m59350x1(58).m8678x1());
                        C1869to c1869to2 = new C1869to(c12743xk.m59408du());
                        while (c1869to2.mo9764x1()) {
                            C12682ar c12682ar = (C12682ar) c1869to2.mo9760kk();
                            c12682ar.mo54974k4(this.f42429fa);
                            c12682ar.mo49031x6();
                            c12743xk.m59412k4(c12682ar.mo48950k4(c12724ss2, this.f42463k4));
                        }
                        z = true;
                    }
                    if (c12743xk.m59406c5()) {
                        zArr[0] = true;
                        C12724ss c12724ss3 = new C12724ss(c12724ss);
                        c12724ss3.m59160k4(c12724ss.m59173ne());
                        c12724ss3.m59186x1(this.f42433to.m59235um().m59350x1(58).m8678x1());
                        C1869to c1869to3 = new C1869to(c12743xk.m59410h4());
                        while (c1869to3.mo9764x1()) {
                            C12702ix c12702ix = (C12702ix) c1869to3.mo9760kk();
                            c12702ix.mo54974k4((InterfaceC12711lr) this.f42429fa);
                            c12702ix.mo49031x6();
                            c12743xk.m59416x1(c12702ix.mo48950k4(c12724ss3, this.f42463k4));
                        }
                    }
                }
            }
            return z;
        }
        return false;
    }
}
