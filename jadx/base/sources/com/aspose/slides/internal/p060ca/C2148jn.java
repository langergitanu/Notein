package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.jn */
/* JADX INFO: loaded from: classes3.dex */
public final class C2148jn {

    /* JADX INFO: renamed from: k4 */
    public static final C2148jn f7435k4 = new C2148jn(-1.7976931348623157E308d, -1.7976931348623157E308d);

    /* JADX INFO: renamed from: kk */
    private double f7436kk;

    /* JADX INFO: renamed from: x1 */
    private double f7437x1;

    public C2148jn(double d, double d2) {
        m10859k4(d);
        m10861x1(d2);
    }

    public boolean equals(Object obj) {
        C2148jn c2148jn = (C2148jn) C7019kk.m27452k4(obj, C2148jn.class);
        return c2148jn != null ? c2148jn.m10858k4() == m10858k4() && c2148jn.m10860x1() == m10860x1() : super.equals(obj);
    }

    public int hashCode() {
        return C14113y2.m67402k4("{0}_{1}", Double.valueOf(m10858k4()), Double.valueOf(m10860x1())).hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public final double m10858k4() {
        return this.f7437x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m10860x1() {
        return this.f7436kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10859k4(double d) {
        this.f7437x1 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10861x1(double d) {
        this.f7436kk = d;
    }
}
