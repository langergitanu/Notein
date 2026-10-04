package com.aspose.slides.internal.p048bv;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.bv.fa */
/* JADX INFO: loaded from: classes3.dex */
public class C1860fa {

    /* JADX INFO: renamed from: du */
    private double f6714du;

    /* JADX INFO: renamed from: h4 */
    private int f6715h4;

    /* JADX INFO: renamed from: k4 */
    private int f6716k4;

    /* JADX INFO: renamed from: kk */
    private int f6717kk;

    /* JADX INFO: renamed from: to */
    private double f6718to;

    /* JADX INFO: renamed from: x1 */
    private int f6719x1;

    public C1860fa(int i, int i2, double d, double d2, float f) {
        m9722k4(i, i2);
        m9721k4(d, d2);
        this.f6715h4 = C7019kk.m27462to(Float.valueOf(72000.0f / f), 13);
    }

    /* JADX INFO: renamed from: du */
    public final int m9718du() {
        return this.f6719x1 * this.f6715h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final double m9719h4() {
        return this.f6718to;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m9720k4() {
        return this.f6717kk;
    }

    /* JADX INFO: renamed from: kk */
    public final int m9723kk() {
        return this.f6719x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final double m9724m9() {
        return this.f6714du;
    }

    /* JADX INFO: renamed from: to */
    public final int m9725to() {
        return this.f6716k4 * this.f6715h4;
    }

    public String toString() {
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("Size: ");
        c6765kpOooO00o.m26805kk(m9725to()).m26780k4('x').m26805kk(m9718du()).m26792k4(" mpt");
        c6765kpOooO00o.m26792k4(" (");
        c6765kpOooO00o.m26805kk(m9726x1()).m26780k4('x').m26805kk(m9723kk()).m26792k4(" px");
        c6765kpOooO00o.m26792k4(" at ").m26784k4(m9719h4()).m26780k4('x').m26784k4(m9724m9());
        c6765kpOooO00o.m26792k4(" dpi");
        c6765kpOooO00o.m26792k4(")");
        return c6765kpOooO00o.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m9726x1() {
        return this.f6716k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9721k4(double d, double d2) {
        this.f6718to = d;
        this.f6714du = d2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9722k4(int i, int i2) {
        this.f6716k4 = i;
        this.f6719x1 = i2;
    }
}
