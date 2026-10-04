package com.aspose.slides.internal.p460vf;

import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p052c0.C1937to;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p138fu.C4121ck;
import com.aspose.slides.internal.p146g9.C4230to;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p330p5.C7195x1;
import com.aspose.slides.internal.p339pk.AbstractC9448ck;
import com.aspose.slides.internal.p339pk.AbstractC9451fa;
import com.aspose.slides.internal.p339pk.C9455kk;
import com.aspose.slides.internal.p339pk.C9462x6;
import com.aspose.slides.internal.p372qx.C9963x1;
import com.aspose.slides.internal.p420th.AbstractC10957fa;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p420th.C10970u4;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.vf.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11638k4 extends AbstractC9448ck {

    /* JADX INFO: renamed from: du */
    private C10950bv f39217du;

    /* JADX INFO: renamed from: h4 */
    private final C10951c5 f39219h4;

    /* JADX INFO: renamed from: kk */
    private C10971um f39221kk;

    /* JADX INFO: renamed from: m9 */
    private C10951c5 f39222m9;

    /* JADX INFO: renamed from: to */
    private boolean f39223to;

    /* JADX INFO: renamed from: x1 */
    private final AbstractC9451fa f39224x1;

    /* JADX INFO: renamed from: k4 */
    private C12025x6 f39220k4 = C12025x6.f40591k4.Clone();

    /* JADX INFO: renamed from: dy */
    private final Stack<C10951c5> f39218dy = new Stack<>();

    private C11638k4(AbstractC9451fa abstractC9451fa, C12015qq c12015qq, C12007ix c12007ix) {
        this.f39224x1 = abstractC9451fa;
        C10951c5 c10951c5 = new C10951c5();
        this.f39219h4 = c10951c5;
        C10951c5 c10951c52 = new C10951c5();
        c10951c5.m52930k4(c10951c52);
        this.f39222m9 = c10951c52;
        C12007ix c12007ixClone = c12007ix.Clone();
        this.f39222m9.m52904k4(new C4317dy(c12015qq.m56699x1() / c12007ixClone.m56550c5(), 0.0f, 0.0f, c12015qq.m56697kk() / c12007ixClone.m56575x1(), 0.0f, 0.0f));
        this.f39222m9.mo52909to().m17349x1(-c12007ixClone.m56557jd(), -c12007ixClone.m56551ck(), 0);
    }

    /* JADX INFO: renamed from: k4 */
    private static C10951c5 m54723k4(C1937to c1937to, C12015qq c12015qq, C12007ix c12007ix, C11639kk c11639kk) {
        if (!m54734to(c1937to.m9994rv())) {
            throw new NotSupportedException();
        }
        c1937to.m9989k4().seek(0L, 0);
        return new C7195x1((C3180k4) AbstractC12536x1.m58363k4(c1937to.m9989k4()), C4230to.m17042x1()).m27856k4(c12015qq.Clone(), c12007ix.Clone());
    }

    /* JADX INFO: renamed from: ks */
    private void m54732ks() {
        this.f39222m9.m52930k4((AbstractC10973uz) this.f39221kk);
        this.f39221kk = null;
    }

    /* JADX INFO: renamed from: rv */
    private void m54733rv() {
        C9455kk c9455kkM46282du = this.f39224x1.m46282du();
        if (c9455kkM46282du.m46349ne()) {
            if (this.f39222m9.mo52902du() == null || this.f39222m9.mo52902du().m52927c5() == 0) {
                m54727k4(C4121ck.m16485k4(c9455kkM46282du.m46358x6()));
            }
        }
    }

    /* JADX INFO: renamed from: up */
    private void m54735up() {
        if (this.f39217du == null) {
            this.f39217du = new C10950bv();
        }
    }

    /* JADX INFO: renamed from: x6 */
    private void m54739x6() {
        C10951c5 c10951c5 = new C10951c5();
        AbstractC10957fa abstractC10957fa = (AbstractC10957fa) this.f39222m9.m53116um();
        c10951c5.m52904k4(this.f39222m9.mo52909to());
        if (abstractC10957fa != null) {
            abstractC10957fa.m52930k4(c10951c5);
        }
        this.f39222m9 = c10951c5;
    }

    /* JADX INFO: renamed from: yj */
    private void m54740yj() {
        if (this.f39223to && this.f39221kk.mo52909to() == null) {
            this.f39221kk.m53099k4(this.f39224x1.m46282du().m46350rv().m17345kk());
        }
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: c5 */
    public void mo9934c5() {
        C4328x1 c4328x1M46344kk = this.f39224x1.m46282du().m46344kk();
        C4320jd c4320jdM46354x1 = this.f39224x1.m46282du().m46354x1();
        if (this.f39221kk != null) {
            if (c4328x1M46344kk == null && c4320jdM46354x1 == null) {
                return;
            }
            mo9950k4(false);
            this.f39221kk.m53101k4(c4328x1M46344kk);
            this.f39221kk.m53100k4(c4320jdM46354x1);
            m54732ks();
        }
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: ck */
    public void mo46253ck() {
        m54733rv();
        m54739x6();
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: du */
    public void mo9935du() {
        mo9950k4(false);
        m54740yj();
        this.f39223to = false;
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: dy */
    public void mo9936dy() {
        C4320jd c4320jdM46354x1 = this.f39224x1.m46282du().m46354x1();
        if (this.f39221kk == null || c4320jdM46354x1 == null) {
            return;
        }
        mo9950k4(false);
        this.f39221kk.m53100k4(c4320jdM46354x1);
        m54732ks();
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: fa */
    public void mo46255fa() {
        m54733rv();
        this.f39222m9 = this.f39218dy.pop();
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: h4 */
    public void mo9937h4() {
        m54740yj();
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: jd */
    public void mo46257jd() {
        this.f39218dy.push(this.f39222m9);
        C10951c5 c10951c5 = new C10951c5();
        this.f39222m9.m52930k4(c10951c5);
        this.f39222m9 = c10951c5;
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: kk */
    public void mo9955kk() {
        mo9950k4(true);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: m9 */
    public void mo9959m9() {
        C4328x1 c4328x1M46344kk = this.f39224x1.m46282du().m46344kk();
        if (this.f39221kk == null || c4328x1M46344kk == null) {
            return;
        }
        mo9950k4(true);
        this.f39221kk.m53101k4(c4328x1M46344kk);
        m54732ks();
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: to */
    public void mo9960to() {
        this.f39223to = true;
        this.f39221kk = new C10971um();
    }

    /* JADX INFO: renamed from: x1 */
    public final C10951c5 m54741x1() {
        return this.f39219h4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C10951c5 m54724k4(C1937to c1937to, C12015qq c12015qq, C12007ix c12007ix, C11639kk c11639kk, C12007ix c12007ix2) {
        return m54725k4(c1937to, c12015qq.Clone(), c12007ix.Clone(), c11639kk, c12007ix2.Clone(), false);
    }

    /* JADX INFO: renamed from: x1 */
    private static C10951c5 m54736x1(C1937to c1937to, C12015qq c12015qq, C12007ix c12007ix, C11639kk c11639kk, C12007ix c12007ix2) {
        AbstractC9451fa abstractC9451faM46273k4 = AbstractC9451fa.m46273k4(c1937to.m9994rv());
        C11638k4 c11638k4 = new C11638k4(abstractC9451faM46273k4, c12015qq.Clone(), c12007ix.Clone());
        abstractC9451faM46273k4.m46292k4(c1937to, c11638k4, c11639kk, c12007ix2.Clone());
        return c11638k4.m54741x1();
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: du */
    public void mo46254du(C12007ix c12007ix) {
        mo46253ck();
        this.f39224x1.m46282du().m46358x6().m56772x1(c12007ix.Clone());
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: h4 */
    public void mo46256h4(C12007ix c12007ix) {
        mo46253ck();
        this.f39224x1.m46282du().m46358x6().m56751k4(c12007ix.Clone());
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: kk */
    public void mo9956kk(C12007ix c12007ix) {
        m54730k4(C10971um.m53087k4(c12007ix.Clone()), false, true, true);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: to */
    public void mo9961to(C12007ix c12007ix) {
        m54729k4(C11640to.m54748k4(c12007ix.Clone()), true, true);
    }

    /* JADX INFO: renamed from: k4 */
    public static C10951c5 m54725k4(C1937to c1937to, C12015qq c12015qq, C12007ix c12007ix, C11639kk c11639kk, C12007ix c12007ix2, boolean z) {
        byte[] bArrM58336k4;
        if (c1937to.m9994rv() == 1 && (bArrM58336k4 = C12530dy.m58336k4(c1937to.m9989k4())) != null) {
            c1937to = new C1937to(bArrM58336k4);
            c1937to.m9986fa().CloneTo(c12007ix);
        }
        return (!m54734to(c1937to.m9994rv()) || z) ? m54736x1(c1937to, c12015qq.Clone(), c12007ix.Clone(), c11639kk, c12007ix2.Clone()) : m54723k4(c1937to, c12015qq.Clone(), c12007ix.Clone(), c11639kk);
    }

    /* JADX INFO: renamed from: to */
    private static boolean m54734to(int i) {
        return i == 3 || i == 5 || i == 4;
    }

    /* JADX INFO: renamed from: x1 */
    private C12015qq m54737x1(C12025x6 c12025x6, String str) {
        C9455kk c9455kkM46282du = this.f39224x1.m46282du();
        C12015qq c12015qqClone = c9455kkM46282du.m46335k4(str).Clone();
        C10963ks c10963ks = new C10963ks(c9455kkM46282du.m46324du(), c9455kkM46282du.m46321c5(), C5656k4.f15629ze, c12025x6.Clone(), str, c12015qqClone.Clone(), c9455kkM46282du.m46353up());
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 1);
        c12025x6.CloneTo(c12025x6Arr[0]);
        c10963ks.m52984k4(C9963x1.m49074k4(c12025x6Arr[0].Clone(), c9455kkM46282du.m46350rv(), c12015qqClone.Clone(), c10963ks.m53005x1(), c9455kkM46282du.m46332jd(), c9455kkM46282du.m46351to().m46379du()));
        c10963ks.m52990k4(c12025x6Arr[0].Clone());
        m54726k4(c10963ks);
        this.f39222m9.m52930k4(c10963ks);
        return c12015qqClone;
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: kk */
    public void mo9957kk(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
        m54729k4(C11640to.m54760kk(c12007ix.Clone(), c12025x6.Clone(), c12025x62.Clone()), true, true);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo46258k4() {
        C12015qq c12015qqClone = this.f39224x1.m46305to().m9999yj().Clone();
        this.f39224x1.m46297k4(c12015qqClone.Clone());
        this.f39224x1.m46282du().m46341k4(c12015qqClone.Clone());
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: kk */
    public void mo9958kk(C12025x6[] c12025x6Arr) {
        if (c12025x6Arr.length > 0) {
            if (!this.f39223to) {
                m54729k4(C11640to.m54754k4(c12025x6Arr, true), true, true);
                return;
            }
            m54735up();
            this.f39217du.m52901x1(c12025x6Arr);
            mo9950k4(true);
        }
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9938k4(int i) {
        if (this.f39223to) {
            this.f39221kk.m53105kk(AbstractC9451fa.m46276m9(this.f39224x1.m46282du().m46323ck()));
        }
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9939k4(C9462x6 c9462x6, C4320jd c4320jd, C4328x1 c4328x1) {
        C10971um c10971um = new C10971um();
        for (int i = 0; i < c9462x6.m46458to().size(); i++) {
            c10971um.m52930k4(C10950bv.m52889k4(c9462x6.m46458to().get_Item(i).Clone()));
        }
        m54728k4(c10971um, c4320jd, c4328x1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m54726k4(C10963ks c10963ks) {
        C10971um c10971umM53087k4 = C10971um.m53087k4(new C12007ix(c10963ks.m52982jd().Clone(), c10963ks.m53002up().Clone()).Clone());
        c10971umM53087k4.m53101k4(new C4318fa(this.f39224x1.m46282du().m46347m9()));
        c10971umM53087k4.m53099k4(c10963ks.mo52909to().m17345kk());
        c10971umM53087k4.mo52909to().m17349x1(0.0f, -c10963ks.m53005x1().m23111c5(), 0);
        this.f39222m9.m52930k4((AbstractC10973uz) c10971umM53087k4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m54727k4(C10971um c10971um) {
        if (c10971um.mo52909to() != null) {
            c10971um.m53109x1(c10971um.mo52909to());
            c10971um.m53099k4((C4317dy) null);
        }
        this.f39222m9.m52907k4(c10971um);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: x1 */
    public void mo9964x1(int i) {
        if (this.f39221kk == null) {
            return;
        }
        mo9950k4(true);
        m54727k4(this.f39221kk);
        this.f39221kk = null;
    }

    /* JADX INFO: renamed from: k4 */
    private void m54728k4(C10971um c10971um, C4320jd c4320jd, C4328x1 c4328x1) {
        if (c4320jd == null && c4328x1 == null) {
            if (c10971um.m53098k4() == null) {
                return;
            } else {
                c4320jd = c10971um.m53098k4();
            }
        }
        c10971um.m53100k4(c4320jd);
        c10971um.m53101k4(c4328x1);
        C9455kk c9455kkM46282du = this.f39224x1.m46282du();
        c10971um.m53105kk(AbstractC9451fa.m46276m9(c9455kkM46282du.m46323ck()));
        c10971um.m53099k4(c9455kkM46282du.m46350rv().m17345kk());
        c10971um.m53108x1(c9455kkM46282du.m46328fa());
        this.f39222m9.m52930k4((AbstractC10973uz) c10971um);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: x1 */
    public void mo9965x1(C12007ix c12007ix) {
        m54729k4(C10971um.m53087k4(c12007ix.Clone()), false, true);
    }

    /* JADX INFO: renamed from: k4 */
    private void m54729k4(C10971um c10971um, boolean z, boolean z2) {
        m54730k4(c10971um, z, z2, false);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: x1 */
    public void mo9966x1(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
        m54729k4(C11640to.m54762x1(c12007ix.Clone(), c12025x6.Clone(), c12025x62.Clone()), true, true);
    }

    /* JADX INFO: renamed from: k4 */
    private void m54730k4(C10971um c10971um, boolean z, boolean z2, boolean z3) {
        C9455kk c9455kkM46282du = this.f39224x1.m46282du();
        C4320jd c4320jdM46354x1 = z ? c9455kkM46282du.m46354x1() : null;
        C4328x1 c4328x1M46344kk = z2 ? c9455kkM46282du.m46344kk() : null;
        if (z3 && c4328x1M46344kk != null) {
            c4328x1M46344kk = new C4318fa(c9455kkM46282du.m46347m9());
        }
        m54728k4(c10971um, c4320jdM46354x1, c4328x1M46344kk);
    }

    /* JADX INFO: renamed from: x1 */
    private void m54738x1(C12025x6 c12025x6, String str, short[] sArr) {
        boolean z = (this.f39224x1.m46282du().m46332jd() & 1) != 0;
        if (z && (C12025x6.m56883k4(c12025x6, this.f39220k4) || C12025x6.m56883k4(c12025x6, C12025x6.f40591k4))) {
            this.f39224x1.m46304m9().CloneTo(c12025x6);
        }
        c12025x6.CloneTo(this.f39220k4);
        C12015qq c12015qq = new C12015qq();
        if (sArr == null || !m54731k4(str, sArr)) {
            m54737x1(c12025x6.Clone(), str).CloneTo(c12015qq);
        } else {
            c12015qq = new C12015qq();
            for (int i = 0; i < str.length(); i++) {
                C12015qq.m56688k4(c12015qq, m54737x1(c12025x6.Clone(), C14117yj.m67537ne(str.charAt(i))).Clone()).CloneTo(c12015qq);
                c12025x6.m56891k4(c12025x6.m56897x1() + sArr[i]);
            }
        }
        if (z) {
            this.f39224x1.m46289h4(new C12025x6(c12015qq.m56699x1() + c12025x6.m56897x1(), c12025x6.m56895kk()));
        }
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9940k4(C12007ix c12007ix) {
        m54729k4(C10971um.m53087k4(c12007ix.Clone()), true, true);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: x1 */
    public void mo9967x1(C12025x6[] c12025x6Arr) {
        if (c12025x6Arr.length > 0) {
            if (!this.f39223to) {
                m54729k4(C11640to.m54753k4(c12025x6Arr), true, false);
            } else {
                m54735up();
                this.f39217du.m52897kk(c12025x6Arr);
            }
        }
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9941k4(C12007ix c12007ix, C12007ix c12007ix2, C4317dy c4317dy, C5656k4 c5656k4, int i, byte[] bArr) {
        C10951c5 c10951c5 = new C10951c5();
        c10951c5.m52930k4(new C10970u4(new C12025x6(c12007ix2.m56571to(), c12007ix2.m56554dy()).Clone(), new C12015qq(c12007ix2.m56550c5(), c12007ix2.m56575x1()).Clone(), bArr));
        c10951c5.m52904k4(this.f39224x1.m46282du().m46350rv().m17345kk());
        c10951c5.mo52909to().m17341k4(c4317dy, 0);
        this.f39222m9.m52930k4(c10951c5);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: x1 */
    public void mo9969x1(C12025x6[][] c12025x6Arr) {
        if (c12025x6Arr.length > 0) {
            if (!this.f39223to) {
                m54729k4(C11640to.m54756k4(c12025x6Arr, true), true, true);
                return;
            }
            for (C12025x6[] c12025x6Arr2 : c12025x6Arr) {
                m54735up();
                this.f39217du.m52901x1(c12025x6Arr2);
                mo9950k4(true);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9942k4(C12007ix c12007ix, C12007ix c12007ix2, byte[] bArr) {
        C10951c5 c10951c5 = new C10951c5();
        C12025x6 c12025x6 = new C12025x6(c12007ix2.m56571to(), c12007ix2.m56554dy());
        C12015qq c12015qq = new C12015qq(c12007ix2.m56550c5(), c12007ix2.m56575x1());
        if (this.f39224x1.m46282du().m46326dy() == 1) {
            try {
                C12009k4 c12009k4 = new C12009k4(new C3152yj(bArr));
                try {
                    c12009k4.m56603k4();
                    C3152yj c3152yj = new C3152yj();
                    try {
                        c12009k4.m56333k4(c3152yj, C3977ck.m15681jd());
                        bArr = c3152yj.toArray();
                    } finally {
                        c3152yj.dispose();
                    }
                } finally {
                    c12009k4.dispose();
                }
            } catch (RuntimeException unused) {
            }
        }
        C10970u4 c10970u4 = new C10970u4(c12025x6.Clone(), c12015qq.Clone(), bArr);
        c10970u4.m53073k4(this.f39224x1.m46282du().m46326dy());
        c10951c5.m52930k4(c10970u4);
        c10951c5.m52904k4(this.f39224x1.m46282du().m46350rv().m17345kk());
        this.f39222m9.m52930k4(c10951c5);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9943k4(C12007ix c12007ix, C12015qq c12015qq) {
        m54729k4(C11640to.m54750k4(c12007ix.Clone(), c12015qq.Clone()), true, true);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9944k4(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
        m54729k4(C11640to.m54751k4(c12007ix.Clone(), c12025x6.Clone(), c12025x62.Clone()), true, false);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9945k4(C12025x6 c12025x6) {
        if (!this.f39223to) {
            m54729k4(C10971um.m53088k4(this.f39224x1.m46304m9().Clone(), c12025x6.Clone()), true, false);
            return;
        }
        m54735up();
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 2);
        this.f39224x1.m46304m9().CloneTo(c12025x6Arr[0]);
        c12025x6.CloneTo(c12025x6Arr[1]);
        this.f39217du.m52901x1(c12025x6Arr);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9947k4(C12025x6 c12025x6, C5656k4 c5656k4) {
        C10971um c10971umM53088k4 = C10971um.m53088k4(c12025x6.Clone(), c12025x6.Clone());
        c10971umM53088k4.m53100k4(new C4320jd(c5656k4));
        m54729k4(c10971umM53088k4, false, false);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9948k4(C12025x6 c12025x6, String str) {
        m54738x1(c12025x6.Clone(), str, (short[]) null);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9949k4(C12025x6 c12025x6, String str, short[] sArr) {
        m54738x1(c12025x6.Clone(), str, sArr);
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9950k4(boolean z) {
        C10950bv c10950bv = this.f39217du;
        if (c10950bv == null) {
            return;
        }
        c10950bv.m52895k4(z);
        this.f39221kk.m52930k4(this.f39217du);
        this.f39217du = null;
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9951k4(C12025x6[] c12025x6Arr) {
        if (c12025x6Arr.length > 0) {
            if (!this.f39223to) {
                m54729k4(C11640to.m54754k4(c12025x6Arr, false), true, false);
            } else {
                m54735up();
                this.f39217du.m52901x1(c12025x6Arr);
            }
        }
    }

    @Override // com.aspose.slides.internal.p339pk.AbstractC9448ck
    /* JADX INFO: renamed from: k4 */
    public void mo9953k4(C12025x6[][] c12025x6Arr) {
        if (c12025x6Arr.length >= 0) {
            if (!this.f39223to) {
                m54729k4(C11640to.m54756k4(c12025x6Arr, false), true, false);
                return;
            }
            for (C12025x6[] c12025x6Arr2 : c12025x6Arr) {
                m54735up();
                this.f39217du.m52901x1(c12025x6Arr2);
                mo9950k4(false);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m54731k4(String str, short[] sArr) {
        for (int i = 0; i < sArr.length; i++) {
            C12015qq c12015qqClone = this.f39224x1.m46282du().m46335k4(C14117yj.m67537ne(str.charAt(i))).Clone();
            short s = sArr[i];
            short sM27468x1 = C7019kk.m27468x1(Double.valueOf(C14116yg.m67501x1(c12015qqClone.m56699x1())), 14);
            short sM27468x12 = C7019kk.m27468x1(Double.valueOf(C14116yg.m67490kk(c12015qqClone.m56699x1())), 14);
            if (sM27468x1 != s && sM27468x12 != s) {
                return true;
            }
        }
        return false;
    }
}
