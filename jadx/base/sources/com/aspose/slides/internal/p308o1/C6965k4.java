package com.aspose.slides.internal.p308o1;

import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.o1.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6965k4 {

    /* JADX INFO: renamed from: k4 */
    private C11906rv f18951k4;

    /* JADX INFO: renamed from: x1 */
    private C11896dy f18952x1;

    public C6965k4(C11906rv c11906rv, C11896dy c11896dy) {
        this.f18951k4 = c11906rv;
        this.f18952x1 = c11896dy;
    }

    /* JADX INFO: renamed from: k4 */
    private C11913yj m27223k4(C12007ix c12007ix, C12023wl c12023wl) {
        float fMax = Math.max(c12023wl.m56865x1(), c12023wl.m56862kk()) / Math.max(c12007ix.m56550c5(), c12007ix.m56575x1());
        float f = -c12007ix.m56557jd();
        float f2 = -c12007ix.m56551ck();
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55763k4(fMax, fMax);
        c11913yj.m55777kk(f, f2);
        return c11913yj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C12007ix m27224k4(C11896dy c11896dy, C12025x6 c12025x6) {
        float fM56897x1;
        float fM56895kk;
        C12007ix c12007ixM55530jd = c11896dy.m55530jd();
        C12007ix c12007ix = new C12007ix(c12007ixM55530jd.m56557jd(), c12007ixM55530jd.m56551ck(), c12007ixM55530jd.m56550c5(), c12007ixM55530jd.m56575x1());
        if (this.f18951k4.m55700up() == 4) {
            if (c12025x6.m56897x1() >= c12007ix.m56571to()) {
                if (c12025x6.m56897x1() > c12007ix.m56556h4()) {
                    fM56897x1 = c12025x6.m56897x1() - c12007ix.m56557jd();
                }
                if (c12025x6.m56895kk() >= c12007ix.m56554dy()) {
                    fM56895kk = c12007ix.m56551ck() - c12025x6.m56895kk();
                    c12007ix.m56572to(c12025x6.m56895kk());
                } else if (c12025x6.m56895kk() > c12007ix.m56558k4()) {
                    fM56895kk = c12025x6.m56895kk() - c12007ix.m56551ck();
                }
                c12007ix.m56560k4(c12007ix.m56575x1() + fM56895kk);
                return c12007ix;
            }
            fM56897x1 = c12007ix.m56557jd() - c12025x6.m56897x1();
            c12007ix.m56566kk(c12025x6.m56897x1());
            c12007ix.m56576x1(c12007ix.m56550c5() + fM56897x1);
            if (c12025x6.m56895kk() >= c12007ix.m56554dy()) {
            }
            c12007ix.m56560k4(c12007ix.m56575x1() + fM56895kk);
            return c12007ix;
        }
        return c12007ix;
    }

    /* JADX INFO: renamed from: k4 */
    private C12009k4 m27225k4(C12023wl c12023wl, C11906rv c11906rv, C11896dy c11896dy) {
        int iM56865x1 = c12023wl.m56865x1();
        int iM56862kk = c12023wl.m56862kk();
        C12009k4 c12009k4 = new C12009k4(iM56865x1, iM56862kk, 2498570);
        c12009k4.m56608x1().mo11987k4(new C6966kk(c11906rv, c11896dy, new C11913yj(), c11896dy).m27237k4(0, 0, iM56865x1, iM56862kk), 0, 0, iM56865x1, iM56862kk);
        return c12009k4;
    }

    /* JADX INFO: renamed from: k4 */
    public C12012lr m27229k4(C11913yj c11913yj) {
        C11913yj c11913yjM55760h4 = c11913yj.m55760h4();
        c11913yjM55760h4.m55787x1(this.f18951k4.m55685fa());
        return m27226k4(c11913yjM55760h4, C6967x1.m27238k4(this.f18952x1, c11913yjM55760h4));
    }

    /* JADX INFO: renamed from: k4 */
    private C12012lr m27226k4(C11913yj c11913yj, C11896dy c11896dy) {
        C12025x6 c12025x6M55684dy = this.f18951k4.m55684dy();
        C12007ix c12007ixM27224k4 = m27224k4(this.f18952x1, c12025x6M55684dy);
        C12023wl c12023wlM27228k4 = m27228k4(c12007ixM27224k4, m27224k4(c11896dy, C9467to.m46525k4(this.f18951k4.m55684dy(), c11913yj)), c11913yj);
        C11913yj c11913yjM27223k4 = m27223k4(c12007ixM27224k4, c12023wlM27228k4);
        C11896dy c11896dyM27238k4 = C6967x1.m27238k4(this.f18952x1, c11913yjM27223k4);
        C12025x6 c12025x6M46525k4 = C9467to.m46525k4(c12025x6M55684dy, c11913yjM27223k4);
        C11906rv c11906rv = (C11906rv) this.f18951k4.deepClone();
        c11906rv.m56871k4(new C11913yj());
        c11906rv.m55693k4(c12025x6M46525k4);
        return m27227k4(m27225k4(c12023wlM27228k4, c11906rv, c11896dyM27238k4), c11913yjM27223k4, c11913yj);
    }

    /* JADX INFO: renamed from: k4 */
    private C12012lr m27227k4(C12009k4 c12009k4, C11913yj c11913yj, C11913yj c11913yj2) {
        C11913yj c11913yjM55760h4 = c11913yj.m55760h4();
        c11913yjM55760h4.m55780m9();
        c11913yjM55760h4.m55769k4(c11913yj2, 1);
        C12012lr c12012lr = new C12012lr(c12009k4, this.f18951k4.m55700up());
        c12012lr.m56623kk(c11913yjM55760h4);
        return c12012lr;
    }

    /* JADX INFO: renamed from: k4 */
    private C12023wl m27228k4(C12007ix c12007ix, C12007ix c12007ix2, C11913yj c11913yj) {
        double dSqrt;
        double dM46521k4;
        double dM56550c5 = c12007ix.m56550c5() / c12007ix.m56575x1();
        double dSqrt2 = 256.0d;
        if (dM56550c5 > 1.0d) {
            dSqrt = 256.0d / dM56550c5;
        } else {
            dSqrt2 = dM56550c5 * 256.0d;
            dSqrt = 256.0d;
        }
        double d = dSqrt2 * dSqrt;
        if (c11913yj.m55790x6().m17925h4() == 0.0d && c11913yj.m55790x6().m17939m9() == 0.0d) {
            dM46521k4 = c12007ix2.m56575x1() * c12007ix2.m56550c5();
        } else {
            C12025x6 c12025x6M46525k4 = C9467to.m46525k4(new C12025x6(c12007ix.m56571to(), c12007ix.m56554dy()), c11913yj);
            dM46521k4 = C9467to.m46521k4(c12025x6M46525k4, C9467to.m46525k4(new C12025x6(c12007ix.m56556h4(), c12007ix.m56554dy()), c11913yj)) * C9467to.m46521k4(c12025x6M46525k4, C9467to.m46525k4(new C12025x6(c12007ix.m56571to(), c12007ix.m56558k4()), c11913yj));
        }
        if (d > dM46521k4) {
            double d2 = d / dM46521k4;
            dSqrt2 /= Math.sqrt(d2);
            dSqrt /= Math.sqrt(d2);
        }
        return new C12023wl(Math.max(1, (int) Math.round(dSqrt2)), Math.max(1, (int) Math.round(dSqrt)));
    }
}
