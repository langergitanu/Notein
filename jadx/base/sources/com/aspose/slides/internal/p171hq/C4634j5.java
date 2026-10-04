package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.j5 */
/* JADX INFO: loaded from: classes.dex */
public final class C4634j5 extends AbstractC4638kk {

    /* JADX INFO: renamed from: k4 */
    private C4637k4 f12919k4;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4634j5.class) && m19162k4((C4634j5) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return this.f12919k4.mo19017h4();
    }

    public int hashCode() {
        C4637k4 c4637k4 = this.f12919k4;
        if (c4637k4 != null) {
            return c4637k4.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4637k4 m19163k4() {
        return this.f12919k4;
    }

    public String toString() {
        return C14113y2.m67402k4("SolidColor: {0}", this.f12919k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19164k4(C4637k4 c4637k4) {
        this.f12919k4 = c4637k4;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19162k4(C4634j5 c4634j5) {
        return C14067j2.m66728k4(this.f12919k4, c4634j5.f12919k4);
    }
}
