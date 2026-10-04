package com.aspose.slides.internal.p104ec;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p505xn.C12555c5;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.xk */
/* JADX INFO: loaded from: classes3.dex */
public class C3659xk extends AbstractC3629m4 {

    /* JADX INFO: renamed from: c5 */
    private C3595ak f10139c5;

    /* JADX INFO: renamed from: ck */
    private C3655wp f10140ck;

    /* JADX INFO: renamed from: du */
    private C3650v4 f10141du;

    /* JADX INFO: renamed from: dy */
    private C3605dq f10142dy;

    /* JADX INFO: renamed from: fa */
    private C3663yd f10143fa;

    /* JADX INFO: renamed from: h4 */
    private C3634qm f10144h4;

    /* JADX INFO: renamed from: jd */
    private C3608e0 f10145jd;

    /* JADX INFO: renamed from: k4 */
    private C3641sv f10146k4;

    /* JADX INFO: renamed from: kk */
    private C3602c6 f10147kk;

    /* JADX INFO: renamed from: m9 */
    private C3656wy f10148m9;

    /* JADX INFO: renamed from: to */
    private C3645ts f10149to;

    /* JADX INFO: renamed from: x1 */
    private C3627lr f10150x1;

    public C3659xk() {
        this.f10146k4 = new C3641sv();
        this.f10147kk = new C3602c6();
        this.f10149to = new C3645ts();
        this.f10141du = new C3650v4();
        this.f10139c5 = new C3595ak();
        this.f10145jd = new C3608e0();
        this.f10140ck = new C3655wp();
    }

    /* JADX INFO: renamed from: k4 */
    public final C3650v4 m14839k4() {
        return this.f10141du;
    }

    /* JADX INFO: renamed from: x1 */
    public final C3634qm m14840x1() {
        return this.f10144h4;
    }

    public C3659xk(int i, String str) {
        C3641sv c3641sv = new C3641sv();
        this.f10146k4 = c3641sv;
        c3641sv.m14799k4(1L);
        this.f10147kk = new C3602c6();
        this.f10149to = new C3645ts();
        C3650v4 c3650v4 = new C3650v4();
        this.f10141du = c3650v4;
        c3650v4.m14814k4(i);
        C3634qm c3634qm = new C3634qm(this.f10141du.m14815x1() & 65535);
        this.f10144h4 = c3634qm;
        c3634qm.m14783k4(str);
        C3656wy c3656wy = new C3656wy(this.f10141du.m14815x1() & 65535);
        this.f10148m9 = c3656wy;
        c3656wy.m14833k4("");
        this.f10148m9.m14834x1("");
        C3605dq c3605dq = new C3605dq(this.f10141du.m14815x1() & 65535);
        this.f10142dy = c3605dq;
        c3605dq.m14713k4("");
        this.f10142dy.m14714x1("");
        this.f10139c5 = new C3595ak();
        this.f10145jd = new C3608e0();
        C3655wp c3655wp = new C3655wp();
        this.f10140ck = c3655wp;
        c3655wp.m14832k4(8L);
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14692k4(C3134k4 c3134k4) {
        this.f10146k4.mo14692k4(c3134k4);
        if ((C3623k4.m14763k4(c3134k4) & 65535) == 74) {
            C3627lr c3627lr = new C3627lr();
            this.f10150x1 = c3627lr;
            c3627lr.mo14692k4(c3134k4);
        }
        this.f10147kk.mo14692k4(c3134k4);
        this.f10149to.mo14692k4(c3134k4);
        this.f10141du.mo14692k4(c3134k4);
        try {
            C12555c5.m58552k4(this.f10141du.m14815x1() & 65535);
        } catch (ArgumentException | UnsupportedOperationException unused) {
            this.f10141du.m14814k4(AbstractC6747ar.m26634h4().mo26673ks() & 65535);
        }
        C3634qm c3634qm = new C3634qm(this.f10141du.m14815x1() & 65535);
        this.f10144h4 = c3634qm;
        c3634qm.mo14692k4(c3134k4);
        C3656wy c3656wy = new C3656wy(this.f10141du.m14815x1() & 65535);
        this.f10148m9 = c3656wy;
        c3656wy.mo14692k4(c3134k4);
        C3605dq c3605dq = new C3605dq(this.f10141du.m14815x1() & 65535);
        this.f10142dy = c3605dq;
        c3605dq.mo14692k4(c3134k4);
        this.f10139c5.mo14692k4(c3134k4);
        this.f10145jd.mo14692k4(c3134k4);
        this.f10140ck.mo14692k4(c3134k4);
        if ((C3623k4.m14763k4(c3134k4) & 65535) == 12) {
            C3663yd c3663yd = new C3663yd(65535 & this.f10141du.m14815x1());
            this.f10143fa = c3663yd;
            c3663yd.mo14692k4(c3134k4);
        }
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14697k4(C3149x1 c3149x1) {
        this.f10146k4.mo14697k4(c3149x1);
        C3627lr c3627lr = this.f10150x1;
        if (c3627lr != null) {
            c3627lr.mo14697k4(c3149x1);
        }
        this.f10147kk.mo14697k4(c3149x1);
        this.f10149to.mo14697k4(c3149x1);
        this.f10141du.mo14697k4(c3149x1);
        this.f10144h4.mo14697k4(c3149x1);
        this.f10148m9.mo14697k4(c3149x1);
        this.f10142dy.mo14697k4(c3149x1);
        this.f10139c5.mo14697k4(c3149x1);
        this.f10145jd.mo14697k4(c3149x1);
        this.f10140ck.mo14697k4(c3149x1);
        C3663yd c3663yd = this.f10143fa;
        if (c3663yd != null) {
            c3663yd.mo14697k4(c3149x1);
        }
    }
}
