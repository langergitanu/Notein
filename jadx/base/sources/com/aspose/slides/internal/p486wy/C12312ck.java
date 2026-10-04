package com.aspose.slides.internal.p486wy;

import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12023wl;

/* JADX INFO: renamed from: com.aspose.slides.internal.wy.ck */
/* JADX INFO: loaded from: classes5.dex */
public class C12312ck extends C12314dy {

    /* JADX INFO: renamed from: ck */
    private C1606x1 f41166ck;

    /* JADX INFO: renamed from: fa */
    private boolean f41167fa;

    /* JADX INFO: renamed from: up */
    private C12007ix f41168up;

    public C12312ck(C1606x1 c1606x1) {
        this(c1606x1, -1);
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: k4 */
    public C12023wl mo8505k4(boolean z) {
        C1606x1 c1606x1M57563wl = m57563wl();
        if (c1606x1M57563wl != null) {
            C12023wl c12023wlClone = c1606x1M57563wl.mo8505k4(z).Clone();
            if (!c12023wlClone.m56861k4()) {
                return c12023wlClone;
            }
        }
        return m8654du() > 0 ? super.mo8505k4(z) : C12023wl.f40585k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m57560kk(C1606x1 c1606x1) {
        this.f41166ck = c1606x1;
    }

    /* JADX INFO: renamed from: u4 */
    public final boolean m57561u4() {
        return this.f41167fa;
    }

    /* JADX INFO: renamed from: uz */
    public final C12007ix m57562uz() {
        return this.f41168up;
    }

    /* JADX INFO: renamed from: wl */
    public final C1606x1 m57563wl() {
        return this.f41166ck;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57564x1(boolean z) {
        this.f41167fa = z;
    }

    public C12312ck(C1606x1 c1606x1, int i) {
        super(0, i);
        this.f41167fa = false;
        this.f41168up = new C12007ix();
        this.f41166ck = c1606x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57559k4(C12007ix c12007ix) {
        c12007ix.CloneTo(this.f41168up);
    }
}
