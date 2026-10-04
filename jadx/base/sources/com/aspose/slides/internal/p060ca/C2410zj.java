package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.zj */
/* JADX INFO: loaded from: classes3.dex */
class C2410zj {

    /* JADX INFO: renamed from: k4 */
    private C2165kp f8355k4;

    public C2410zj(C2165kp c2165kp) {
        this.f8355k4 = c2165kp;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11826k4(C2234os c2234os) {
        c2234os.m11207k4(this.f8355k4.m10964x1());
        c2234os.m11205k4(C7019kk.m27462to(Integer.valueOf(this.f8355k4.m10957du()), 8));
        if (c2234os.m11210kk() > 0) {
            c2234os.m11204k4(this.f8355k4.m10958h4());
            c2234os.m11209k4(new int[c2234os.m11210kk() + 1]);
            for (int i = 0; i <= c2234os.m11210kk(); i++) {
                c2234os.m11201du()[i] = this.f8355k4.m10959k4(C7019kk.m27462to(Byte.valueOf(c2234os.m11211to()), 6));
            }
            c2234os.m11208k4(new byte[c2234os.m11201du()[c2234os.m11201du().length - 1] - 1]);
            for (int i2 = 0; i2 < c2234os.m11202h4().length; i2++) {
                c2234os.m11202h4()[i2] = this.f8355k4.m10962kk();
            }
        }
        c2234os.m11213x1(this.f8355k4.m10964x1() - 1);
    }
}
