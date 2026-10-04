package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.gk */
/* JADX INFO: loaded from: classes3.dex */
class C2100gk {

    /* JADX INFO: renamed from: k4 */
    private C2165kp f7244k4;

    /* JADX INFO: renamed from: kk */
    private C2410zj f7245kk;

    /* JADX INFO: renamed from: x1 */
    private C2139j5 f7246x1;

    public C2100gk(C2139j5 c2139j5, C2165kp c2165kp) {
        this.f7244k4 = c2165kp;
        this.f7246x1 = c2139j5;
        this.f7245kk = new C2410zj(c2165kp);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10595k4(C2097gf c2097gf, byte[] bArr, int i, int i2) {
        C2370xk c2370xk = new C2370xk();
        c2370xk.m10366k4(new C2053dq(c2370xk, c2097gf.m10584k4(), false));
        c2370xk.mo10372x1(new C2317u4(bArr, i, i2));
        if (c2097gf.m10584k4().f7918ar > 0 && c2097gf.m10584k4().f7938qq > 0) {
            this.f7244k4.m10961k4(c2097gf.m10584k4().f7918ar);
            int i3 = (int) c2097gf.m10584k4().f7938qq;
            byte[] bArr2 = new byte[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                bArr2[i4] = this.f7244k4.m10962kk();
            }
            C2151jw c2151jw = new C2151jw();
            c2151jw.m10366k4(new C2112he(c2151jw, c2097gf.m10587x1()));
            c2151jw.mo10372x1(new C2317u4(bArr2));
            if (c2097gf.m10587x1().f7608kk != Long.MIN_VALUE) {
                this.f7244k4.m10961k4(c2097gf.m10584k4().f7918ar + c2097gf.m10587x1().f7608kk);
                this.f7245kk.m11826k4(c2097gf.m10586to());
            }
        }
        c2097gf.m10585kk().m10716k4(this.f7246x1.m10805k4(C7019kk.m27457kk(Integer.valueOf(c2097gf.m10586to().m11210kk()), 9)));
    }
}
