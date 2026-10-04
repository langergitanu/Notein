package com.aspose.slides.internal.p513xw;

import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p294n9.C6765kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.nv */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12716nv extends AbstractC12704j5 {

    /* JADX INFO: renamed from: du */
    private boolean f42296du;

    /* JADX INFO: renamed from: k4 */
    private C1375h4 f42297k4;

    /* JADX INFO: renamed from: kk */
    private C12721ri f42298kk;

    /* JADX INFO: renamed from: to */
    private boolean f42299to;

    /* JADX INFO: renamed from: x1 */
    private boolean f42300x1;

    public AbstractC12716nv(C12717os c12717os, C1375h4 c1375h4, C12721ri c12721ri, boolean z, boolean z2, boolean z3) {
        super(c12717os);
        this.f42297k4 = c1375h4;
        this.f42298kk = c12721ri;
        this.f42300x1 = z;
        this.f42299to = z2;
        this.f42296du = z3;
    }

    /* JADX INFO: renamed from: ck */
    public final C12721ri m59068ck() {
        return this.f42298kk;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12704j5
    /* JADX INFO: renamed from: du */
    public boolean mo58995du() {
        return this.f42300x1;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m59069fa() {
        return this.f42299to;
    }

    /* JADX INFO: renamed from: jd */
    public final C1375h4 m59070jd() {
        return this.f42297k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo58897k4(C1375h4 c1375h4);

    /* JADX INFO: renamed from: ks */
    public final boolean m59071ks() {
        return this.f42296du;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(m59068ck().m59122k4()).m26792k4(", ");
        c6765kp.m26792k4(this.f42297k4.toString());
        c6765kp.m26792k4(mo58995du() ? "[discard]" : "[RETAIN]");
        if (m59069fa()) {
            c6765kp.m26792k4("[first]");
        }
        if (m59071ks()) {
            c6765kp.m26792k4("[last]");
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59072x1(C1375h4 c1375h4) {
        this.f42297k4 = c1375h4;
    }
}
