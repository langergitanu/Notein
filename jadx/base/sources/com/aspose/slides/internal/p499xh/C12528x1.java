package com.aspose.slides.internal.p499xh;

import com.aspose.slides.internal.p154gr.C4375kk;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p472w8.C11911x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.xh.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C12528x1 {

    /* JADX INFO: renamed from: k4 */
    private final C11909up f41963k4;

    public C12528x1(C11909up c11909up) {
        this.f41963k4 = c11909up;
    }

    /* JADX INFO: renamed from: k4 */
    private C11913yj m58309k4(C12007ix c12007ix, C12023wl c12023wl) {
        float fMax = Math.max(c12023wl.m56865x1(), c12023wl.m56862kk()) / Math.max(c12007ix.m56550c5(), c12007ix.m56575x1());
        float f = -c12007ix.m56557jd();
        float f2 = -c12007ix.m56551ck();
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55763k4(fMax, fMax);
        c11913yj.m55777kk(f, f2);
        return c11913yj;
    }

    /* JADX INFO: renamed from: k4 */
    private C12009k4 m58310k4(C12023wl c12023wl, C12527kk c12527kk) {
        int iM56865x1 = c12023wl.m56865x1();
        int iM56862kk = c12023wl.m56862kk();
        C12009k4 c12009k4 = new C12009k4(iM56865x1, iM56862kk, 2498570);
        AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        c12009k4.m56608x1().mo11987k4(new C12526k4(new C11913yj(), c12527kk).m58302k4(0, 0, iM56865x1, iM56862kk), 0, 0, iM56865x1, iM56862kk);
        return c12009k4;
    }

    /* JADX INFO: renamed from: k4 */
    public C12012lr m58314k4(C11913yj c11913yj) {
        C11913yj c11913yjM55760h4 = c11913yj.m55760h4();
        c11913yjM55760h4.m55787x1(this.f41963k4.m55719ck());
        return m58311k4(c11913yjM55760h4, m58315k4());
    }

    /* JADX INFO: renamed from: k4 */
    private C12012lr m58311k4(C11913yj c11913yj, C12527kk c12527kk) {
        C12025x6 c12025x6M55731ks = this.f41963k4.m55731ks();
        C12025x6 c12025x6M55733rv = this.f41963k4.m55733rv();
        C12007ix c12007ixM56541k4 = C12007ix.m56541k4(c12025x6M55731ks.m56897x1(), c12025x6M55731ks.m56895kk(), c12025x6M55733rv.m56897x1(), c12025x6M55733rv.m56895kk());
        C12023wl c12023wlM58313k4 = m58313k4(c12007ixM56541k4);
        return m58312k4(m58310k4(c12023wlM58313k4, new C12527kk(new C12025x6(0.0f, 0.0f), new C12025x6(c12023wlM58313k4.m56865x1(), c12023wlM58313k4.m56862kk()), c12527kk.m58306kk(), c12527kk.m58307to(), c12527kk.m58303du(), c12527kk.m58304h4())), m58309k4(c12007ixM56541k4, c12023wlM58313k4), c11913yj);
    }

    /* JADX INFO: renamed from: k4 */
    private C12012lr m58312k4(C12009k4 c12009k4, C11913yj c11913yj, C11913yj c11913yj2) {
        C11913yj c11913yjM55760h4 = c11913yj.m55760h4();
        c11913yjM55760h4.m55780m9();
        c11913yjM55760h4.m55769k4(c11913yj2, 1);
        C12012lr c12012lr = new C12012lr(c12009k4, this.f41963k4.m55722fa());
        c12012lr.m56623kk(c11913yjM55760h4);
        return c12012lr;
    }

    /* JADX INFO: renamed from: k4 */
    private C12023wl m58313k4(C12007ix c12007ix) {
        double dSqrt;
        double dM56550c5 = c12007ix.m56550c5() / c12007ix.m56575x1();
        double dSqrt2 = 256.0d;
        if (dM56550c5 > 1.0d) {
            dSqrt = 256.0d / dM56550c5;
        } else {
            dSqrt2 = dM56550c5 * 256.0d;
            dSqrt = 256.0d;
        }
        double d = dSqrt2 * dSqrt;
        double dM56575x1 = c12007ix.m56575x1() * c12007ix.m56550c5();
        if (d > dM56575x1) {
            double d2 = d / dM56575x1;
            dSqrt2 /= Math.sqrt(d2);
            dSqrt /= Math.sqrt(d2);
        }
        return new C12023wl(Math.max(1, (int) Math.round(dSqrt2)), Math.max(1, (int) Math.round(dSqrt)));
    }

    /* JADX INFO: renamed from: k4 */
    public C12527kk m58315k4() {
        C12003du[] c12003duArr;
        float[] fArr;
        float[] fArr2;
        float f;
        C12003du c12003duM56398k4;
        int i = 0;
        boolean z = true;
        float f2 = 1.0f;
        float[] fArr3 = {0.0f, 1.0f};
        C12003du[] c12003duArrM55718c5 = this.f41963k4.m55718c5();
        C12003du c12003du = c12003duArrM55718c5[0];
        C12003du c12003du2 = c12003duArrM55718c5[1];
        C11911x1 c11911x1M55723h4 = this.f41963k4.m55723h4();
        C11902kk c11902kkM55721dy = this.f41963k4.m55736up() ? this.f41963k4.m55721dy() : null;
        if (c11902kkM55721dy == null || c11902kkM55721dy.m55668k4() == null || c11902kkM55721dy.m55668k4().length <= 0) {
            if (this.f41963k4.m55740yj() && c11911x1M55723h4 != null) {
                float[] fArr4 = new float[c11911x1M55723h4.m55744kk().length];
                C12003du[] c12003duArr2 = new C12003du[c11911x1M55723h4.m55747x1().length];
                for (int i2 = 0; i2 < c11911x1M55723h4.m55744kk().length; i2++) {
                    fArr4[i2] = c11911x1M55723h4.m55744kk()[i2];
                }
                float fM56501c5 = (c12003du2.m56501c5() & 255) - (c12003du.m56501c5() & 255);
                float fM56507jd = (c12003du2.m56507jd() & 255) - (c12003du.m56507jd() & 255);
                float fM56502ck = (c12003du2.m56502ck() & 255) - (c12003du.m56502ck() & 255);
                float fM56505fa = (c12003du2.m56505fa() & 255) - (c12003du.m56505fa() & 255);
                while (i < c11911x1M55723h4.m55747x1().length) {
                    float f3 = c11911x1M55723h4.m55747x1()[i];
                    if (z) {
                        fArr2 = fArr4;
                        f = f2;
                        float f4 = f - f3;
                        c12003duM56398k4 = C12003du.m56398k4((int) ((c12003du2.m56501c5() & 255) - (fM56501c5 * f4)), (int) ((c12003du2.m56507jd() & 255) - (fM56507jd * f4)), (int) ((c12003du2.m56502ck() & 255) - (fM56502ck * f4)), (int) ((c12003du2.m56505fa() & 255) - (f4 * fM56505fa)));
                    } else {
                        try {
                            f = f2;
                            try {
                                fArr2 = fArr4;
                                try {
                                    c12003duM56398k4 = C12003du.m56398k4((int) ((fM56501c5 * f3) + (c12003du.m56501c5() & 255)), (int) ((fM56507jd * f3) + (c12003du.m56507jd() & 255)), (int) ((fM56502ck * f3) + (c12003du.m56502ck() & 255)), (int) ((f3 * fM56505fa) + (c12003du.m56505fa() & 255)));
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                                fArr2 = fArr4;
                            }
                        } catch (Exception unused3) {
                            fArr2 = fArr4;
                            f = f2;
                        }
                    }
                    c12003duArr2[i] = c12003duM56398k4;
                    z = !z;
                    i++;
                    f2 = f;
                    fArr4 = fArr2;
                }
                c12003duArr = c12003duArr2;
                fArr = fArr4;
            }
            return new C12527kk(this.f41963k4.m55731ks(), this.f41963k4.m55733rv(), fArr, c12003duArr, this.f41963k4.m55722fa(), this.f41963k4.m55732m9());
        }
        fArr3 = new float[c11902kkM55721dy.m55669x1().length];
        c12003duArrM55718c5 = new C12003du[c11902kkM55721dy.m55668k4().length];
        for (int i3 = 0; i3 < c11902kkM55721dy.m55669x1().length; i3++) {
            fArr3[i3] = c11902kkM55721dy.m55669x1()[i3];
        }
        while (i < c11902kkM55721dy.m55668k4().length) {
            c12003duArrM55718c5[i] = (this.f41963k4.m55740yj() || !this.f41963k4.m55732m9()) ? c11902kkM55721dy.m55668k4()[i] : C12003du.m56396k4(C4375kk.m17635x1(c11902kkM55721dy.m55668k4()[i].m56506h4()));
            i++;
        }
        fArr = fArr3;
        c12003duArr = c12003duArrM55718c5;
        return new C12527kk(this.f41963k4.m55731ks(), this.f41963k4.m55733rv(), fArr, c12003duArr, this.f41963k4.m55722fa(), this.f41963k4.m55732m9());
    }
}
