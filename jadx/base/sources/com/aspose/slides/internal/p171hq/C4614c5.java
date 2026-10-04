package com.aspose.slides.internal.p171hq;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.c5 */
/* JADX INFO: loaded from: classes.dex */
public final class C4614c5 extends C4620dy {

    /* JADX INFO: renamed from: k4 */
    private C4637k4[] f12874k4;

    @Override // com.aspose.slides.internal.p171hq.C4620dy
    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4614c5.class) && m19050k4((C4614c5) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.C4620dy, com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return (int) ((((long) super.mo19017h4()) + (((m19080x1() & 4294967295L) * 4) & 4294967295L)) & 4294967295L);
    }

    @Override // com.aspose.slides.internal.p171hq.C4620dy
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C4637k4[] c4637k4Arr = this.f12874k4;
        return iHashCode ^ (c4637k4Arr != null ? AbstractC14092to.m67208k4((Object) c4637k4Arr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19051k4(C4637k4[] c4637k4Arr) {
        this.f12874k4 = c4637k4Arr;
    }

    /* JADX INFO: renamed from: kk */
    public final C4637k4[] m19052kk() {
        return this.f12874k4;
    }

    @Override // com.aspose.slides.internal.p171hq.C4620dy
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (C4637k4 c4637k4 : this.f12874k4) {
            c6765kp.m26792k4(C14113y2.m67408k4(c4637k4.toString(), ", "));
        }
        return C14113y2.m67402k4("{0}, BlendColors: [{1}]", super.toString(), c6765kp);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19050k4(C4614c5 c4614c5) {
        return m19078k4((C4620dy) c4614c5) && C12530dy.m58334k4(this.f12874k4, c4614c5.f12874k4);
    }
}
